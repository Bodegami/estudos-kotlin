package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "77744422201",
        senha = 1234,
        endereco = Endereco(
            logradouro = "Rua Vergueiro"
        )
    )

    val fran = Cliente(
        nome = "Fran",
        cpf = "99966633301",
        senha = 4321
    )

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente apos deposito: ${contaCorrente.saldo}")
    println("Saldo poupanca apos deposito: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente apos saque: ${contaCorrente.saldo}")
    println("Saldo poupanca apos saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1234)

    println("Saldo corrente apos transferencia para poupanca: ${contaCorrente.saldo}")
    println("Saldo poupanca apos receber transferencia da corrente: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 4321)

    println("Saldo poupanca apos transferencia para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente apos receber transferencia da poupanca: ${contaCorrente.saldo}")

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereco titular ${contaCorrente.titular.endereco.logradouro}")

    println("titular")
    println("nome do titular ${contaPoupanca.titular.nome}")
    println("cpf do titular ${contaPoupanca.titular.cpf}")
    println("endereco titular ${contaPoupanca.titular.endereco.logradouro}")
}