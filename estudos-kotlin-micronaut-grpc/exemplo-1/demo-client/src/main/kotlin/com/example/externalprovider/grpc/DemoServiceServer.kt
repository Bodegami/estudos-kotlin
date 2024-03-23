package com.example.externalprovider.grpc

import com.example.DemoServerServiceGrpcKt
import com.example.Entities.*
import io.grpc.Channel
import io.grpc.ManagedChannelBuilder
import jakarta.inject.Singleton

@Singleton
class DemoServiceServer : DemoServerServiceGrpcKt.DemoServerServiceCoroutineImplBase() {

    private fun createStub(): DemoServerServiceGrpcKt.DemoServerServiceCoroutineStub {
        val channel: Channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build()

        return DemoServerServiceGrpcKt.DemoServerServiceCoroutineStub(channel)
    }

    override suspend fun saveUser(request: SaveUserRequest): UserResponse {
        val demoServerStub = createStub()

        val saveUserResponse = demoServerStub.saveUser(request)

        println("Usuário registrado com id = " + saveUserResponse.id)
        return saveUserResponse
    }

    override suspend fun findAdressByCep(request: FindAdressRequest): AdressResponse {
        print("chegou no metodo\n")
        val demoServerStub = createStub()

        return demoServerStub.findAdressByCep(request);
    }

}