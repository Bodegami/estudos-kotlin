package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = mutableSetOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = mutableSetOf<String>("Alex", "Paulo", "Maria")
    //val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Gui") // não vai adicionar, pois já existe o elemento no Set
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}