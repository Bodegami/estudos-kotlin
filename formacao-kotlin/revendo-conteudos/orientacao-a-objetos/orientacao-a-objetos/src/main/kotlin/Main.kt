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

}

