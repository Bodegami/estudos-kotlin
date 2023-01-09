package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Cliente
import br.com.bodegami.bytebank.modelo.ContaCorrente
import br.com.bodegami.bytebank.modelo.ContaPoupanca
import br.com.bodegami.bytebank.modelo.totalContas
import br.com.bodegami.bytebank.teste.*

fun main() {

    val renato = Cliente(nome = "Renato", cpf = "111.111.111-11", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = renato, numero = 1000)
    val contaCorrente = ContaCorrente(titular = renato, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}











