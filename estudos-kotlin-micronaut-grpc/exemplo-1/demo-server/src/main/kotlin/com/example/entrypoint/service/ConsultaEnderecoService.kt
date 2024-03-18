package com.example.entrypoint.service

import com.example.externalprovider.dto.EnderecoDTO
import com.example.externalprovider.dto.EnderecoRequest

interface ConsultaEnderecoService {

    fun consultaEndereco(request: EnderecoRequest) : EnderecoDTO

}