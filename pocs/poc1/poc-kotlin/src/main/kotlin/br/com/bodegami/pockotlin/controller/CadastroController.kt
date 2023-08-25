package br.com.bodegami.pockotlin.controller

import br.com.bodegami.pockotlin.dto.CadastroRequest
import br.com.bodegami.pockotlin.dto.CadastroResponse
import br.com.bodegami.pockotlin.service.CadastroService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cadastro")
class CadastroController(
    val cadastroService: CadastroService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    fun cadastra(@RequestBody request: CadastroRequest): ResponseEntity<CadastroResponse> {
        val response = cadastroService.cadastra(request)
        return ResponseEntity.ok(response)
    }

    @GetMapping
    @Transactional(readOnly = true)
    fun consulta(): ResponseEntity<List<CadastroResponse>> {
        val response = cadastroService.consultaClientes()
        return ResponseEntity.ok(response)
    }

}