package com.br.pdvpostocombustivel.api.preco.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
Para Resposta
*/
public record PrecoResponse(
        BigDecimal valor,
        LocalDate dataAlteracao,
        LocalDate horaAlteracao
)
{}
