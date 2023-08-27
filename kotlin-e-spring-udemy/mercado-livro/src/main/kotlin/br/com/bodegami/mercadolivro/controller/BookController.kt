package br.com.bodegami.mercadolivro.controller

import br.com.bodegami.mercadolivro.controller.request.PostBookRequest
import br.com.bodegami.mercadolivro.extension.toBookModel
import br.com.bodegami.mercadolivro.service.BookService
import br.com.bodegami.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
    val bookService: BookService,
    val customerService: CustomerService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: PostBookRequest) {
        val customer = customerService.getById(request.customerId)
        bookService.create(request.toBookModel(customer));
    }

}