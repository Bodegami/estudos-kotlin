package br.com.bodegami.pockotlin.controller

import br.com.bodegami.pockotlin.dto.CadastroRequest
import br.com.bodegami.pockotlin.dto.CadastroResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cadastro")
class CadastroController {

    @PostMapping
    fun cadastra(@RequestBody request: CadastroRequest): ResponseEntity<CadastroResponse> {
        val response = CadastroResponse(
            nome = request.nome,
            email = request.email
        )
        return ResponseEntity.ok(response)
    }

}