package br.com.bodegami.mercadolivro.service

import br.com.bodegami.mercadolivro.model.CustomerModel
import br.com.bodegami.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    val custormers = mutableListOf<CustomerModel>()

    fun findAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun findById(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun update(customer: CustomerModel) {
        val customerExists = customerRepository.existsById(customer.id!!)
        if (!customerExists) {
            throw Exception()
        }

        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        val customerExists = customerRepository.existsById(id)
        if (!customerExists) {
            throw Exception()
        }

        customerRepository.deleteById(id)
    }

}