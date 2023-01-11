package br.com.bodegami.bytebank

import br.com.bodegami.bytebank.modelo.Endereco
import br.com.bodegami.bytebank.teste.testaFuncionarios


fun main() {

    val endereco: Endereco = Endereco(logradouro = "rua xpto")

    imprime(Any())
    imprime(Unit)
    imprime(1)
    imprime(1.0)
    val teste = imprime(endereco)
    println(teste)

    testaFuncionarios()


}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}









