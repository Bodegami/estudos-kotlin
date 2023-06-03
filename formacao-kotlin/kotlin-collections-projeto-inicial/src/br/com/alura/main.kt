package br.com.alura


fun main() {

    //imprime um set multiplicando por 3 cada elemento
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    //imprime um set multiplicando o valor de cada elemento pelo indice
    println(numbers.mapIndexed{ idx, value -> value * idx })

    //imprime a lista com o tipo Pedido
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)

    //cria um map atraves do associate onde indicamos qual elementos é a chave e o valor
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
    }
    println(pedidosMapeados)

    //cria um map atraves do associateBy onde cada chave representa um Pedido
    val pedidosMapeados2: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados2)

    //imprime um Pedido recuperado do mapa através do get
    println(pedidosMapeados[2])

    //cria um map onde faz a associacao atraves da instrução passada no bloco.
    //Aqui a chave é o Pedido e o valor o resultado da expressão no bloco
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { it.valor > 50.0 }
    println(pedidosFreteGratis)

    //Retorna o valor do elemento do mapa de frete gratis
    println(pedidosFreteGratis[Pedido(numero=2, valor=60.0)])

    //atraves uma lista, cria um map onde para cada elemento, a chave é o valor da lista e o valor é o length do valor da lista
    val listaLiteral = listOf<String>("um", "dois", "tres", "quatro", "cinco")
    val mapLiteral: Map<String, Int> = listaLiteral.associateWith { it.length }
    println(mapLiteral)

}

data class Pedido(val numero: Int, val valor: Double)




