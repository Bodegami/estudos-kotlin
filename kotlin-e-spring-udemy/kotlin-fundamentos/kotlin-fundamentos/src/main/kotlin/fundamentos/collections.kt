package fundamentos


fun main() {

    println("\n===============LISTAS IMUTAVEIS================\n")
    //LISTAS IMUTAVEIS

    var listaImutavel = listOf(1, 2, 3, 4, 6) //listOf é do tipo imutavel e nao permite adicionar/remover valores
    var pares = listaImutavel.filter { it % 2 == 0 }

    println(pares)
    println(pares.javaClass)

    listaImutavel.forEach {
        println(it)
    }

//    for(numero in listaImutavel) {
//        println(numero)
//    }

    println()
    println(listaImutavel[0])
    println(listaImutavel.get(0))
    println(listaImutavel.size)
    println(listaImutavel.indexOf(4))


    println("\n===============LISTAS MUTAVEIS================\n")
    //LISTAS MUTAVEIS

    var listaMutavel = mutableListOf(1, 2, 3, 4, 6) //mutableListOf é do tipo mutavel que permite adicionar/remover valores
    println(listaMutavel)

    listaMutavel.add(8)
    println(listaMutavel)

    listaMutavel.removeAt(0) //removendo pelo indice
    println(listaMutavel)

    listaMutavel.remove(3) //removendo pelo valor do elemento
    println(listaMutavel)

    listaMutavel[0] = 20 //sobrescrevendo um valor
    println(listaMutavel)

    listaMutavel.sort() //ordena a lista
    println(listaMutavel)

    listaMutavel.shuffle() //embaralha a lista
    println(listaMutavel)

    var listaNomes = mutableListOf("Renato", "Gustavo", "Daniel")
    println(listaNomes)

    listaNomes.sort() //o sort() tb funciona para String's
    println(listaNomes)


    println("\n===============SET================\n")
    //SET

    var setNumeros = setOf(1, 2, 3, 2) //setOf é um tipo Set imutavel e que não aceita elementos duplicados
    println(setNumeros)

    var setNumerosMutaveis = mutableSetOf(1, 2, 3, 2)//mutableSetOf é um tipo Set mutavel e que aceita elementos duplicados
    println(setNumerosMutaveis)

    setNumerosMutaveis.add(2)
    setNumerosMutaveis.add(8)
    println(setNumerosMutaveis)
    println(setNumerosMutaveis.contains(2))


    println("\n===============MAP================\n")
    //MAP

    var mapNomeIdadeImutavel = mapOf("Gustavo" to 24, "Renato" to 36)

    println(mapNomeIdadeImutavel)
    println(mapNomeIdadeImutavel.size)
    mapNomeIdadeImutavel.forEach { (key, value) ->
        println("Nome: $key | Idade: $value")
    }

    var mapNomeIdadeMutavel = mutableMapOf<String, Int>("Gustavo" to 24, "Renato" to 36)
    println(mapNomeIdadeMutavel)

    mapNomeIdadeMutavel.put("Bruno", 30)
    println(mapNomeIdadeMutavel)

    mapNomeIdadeMutavel["Renato"] = 25
    println(mapNomeIdadeMutavel)

    val result = mapNomeIdadeMutavel.values.find { it % 5 == 0 }
    println(result)

    mapNomeIdadeMutavel.remove("Bruno")
    println(mapNomeIdadeMutavel)

    mapNomeIdadeMutavel.put("Renato", 48)
    println(mapNomeIdadeMutavel) //Assim como o SET, o MAP não aceita chaves duplicadas

    mapNomeIdadeMutavel.putIfAbsent("Gustavo", 31) //putIfAbsent só vai adicionar o elemento caso não exista a chave
    println(mapNomeIdadeMutavel)


}