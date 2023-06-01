package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao()
    }

    /**
     *
     *
     *         funcionario as Funcionario -> faz o cast e altera a mesma variavel, caso contrario lanca exception
     *         if (funcionario is Funcionario) { // -> verifica e faz o smart cast e altera a mesma variavel
     *             this.total += funcionario.bonificacao()
     *         }
     *
     */

}