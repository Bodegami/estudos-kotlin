package br.com.bode.entrypoint.controller

import br.com.bode.entrypoint.ports.BuscaCepInputPort
import br.com.bode.externalprovider.ports.EnderecoDTO
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.scheduling.TaskExecutors
import io.micronaut.scheduling.annotation.ExecuteOn
import jakarta.inject.Inject


@Controller("/cadastro/v1")
@ExecuteOn(TaskExecutors.BLOCKING)
class ConsultaEnderecoController {

    @Inject
    private lateinit var buscaCepInputPort: BuscaCepInputPort

    @Get("/enderecos/{cep}")
    fun buscaEnderecoPorCep(@PathVariable("cep") cep: String): HttpResponse<EnderecoDTO> {
        val endereco = buscaCepInputPort.buscaEndereco(cep)
        return HttpResponse.ok(endereco).header("cached", "no-cache")
    }

}