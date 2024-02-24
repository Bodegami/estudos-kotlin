package br.com.bode.externalprovider.ports

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client("https://viacep.com.br/ws")
interface ViaCepHttpClient {

    @Get("/{cep}/json/")
    fun buscaCep(@PathVariable("cep") cep: String) : EnderecoDTO

}