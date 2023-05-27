fun main(args: Array<String>) {
    println("Hello World!")

    val contaRenato = Conta()
    contaRenato.titular = "Renato"
    contaRenato.numero = 1000
    contaRenato.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

//    println(contaRenato.titular)
//    println(contaRenato.numero)
//    println(contaRenato.saldo)
//
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)


    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

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

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}