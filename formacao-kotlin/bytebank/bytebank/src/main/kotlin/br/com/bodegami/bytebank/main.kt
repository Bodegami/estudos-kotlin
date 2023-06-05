package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Autenticavel
import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.modelo.SistemaInterno

fun main() {

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaisculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaisculo)

    //O apply e o also retornam o objeto de contexto
    //já o run devolve o resultado da ultima expressão no bloco, assim como no lambda
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let (::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter { endereco -> !endereco.complemento.isNullOrEmpty() }
        .let { enderecosComComplemento ->
            println(enderecosComComplemento)
            println(enderecosComComplemento.size)
        }

    soma(1, 5, resultado = {
        println(it)
    })

    val autenticavel = object: Autenticavel {
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
