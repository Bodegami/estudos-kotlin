package teste

fun testaCondicoesComWhen(saldo: Double) {

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