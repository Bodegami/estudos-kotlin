package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Cliente
import br.com.bodegami.bytebank.modelo.Diretor
import br.com.bodegami.bytebank.modelo.Gerente
import br.com.bodegami.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Renato",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente, 1234)

}