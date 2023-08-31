package br.com.bodegami.mercadolivro.controller

import br.com.bodegami.mercadolivro.controller.request.PostCustomerRequest
import br.com.bodegami.mercadolivro.controller.request.PutCustomerRequest
import br.com.bodegami.mercadolivro.controller.response.CustomerResponse
import br.com.bodegami.mercadolivro.extension.toCustomerModel
import br.com.bodegami.mercadolivro.extension.toResponse
import br.com.bodegami.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/customers")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun findAll(@RequestParam name: String?): List<CustomerResponse> {
        return customerService.findAll(name).map { it.toResponse() }
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): CustomerResponse {
        return customerService.findById(id).toResponse()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid customer: PostCustomerRequest) {
        customerService.create(customer.toCustomerModel())
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
        val customerSaved = customerService.findById(id)
        customerService.update(customer.toCustomerModel(customerSaved))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        customerService.delete(id)
    }

}