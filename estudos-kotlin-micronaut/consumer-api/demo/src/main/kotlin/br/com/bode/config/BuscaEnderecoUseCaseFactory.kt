package br.com.bode.config

import br.com.bode.core.usecase.BuscaEnderecoUseCase
import br.com.bode.entrypoint.ports.BuscaCepInputPort
import br.com.bode.externalprovider.adapters.BuscaCepOutputAdapter
import br.com.bode.externalprovider.ports.ViaCepHttpClient
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory

@Factory
class BuscaEnderecoUseCaseFactory(var viacepClient: ViaCepHttpClient) {

    @Bean
    fun buscaCepEnderecoUseCaseConfiguration() : BuscaCepInputPort {
        print("Criou o BEAN: BuscaCepInputPort com sucesso!")
        return BuscaEnderecoUseCase(BuscaCepOutputAdapter(viacepClient))
    }



}