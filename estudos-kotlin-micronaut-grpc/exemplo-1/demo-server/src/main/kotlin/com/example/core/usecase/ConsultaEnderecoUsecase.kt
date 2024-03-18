package com.example.core.usecase

import com.example.entrypoint.service.ConsultaEnderecoService
import com.example.externalprovider.dto.EnderecoDTO
import com.example.externalprovider.dto.EnderecoRequest
import com.example.externalprovider.ports.BuscaEnderecoPort

class ConsultaEnderecoUsecase(
    private val buscaEnderecoPort: BuscaEnderecoPort
) : ConsultaEnderecoService {

    override fun consultaEndereco(request: EnderecoRequest) : EnderecoDTO {
        return buscaEnderecoPort.buscaEndereco(request)
    }

}