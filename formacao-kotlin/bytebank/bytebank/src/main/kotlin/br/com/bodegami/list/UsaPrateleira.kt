package br.com.bodegami.list

fun main() {

    val prateleira = Prateleira(genereo = "Literatura", livros = listaLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicao.imprimeComMarcadores()

}