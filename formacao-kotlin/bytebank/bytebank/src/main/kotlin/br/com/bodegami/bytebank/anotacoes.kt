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

// É possivel criar uma variavel que executa um Try Expression e retorna um valor.
// Exemplo: val a: Int? = try { parseInt(input) } catch (e: NumberFormatException) { null }
// Note que a variavel a pode receber um Int ou null

// Também é possivel utilizar a abordagem do try Expression com o If
// A classe mãe das Exceptions é a Throwable. Suas classes filhas são 'Exception' e 'Error'
// A classe 'Error' é para casos de erro na JVM. É uma boa prática evitar usar a 'Error'
// Sempre que for capturar varios tipos de exception, é interessante deixar o tipo mais genérico por ultimo

// Para indicar que uma variavel ou atributo pode receber nulo, indicamos colocando o '?' ao lado do tipo de retorno.
// Ex: var endereco: Endereco? = null .... dessa forma indicamos que a variavel pode receber Endereco() ou nulo

// Para indicar que ao chamar uma variavel ou atributo a mesma não pode ser nula, utilizamos o '!!'. Exemplo:
// var endereco: Endereco? = null .... endereco!!.logradouro
// Quando seguimos o exemplo do codigo acima que, primeiro indicamos a variavel pode receber nulo e depois
// indicamos que aquele atributo não é nulo, o kotlin lança a 'KotlinNullPointerException'

// No Kotlin temos o Safe Call Operator, que verifica se uma variavel é do tipo nulo. Se for do tipo nulo ela devolve
// nulo ou se não devolve o valor. Exemplo: val a: String? = null ... println(a?.length)
// No codigo acima, se a variavel a for nula devolve nulo, senao chama o metodo length

// Porem, quando fazemos uma chamada com 'safe call', caso tenha mais encadeamentos, precisamos indicar que esse valores
// podem ser nulos. Ex: val a: Endereco? = null ... a?.logradouro?.length?.toInt()
// Note que temos que fazer o safe call para cada novo encadeamento na chamada do metodo

// Outra abordagem para uso de 'Safe call' é o 'Let' que também é conhecido como 'Scope Functions'.
// Ao usar o 'Let', utilizamos a palavra chave 'it' para referenciar ao proprio objeto
// Ex: val logradouro: String? = "texto" ... logradouro.let { println(it?.length) }
// A palavra reservada 'let' também pode ser substituida por outro nome. Exemplo:
// Ex: val logradouro: String? = "texto" ... logradouro.let { endereco: String -> println(endereco?.length) }
// Um detalhe ao utilizar o 'let' é que ele ignora a propriedade, caso ela seja nula.
// Outra vantagem do 'let' é que quando o utilizamos com o safe call, os metodos encadeados dentro do bloco não precisam
// chamar o safe call. Ex: val rua: String? = "texto" ... rua?.let { it.length.toint() }

// Em alguns casos podemos utlizar o 'elvis operator' para indicar que, caso um valor seja nulo, retorne outro valor
// O elvis operator é chamado usando o conjunto de caracteres '?:'
// Ex: enderecoNulo?.let { val tamanhoComplemento: Int = it.complemento?.lenght ?: 0 }
// Note que no exemplo acima, caso o complemento seja nulo, ele vai retornar o valor 0

// O safe call também pode ser usado com o 'cast' com a sintaxe 'as?'. Essa é uma das formas seguras de tebtar fazer o
// 'cast' de um valor. Ex: val numero: Int? = "10" as? Int
// Caso ele não consiga fazer o 'cast', ele retorna nulo

// ----------------------------------------------MODULO 5-------------------------------------------------->

// Sempre criar um array, é necessário passar como argumento o tamanho dele
// As funcoes "1.rangeTo(10)" e "1..10" retornam um objeto IntRange que é um array do tipo numerico seguindo uma serie
// Alem disso as duas funcoes citadas acima incluem tanto o argumento inicial e o final no array. EX: 1 e 10
// Podemos usar a funcao "1.until(10)" que vai devolver um objeto IntRange de 1 ATÉ 10. Ex: de 1 a 9

// O operador "in" opera de forma diferente dependendo do contexto em que está inserido.
// O "in" no if verifica se o elemento está dentro de uma série, como o metodo contains() do Java. Ex: if (5 in 1..10)
// O "in" no for percorre todos elementos da série procurando pelo valor. Ex: for (2 in 1..10)

// A palavra reservada "vararg" representa um conjunto de valores dinamico. Como a expressao "..." no java

// Extension funcions são funcoes de um objeto. Ex: String nome = "ana"; ana.toUpperCase()
// Podemos criar uma funcao que se comporta como uma extension funcion, como no exemplo abaixo onde criamos
// uma funcao de soma para um array de BigDecimal.
// Ex: Array<BigDecimal>.soma(): BigDecimal { return this.reduce { acumulador, valor -> acumulador + valor }
// No exemplo acima usamos a funcao reduce que permite reduzir todos valores de um array a um elemento, seja somando,
// multiplicando, subtraindo, etc.

// Podemos usar a expression function "fold" como o "reduce". A maior diferença é que o fold recebe um valor inicial.
// Ex: idades.fold(totalDeIdades) { acumulador, idade -> acumulador + (idade + 1) }

// Podemos encadear expression functions sem a necessidade de criar variaveis temporarias.
// Ex: var idades = ArrayOf(22, 18, 15)  idades.sorted().take(2).toTypedArray().media()

// Assim como no Java, não é possível criar uma lista de tipos primitivos. A 'interface' List trabalha apenas com objetos
// ou classes Wrapper
// Podemos usar a mutableListOf<>() para criar uma List do tipo informado nos generics
// Diferente dos Arrays, a List nos possibilita o usa de algumas funcoes como add, remove e etc
// Diferente dos Arrays, a List é mutavel e não precisamos definir o seu tamanho no momento de criacao de uma List

// A 'interface' List provem um metodo chamadado "joinToString" que permite criar uma String com os elementos da lista
// delimitados pelo separador. val textoFormatado = this.joinToString(separator = "\n") {" - ${it.titulo}" }

// Para ordernar um List de uma classe que criamos, essa classe precisa extender o tipo Comparable, igual ao Java
// Mas o Kotlin tem uma forma mais simples de ordenar, que seria chamando a expression function 'sortedBy'
// Ex: var livros = List<Livro>(livro1, livro2, livro3) ... livros.sortedBy{ it.titulo }
// Dessa forma, a nossa classe Livro não precisa extender de Comparable

// Podemos chama a função 'filter' apartir do objeto que representa nossa lista de livros
// Ex: livros.filter { it.autor == "João Guimarães Rosa" }
// Assim como as outras expression functions, 'filter' também pode encadear outras funções

// O Kotlin tem um funcao na nativa para filtrar elementos nulos de uma lista. Ex: lista.filterNotNull()

// A interface list possui uma funcao 'groupBy' que recebe um parametro como argumento. Essa funcao
// retorna um 'Map' onde a chave é o parametro informado. Ex: listaLivros.groupBy { it.autor }

