package br.com.bodegami.bytebank.teste

fun testaFuncaoLambda() {
    //inicializacao atraves de uma expressão lambda
    val minhaFuncaoLambda = { a: Int, b: Int ->
        println("Executa como Lambda!")
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1100.0))
}

fun testaTipoFuncaoAnonima() {
    //inicializacao atraves de uma funcao anonima
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("Executa como funcao anonima!")
        return a + b
    }
    println(minhaFuncaoAnonima(15, 15))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1100.0))
}

fun testaTipoFuncaoReferencia() {
    //inicializacao atraves da referencia de funcao
    //devemos indicar os paramtros de entra e saida. ex: (Int, Int) -> Int
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun testaTipoFuncaoClasse() {
    //inicializacao atraves de um objeto de classe com a reimplementacao do invoke
    //a funcao anonima de certa forma é mais declarativa e legivel
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(10, 10))
}

fun soma(a: Int, b: Int) : Int = a + b

class Soma: (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

}