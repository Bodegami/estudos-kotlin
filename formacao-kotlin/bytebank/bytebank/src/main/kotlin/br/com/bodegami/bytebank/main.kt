package br.com.bodegami.bytebank

fun main() {

//    /**
//     * Assim como no Python, as funções são Firt-Class, ou seja,
//     * elas podem ser assinadas como variaveis ou passadas como
//     * parametros.
//     */

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()


//    testaFuncaoLambda()
//
//    testaTipoFuncaoAnonima()


}

fun testaFuncaoLambda() {
    //inicializacao atraves de uma expressão lambda
    val minhaFuncaoLambda = {
        println("Executa como Lambda!")
    }
    println(minhaFuncaoLambda())
}

fun testaTipoFuncaoAnonima() {
    //inicializacao atraves de uma funcao anonima
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como funcao anonima!")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoReferencia() {
    //inicializacao atraves da referencia de funcao
    //devemos indicar os paramtros de entra e saida. ex: (Int, Int) -> Int
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun testaTipoFuncaoClasse() {
    //inicializacao atraves de um objeto de classe com a reimplementacao do invoke

    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(10, 10))
}

fun soma(a: Int, b: Int) : Int = a + b

class Soma: (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2

}
