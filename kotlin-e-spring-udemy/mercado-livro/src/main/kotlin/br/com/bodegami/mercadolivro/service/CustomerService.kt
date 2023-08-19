package br.com.bodegami.mercadolivro.service

import br.com.bodegami.mercadolivro.controller.request.PostCustomerRequest
import br.com.bodegami.mercadolivro.controller.request.PutCustomerRequest
import br.com.bodegami.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service

@Service
class CustomerService {

    val custormers = mutableListOf<CustomerModel>()

    fun findAll(name: String?): List<CustomerModel> {
        name?.let {
            return custormers.filter { it.name.contains(name, true) }
        }
        return custormers
    }

    fun findById(id: String): CustomerModel {
        return custormers.first { it ->
            it.id == id
        }
    }

    fun create(customer: PostCustomerRequest) {
        custormers.add(CustomerModel(getId(), customer.name, customer.email))
        print(custormers)
    }

    fun update(id: String, customer: PutCustomerRequest) {
        custormers.first { it.id == id }.let { it ->
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: String) {
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