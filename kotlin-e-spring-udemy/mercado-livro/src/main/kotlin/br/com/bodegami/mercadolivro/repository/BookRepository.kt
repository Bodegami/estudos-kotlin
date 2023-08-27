package br.com.bodegami.mercadolivro.repository

import br.com.bodegami.mercadolivro.model.BookModel
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookModel, Int> {
}