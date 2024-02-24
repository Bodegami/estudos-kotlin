package br.com.bode.externalprovider.ports

interface BuscaCepOutputPort {

    fun buscaEnderecoPeloCep(cep: String): EnderecoDTO

}
