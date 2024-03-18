package com.example.externalprovider.ports

import com.example.externalprovider.dto.EnderecoDTO
import com.example.externalprovider.dto.EnderecoRequest

interface BuscaEnderecoPort {

    fun buscaEndereco(request: EnderecoRequest) : EnderecoDTO

}