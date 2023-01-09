package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {

    //Exemplo de copia, no Kotlin somente tipos primitivos são copiados para um novo espaço em memoria
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")


    // Exemplo de referência, no Kotlin somente objetos recebem a referência
    val contaJoao = ContaCorrente("Joao", 1002)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "Joao"

    println("titula conta joao: ${contaJoao.titular}")
    println("titula conta maria: ${contaMaria.titular}")
}