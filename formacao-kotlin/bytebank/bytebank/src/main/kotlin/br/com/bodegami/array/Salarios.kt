package br.com.bodegami.array

fun main() {

    var salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    var posicao = 0
    for (salario in salarios) {
        salarios[posicao] = salario * aumento
        posicao++
    }
    println(salarios.contentToString())


    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())


    salarios.forEachIndexed { indice, salario ->
        salarios[indice] = salario * aumento
    }
    println(salarios.contentToString())


    val salariosComAumento = salarios.map { salario -> salario * aumento }
    println(salariosComAumento)

}