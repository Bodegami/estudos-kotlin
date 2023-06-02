package br.com.alura

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    //nomesSalvos.add("Paulo")
    println(nomesSalvos) // recebeu uma copia da lista
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }


}


fun testaColecao() {
    val nomes: Collection<String> = setOf("Alex", "Fran", "Gui", "Maria", "Ana")
    println(nomes)

    for (nome in nomes) {
        println(nome)
    }

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}