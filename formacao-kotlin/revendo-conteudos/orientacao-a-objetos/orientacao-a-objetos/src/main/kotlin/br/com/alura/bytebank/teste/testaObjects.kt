package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome = "Fran"
        val cpf = "11122233301"
        val senha = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("NOME DO CLIENTE: ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)


    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(alex, 1000)
    val contaCorrente = ContaCorrente(alex, 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}