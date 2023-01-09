package br.com.bodegami.bytebank.modelo

import br.com.bodegami.bytebank.modelo.Funcionario

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override fun bonificacao(): Double {
        return salario * 0.5
    }

}