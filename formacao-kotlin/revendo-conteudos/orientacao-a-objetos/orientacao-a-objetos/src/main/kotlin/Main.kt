fun main(args: Array<String>) {
    println("Hello Byte Bank!")


    val renato = Funcionario(
        nome = "Renato",
        cpf = "11122233301",
        salario = 1000.0
    )

    println("nome $${renato.nome}")
    println("cpf $${renato.cpf}")
    println("salario $${renato.salario}")
    println("bonificacao ${renato.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "99988877701",
        salario = 2000.0,
        senha = 1234
    )

    println("nome $${fran.nome}")
    println("cpf $${fran.cpf}")
    println("salario $${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    if (fran.autentica(4000)) {
        println("autenticou com sucesso!")
    } else {
        println("falha na autenticacao!")
    }

}

