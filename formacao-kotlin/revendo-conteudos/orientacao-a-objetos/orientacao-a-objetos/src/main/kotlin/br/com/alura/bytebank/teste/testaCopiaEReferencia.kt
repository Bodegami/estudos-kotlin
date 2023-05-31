package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(
        nome = "João",
        cpf = "77744422201",
        senha = 1234
    )

    val maria = Cliente(
        nome = "Maria",
        cpf = "99966633301",
        senha = 4321
    )

    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = ContaPoupanca(maria, 1003)

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)

    /**
     *
     * Ao finalizar o teste, o comportamento de cópia para variáveis
     * do tipo primitivo deve ser mantido, e para variáveis do tipo
     * modelo.Conta deve apresentar o comportamento de referência.
     *
     */
}