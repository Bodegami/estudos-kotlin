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

    //cria um mapa, associando o resultado do bloco como chave e o Pedido como valor
    //aqui gera um problema, porque cada chave tem que ser unica, logo so podemos ter uma chave true e outra false
    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
    println(mapa)

    //atraves de uma lista, transforma num mapa a agrupando pelo primeiro caractere do valor
    //alem disso, atraves do valueTransform podemos alterar cada elemento
    val numeros = listOf<String>("one", "two", "three", "four", "five", "six", "seven", "eight", "nive", "ten")
    //val mapaAgrupadoPelaPrimeiraLetra = numeros.groupBy { it.first().toUpperCase() }
    val mapaAgrupadoPelaPrimeiraLetra = numeros.groupBy(keySelector = { it.first().toUpperCase() },
        valueTransform = { it.toUpperCase() })
    println(mapaAgrupadoPelaPrimeiraLetra)

    //cria um mapa atraves do groupBy, onde a chave é o resultado booleano do bloco e o valor é uma lista de pedidos
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratisAgrupados)

    //imprime o valor do mapa através da chave
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Alex", "Fran", "Rafaela", "Gui", "Ana", "Maria", "Paulo", "Gisele", "Renato")
    val agenda: Map<Char, List<String>> = nomes.groupBy { it.first() }.toSortedMap()
    println(agenda)
    println('A')

    //cria o agrupamento atraves da expressão passada no bloco e retorna um objeto do tipo Grouping
    //Alem disso, o Grouping tem alguns comportamentos especificos
    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }

    //imprime o count de elementos de cada chave
    println(pedidosAgrupados.eachCount())
    
}

data class Pedido(val numero: Int, val valor: Double)




