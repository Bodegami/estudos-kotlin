import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaContasDiferentes
import br.com.alura.bytebank.teste.testaObjectExpressions

fun main(args: Array<String>) {



    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(alex, 1000)
    val contaCorrente = ContaCorrente(alex, 1001)

    testaContasDiferentes()
    testaObjectExpressions()

    println("Total de contas: $totalContas")
}









