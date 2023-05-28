open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    //convertendo uma funcao para property
    //open val bonificacao: Double get() = salario * 0.1
    open fun bonificacao(): Double {
        return salario * 0.1
    }

}