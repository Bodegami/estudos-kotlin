package br.com.bode.entrypoint.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/cadastro/v1")
class CadastroEnderecoController {

    @Get("/enderecos")
    fun buscaEnderecoPorCep(): HttpResponse<String> {
        val response: String = "Rua xpto, 555"
        return HttpResponse.ok(response).header("cached", "no-cache")
    }

}