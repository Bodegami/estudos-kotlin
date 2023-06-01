import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaFuncionarios

fun main(args: Array<String>) {
    val endereco = Endereco()

    println(endereco)

    imprime(Unit)
    imprime(1)
    imprime(2.0)
    imprime(endereco)

    val objeto = Any()
    println(objeto)

    val teste: Any = imprime(endereco)
    println(teste)

    testaFuncionarios()

}

fun imprime(valor: Any) : Any {
    println(valor)
    return valor
}












