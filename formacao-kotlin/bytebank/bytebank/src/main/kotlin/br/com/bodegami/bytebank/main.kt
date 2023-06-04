package br.com.bodegami.bytebank

fun main() {

    /**
     * Assim como no Python, as funções são Firt-Class, ou seja,
     * elas podem ser assinadas como variaveis ou passadas como
     * parametros.
     */

    //inicializacao atraves de uma expressão lambda
    val minhaFuncaoLambda = {
        println("Executa como Lambda!")
    }
    println(minhaFuncaoLambda())

    //inicializacao atraves de uma funcao anonima
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como funcao anonima!")
    }
    println(minhaFuncaoAnonima())



}

fun testaTipoFuncaoReferencia() {
    //inicializacao atraves da referencia de funcao

    val minhaFuncao = ::teste
    println(minhaFuncao())
}

fun testaTipoFuncaoClasse() {
    //inicializacao atraves de um objeto de classe com a reimplementacao do invoke

    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

fun teste() {
    println("executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }


}
