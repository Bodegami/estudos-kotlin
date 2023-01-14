package br.com.bodegami.bytebank.exception

class SaldoInsuficienteException(
    message: String = "O saldo é insuficiente"): Exception(message)