package br.com.bodegami.bytebank.modelo

import br.com.bodegami.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {

    var saldo: Double = 0.0
        protected set(valor) {
            field = valor
        }

    companion object Contador {
        var total: Int = 0
            private set
    }

    init {
        println("Criando conta $total")
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }

        this.saca(valor)
        destino.deposita(valor)
    }

}