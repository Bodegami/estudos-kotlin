package com.example.entrypoint.grpc

import com.example.DemoClientServiceGrpcKt
import com.example.externalprovider.grpc.DemoServiceServer
import com.example.Entities.*
import com.example.Entities.FindAdressRequest
import jakarta.inject.Singleton

@Singleton
class DemoServiceClient(
    val demoServer: DemoServiceServer
) : DemoClientServiceGrpcKt.DemoClientServiceCoroutineImplBase() {
    override suspend fun saveUser(request: SaveUserRequest): UserResponse {
        return demoServer.saveUser(request)
    }

    override suspend fun findAdressByCepClient(request: FindAdressRequest): AdressResponse {
        return demoServer.findAdressByCep(request)
    }
}