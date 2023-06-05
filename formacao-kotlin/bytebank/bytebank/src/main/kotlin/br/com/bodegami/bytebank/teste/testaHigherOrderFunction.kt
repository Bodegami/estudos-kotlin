package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Autenticavel
import br.com.bodegami.bytebank.modelo.SistemaInterno

fun testaHigherOrderFunction() {
    soma(1, 5, resultado = {
        println(it)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}



fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}