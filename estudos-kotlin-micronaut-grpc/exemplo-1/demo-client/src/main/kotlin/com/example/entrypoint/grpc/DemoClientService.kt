package com.example.entrypoint.grpc

import com.example.DemoClientServiceGrpcKt
import com.example.externalprovider.grpc.DemoService
import com.example.Entities.*
import com.example.Entities.FindAdressRequest
import jakarta.inject.Singleton

@Singleton
class DemoClientService(
    val demoServer: DemoService
) : DemoClientServiceGrpcKt.DemoClientServiceCoroutineImplBase() {

    override suspend fun findAdressByCepClient(request: FindAdressRequest): AdressResponse {
        return demoServer.findAdressByCep(request)
    }

}