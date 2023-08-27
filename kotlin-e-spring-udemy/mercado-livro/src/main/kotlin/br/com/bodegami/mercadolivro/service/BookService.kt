package br.com.bodegami.mercadolivro.service

import br.com.bodegami.mercadolivro.enums.BookStatus
import br.com.bodegami.mercadolivro.model.BookModel
import br.com.bodegami.mercadolivro.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {
    fun create(book: BookModel): BookModel {
        return bookRepository.save(book)
    }

    fun findAll(): List<BookModel> {
        return bookRepository.findAll().toList()
    }

    fun findActives(): List<BookModel> = bookRepository.findByStatus(BookStatus.ATIVO)
    fun findById(id: Int): BookModel = bookRepository.findById(id).orElseThrow()
    fun delete(id: Int) {
        val book = findById(id)
        book.status = BookStatus.CANCELADO

        update(book)
    }

    fun update(book: BookModel) {
        bookRepository.save(book)
    }
}
