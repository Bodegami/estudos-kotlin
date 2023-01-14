package br.com.bodegami.bytebank.exception

class FalhaAutenticacaoException(
    message: String = "Falha na autenticação"
): Exception(message) {
}