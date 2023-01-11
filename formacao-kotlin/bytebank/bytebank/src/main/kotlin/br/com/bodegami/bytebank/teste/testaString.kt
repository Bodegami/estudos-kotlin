package br.com.bodegami.bytebank.teste

fun testaString() {
    val p1 = Pessoa("Renato")
    val p2 = p1

    p2.nome = "Fran"

    println(p1.nome)
    println(p2.nome)


    var palavra = "palavra"
    var palavraNova = palavra
    palavraNova = "palavraNova"
    val substring = palavra.substring(4)

    println(palavra)
    println(palavraNova)
    println(substring)

    for (c in palavra) {
        println(c == 'a')
    }
}

class Pessoa(var nome: String)