package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Endereco

fun testaExpressao() {
    val entrada: String = "1.0"

    //val valor: Double? = try { entrada.toDouble() } catch(e: NumberFormatException) { null }
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido!!")
    }
}

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        //println(e.message)
        //println(e.stackTrace)
        //println(e.cause)
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
        endereco as Endereco
    }
    println("fim funcao2")
}