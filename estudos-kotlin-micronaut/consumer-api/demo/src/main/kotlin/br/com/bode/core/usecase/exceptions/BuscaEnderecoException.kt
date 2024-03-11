package br.com.bode.core.usecase.exceptions

class BuscaEnderecoException(override var message: String) : IllegalArgumentException(message) {
}