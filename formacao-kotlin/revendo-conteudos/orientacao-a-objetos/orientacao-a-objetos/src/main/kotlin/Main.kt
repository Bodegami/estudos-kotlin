fun main(args: Array<String>) {
    println("Hello World!")

    val contaRenato = Conta()
    contaRenato.titular = "Renato"
    contaRenato.numero = 1000
    contaRenato.saldo = 200.0
    println(contaRenato.titular)
    println(contaRenato.numero)
    println(contaRenato.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}