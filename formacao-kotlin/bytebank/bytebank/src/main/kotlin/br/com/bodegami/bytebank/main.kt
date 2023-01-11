package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.teste.testaAny
import br.com.bodegami.bytebank.teste.testaFuncionarios


fun main() {

    val endereco: Endereco = Endereco(logradouro = "rua xpto", complemento = "Alura")
    val enderecoNovo = Endereco(bairro = "Vila Mariana", numero = 1000)

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${java.lang.Integer.toHexString(endereco.hashCode())}")

}












