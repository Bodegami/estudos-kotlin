package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

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