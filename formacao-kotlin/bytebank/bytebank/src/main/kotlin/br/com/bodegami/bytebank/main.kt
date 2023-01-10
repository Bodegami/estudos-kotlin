package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.*
import br.com.bodegami.bytebank.teste.*

fun main() {

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha:Int) = this.senha == senha

        fun imprime() {
            var total: Int = 0

            for (i in this.cpf) {

                when (i) {
                    '1' -> total += i.digitToInt()
                    '.' -> continue
                    '-' -> continue
                }
                println(total)
            }
        }
    }

    println("nome do cliente ${fran.nome}")
    fran.imprime()

    val sistemaInterno: SistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    val renato = Cliente(nome = "Renato", cpf = "111.111.111-11", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = renato, numero = 1000)
    val contaCorrente = ContaCorrente(titular = renato, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}











