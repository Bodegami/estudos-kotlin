package br.com.bodegami.mercadolivro.repository

import br.com.bodegami.mercadolivro.enums.BookStatus
import br.com.bodegami.mercadolivro.model.BookModel
import br.com.bodegami.mercadolivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookModel, Int> {
    fun findByStatus(status: BookStatus): List<BookModel>
    fun findByCustomer(customer: CustomerModel): List<BookModel>

}