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
// Em tempo de compilação a classe Any representa ela mesma, já em execução ela vira a classe Object do Java
// Inclusive não é recomendado o uso da classe Object no Kotlin, para isso podemos usar a classe Any
// Assim como a classe Object do Java, a classe Any no Kotlin tem diversos métodos que são herdados nas classes filhas
// Se quisermos criar um metodo que recebe qualquer classe como parametro, podemos utilizar a classe Any

// No Kotlin, em tempo de compilação, os tipos primitivos são considerados classes. Agora em tempo de execução,
// são tipos primitivos

// No Kotlin, temos o tipo Unit que é como o tipo void em Java
// No Kotlin, tudo é considerado um objeto. Mesmo a classe Unit que é como o void, é considerado um objeto

// No Kotlin, para fazer um cast de um objeto usamos a palavra 'as' seguido da classe. Ex: funcionario as Funcionario
// Para saber mais sobre o cast em Kotlin, vale a pena pesquisar sobre o 'smart cast' e o 'cast expression'

// No Kotlin, para verificar se um objeto pode ser de um determinado tipo, podemos usar a palavra reservada 'is'
// Alem disso, o 'is' faz primeiro a verificação e sendo possível, ele já faz o cast para o tipo apontado
// Exemplo: val numero: Int = 1 ...  numero is Int //retorna true  | numero is String // retorna false

// Podemos utilizar a toString() padrão, personalizado ou raw String, que traz alguns metodos especificos para impressão
// O equals padrão faz a comparação pela referência do objeto

// Sempre que for alterar a implementacao padrao do equals, é interessante mudar também a do hashcode(), dado que o
// o equals utiliza o hashcode por de baixo dos panos

// ----------------------------------------------ARTIGOS LIDOS-------------------------------------------------->

// No Kotlin, tanto o Byte, Short, Int, Long, Double e Float são filhos da classe mãe Number
// Lembrando que tipos primitivos em tempo de compilação são objetos, já em execução são tipos primitivos

// Diferente do Number, quando criamos uma variavel do tipo String e ela recebe um novo valor, a variavel passa
// apontar para um novo objeto contendo o valor informado.
// Para comparações do tipo Char, devemos usar as aspas simples. Exemplo: println('a' == 'b') -> retorna false
// Resumindo, Strings são objetos, imutaveis e quando atribuirmos um novo valor não será uma cópia e sim um novo objeto

// Podemos usar um tipo de classe chamado "data class" para guardar estado. Exemplo: data class Pessoa(val nome: String)
// Além disso a 'data class' nos fornece alguns metodos já implementados como toString(), equals(), hashcode() e etc.
// Um ponto de atenção que para usar a 'data class' o construtor primario sempre deve ter parametros e não argumentos.
// E os parametros passados no construtor primario que serão utilizados na implementação dos metodos herdados.
// Nos podemos tb utilizar o 'destructing declarations' em classes do tipo 'data class'. Exemplo:
// val renato = Pessoa("Renato", 35)  ...   val (nome, idade) = renato
// Podemos implementar o 'destructing declarations' em classes normais. Para isso precisamos criar um metodo do tipo
// operator e especificar o seu retorno. Ex: class Pessoa(val nome: String) { operator fun component1() = this.nome }
// O conceito que engloba o 'destructing declarations' é conhecido como 'components function'
// As 'data class' também fornecem um metodo chamado 'copy' que basicamente faz a copia da propria referencia.
// Além disso, é possível mudar o valor dos atributos simplemente passando os novos valores como argumento.
// Ex: data class Pessoa(val nome:String) ... val pessoa = Pessoa("Renato") ... val pessoa2 = pessoa.copy("Fran")

// ----------------------------------------------MODULO 4-------------------------------------------------->

// As pilhas de execução em Kotlin funcionam exatamente igual em Java.
// O depurador funciona exatamente igual em Java.
// No Kotlin, quando um programa é executado e depois finalizado, no console ele exibe um 'exit code'. Quando esse
// valor é 0, indica que o programa executou como esperado. Porém quando o valor é 1 ele finalizou com erro.
// Ao capturar uma Exception, podemos chamar o printStackTrace que retorna as informações do cause, message e stacktrace