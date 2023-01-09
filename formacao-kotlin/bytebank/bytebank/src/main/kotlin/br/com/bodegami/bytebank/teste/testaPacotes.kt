package br.com.bodegami.bytebank.teste

import br.com.bodegami.bytebank.modelo.Cliente

import java.lang.StringBuffer as StringBufferJava
import br.com.bodegami.bytebank.novoModelo.Cliente as NovoCliente

fun testaPacotes() {
    val palavra: String = "texto kotlin"
    val palavraJava: StringBufferJava = StringBufferJava("texto java")

    println(palavra)
    println(palavraJava)

    val cliente = Cliente(nome ="Renato", cpf = "000.000.000-00", senha = 1)
    val clienteNovo: NovoCliente = NovoCliente()

}