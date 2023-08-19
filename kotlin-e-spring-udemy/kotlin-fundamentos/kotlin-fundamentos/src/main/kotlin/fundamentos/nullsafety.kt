package fundamentos

fun main() {

    var nome: String? = "Renato" //? quando a variavel pode ser nula
    //nome = null

    if (nome != null) {
        println(nome.length)
    }

    //NULL SAFETY

    val toShort = nome?.length?.toShort() //? em concatenacoes de metodos, devemos indicar que o valor pode ser nulo
    println(toShort)

    val toShorted = nome!!.length.toShort()// !! quando temos certeza que o valor nao sera nulo, nesse caso o compilador nao faz a verificacao
    println(toShorted)


    //ELVIS OPERATOR

    var outroNome: String? = "Gilgamesh"
    var tamanho: Int = outroNome?.length ?: 0 //?: retorna um valor padrao, caso a variavel seja nula
    println(tamanho)


    //LIDANDO COM NULO EM LISTAS

    var lista: List<Int?> = listOf(1, 2, null, 4) //List que pode receber inteiros e nulos
    //var listaNullable: List<Int> = null -> por padrao, não podemos criar uma lista nula
    var listaNullable: List<Int>? = null
    var outraListaNullable: List<Int?>? = null //List que pode ser inicializada como nula e receber valores nulos
    outraListaNullable = listOf(7, 3, null, null)

    println(lista)
    println(listaNullable)
    println(outraListaNullable)

    


}