package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "preco")
public class Preco{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Atributos: definem um atributo
     * Correção no banco de dados! (lançar no query do pg admin)
     *
     * ALTER TABLE preco
     * ALTER COLUMN "hora_alteracao" TYPE time without time zone
     * USING '00:00:00'::time without time zone;
     */
    @Column(length = 10, nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDate dataAlteracao;

    @Column(nullable = false)
    private LocalTime horaAlteracao;

    /**
     * Construtor
     */
    protected Preco() {}
    
    public Preco(BigDecimal valor, LocalDate dataAlteracao, LocalTime horaAlteracao){
        this.valor = valor;
        this.dataAlteracao = dataAlteracao;
        this.horaAlteracao = horaAlteracao;
    }

    /**
     * Getters
     */
    public Long getId() {
        return id;
    }
    
    public BigDecimal getValor(){
        return valor;
    }
    public LocalDate getDataAlteracao(){
        return dataAlteracao;
    }
    public LocalTime getHoraAlteracao(){
        return horaAlteracao;
    }

    /**
     * Setters
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
    public void setDataAlteracao(LocalDate dataAlteracao){
        this.dataAlteracao = dataAlteracao;
    }
    public void setHoraAlteracao(LocalTime horaAlteracao){
        this.horaAlteracao = horaAlteracao;
    }

}