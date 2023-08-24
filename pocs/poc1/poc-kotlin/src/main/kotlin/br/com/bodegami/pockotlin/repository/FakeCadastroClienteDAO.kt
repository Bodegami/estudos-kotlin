package br.com.bodegami.pockotlin.repository

import model.Cliente
import org.springframework.stereotype.Repository

@Repository
class FakeCadastroClienteDAO {

    private val tabelaCliente: MutableList<Cliente> = ArrayList()

    fun save(cliente: Cliente): Cliente {
        tabelaCliente.add(cliente)
        return cliente
    }

    fun findAll(): List<Cliente> {
        return tabelaCliente
    }

}