package br.com.bodegami.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

//    FORMA NORMAL
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1500.55".toBigDecimal()
//    salarios[1] = "2000.00".toBigDecimal()
//    println(salarios.contentToString())
//
//    println()

    val salariosComArrayCustomizado = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salariosComArrayCustomizado.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salariosComArrayCustomizado
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    //Calcula sala
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)


}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

//Criando uma funcao que devolve um array de BigDecimal
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

//Criando uma expression function para o nosso array de BigDecimal
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}