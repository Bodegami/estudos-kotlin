package br.com.alura

fun main() {

    val nomes: Collection<String> = setOf("Alex", "Fran", "Gui", "Maria", "Ana")
    println(nomes)

    for (nome in nomes) {
        println(nome)
    }

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")

}