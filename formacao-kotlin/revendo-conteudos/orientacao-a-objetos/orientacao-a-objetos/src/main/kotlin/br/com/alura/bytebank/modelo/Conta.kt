package br.com.alura.bytebank.modelo

var totalContas = 0
    private set

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

abstract class Conta(
    var titular: Cliente,
    val numero: Int = 0 //atribui o valor 0 como padrao caso nao seja enviado no construtor
) {
    var saldo = 0.0
        protected set

    var total = 0
    init {
        println("Criando conta")
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }

}