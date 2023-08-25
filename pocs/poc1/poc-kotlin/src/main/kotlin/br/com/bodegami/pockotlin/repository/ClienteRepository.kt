package br.com.bodegami.pockotlin.repository

import br.com.bodegami.pockotlin.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : JpaRepository<Cliente, Long> {
}