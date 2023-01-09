package teste

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