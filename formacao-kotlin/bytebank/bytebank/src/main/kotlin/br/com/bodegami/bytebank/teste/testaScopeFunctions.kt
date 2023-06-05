package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Endereco

fun testaScopeFunctions() {
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
    }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { endereco -> !endereco.complemento.isNullOrEmpty() }
        .let { enderecosComComplemento ->
            println(enderecosComComplemento)
            println(enderecosComComplemento.size)
        }
}