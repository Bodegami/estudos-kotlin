package br.com.bodegami.pockotlin.dto

data class CadastroRequest(
    val nome: String,
    val idade: String,
    val email: String,
    val telefone: String,
    val endereco: String
) {

}
