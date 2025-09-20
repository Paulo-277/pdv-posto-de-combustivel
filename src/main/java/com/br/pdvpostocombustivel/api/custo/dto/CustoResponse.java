package com.br.pdvpostocombustivel.api.custo.dto;

import java.time.LocalDate;

/*
Para Resposta
*/
public record CustoResponse(
        Double imposto,
        Double custoVariavel,
        Double custoFixo,
        Double margemLucro,
        LocalDate dataProcessamento
)
{}
