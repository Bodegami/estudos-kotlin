package com.example.entrypoint.endpoint

import com.example.*
import com.example.entrypoint.service.ConsultaEnderecoService
import com.example.externalprovider.dto.EnderecoRequest
import jakarta.inject.Singleton
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

@Singleton
class DemoServerEndpoint(
    private val consultaEnderecoService: ConsultaEnderecoService
) : DemoServerServiceGrpcKt.DemoServerServiceCoroutineImplBase() {

    override suspend fun saveUser(request: SaveUserRequest): UserResponse {
        return UserResponse.newBuilder()
            .setId(1)
            .setName(request.name)
            .setLastName(request.lastName)
            .build()
    }
    override fun saveUserStream(requests: Flow<SaveUserRequest>): Flow<UserResponse> = flow {
        var id = 1
        requests.collect {
            println("Salvando usuário...")
            emit(
                UserResponse.newBuilder()
                    .setId(id++)
                    .setName(it.name)
                    .setLastName(it.lastName)
                    .build()
            )
            println("Concluído...")
        }
    }

    override suspend fun findAdressByCep(request: FindAdressRequest): AdressResponse {
        val response = consultaEnderecoService.consultaEndereco(EnderecoRequest(request.cep))
        return AdressResponse.newBuilder()
            .setCep(response.cep)
            .setLogradouro(response.logradouro)
            .setComplemento(response.complemento)
            .setBairro(response.bairro)
            .setLocalidade(response.localidade)
            .setUf(response.uf)
            .setIbge(response.ibge)
            .setGia(response.gia)
            .setDdd(response.ddd)
            .setSiafi(response.siafi)
            .build()
    }

}