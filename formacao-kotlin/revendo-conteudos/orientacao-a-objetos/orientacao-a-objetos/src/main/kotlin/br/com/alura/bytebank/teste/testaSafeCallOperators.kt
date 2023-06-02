package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaSafeCallOperators() {
    // Por padrao os tipos não podem receber nulo (nullable), para isso precisamos indicar com o interrogação
    //quando um tipo pode receber nulo. Ex: Endereco?
    var enderecoNulo: Endereco? = null

    // Podemos também indicar ao kotlin que temos certeza que um objeto não é nulo (non-nullable), para isso
    //indicamos com !!. Ex: endereco!!
    //val enderecoNaoNulo: Endereco = enderecoNulo!!
    //enderecoNaoNulo.logradouro


    var enderecoNovo: Endereco? = Endereco(logradouro = "Vergueiro")
    val logradouroNovo: String? = enderecoNovo?.logradouro
    println(logradouroNovo?.length?.toUByte())

    //Com o .let{} (scope function) podemos apenas passar o safe call operator antes do let, de forma que
    //qualquer atributo que tentarmos acessar dentro do bloco, não somos obrigados a passar o safe call
    enderecoNovo?.let {
        println(it.logradouro)
        println(it.cep.length)

    }
}