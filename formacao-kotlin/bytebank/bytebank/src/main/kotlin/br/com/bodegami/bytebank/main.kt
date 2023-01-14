package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.exception.FalhaAutenticacaoException
import br.com.bodegami.bytebank.exception.SaldoInsuficienteException
import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.teste.*


fun main() {

    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    println(enderecoNulo?.logradouro)
    println(enderecoNaoNulo?.logradouro?.length)

    enderecoNaoNulo.let { println(it?.logradouro) }
    enderecoNulo?.let { endereco: Endereco -> println(endereco.logradouro) }

    enderecoNulo?.let { endereco: Endereco ->
        teste(endereco)
        println("endereco nulo")
    }

    enderecoNaoNulo?.let { endereco: Endereco ->
        teste(endereco).also { println("endereco não nulo") }
    }

}

fun teste(endereco: Endereco) {
    println(endereco)
}























