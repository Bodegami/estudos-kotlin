fun main(args: Array<String>) {
    println("Hello Byte Bank!")

    // os labels permitem que o construtor recebe os parametros em qualquer ordem
    val contaRenato = Conta(titular = "Renato", numero = 1000)
    contaRenato.deposita(200.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
    contaFran.deposita(300.0)

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

    println("Fran transfere para conta do Renato")
    if (contaFran.transfere(100.0, contaRenato)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaRenato.saldo)
    println(contaFran.saldo)

    println("Fran transfere para conta do Renato")
    if (contaFran.transfere(500.0, contaRenato)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaRenato.saldo)
    println(contaFran.saldo)

}

private fun testaCopiaEReferencia() {
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

/**
 *
 * A forma ideomatica do Kotlin trabalhar com atributos de classe
 * é através de properties. Cada atributo que criamos numa classe
 * contém implicitamente um get e um set. Ex:
 *
 *     var saldo = 0.0
 *         set
 *         get
 *
 */

class Conta(
    var titular: String,
    val numero: Int = 0 //atribui o valor 0 como padrao caso nao seja enviado no construtor
) {
    var saldo = 0.0
        private set

    //construtor secundario
//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo-= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }

/*
    Codigo comum para linguagens que trabalham com orientação a objetos

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor
        }
    }*/

}

