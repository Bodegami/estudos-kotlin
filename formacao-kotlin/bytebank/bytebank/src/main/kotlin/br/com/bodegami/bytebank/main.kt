package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Endereco

fun main() {

    val testeFuncao: () -> Unit

    Endereco().let {
        it
    }


    "".let(::testeRecebeString)

    1.let {
        it
    }

    teste (1, {})



}

fun testeRecebeString(teste: String) {

}

//High Order Function
//É quando temos uma função recebe ou devolve outra função
fun teste(teste: Int, bloco: () -> Unit) {

}