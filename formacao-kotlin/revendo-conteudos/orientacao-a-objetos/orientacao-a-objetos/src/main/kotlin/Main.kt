import br.com.alura.bytebank.modelo.Endereco

fun main() {

    // Por padrao os tipos não podem receber nulo, para isso precisamos indicar com o interrogação
    //quando um tipo pode receber nulo. Ex: Endereco?
    var enderecoNulo: Endereco? = null

    // Podemos também indicar ao kotlin que temos certeza que um objeto não é nulo, para isso
    //indicamos com !!. Ex: endereco!!
    val enderecoNaoNulo: Endereco = enderecoNulo!!

    enderecoNaoNulo.logradouro

}




