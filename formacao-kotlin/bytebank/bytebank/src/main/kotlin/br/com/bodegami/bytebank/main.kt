package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.teste.*


fun main() {

    println("inicio main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println(e.printStackTrace())
        println("ClassCastException foi pegada!")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5)  {
        println(i)
        val endereco = Any()
        throw ArithmeticException()
    }
    println("fim funcao2")
}


















