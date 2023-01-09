package br.com.bodegami.bytebank.modelo

import br.com.bodegami.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
        }
        else {
            println("Falha na autenticação!")
        }
    }


}