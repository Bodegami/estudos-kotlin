package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Endereco

fun testaSafeCall() {
    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "predio")
    val enderecoNaoNuloComplementoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    println(enderecoNulo?.logradouro)
    println(enderecoNaoNulo?.logradouro?.length)

    enderecoNaoNulo.let { println(it?.logradouro) }
    enderecoNulo?.let { endereco: Endereco -> println(endereco.logradouro) }

    enderecoNulo?.let { endereco: Endereco ->
        teste(endereco)
        println("endereco nulo")
    }

    enderecoNaoNulo?.let { endereco: Endereco ->
        teste(endereco).also { println("endereco não nulo") }
    }

    enderecoNaoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: 0
        println(tamanhoComplemento)
    }

//    enderecoNaoNuloComplementoNulo?.let {
//        println(it.logradouro.length)
//        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalArgumentException("complemento vazio!")
//        println(tamanhoComplemento)
//    }

    val numero1: Int = 10
    val numero2: String = "20"
    testeCast(numero1)
    testeCast(numero2)
}

fun teste(endereco: Endereco) {
    println(endereco)
}

fun testeCast(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}