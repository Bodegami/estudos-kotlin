package br.com.bodegami.bytebank.modelo

import br.com.bodegami.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
            autenticado()
        }
        else {
            println("Falha na autenticação!")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
            autenticado(this)
        }
        else {
            println("Falha na autenticação!")
        }
    }

    fun pagamento() {
        println("realizando pagamento")
    }


}