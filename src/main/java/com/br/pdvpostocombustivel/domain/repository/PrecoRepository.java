package com.br.pdvpostocombustivel.domain.repository;

import com.br.pdvpostocombustivel.domain.entity.Preco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;
import java.math.BigDecimal;

public interface PrecoRepository  extends JpaRepository<Preco, Long> {
        Optional<Preco> findByValor(BigDecimal valor);

        Optional<Preco> findByDataAlteracao(LocalDate dataAlteracao);

        Optional<Preco> findByHoraAlteracao(LocalDate horaAlteracao);
}
