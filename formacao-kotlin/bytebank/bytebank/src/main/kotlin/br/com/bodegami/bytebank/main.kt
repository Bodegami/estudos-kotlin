package br.com.bodegami.bytebank

var numero = 10

fun main() {

    println(soma(1, 5))
    numero = 3
    println(soma(1,5))

}

fun soma(a: Int, b: Int) : Int = a + b


