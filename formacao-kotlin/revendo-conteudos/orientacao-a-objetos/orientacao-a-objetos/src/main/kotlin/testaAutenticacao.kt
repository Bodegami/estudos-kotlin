fun testaAutenticacao() {
    
    val gerente = Gerente(
        nome = "Renato",
        cpf = "33322266601",
        salario = 1000.0,
        senha = 1234
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "44455588801",
        salario = 2000.0,
        senha = 4321,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "77788899901",
        senha = 1515
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(diretora, 2000)
    sistemaInterno.entra(cliente, 1515)
}