package fundamentos

fun main() {

    //retornaValorDeX()

    when {
        comecaComOi(5) -> println("5")
        //comecaComOi("oi, tudo bem?") -> println("ola, tudo bem?")
        comecaComOi("oi, estou bem!") -> println("oi, estou bem!")
    }
}

fun retornaValorDeX() {
    val x = 35

    when (x) {
        5, -5 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        10 -> {
            println("x == 10")
            println("x é uma dezena")
        }

        in 11..15 -> println("x está entre 11 e 15")
        !in 16..20 -> println("numero não estrá no range de 16 a 20")
        else -> println("numero não mapeado")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when(x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}