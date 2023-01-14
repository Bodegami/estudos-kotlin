package br.com.bodegami.bytebank.modelo

import br.com.bodegami.bytebank.exception.FalhaAutenticacaoException
import br.com.bodegami.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {

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

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                message = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído")
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        this.saca(valor)
        destino.deposita(valor)
    }

}