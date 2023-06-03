package br.com.alura

fun testaComportamentosMap() {
    // o Infix "to" facilita a leitura, mas para estruturas muitos grandes ele apresenta uma perda de desempenho
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
    println(pedidos)

    /**
     * MAP - Comportamentos de Leitura e filtros
     */

    //Retorna nulo caso não encontre a chave no mapa
    var valorPedido: Double? = pedidos[0]
    println(valorPedido)

    //Retorna nulo caso não encontre a chave no mapa
    valorPedido = pedidos.get(0)
    println(valorPedido)

    //Caso nao encontre a chave no mapa, lança uma NoSuchElementException
    val valorPedidoComGetValue = try {
        pedidos.getValue(4)
    } catch (e: NoSuchElementException) {
        "Exception: ${e.javaClass.simpleName} | Message: ${e.message}"
    }
    println(valorPedidoComGetValue)

    //Caso não encontre a chave no mapa, executa o código no bloco passado como argumento
    println(pedidos.getOrElse(5) { "Não tem o pedido" })

    //Caso não encontre a chave no ampa, retorna um valor padrão
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for ((chave, valor) in pedidos) {
        println("Valor do pedido $chave: $valor ")
    }

    for (valor in pedidos.keys) {
        println("Valor do pedido: $valor ")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println("Pedidos Filtrados: $pedidosFiltrados")

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println("Pedidos Acima: $pedidosAcima")

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Pedidos Pares: $pedidosPares")

    val mapaFiltrado: MutableMap<Int, Double> = mutableMapOf<Int, Double>()
    pedidos.filterTo(mapaFiltrado) { it.key % 2 == 0 && it.value > 70.0 }.run { println("Mapa Filtrado: $this") }

    //imprime um mapa com um novo pedido, mas não altera o objeto pedidos
    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 50.0, 8 to 20.0))
    println(pedidos)

    //imprime pedidos sem o elemento da chave informada, mas não alter o objeto pedidos
    println(pedidos - 6)
    println(pedidos - listOf(5, 2, 1))
    println(pedidos)

    /**
     * Map - Comportamentos de escrita
     */

    //Adiciona novos elementos no objeto pedidos através de um Set<Pair, Double>>
    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 50.0, 8 to 20.0))
    println(pedidos)

    //Adiciona novos elementos no objeto pedidos através de um List<Pair, Double>>
    pedidos += listOf<Pair<Int, Double>>(7 to 50.0, 8 to 30.0)
    println(pedidos)

    //Remove elementos do objeto pedidos pela chave
    pedidos.keys.remove(1)
    println(pedidos)

    //Remove o elemento pela chave usando o operator minus assign
    pedidos -= 2
    println(pedidos)

    //Remove o primeiro elemento que encontrar pelo valor
    pedidos.values.remove(50.0)
    println(pedidos)
}