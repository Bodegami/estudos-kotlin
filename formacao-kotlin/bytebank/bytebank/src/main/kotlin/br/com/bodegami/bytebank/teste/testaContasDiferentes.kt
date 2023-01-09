package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Cliente
import br.com.bodegami.bytebank.modelo.ContaCorrente
import br.com.bodegami.bytebank.modelo.ContaPoupanca
import br.com.bodegami.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Renato", cpf = "111.111.111-11", senha = 1000, endereco = Endereco(
            logradouro = "Rua Vergueiro"
        )),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "", senha = 2),
        numero = 1001
    )

    println("titular ")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereco do titular ${contaCorrente.titular.endereco.logradouro}")


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo atual corrente: ${contaCorrente.saldo}")
    println("saldo atual poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber a transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber a transferencia: ${contaCorrente.saldo}")
}