package com.br.pdvpostocombustivel.api.preco.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/*
Para Resposta
*/
public record PrecoResponse(
        BigDecimal valor,
        LocalDate dataAlteracao,
        LocalTime horaAlteracao
)
{}
