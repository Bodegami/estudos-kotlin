package fundamentos

class Pessoa(
    var nome: String,
    var idade: Int


) {
    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade)"
    }
}

fun main() {
    var renato = Pessoa(nome = "renato", idade = 26)
    print(renato)
}