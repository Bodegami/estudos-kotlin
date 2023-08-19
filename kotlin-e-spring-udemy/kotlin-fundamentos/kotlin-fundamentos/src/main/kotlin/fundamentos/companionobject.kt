package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criaClasseComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Renato", "rua vergueiro", 36)
        }

        fun criarAPartirDeSegundaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }

    override fun toString(): String {
        return "MinhaClasse(nome='$nome', endereco='$endereco', idade=$idade)"
    }


}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaClasseComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Daniel", "rua teste", 25)
    }

    override fun toString(): String {
        return "SegundaClasse(nome='$nome', endereco='$endereco', idade=$idade)"
    }


}

fun main() {

    var segundaClasse = SegundaClasse("nome", "endereco", 0).criaClasseComValoresPadrao()
    println(segundaClasse)

    var minhaClasse = MinhaClasse.criaClasseComValoresPadrao()
    println(minhaClasse)

    var minhaClasseComValoresDaSegundaClasse = MinhaClasse.criarAPartirDeSegundaClasse(segundaClasse)
    println(minhaClasseComValoresDaSegundaClasse)


}