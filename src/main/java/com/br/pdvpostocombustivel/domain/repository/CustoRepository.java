package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Custo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

public interface CustoRepository extends JpaRepository<Custo, Long> {
    Optional<Custo> findByCustoFixo (BigDecimal custoFixo);
    Optional<Custo> findByMargemLucro (BigDecimal margemLucro);
    Optional<Custo> findByDataProcessamento (LocalDate dataProcessamento);
}
