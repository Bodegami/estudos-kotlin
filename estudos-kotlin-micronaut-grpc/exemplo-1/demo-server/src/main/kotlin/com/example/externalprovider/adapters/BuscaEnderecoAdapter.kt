package com.example.externalprovider.adapters

import com.example.externalprovider.dto.EnderecoDTO
import com.example.externalprovider.dto.EnderecoRequest
import com.example.externalprovider.client.ViaCepHttpClient
import com.example.externalprovider.ports.BuscaEnderecoPort
import jakarta.inject.Singleton

@Singleton
class BuscaEnderecoAdapter(
    private val viaCepHttpClient: ViaCepHttpClient
) : BuscaEnderecoPort {

    override fun buscaEndereco(request: EnderecoRequest): EnderecoDTO {
        return viaCepHttpClient.buscaCep(request.cep)
    }
}