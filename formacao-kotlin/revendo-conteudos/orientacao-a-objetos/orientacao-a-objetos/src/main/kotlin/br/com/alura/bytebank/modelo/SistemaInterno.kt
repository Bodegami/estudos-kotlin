package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
         if (admin.autentica(senha)) {
             println("Bem vindo ao ByteBank")
         } else {
             println("Falha na autenticacao")
         }
    }


}