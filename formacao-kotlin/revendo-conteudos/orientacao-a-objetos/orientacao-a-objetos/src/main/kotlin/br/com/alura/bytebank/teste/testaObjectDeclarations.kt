package br.com.alura.bytebank.teste

fun testaObjectDeclarations() {

    /**
     *
     *  Object Declarations
     *  permite criar um objeto dentro de uma classe com
     *  membros e comportamentos. Além disso ele pode
     *  ser chamadado de qualquer ponto do projeto
     *
     *
     * Ex: Imprimindo o valor total
     * println("Total ${Teste.Contador.total})
     *
     * Repare que primeiro indicamos a classe onde ele está,
     * depois fazemos o encadeamento com o objeto que aqui no
     * caso demos o nome de 'Contador' e apartir disso podemos
     * acessar o atributo total
     *
     */


}

class Teste() {

    object Contador {
        var total = 0
            private set

        fun incrementa() {
            total++
        }
    }


}