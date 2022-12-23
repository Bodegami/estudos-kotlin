
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


    //String template
    println("titular: $titular")
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")


}