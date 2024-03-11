package br.com.bode.entrypoint.interceptor

import br.com.bode.core.usecase.exceptions.BuscaEnderecoException
import br.com.bode.core.usecase.exceptions.ErrorResponse
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus.NOT_ACCEPTABLE
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import jakarta.inject.Singleton


@Produces
@Singleton
@Requires(classes = [BuscaEnderecoException::class, ExceptionHandler::class])
class GlobalExceptionHandler : ExceptionHandler<BuscaEnderecoException, HttpResponse<Any>> {

    override fun handle(request: HttpRequest<*>?, exception: BuscaEnderecoException?): HttpResponse<Any> {
        val error = ErrorResponse(NOT_ACCEPTABLE.code, exception!!.message, exception.cause.toString())
        return HttpResponse.status<Any?>(NOT_ACCEPTABLE).body(error)
    }

}