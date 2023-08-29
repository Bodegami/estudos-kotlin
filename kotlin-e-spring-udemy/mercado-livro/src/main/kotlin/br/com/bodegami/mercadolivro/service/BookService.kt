package br.com.bodegami.mercadolivro.service

import br.com.bodegami.mercadolivro.enums.BookStatus
import br.com.bodegami.mercadolivro.exception.NotFoundException
import br.com.bodegami.mercadolivro.model.BookModel
import br.com.bodegami.mercadolivro.model.CustomerModel
import br.com.bodegami.mercadolivro.repository.BookRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {
    fun create(book: BookModel): BookModel {
        return bookRepository.save(book)
    }

    fun findAll(pageable: Pageable): Page<BookModel> {
        return bookRepository.findAll(pageable)
    }

    fun findActives(pageable: Pageable): Page<BookModel> = bookRepository.findByStatus(BookStatus.ATIVO, pageable)
    fun findById(id: Int): BookModel = bookRepository
        .findById(id)
        .orElseThrow{ throw NotFoundException("Book [$id] not exists!", "ML-0001") }

    fun delete(id: Int) {
        val book = findById(id)
        book.status = BookStatus.CANCELADO

        update(book)
    }

    fun update(book: BookModel) {
        bookRepository.save(book)
    }

    fun deleteByCustomer(customer: CustomerModel) {
        val books = bookRepository.findByCustomer(customer)
        for(book in books) {
            book.status = BookStatus.DELETADO
        }

        bookRepository.saveAll(books)
    }
}
