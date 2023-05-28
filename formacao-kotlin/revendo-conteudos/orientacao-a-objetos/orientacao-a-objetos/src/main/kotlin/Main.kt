fun main(args: Array<String>) {
    println("Hello Byte Bank!")

    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente apos deposito: ${contaCorrente.saldo}")
    println("Saldo poupanca apos deposito: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente apos saque: ${contaCorrente.saldo}")
    println("Saldo poupanca apos saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente apos transferencia para poupanca: ${contaCorrente.saldo}")
    println("Saldo poupanca apos receber transferencia da corrente: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo poupanca apos transferencia para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente apos receber transferencia da poupanca: ${contaCorrente.saldo}")

}


