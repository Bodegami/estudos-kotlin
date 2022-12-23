
// Use 'var' para variaveis que podem mudar o valor
// Use 'val' para variaveis imutaveis
// Não é possivel criar uma variavel sem inicializa-la
//O kotlin permite deixar implicito o tipo de retorno

fun main() {
    println("Bem vindo ao Bytebank!")
    val titular: String = "Renato"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo = 100 + 2.0
    saldo += 200
    saldo = 0.0
    saldo -= 1000

    //String template
    println("titular: $titular")
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")

    //Utilizando o if, else if e else
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if(saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    // When expression -> equivalente ao switch case
    // A sintaxe consiste na chamada do 'when', depois a condição, seguida por '->' que indica o comando a ser executado
    // As chaves são opcionais quando o comando é somente uma linha de código
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> {
            println("conta é negativa")
        }
    }


}