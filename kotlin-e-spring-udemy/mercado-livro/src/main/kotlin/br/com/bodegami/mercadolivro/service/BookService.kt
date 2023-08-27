package br.com.bodegami.mercadolivro.service

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

}
