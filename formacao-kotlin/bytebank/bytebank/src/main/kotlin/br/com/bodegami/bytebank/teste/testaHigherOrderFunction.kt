package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Autenticavel
import br.com.bodegami.bytebank.modelo.SistemaInterno

fun testaHigherOrderFunction() {
    soma(1, 5, resultado = {valor ->
        println(valor)
    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        this.pagamento()
    })

}



fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}