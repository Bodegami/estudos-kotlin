
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

// -------------------MODULO 2--------------------->
// No Intellij podemos utlizar o comando CTRL + ALT + M para extrair um trecho de codigo para uma funcao
// Para fazer a herança, precisamos assinar a classe mae como: open class Conta()

// Para indicar que uma classe herda de outra, precisamos declarar na assinatura da classe como no exemplo abaixo:
// Gerente(val senha: String) : Funcionario(nome: String, cpf: String)
// Note que no exemplo acima utilizamos o construtor da classe mae e no construtor da classe Gerente temos uma
// propriedade especifica da classe Gerente

fun main() {
    println("Bem vindo ao Bytebank!")

    val renato = Funcionario(
        nome = "Renato",
        cpf = "02145689611",
        salario = 1000.0
    )

    println("nome: ${renato.nome}")
    println("cpf: ${renato.cpf}")
    println("salario: ${renato.salario}")
    println("bonificação: ${renato.bonificacao()} \n")

    val fran = Gerente(
        nome = "Fran",
        cpf = "25635848744",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificação: ${fran.bonificacao()}")

    if (fran.autentica(4000)) {
        println("autenticado com sucesso! \n")
    } else {
        println("falha na autenticacao! \n")
    }

    val gui = Diretor(
        nome = "Guilherme",
        cpf = "589614525477",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("bonificação: ${gui.bonificacao()}")
    println("plr: ${gui.plr}")

    if (gui.autentica(4000)) {
        println("autenticado com sucesso! \n")
    } else {
        println("falha na autenticacao! \n")
    }
}




