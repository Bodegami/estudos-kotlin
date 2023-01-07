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