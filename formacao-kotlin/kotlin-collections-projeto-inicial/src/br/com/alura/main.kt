package br.com.alura

fun main() {

    // o Infix "to" facilita a leitura, mas para estruturas muitos grandes ele apresenta um perca de performance
    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 23.0), 2 to 50.0, 3 to 50.0)
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido: $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

}
