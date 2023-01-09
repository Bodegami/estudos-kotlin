package br.com.bodegami.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int) : Boolean

}