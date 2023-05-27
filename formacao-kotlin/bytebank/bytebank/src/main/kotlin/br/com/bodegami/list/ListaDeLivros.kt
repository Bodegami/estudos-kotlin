package br.com.bodegami.list

fun main() {

    val livro = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livros = listaLivros

    // adicionando um livro
    livros.add(livro)


    // usanda expression function
    livros.imprimeComMarcadores()

    // removendo um livro
    livros.remove(livro)

    livros.imprimeComMarcadores()

    //ordenando um List
    // sorted() devolve um tipo List. Para chamar o metodo imprimeComMarcadores, alteramos de MutableList para List.
    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    // usando sorteBy passando apenas o elemento de comparacao
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    //filtrando dados de uma lista
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    val listaDeTitulos: List<String> = livros
        .filter { it.autor.startsWith("João") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(listaDeTitulos)

}