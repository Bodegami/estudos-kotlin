// Use 'var' para variaveis que podem mudar o valor
// Use 'val' para variaveis imutaveis
// Não é possivel criar uma variavel sem inicializa-la
// O kotlin permite deixar implicito o tipo de retorno
// No Kotlin, por padrao quando nao especificamos o tipo de retorno, implicitamente ele retorna o tipo Unit
// Na classe Conta as variaveis "titular" e "numero" tem Getters e Setters implicitos e publicos
// Na classe Conta a variavel "saldo" tem Gettter explicito e publico, Setter explicito e privado
// No kotlin, utilizamos a palavra reservada constructor() para inicializar um construtor secundario
// O construtor primario fica ao lado do nome da classe. Exemplo: Conta(nome: String, idade: Int)
// É possivel tb indicar que aquele atributo do construtor é a property. Exemplo: Conta(var nome: String, var idade: Int)

fun main() {
    println("Bem vindo ao Bytebank!")

    val contaRenato = Conta("Renato", 1000)
    contaRenato.deposita(200.0)

    println(contaRenato.titular)
    println(contaRenato.numero)
    println(contaRenato.saldo)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)


    println("depositando na conta do Renato")
    contaRenato.deposita(-50.0)
    println(contaRenato.saldo)

    println("depositando na conta do Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando da conta do Renato")
    contaRenato.saca(250.0)
    println(contaRenato.saldo)

    println("sacando da conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso")
    contaRenato.saca(100.0)
    println(contaRenato.saldo)

    println("saque em excesso")
    contaFran.saca(300.0)
    println(contaFran.saldo)

    println("transferencia da conta da Fran para o Renato:")
    if (contaFran.transfere(300.0, contaRenato)) {
        println("Transferencia sucedida")
    } else {
        println("Falha na transferencia")
    }

    println("Saldo da conta do Renato: ${contaRenato.saldo}")
    println("Saldo da conta da Fran: ${contaFran.saldo}")


    //executaAsFuncoes()
}


class Conta(var titular: String, var numero: Int) {

    var saldo: Double = 0.0
        private set(valor) {
            field = valor
        }
        get

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saca(valor)
            destino.deposita(valor)
            return true
        }

        return false
    }

//    fun getSaldo(): Double {
//        return this.saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            this.saldo += valor
//        }
//    }

}


fun executaAsFuncoes() {
    println("\n<------------------------------Testa Condições com If Else---------------------------------->\n")
    var saldo = 20.0
    testaCondicoesComIfElse(saldo)

    println("\n<------------------------------Testa Condições com When---------------------------------->\n")
    saldo = 0.0
    testaCondicoesComWhen(saldo)

    println("\n<--------------------------------Testa Laços com While------------------------------------>\n")
    testaLacosComWhile()

    println("\n<--------------------------------Testa Laços com Do While------------------------------------>\n")
    testaLacosComDoWhile()

    println("\n<--------------------------------Testa Laços com For e DownTo------------------------------------>\n")
    testaLacosComForEDownTo()

    println("\n<--------------------------------Testa Laços com For e Range------------------------------------>\n")
    testaLacosComForERange()

    println("\n<---------------------------------Testa Soma------------------------------------>\n")
    println(somar(10, 20))

    println("\n<---------------------------------Testa Copias e Referências------------------------------------>\n")
    println(testaCopiasEReferencias())
}

fun testaCondicoesComIfElse(saldo: Double) {
    //Utilizando o if, else if e else
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }


}

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

fun testaLacosComForERange() {
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

fun testaLacosComDoWhile() {
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

fun testaLacosComWhile() {
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
}

fun testaLacosComForEDownTo() {

    for (i in 5 downTo 1) {

        //o downTo faz um loop reverso
        // o step é usado para iterar dentro do loop
        //criamos um if com um break para encerrar o loop em determinada codicao
        //criamos um if com um continue para pular quando chegar em determinada condicao

        if (i == 2) {
            break
        }

        if (i == 4) {
            continue
        }

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

fun somar(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun testaCopiasEReferencias() {

    //Exemplo de copia, no Kotlin somente tipos primitivos são copiados para um novo espaço em memoria
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")


    // Exemplo de referência, no Kotlin somente objetos recebem a referência
    val contaJoao = Conta("Joao", 1002)
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
    contaJoao.titular = "Joao"

    println("titula conta joao: ${contaJoao.titular}")
    println("titula conta maria: ${contaMaria.titular}")
}