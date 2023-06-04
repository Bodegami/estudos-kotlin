package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Endereco

fun main() {

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaisculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaisculo)

    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let (::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter { endereco -> !endereco.complemento.isNullOrEmpty() }
        .let { enderecosComComplemento ->
            println(enderecosComComplemento)
            println(enderecosComComplemento.size)
        }

}
