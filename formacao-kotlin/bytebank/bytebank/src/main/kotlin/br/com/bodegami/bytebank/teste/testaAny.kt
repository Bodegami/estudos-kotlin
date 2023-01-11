package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Endereco

fun testaAny() {
    val endereco: Endereco = Endereco(logradouro = "rua xpto")

    println(Any())
    println(Unit)
    println(1)
    println(1.0)
    val teste = println(endereco)
    println(teste)
}