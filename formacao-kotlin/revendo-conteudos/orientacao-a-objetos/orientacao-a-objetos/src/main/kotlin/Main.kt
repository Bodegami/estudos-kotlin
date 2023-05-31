import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas
import br.com.alura.bytebank.teste.testaContasDiferentes

fun main(args: Array<String>) {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(alex, 1000)
    val contaCorrente = ContaCorrente(alex, 1001)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}









