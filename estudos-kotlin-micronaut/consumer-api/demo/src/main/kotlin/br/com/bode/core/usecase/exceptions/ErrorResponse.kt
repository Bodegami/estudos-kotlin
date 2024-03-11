package br.com.bode.core.usecase.exceptions

class ErrorResponse(
    val statusError: Int,
    val mensagemError: String,
    val descricaoError: String
) {
}