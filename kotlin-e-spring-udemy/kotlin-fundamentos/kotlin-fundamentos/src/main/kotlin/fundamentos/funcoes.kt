package fundamentos

fun main(): Unit {
    dizOi(retornaNome())
    dizOi(idade = 26, nome = retornaNome())
}

fun retornaNome(): String {
    return "Renato"
}

fun dizOi(nome: String, idade: Int? = 0) {
    println("Oi $nome, parabéns pelos seus $idade anos!")
}