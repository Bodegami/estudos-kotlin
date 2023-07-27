package br.com.alura.forum.service

import org.springframework.stereotype.Service

import br.com.alura.forum.model.Usuario

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Ana da Silva",
            email = "ana@email.com.br"
        )
        usuarios = listOf(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter { usuario ->
            usuario.id == id
        }.findFirst().get()
    }
}
