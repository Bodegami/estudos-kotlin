package br.com.alura

fun main() {

    val assistiramCursoAndroid = listOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf<String>("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramAmbos.distinct())

}

