package com.br.pdvpostocombustivel.api.preco.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public record PrecoRequest(
        BigDecimal valor,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate dataAlteracao,
        @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
        @Schema(type = "string", example = "19:05:00")
        LocalTime horaAlteracao
) {}
