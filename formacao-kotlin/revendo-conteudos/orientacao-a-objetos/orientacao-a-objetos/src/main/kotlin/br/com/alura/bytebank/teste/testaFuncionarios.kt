package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*


fun testaFuncionarios() {

    val renato: Analista = Analista(
        nome = "Renato",
        cpf = "11122233301",
        salario = 1000.0
    )

    println("nome $${renato.nome}")
    println("cpf $${renato.cpf}")
    println("salario $${renato.salario}")
    println("bonificacao ${renato.bonificacao()}")

    val fran: Gerente = Gerente(
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

    val gui: Diretor = Diretor(
        nome = "Gui",
        cpf = "66655544401",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome $${gui.nome}")
    println("cpf $${gui.cpf}")
    println("salario $${gui.salario}")
    println("bonificacao ${gui.bonificacao()}")
    println("plr ${gui.plr}")

    val maria: Funcionario = Analista(
        nome = "Maria",
        cpf = "33322211101",
        salario = 3000.0
    )


    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(renato)
    calculadoraBonificacao.registra(fran)
    calculadoraBonificacao.registra(gui)
    calculadoraBonificacao.registra(maria)

    println("Total de bonificacao é ${calculadoraBonificacao.total}")
}