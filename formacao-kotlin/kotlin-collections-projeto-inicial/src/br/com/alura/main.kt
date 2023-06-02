package br.com.alura

fun main() {

    // o Infix "to" facilita a leitura, mas para estruturas muitos grandes ele apresenta uma perda de desempenho
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 23.0), 2 to 50.0, 3 to 50.0)
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido: $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    //Forma comum para adicionar um elemento
    pedidos[4] = 70.0
    println(pedidos)

    //Outra opcção para adicionar elemento
    pedidos.put(5, 80.0)
    println(pedidos)

    //Atualiza o valor de um elemento já existente no mapa
    pedidos[1] = 100.0
    println(pedidos)

    //So adiciona elementos novos no mapa, do contrario ele ignora
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    //remove um elemento do mapa
    pedidos.remove(6)
    println(pedidos)

    //sobrecarga do metodos remove que só elimina o elemento caso o valor seja igual
    pedidos.remove(3, 100.0)
    println(pedidos)



}
