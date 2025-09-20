package com.br.pdvpostocombustivel.api.estoque.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
Para Resposta
*/
public record EstoqueResponse(
        BigDecimal quantidade,
        String localTanque,
        String localEndereco,
        String loteFabricacao,
        LocalDate dataValidade
)
{}
