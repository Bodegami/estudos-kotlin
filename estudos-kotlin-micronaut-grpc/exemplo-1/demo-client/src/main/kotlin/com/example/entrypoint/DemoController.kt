package com.example.entrypoint

import com.example.externalprovider.grpc.DemoServiceServer
import com.example.dto.EnderecoDTO
import com.example.Entities.FindAdressRequest
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/teste")
class DemoController(
    private val demo: DemoServiceServer
)  {

    @Get("/{cep}")
    suspend fun buscaEndereco(@PathVariable("cep") cep: String): EnderecoDTO {
        print("Chegou no controller o cep: $cep\n")
        val request = FindAdressRequest.newBuilder().setCep(cep).build()
        val addressResponse = demo.findAdressByCep(request)

        return EnderecoDTO(addressResponse)
    }

}