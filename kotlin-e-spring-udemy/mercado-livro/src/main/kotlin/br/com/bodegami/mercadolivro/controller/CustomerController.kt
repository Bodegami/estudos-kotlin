package br.com.bodegami.mercadolivro.controller

import br.com.bodegami.mercadolivro.controller.request.PostCustomerRequest
import br.com.bodegami.mercadolivro.controller.request.PutCustomerRequest
import br.com.bodegami.mercadolivro.model.CustomerModel
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
class CustomerController {

    val custormers = mutableListOf<CustomerModel>()

    @GetMapping
    fun findAll(@RequestParam name: String?): List<CustomerModel> {
        name?.let {
            return custormers.filter { it.name.contains(name, true) }
        }
        return custormers
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): CustomerModel {
        return custormers.first { it ->
            it.id == id
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        custormers.add(CustomerModel(getId(), customer.name, customer.email))
        print(custormers)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: String, @RequestBody customer: PutCustomerRequest) {
        custormers.first { it.id == id }.let { it ->
            it.name = customer.name
            it.email = customer.email
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String) {
        custormers.removeIf { it.id == id }
    }


    private fun getId(): String {
        return if(custormers.isEmpty()) {
            1
        } else {
            custormers.last().id.toInt().plus(1)
        }.toString()
    }

}