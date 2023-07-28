package br.com.alura.forum.service

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
    private val topicoVierMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { topico ->
            topicoVierMapper.map(topico)
        }.toList()
    }

    fun buscarPorId(id: Long): TopicoView {
        return topicos.stream()
            .filter { topico -> topico.id == id }
            .findFirst()
            .get()
            .let{ topico -> topicoVierMapper.map(topico) }
    }

    fun cadastrar(form: NovoTopicoForm) {
        val topico = topicoFormMapper.map(form)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topico)
    }
}