package br.com.bodegami.mercadolivro.controller

import br.com.bodegami.mercadolivro.controller.request.PostCustomerRequest
import br.com.bodegami.mercadolivro.controller.request.PutCustomerRequest
import br.com.bodegami.mercadolivro.extension.toCustomerModel
import br.com.bodegami.mercadolivro.model.CustomerModel
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

@RestController
@RequestMapping("/customers")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun findAll(@RequestParam name: String?): List<CustomerModel> {
        return customerService.findAll(name)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): CustomerModel {
        return customerService.findById(id)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        customerService.create(customer.toCustomerModel())
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: String, @RequestBody customer: PutCustomerRequest) {
        customerService.update(customer.toCustomerModel(id))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String) {
        customerService.delete(id)
    }

}