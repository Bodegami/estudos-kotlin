package fundamentos

class Carro(val cor: String, val anoFabricao: Int, val dono: Dono) {

}

data class Dono(val nome: String, val idade: Int) {

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("renato", 36))

    println(carro.cor)
    println(carro.dono)
}