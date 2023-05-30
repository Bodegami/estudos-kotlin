package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {
    // os labels permitem que o construtor recebe os parametros em qualquer ordem
    val contaRenato = ContaCorrente(titular = "Renato", numero = 1000)
    contaRenato.deposita(200.0)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
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
    if (contaFran.transfere(100.0, contaRenato)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaRenato.saldo)
    println(contaFran.saldo)

    println("Fran transfere para conta do Renato")
    if (contaFran.transfere(500.0, contaRenato)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaRenato.saldo)
    println(contaFran.saldo)
}