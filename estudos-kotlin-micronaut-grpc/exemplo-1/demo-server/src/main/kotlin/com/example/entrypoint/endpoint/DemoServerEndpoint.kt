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

    var num: Int = 1

    override suspend fun saveUser(request: SaveUserRequest): UserResponse {
        println("Salvando usuário de id: $num")

        val response = UserResponse.newBuilder()
            .setId(num)
            .setName(request.name)
            .setLastName(request.lastName)
            .build()

        num++
        return response
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
        print("Chamando endpoint de consulta para o cep: ${request.cep}!!!\n")
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