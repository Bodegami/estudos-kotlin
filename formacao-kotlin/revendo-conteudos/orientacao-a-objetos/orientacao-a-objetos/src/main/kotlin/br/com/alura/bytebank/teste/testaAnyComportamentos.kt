package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAnyComportamentos() {
    val endereco = Endereco(logradouro = "Rua Vergueiro", complemento = "Alura", cep = "00000-000")
    val enderecoNovo = Endereco(logradouro = "Rua Vergueiro", complemento = "Alura", cep = "00000-000")

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())


    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")


    println(endereco.equals(enderecoNovo))
}
