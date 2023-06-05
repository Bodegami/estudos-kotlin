package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Cliente
import br.com.bodegami.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.222.333-01", senha = 1234), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulacao rendimento anual: $rendimentoAnual")
}