package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    println("início main")
    val entrada: String = "1.9"

    //Try expression
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    //If expression
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        0.0
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("Valor inválido!")
    }

    funcao1()
    println("fim main")
}