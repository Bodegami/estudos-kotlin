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

}

private fun testaCopiaEReferencia() {
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

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo-= valor
        }
    }

}

