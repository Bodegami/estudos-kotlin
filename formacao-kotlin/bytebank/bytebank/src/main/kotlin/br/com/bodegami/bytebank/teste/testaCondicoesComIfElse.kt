package br.com.bodegami.bytebank.teste

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