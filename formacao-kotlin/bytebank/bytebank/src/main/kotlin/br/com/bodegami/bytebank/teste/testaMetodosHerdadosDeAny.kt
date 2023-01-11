package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Endereco

fun testaMetodosHerdadosDeAny() {
    val endereco: Endereco = Endereco(logradouro = "rua xpto", complemento = "Alura", cep = "00000-000")
    val enderecoNovo = Endereco(logradouro = "rua xpto", complemento = "Alura", cep = "00000-000")

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}
