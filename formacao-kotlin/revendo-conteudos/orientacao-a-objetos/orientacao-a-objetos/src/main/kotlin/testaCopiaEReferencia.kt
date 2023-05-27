fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

    /**
     *
     * Ao finalizar o teste, o comportamento de cópia para variáveis
     * do tipo primitivo deve ser mantido, e para variáveis do tipo
     * Conta deve apresentar o comportamento de referência.
     *
     */
}