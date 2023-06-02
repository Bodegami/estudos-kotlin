package br.com.alura

fun main() {

    val assistiramCursoAndroid: Set<String> = mutableSetOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = mutableSetOf<String>("Alex", "Paulo", "Maria")
    //val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Gui") // não vai adicionar, pois já existe o elemento no Set
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)




}

