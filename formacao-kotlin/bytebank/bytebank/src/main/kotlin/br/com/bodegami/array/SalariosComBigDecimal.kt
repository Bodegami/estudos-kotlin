package br.com.bodegami.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()
    println(salarios.contentToString())

    println()

    val salariosComArrayCustomizado = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salariosComArrayCustomizado.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salariosComArrayCustomizado
        .map { salario ->
            if (salario < "5000.00".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }

        }
        .toTypedArray()
    println(salariosComAumento.contentToString())
}

//Criando uma funcao que devolve um array de BigDecimal
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}