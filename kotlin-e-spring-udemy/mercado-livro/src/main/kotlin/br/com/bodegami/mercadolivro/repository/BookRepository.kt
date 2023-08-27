package br.com.bodegami.mercadolivro.repository

import br.com.bodegami.mercadolivro.enums.BookStatus
import br.com.bodegami.mercadolivro.model.BookModel
import br.com.bodegami.mercadolivro.model.CustomerModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface BookRepository : JpaRepository<BookModel, Int> {
    fun findByStatus(status: BookStatus, pageable: Pageable): Page<BookModel>
    fun findByCustomer(customer: CustomerModel): List<BookModel>

}