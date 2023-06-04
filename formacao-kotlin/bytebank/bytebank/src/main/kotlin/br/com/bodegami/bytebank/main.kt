package br.com.bodegami.bytebank

fun main() {

    /**
     * Assim como no Python, as funções são Firt-Class, ou seja,
     * elas podem ser assinadas como variaveis ou passadas como
     * parametros.
     */

    val minhaFuncao = ::teste

    println(minhaFuncao())

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
