package br.com.bodegami.mercadolivro.service

import br.com.bodegami.mercadolivro.enums.CustomerStatus
import br.com.bodegami.mercadolivro.enums.Errors
import br.com.bodegami.mercadolivro.exception.NotFoundException
import br.com.bodegami.mercadolivro.model.CustomerModel
import br.com.bodegami.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class CustomerService(
    val customerRepository: CustomerRepository,
    val bookService: BookService
) {

    val custormers = mutableListOf<CustomerModel>()

    fun findAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun findById(id: Int): CustomerModel {
        return customerRepository
            .findById(id)
            .orElseThrow{ throw NotFoundException(Errors.ML201.message.format(id), Errors.ML201.code) }
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
        val customer = findById(id)
        bookService.deleteByCustomer(customer)

        customer.status = CustomerStatus.INATIVO

        customerRepository.save(customer)
    }

}