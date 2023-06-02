import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaSafeCallOperators

fun main() {

    /**
     *
     *  Elvis Operator (?:)
     *
     *  funciona basicamente como um if ternario, no primeiro caso ele tenta
     *  pegar um valor do objeto ou executar uma acao e caso retorno nulo,
     *  podemos indicar um valor ou acao que pode ser retorno como padrao.
     *
     */


    var enderecoNovo: Endereco? = Endereco(logradouro = "Vergueiro", complemento = "null")
    val logradouroNovo: String? = enderecoNovo?.logradouro
    enderecoNovo?.let {
        println(it.logradouro)
        println(it.cep.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalArgumentException("Complemento não pode ser vazio")

        println(tamanhoComplemento)
    }

    /**
     *
     *  Safe Casts (val aInt: Int? = a as? Int
     *
     *  O safe cast tenta fazer o cast de um objeto e caso ele não consiga,
     *  ao inves de lançar uma ClassCastException, podemos retornar apenas
     *  null com o safe casts.
     *
     */


    teste(1)
    teste("a")

}

fun teste(valor: Any?) {
    val numero: Int? = valor as? Int
    println(numero)
}




