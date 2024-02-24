package br.com.bode.externalprovider.adapters

import br.com.bode.externalprovider.ports.BuscaCepOutputPort
import br.com.bode.externalprovider.ports.EnderecoDTO
import br.com.bode.externalprovider.ports.ViaCepHttpClient
import jakarta.inject.Inject

class BuscaCepOutputAdapter(): BuscaCepOutputPort {

    @Inject
    private lateinit var viacepClient: ViaCepHttpClient

    override fun buscaEnderecoPeloCep(cep: String): EnderecoDTO {
        return viacepClient.buscaCep(cep)
    }
}