package modelo

import modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registro(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registro(gerente: modelo.Gerente) {
//        this.total += gerente.bonificacao()
//    }
//
//    fun registro(diretor: modelo.Diretor) {
//        this.total += diretor.bonificacao()
//    }

}