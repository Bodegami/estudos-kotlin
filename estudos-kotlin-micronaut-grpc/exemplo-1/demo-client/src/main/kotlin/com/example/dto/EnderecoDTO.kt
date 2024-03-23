package com.example.dto

import com.example.Entities

data class EnderecoDTO(
    var cep: String,
    var logradouro: String,
    var complemento: String,
    var bairro: String,
    var localidade: String,
    var uf: String,
    var ibge: String,
    var gia: String,
    var ddd: String,
    var siafi: String,
) {
    constructor(address: Entities.AdressResponse) : this(
        address.cep,
        address.logradouro,
        address.complemento,
        address.bairro,
        address.localidade,
        address.uf,
        address.ibge,
        address.gia,
        address.ddd,
        address.siafi
    )
}