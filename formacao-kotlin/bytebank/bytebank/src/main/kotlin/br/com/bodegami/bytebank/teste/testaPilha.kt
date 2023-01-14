package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.exception.SaldoInsuficienteException

fun funcao01() {
    println("inicio funcao1")
    try {
        funcao02()
    } catch (e: SaldoInsuficienteException) {
        println(e.printStackTrace())
        println("SaldoInsuficienteException foi pegada!")
    }

    println("fim funcao1")
}

fun funcao02() {
    println("inicio funcao2")
    for (i in 1..5)  {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}