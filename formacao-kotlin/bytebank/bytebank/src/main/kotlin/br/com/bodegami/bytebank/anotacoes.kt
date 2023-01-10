package br.com.bodegami.bytebank
// ----------------------------------------------MODULO 1-------------------------------------------------->

// Use 'var' para variaveis que podem mudar o valor
// Use 'val' para variaveis imutaveis
// Não é possivel criar uma variavel sem inicializa-la
// O kotlin permite deixar implicito o tipo de retorno
// No Kotlin, por padrao quando nao especificamos o tipo de retorno, implicitamente ele retorna o tipo Unit
// Na classe modelo.Conta as variaveis "titular" e "numero" tem Getters e Setters implicitos e publicos
// Na classe modelo.Conta a variavel "saldo" tem Gettter explicito e publico, Setter explicito e privado
// No kotlin, utilizamos a palavra reservada constructor() para inicializar um construtor secundario
// O construtor primario fica ao lado do nome da classe. Exemplo: modelo.Conta(nome: String, idade: Int)
// É possivel tb indicar que aquele atributo do construtor é a property. Exemplo: modelo.Conta(var nome: String, var idade: Int)
// Podemos definir o valor padrão de um atributo do construtor. Exemplo: modelo.Conta(var titular: String, val numero: Int = 0)

// No Kotlin existe o conceito de labels que permite identificar qual o parametro que esta sendo enviado, alem disso
// elas permitem que os atributos do construtor sejam enviados em qualquer ordem

// ----------------------------------------------MODULO 2-------------------------------------------------->

// No Intellij podemos utlizar o comando CTRL + ALT + M para extrair um trecho de codigo para uma funcao
// Para fazer a herança, precisamos assinar a classe mae como: open class modelo.Conta()

// Para indicar que uma classe herda de outra, precisamos declarar na assinatura da classe como no exemplo abaixo:
// modelo.Gerente(val senha: String) : modelo.Funcionario(nome: String, cpf: String)
// Note que no exemplo acima utilizamos o construtor da classe mae e no construtor da classe modelo.Gerente temos uma
// propriedade especifica da classe modelo.Gerente

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
// As interfaces são implicitamente abstratas
// É possivel criar implementações padrões na interface e sobrescrever nas classes que implementam se for necessário

// ----------------------------------------------MODULO 3-------------------------------------------------->

// CTRL + ALT + O organiza os imports na classe
// Podemos fazer o import de todos arquivos de um pacote atraves do *. Exemplo: import br.com.modelo.*
// É possível utilizar alias nos imports. Exemplo: import java.lang.StringBuffer as StringBufferJava
// É possível ter mais uma classe dentro do mesmo arquivo
// Os object expressions são objetos anonimos que podem ter seus proprios atibutos, metodos e comportamentos
// Object expressions podem também implementar interfaces ou herdar de outras classes
// Já os Object declarations devem ter um nome e ele segue o padrão Singleton
// Os Object Declarations podem ficar dentro de um arquivo (fora da funcao main) ou em classes
// Os object declarations podem ser chamados a partir da classe onde eles estão
// Já os Companions Objects conseguem compartilhar os seus membros com a classes onde está
// Os Companions Objects podem ser privados, permitindo que apenas a propria classe altere o seu estado
// O companion object não precisa ter um nome dentro da classe em que está
// Porém quando não declaramos o nome do companion object, por de baixo dos panos ele recebe o nome padrão 'Companion'

// O Kotlin trabalha com a ideia de fazer mais coisas com menos. É o caso de quando criamos uma classe ou método e
// implicitamente o Kotlin faz a sobrecarga deste metodo

// CTRL + B ou CTRL + MOUSE DIREITO entra na implementacao de um metodo ou classe
// O operador '?' é usado em variaveis que podem receber um valor ou não, como é o caso do nulo ou null
// No Kotlin existe a classe Any, que na verdade é a classe mãe de todas as classes. É como a classe Object do Java
// Assim como a classe Object do Java, a classe Any no Kotlin tem diversos métodos que são herdados nas classes filhas
// Se quisermos criar um metodo que recebe qualquer classe como parametro, podemos utilizar a classe Any









