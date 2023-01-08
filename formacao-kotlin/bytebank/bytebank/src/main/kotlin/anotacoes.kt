
// ----------------------------------------------MODULO 1-------------------------------------------------->

// Use 'var' para variaveis que podem mudar o valor
// Use 'val' para variaveis imutaveis
// Não é possivel criar uma variavel sem inicializa-la
// O kotlin permite deixar implicito o tipo de retorno
// No Kotlin, por padrao quando nao especificamos o tipo de retorno, implicitamente ele retorna o tipo Unit
// Na classe Conta as variaveis "titular" e "numero" tem Getters e Setters implicitos e publicos
// Na classe Conta a variavel "saldo" tem Gettter explicito e publico, Setter explicito e privado
// No kotlin, utilizamos a palavra reservada constructor() para inicializar um construtor secundario
// O construtor primario fica ao lado do nome da classe. Exemplo: Conta(nome: String, idade: Int)
// É possivel tb indicar que aquele atributo do construtor é a property. Exemplo: Conta(var nome: String, var idade: Int)
// Podemos definir o valor padrão de um atributo do construtor. Exemplo: Conta(var titular: String, val numero: Int = 0)

// No Kotlin existe o conceito de labels que permite identificar qual o parametro que esta sendo enviado, alem disso
// elas permitem que os atributos do construtor sejam enviados em qualquer ordem

// ----------------------------------------------MODULO 2-------------------------------------------------->

// No Intellij podemos utlizar o comando CTRL + ALT + M para extrair um trecho de codigo para uma funcao
// Para fazer a herança, precisamos assinar a classe mae como: open class Conta()

// Para indicar que uma classe herda de outra, precisamos declarar na assinatura da classe como no exemplo abaixo:
// Gerente(val senha: String) : Funcionario(nome: String, cpf: String)
// Note que no exemplo acima utilizamos o construtor da classe mae e no construtor da classe Gerente temos uma
// propriedade especifica da classe Gerente

// Para sobrescreve um metodo, precisamos assina o metodo na classe mae como: open metodoXpto(){}
// Já na classe filho, utilizamos o modelo: override metodoXpto(){}

// O Kotlin tem uma função interna que permite converter uma função numa property, como no exemplo do metodo bonificacao

// SHIFT + F6 renomeia um metodo ou atributo

// Exemplos de como criar metodos, funcoes e expressoes:
/*

        EXEMPLO DO METODO BONIFICACAO COMO FUNCAO:
            open fun bonificacao(): Double {
                return salario * 0.1
            }

        EXEMPLO DE FUNCAO COMO EXPRESSAO:
            open fun bonificacao(): Double = salario * 0.1

        EXEMPLO DE FUNCAO COMO PROPERTY
            open val bonificacao: Double
                get() {
                    return salario * 0.1
                }

        EXEMPLO DE PROPERTY como EXPRESSAO
            open val bonificacao: Double get() = salario * 0.1

*/

// CTRL + N abre o buscados de classes e metodos
// Somente classes abstratas podem ter membros/metodos abstratos
// No Kotlin só esse possível herdar de uma única classe
// Classes abstratas que herdam de classes abstratas, não tem a obrigação de implementar metodos da classe mãe











