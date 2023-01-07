class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registro(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

//    fun registro(gerente: Gerente) {
//        this.total += gerente.bonificacao()
//    }
//
//    fun registro(diretor: Diretor) {
//        this.total += diretor.bonificacao()
//    }

}