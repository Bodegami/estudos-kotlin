package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Analista
import br.com.bodegami.bytebank.modelo.CalculadoraBonificacao
import br.com.bodegami.bytebank.modelo.Diretor
import br.com.bodegami.bytebank.modelo.Gerente


fun testaFuncionarios() {
    val renato = Analista(
        nome = "Renato",
        cpf = "02145689611",
        salario = 1000.0
    )

    println("nome: ${renato.nome}")
    println("cpf: ${renato.cpf}")
    println("salario: ${renato.salario}")
    println("bonificação: ${renato.bonificacao()} \n")

    val fran = Gerente(
        nome = "Fran",
        cpf = "25635848744",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificação: ${fran.bonificacao()}")

    if (fran.autentica(4000)) {
        println("autenticado com sucesso! \n")
    } else {
        println("falha na autenticação! \n")
    }

    val gui = Diretor(
        nome = "Guilherme",
        cpf = "589614525477",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("bonificação: ${gui.bonificacao()}")
    println("plr: ${gui.plr}")

    if (gui.autentica(4000)) {
        println("autenticado com sucesso! \n")
    } else {
        println("falha na autenticação! \n")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "45896587421",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registro(renato)
    calculadora.registro(fran)
    calculadora.registro(gui)
    calculadora.registro(maria)

    println("total de bonificação: ${calculadora.total}")
}