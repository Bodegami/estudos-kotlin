import modelo.Cliente
import teste.*
import java.lang.StringBuffer as StringBufferJava
import novoModelo.Cliente as NovoCliente

fun main() {

    val palavra: kotlin.String = "texto kotlin"
    val palavraJava: StringBufferJava = StringBufferJava("texto java")

    println(palavra)
    println(palavraJava)

    val cliente = Cliente("Renato", "000.000.000-00", 1)
    val clienteNovo = NovoCliente()

}










