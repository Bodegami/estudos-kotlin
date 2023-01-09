package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Cliente
import br.com.bodegami.bytebank.modelo.ContaCorrente
import br.com.bodegami.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val renato = Cliente(nome = "Renato", cpf = "", senha = 1)
    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaRenato = ContaCorrente(numero = 1000, titular = renato)
    contaRenato.deposita(200.0)

    println(contaRenato.titular.nome)
    println(contaRenato.numero)
    println(contaRenato.saldo)

    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)


    println("depositando na conta do Renato")
    contaRenato.deposita(-50.0)
    println(contaRenato.saldo)

    println("depositando na conta do Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando da conta do Renato")
    contaRenato.saca(250.0)
    println(contaRenato.saldo)

    println("sacando da conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso")
    contaRenato.saca(100.0)
    println(contaRenato.saldo)

    println("saque em excesso")
    contaFran.saca(300.0)
    println(contaFran.saldo)

    println("transferencia da conta da Fran para o Renato:")
    if (contaFran.transfere(valor = 300.0, destino = contaRenato)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println("Saldo da conta do Renato: ${contaRenato.saldo}")
    println("Saldo da conta da Fran: ${contaFran.saldo}")
}