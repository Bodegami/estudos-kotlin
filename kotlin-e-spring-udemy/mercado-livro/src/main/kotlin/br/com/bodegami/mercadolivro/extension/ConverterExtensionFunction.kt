package br.com.bodegami.mercadolivro.extension

import br.com.bodegami.mercadolivro.controller.request.PostBookRequest
import br.com.bodegami.mercadolivro.controller.request.PostCustomerRequest
import br.com.bodegami.mercadolivro.controller.request.PutCustomerRequest
import br.com.bodegami.mercadolivro.enums.BookStatus
import br.com.bodegami.mercadolivro.model.BookModel
import br.com.bodegami.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}

fun PostBookRequest.toBookModel(customer: CustomerModel) : BookModel {
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )
}