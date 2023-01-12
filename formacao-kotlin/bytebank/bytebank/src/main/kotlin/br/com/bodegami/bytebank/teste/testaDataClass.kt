package br.com.bodegami.bytebank.teste

fun testaDataClass() {

    val renato = Humano(nome = "Renato", idade = 35)
    val renato2 = renato.copy()

    println(renato == renato2)

    val (nome, idade) = renato
    println("NOME: $nome | IDADE: $idade")

    renato.fala()

    val documento = Documento(rg = "12345678-9", cpf = "123.456.789-01"    )
    val documento2 = documento.copy(rg = "1234")

    println(documento == documento2)

    val (rg, cpf) = documento
    println(renato)
    println(renato2)
    println(documento)
    println(documento2)
    println("RG: $rg | CPF: $cpf")
}

class Humano(val nome: String, val idade: Int) {

    fun fala() {
        println("emite som")
    }

    operator fun component1() = this.nome
    operator fun component2() = this.idade

    fun copy(): Humano {
        return this
    }

}

data class Documento(val rg: String, val cpf: String)