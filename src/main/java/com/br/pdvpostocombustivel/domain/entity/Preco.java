package com.br.pdvpostocombustivel.domain.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "preco")
public class Preco{
    /**
     * Atributos : definem um atributo
     */
    @Column(length = 10, nullable = false)
    private BigDecimal valor;

    @Column(length = 10, nullable = false)
    private LocalDate dataAlteracao;

    @Column(length = 10, nullable = false)
    private LocalDate horaAlteracao;


    /**
     * Construtor
     */
    public Preco(BigDecimal valor, LocalDate dataAlteracao, LocalDate horaAlteracao){
        this.valor = valor;
        this.dataAlteracao = dataAlteracao;
        this.horaAlteracao = horaAlteracao;
    }

    /**
     * Getters
     */
    public BigDecimal getValor(){
        return valor;
    }
    public LocalDate getDataAlteracao(){
        return dataAlteracao;
    }
    public LocalDate getHoraAlteracao(){
        return horaAlteracao;
    }

    /**
     * Setters
     */
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
    public void setDataAlteracao(LocalDate dataAlteracao){
        this.dataAlteracao = dataAlteracao;
    }
    public void setHoraAlteracao(LocalDate horaAlteracao){
        this.horaAlteracao = horaAlteracao;
    }

}