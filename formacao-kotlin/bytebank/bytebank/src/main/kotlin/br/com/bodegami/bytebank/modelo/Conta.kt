package br.com.bodegami.bytebank.modelo

abstract class Conta(
    var titular: String,
    val numero: Int
) {

    var saldo: Double = 0.0
        protected set(valor) {
            field = valor
        }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saca(valor)
            destino.deposita(valor)
            return true
        }

        return false
    }

}