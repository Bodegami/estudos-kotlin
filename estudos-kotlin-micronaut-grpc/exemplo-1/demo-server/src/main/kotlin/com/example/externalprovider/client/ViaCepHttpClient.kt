package com.example.externalprovider.client


import com.example.externalprovider.dto.EnderecoDTO
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

import jakarta.inject.Singleton

@Client("https://viacep.com.br/ws")
@Singleton
interface ViaCepHttpClient {

    @Get("/{cep}/json/")
    fun buscaCep(@PathVariable("cep") cep: String) : EnderecoDTO

}