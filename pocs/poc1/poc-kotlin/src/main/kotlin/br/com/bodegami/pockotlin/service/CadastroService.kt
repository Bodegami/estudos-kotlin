package br.com.bodegami.pockotlin.service

import br.com.bodegami.pockotlin.dto.CadastroRequest
import br.com.bodegami.pockotlin.dto.CadastroResponse
import br.com.bodegami.pockotlin.repository.FakeCadastroClienteDAO
import model.Cliente
import org.springframework.stereotype.Service

@Service
class CadastroService(
    val repository: FakeCadastroClienteDAO
) {

    fun cadastra(cadastroRequest: CadastroRequest): CadastroResponse {
        val cliente = toModel(cadastroRequest)

        // TODO Salva no DB
        repository.save(cliente)

        return toResponse(cliente)
    }

    fun consultaClientes(): List<CadastroResponse> {
        val clientes = repository.findAll()
        return clientes.stream().map { c -> toResponse(c) }.toList()
    }


    private fun toResponse(cliente: Cliente): CadastroResponse {
        return CadastroResponse(nome = cliente.nome, email = cliente.email)
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