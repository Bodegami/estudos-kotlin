package br.com.bodegami.mercadolivro.controller.request

import br.com.bodegami.mercadolivro.model.CustomerModel

data class PutCustomerRequest(
    var name: String,
    var email: String
) {

}