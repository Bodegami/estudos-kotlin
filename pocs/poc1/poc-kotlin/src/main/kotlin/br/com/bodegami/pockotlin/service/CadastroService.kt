package br.com.bodegami.pockotlin.service

import br.com.bodegami.pockotlin.dto.CadastroRequest
import br.com.bodegami.pockotlin.dto.CadastroResponse
import br.com.bodegami.pockotlin.repository.ClienteRepository
import br.com.bodegami.pockotlin.model.Cliente
import org.springframework.stereotype.Service

@Service
class CadastroService(
    val clienteRepository: ClienteRepository
) {

    fun cadastra(cadastroRequest: CadastroRequest): CadastroResponse {
        val cliente = toModel(cadastroRequest)
        val result = clienteRepository.save(cliente)

        return toResponse(result)
    }

    fun consultaClientes(): List<CadastroResponse> {
        val clientes = clienteRepository.findAll()
        return clientes.stream().map { c -> this.toResponse(c) }.toList()
    }


    private fun toResponse(cliente: Cliente): CadastroResponse {
        return CadastroResponse(id = cliente.id, nome = cliente.nome, email = cliente.email)
    }

    private fun toModel(request: CadastroRequest): Cliente {
        return Cliente(
            nome = request.nome,
            idade = request.idade,
            email = request.email,
            telefone = request.telefone,
            endereco = request.endereco
        )
    }

}