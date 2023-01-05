// Use 'var' para variaveis que podem mudar o valor
// Use 'val' para variaveis imutaveis
// Não é possivel criar uma variavel sem inicializa-la
// O kotlin permite deixar implicito o tipo de retorno

fun main() {
    println("Bem vindo ao Bytebank!")

    var i = 0
    while (i < 5) {
        val titular: String = "Renato $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        //String template
        println("titular: $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }


//    for (i in 5 downTo 1) {
//
//        //o downTo faz um loop reverso
//        // o step é usado para iterar dentro do loop
//        //criamos um if com um break para encerrar o loop em determinada codicao
//        //criamos um if com um continue para pular quando chegar em determinada condicao
//
//        if (i == 2) {
//            break
//        }
//
//        if (i == 4) {
//            continue
//        }
//
//        val titular: String = "Renato $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = i + 10.0
//
//        //String template
//        println("titular: $titular")
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }



    //testaCondicoes(saldo)
    println(somar(10, 20))


}

fun testaCondicoes(saldo: Double) {
    //Utilizando o if, else if e else
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    // When expression -> equivalente ao switch case
    // A sintaxe consiste na chamada do 'when', depois a condição, seguida por '->' e a ação
    // As chaves são opcionais quando o comando é somente uma linha de código
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> {
            println("conta é negativa")
        }
    }
}

fun primeiroLoopCriandoConta() {
    for (i in 1..5) {

        val titular: String = "Renato $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        //String template
        println("titular: $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}

fun loopComDoWhile() {
    var i = 0
    do {
        val titular: String = "Renato $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        //String template
        println("titular: $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    } while (i < 7)
}

fun somar(num1: Int, num2: Int): Int {
    return num1 + num2
}