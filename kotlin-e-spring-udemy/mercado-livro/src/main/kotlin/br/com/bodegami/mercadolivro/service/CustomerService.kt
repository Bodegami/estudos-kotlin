package br.com.bodegami.mercadolivro.service

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
        return custormers.first { it.id == id }
    }

    fun create(customer: CustomerModel) {
        val id = if(custormers.isEmpty()) {
            1
        } else {
            custormers.last().id!!.toInt().plus(1)
        }.toString()

        customer.id = id
        custormers.add(customer)
    }

    fun update(customer: CustomerModel) {
        custormers.first { it.id == customer.id }.let { it ->
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: String) {
        custormers.removeIf { it.id == id }
    }

}