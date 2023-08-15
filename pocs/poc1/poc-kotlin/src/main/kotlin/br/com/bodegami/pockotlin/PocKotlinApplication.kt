package br.com.bodegami.pockotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocKotlinApplication

fun main(args: Array<String>) {
	runApplication<PocKotlinApplication>(*args)
}
