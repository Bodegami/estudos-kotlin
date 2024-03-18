package com.example.config

import com.example.core.usecase.ConsultaEnderecoUsecase
import com.example.entrypoint.service.ConsultaEnderecoService
import com.example.externalprovider.adapters.BuscaEnderecoAdapter
import com.example.externalprovider.client.ViaCepHttpClient
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory

@Factory
class ConsultaEnderecoUsecaseFactory(
    private val viaCepHttpClient: ViaCepHttpClient
) {

    @Bean
    fun consultaEnderecoUseCaseConfiguration() : ConsultaEnderecoService {
        print("Criou o BEAN: consultaEnderecoService com sucesso!")
        return ConsultaEnderecoUsecase(BuscaEnderecoAdapter(viaCepHttpClient))
    }

}