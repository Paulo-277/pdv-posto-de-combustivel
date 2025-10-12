package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    Optional<Estoque> findByLocalTanque (String localTanque);
    Optional<Estoque> findByLocalEndereco (String localEndereco);
    Optional<Estoque> findByDataValidade (LocalDate dataValidade);

    boolean existsByLocalTanque (String localTanque);
    boolean existsByLocalEndereco (String localEndereco);
}
