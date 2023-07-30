package br.com.alura.forum.service

import br.com.alura.forum.dto.AtualizacaoTopicoForm
import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service
import kotlin.collections.ArrayList

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList<Topico>(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { topico ->
            topicoViewMapper.map(topico)
        }.toList()
    }

    fun buscarPorId(id: Long): TopicoView {
        return topicos.stream()
            .filter { topico -> topico.id == id }
            .findFirst()
            .get()
            .let{ topico -> topicoViewMapper.map(topico) }
    }

    fun buscarPorIdTopico(id: Long): Topico {
        return topicos.stream()
            .filter { topico -> topico.id == id }
            .findFirst()
            .get()
    }

    fun cadastrar(form: NovoTopicoForm) {
        val topico = topicoFormMapper.map(form)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topico)
    }

    fun atualizar(form: AtualizacaoTopicoForm) {
        val topico = topicos.stream()
            .filter { topico -> topico.id == form.id }
            .findFirst()
            .get()
        topicos = topicos.minus(topico)
            .plus(Topico(
                id = form.id,
                titulo = form.titulo,
                mensagem = form.mensagem,
                autor = topico.autor,
                curso = topico.curso,
                respostas = topico.respostas,
                status = topico.status,
                dataCriacao = topico.dataCriacao
            ))
    }

    fun deletar(id: Long) {
        val topico = topicos.stream()
            .filter { topico -> topico.id == id }
            .findFirst()
            .get()
        topicos = topicos.minus(topico)
    }
}