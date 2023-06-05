package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Endereco

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "04210-063"
        complemento = "apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}