
// -------------------MODULO 1--------------------->
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

fun main() {
    println("Bem vindo ao Bytebank!")

}




