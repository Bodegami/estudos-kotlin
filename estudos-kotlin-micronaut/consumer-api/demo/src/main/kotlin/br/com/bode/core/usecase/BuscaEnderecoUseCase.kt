package br.com.bode.core.usecase

import br.com.bode.entrypoint.ports.BuscaCepInputPort
import br.com.bode.externalprovider.ports.BuscaCepOutputPort
import br.com.bode.externalprovider.ports.EnderecoDTO
import io.micronaut.http.client.exceptions.HttpClientException
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
open class BuscaEnderecoUseCase() : BuscaCepInputPort {

    @Inject
    private lateinit var consultaCep: BuscaCepOutputPort

    override fun buscaEndereco(cep: String) : EnderecoDTO {
        try {
            val endereco = consultaCep.buscaEnderecoPeloCep(cep);
            return endereco;
        }
        catch (e: HttpClientException) {
            throw IllegalArgumentException("Error: ", e.cause)
        }
    }

}