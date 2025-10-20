package com.br.pdvpostocombustivel.api.custo.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
Para Entrada
 */
public record CustoRequest(
        BigDecimal imposto,
        BigDecimal custoVariavel,
        BigDecimal custoFixo,
        BigDecimal margemLucro,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataProcessamento
        )
{}
