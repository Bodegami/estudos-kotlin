package br.com.bode.entrypoint.ports

import br.com.bode.externalprovider.ports.EnderecoDTO

interface BuscaCepInputPort {

    fun buscaEndereco(cep: String) : EnderecoDTO

}