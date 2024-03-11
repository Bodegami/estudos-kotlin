package br.com.bode.core.usecase

import br.com.bode.core.usecase.exceptions.BuscaEnderecoException
import br.com.bode.entrypoint.ports.BuscaCepInputPort
import br.com.bode.externalprovider.ports.BuscaCepOutputPort
import br.com.bode.externalprovider.ports.EnderecoDTO
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.exceptions.HttpClientResponseException

open class BuscaEnderecoUseCase(
    var consultaCep: BuscaCepOutputPort
) : BuscaCepInputPort {

    override fun buscaEndereco(cep: String) : EnderecoDTO {
        try {
            val endereco = consultaCep.buscaEnderecoPeloCep(cep);
            return endereco;
        }
        catch (e: HttpClientResponseException) {
            throw BuscaEnderecoException(HttpStatus.NOT_ACCEPTABLE.name)
        }
    }

}