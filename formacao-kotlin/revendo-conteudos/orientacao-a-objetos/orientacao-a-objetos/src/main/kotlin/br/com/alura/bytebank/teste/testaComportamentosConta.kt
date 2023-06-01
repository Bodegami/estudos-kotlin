package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.*

fun testaComportamentosConta() {

    val renato = Cliente(
        nome = "Renato",
        cpf = "77744422201",
        senha = 1234
    )

    val fran = Cliente(
        nome = "Fran",
        cpf = "99966633301",
        senha = 4321
    )

    val contaRenato = ContaCorrente(titular = renato, numero = 1000)
    contaRenato.deposita(200.0)

    val contaFran = ContaPoupanca(titular = fran, numero = 1001)
    contaFran.deposita(300.0)

    println(contaRenato.titular)
    println(contaRenato.numero)
    println(contaRenato.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Renato")
    contaRenato.deposita(50.0)
    println(contaRenato.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Renato")
    contaRenato.saca(250.0)
    println(contaRenato.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Renato")
    contaRenato.saca(100.0)
    println(contaRenato.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Fran transfere para conta do Renato")

    try {
        contaFran.transfere(100.0, contaRenato)
        println("Transferencia sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        print("Saldo insuficiente")
        println(e.printStackTrace())
    }

    println(contaRenato.saldo)
    println(contaFran.saldo)

    println("Fran transfere para conta do Renato")

    try {
        contaFran.transfere(500.0, contaRenato)
        println("Transferencia sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        print("Saldo insuficiente")
        println(e.printStackTrace())
    }

    println(contaRenato.saldo)
    println(contaFran.saldo)
}