package br.com.bodegami.list

data class Prateleira(
    val genereo: String,
    val livros: MutableList<Livro>
) {

    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }

}