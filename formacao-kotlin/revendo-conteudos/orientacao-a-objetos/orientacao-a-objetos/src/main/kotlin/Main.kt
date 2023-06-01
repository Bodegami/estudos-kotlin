import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")
    try {
        10/0
    }
    catch (e: ArithmeticException) {
        println("ArithmeticException capturada!")
    }
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    }
    catch (e: ClassCastException) {
        e.printStackTrace()
        println("ClassCastException capturada!")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}
