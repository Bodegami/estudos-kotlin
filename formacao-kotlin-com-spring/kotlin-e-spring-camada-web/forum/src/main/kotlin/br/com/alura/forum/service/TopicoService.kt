package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service
import kotlin.collections.ArrayList

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList<Topico>(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { topico -> TopicoView(
            id = topico.id,
            titulo = topico.titulo,
            mensagem = topico.mensagem,
            status = topico.status,
            dataCriacao = topico.dataCriacao
        ) }.toList()
    }

    fun buscarPorId(id: Long): TopicoView {
        return topicos.stream().filter { topico ->
            topico.id == id
        }.findFirst().get().let { topico ->
            TopicoView(
                id = topico.id,
                titulo = topico.titulo,
                mensagem = topico.mensagem,
                status = topico.status,
                dataCriacao = topico.dataCriacao
            )
        }
    }

    fun cadastrar(dto: NovoTopicoForm) {
        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = dto.titulo,
            mensagem = dto.mensagem,
            curso = cursoService.buscarPorId(id = dto.idCurso),
            autor = usuarioService.buscarPorId(id = dto.idAutor),
        ))
    }
}