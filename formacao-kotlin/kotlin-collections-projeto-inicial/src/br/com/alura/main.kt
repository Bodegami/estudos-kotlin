package br.com.alura

fun main() {

    val banco = BancoDeNomes()
    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)

}

class BancoDeNomes {

    val nomes: Collection<String> get() = Companion.dados

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }


}


private fun testaColecao() {
    val nomes: Collection<String> = setOf("Alex", "Fran", "Gui", "Maria", "Ana")
    println(nomes)

    for (nome in nomes) {
        println(nome)
    }

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}