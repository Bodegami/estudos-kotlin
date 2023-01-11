package br.com.bodegami.bytebank.teste

fun testaNumber() {
    var x: Int = 15
    val y: Double = 14.5
    var z = x

    z += 10


    teste(x)
    teste(y)

    println(z)
    println(x.toDouble())
    println(y.toLong())
}

fun teste(valor: Number) {
    println(valor)
}