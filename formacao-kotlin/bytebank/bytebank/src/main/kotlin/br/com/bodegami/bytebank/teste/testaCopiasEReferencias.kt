package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Cliente
import br.com.bodegami.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {

    //Exemplo de copia, no Kotlin somente tipos primitivos são copiados para um novo espaço em memoria
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")


    val joao = Cliente(nome = "Joao", cpf = "", senha = 1)
    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    // Exemplo de referência, no Kotlin somente objetos recebem a referência
    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = contaJoao
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "Joao"

    println("titula conta joao: ${contaJoao.titular}")
    println("titula conta maria: ${contaMaria.titular}")
}