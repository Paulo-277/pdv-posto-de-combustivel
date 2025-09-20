package com.br.pdvpostocombustivel.api.contato.dto;

/*
Para Resposta
*/
public record ContatoResponse(
        String telefone,
        String email,
        String endereco
)
{}
