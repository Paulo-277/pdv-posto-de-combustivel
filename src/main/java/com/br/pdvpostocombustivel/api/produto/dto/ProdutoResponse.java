package com.br.pdvpostocombustivel.api.produto.dto;

/*
para a Resposta
 */
public record ProdutoResponse(
        String nome,
        String referencia,
        String fronecedor,
        String categoria,
        String marca
)
{}
