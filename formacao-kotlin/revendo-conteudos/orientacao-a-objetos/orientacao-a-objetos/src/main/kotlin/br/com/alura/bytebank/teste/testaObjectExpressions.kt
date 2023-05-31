package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjectExpressions() {
    // Object Expressions
    // Tem a mesma ideia da classe anonima do Java, onde criamos um objeto apenas para um cenário especifico
    val fran = object : Autenticavel {
        val nome = "Fran"
        val cpf = "11122233301"
        val senha = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("NOME DO CLIENTE: ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
}