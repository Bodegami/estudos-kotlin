package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

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
) : Autenticavel {
    var saldo = 0.0
        protected set

    //Object Declarations
    companion object {
        var total = 0
            private set
    }
    init {
        println("Criando conta")
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
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor"
            )
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        this.saldo -= valor
        destino.deposita(valor)
    }

}