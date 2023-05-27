package br.com.bodegami.list

val listaLivros = mutableListOf<Livro>(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),

    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1856,
        editora = "Editora B"
    )
)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),

    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1856,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )
)



