package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.exception.FalhaAutenticacaoException
import br.com.bodegami.bytebank.exception.SaldoInsuficienteException
import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.teste.*


fun main() {

    println("inicio main")
    //funcao1()
    testaComportamentosConta()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println(e.printStackTrace())
        println("SaldoInsuficienteException foi pegada!")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5)  {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}





















