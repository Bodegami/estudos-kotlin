package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Autenticavel
import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.modelo.SistemaInterno

fun main() {

    /**
     * run() sem extensão para executar qualquer instrução retornando ou não uma computação.
     *
     * also() para imprimir o que está acontecendo no código e devolver o objeto de contexto.
     *
     * apply() para inicializar o objeto de contexto e devolvê-lo.
     *
     * with() para computar e devolver algo utilizando os membros do objeto de contexto.
     *
     **/

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaisculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaisculo)


    val endereco = Endereco()
        //O also tem o objeto de contexto como argumento (it) e retorna o valor do proprio objeto
        .also { println("Criando endereco ") }
        //O apply tem o objeto de contexto como um receiver (this) e retorna o valor do proprio objeto
        .apply {
            this.logradouro = "rua vergueiro"
            this.numero = 3185
        }
        .also {
            println("Preenchendo o endereco $it")
        }


    //O run devolve o resultado da ultima expressão no bloco, assim como no lambda
    run {
        println("Execucao do run sem extensao")
    }

    //O let tem o objeto de contexto como argumento e retorna o resultado do lambda
//    endereco.run {
//            "$logradouro, $numero".toUpperCase()
//        }.let (::println)

    //O with não é uma extensao do objeto, ele recebe o objeto de contexto como parametro, mas dentro
    //do bloco o objeto fica disponivel como um receiver (this). Ele retorna o resultado do lambda
    //A ideia é utilizado quando queremos fazer alguma manipulacao no proprio objeto ou retornar algum valor apartir dele
    with(endereco) {
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
