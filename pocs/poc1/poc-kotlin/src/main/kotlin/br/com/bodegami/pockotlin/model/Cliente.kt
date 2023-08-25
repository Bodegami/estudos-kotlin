package br.com.bodegami.pockotlin.model

import jakarta.persistence.*


@Entity(name = "clientes")
data class Cliente(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nome: String,
    val idade: String,
    @Column(unique = true)
    val email: String,
    @Column(unique = true)
    val telefone: String,
    val endereco: String
)