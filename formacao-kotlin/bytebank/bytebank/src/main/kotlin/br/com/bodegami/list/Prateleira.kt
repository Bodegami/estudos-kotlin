package br.com.bodegami.list

data class Prateleira(
    val genereo: String,
    val livros: List<Livro>
) {

    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }

}