package com.br.pdvpostocombustivel.domain.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Custo")
public class Custo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributos
    @Column(length = 5,nullable = false)
    private BigDecimal imposto;

    @Column(length = 10, nullable = false)
    private BigDecimal custoVariavel;

    @Column(length = 10, nullable = false)
    private BigDecimal custoFixo;

    @Column(length = 5, nullable = false)
    private BigDecimal margemLucro;

    @Column(length = 10, nullable = false)
    private LocalDate dataProcessamento;

    //Construtor
    protected Custo() {}
    
    public Custo(BigDecimal imposto, BigDecimal custoVariavel, BigDecimal custoFixo, BigDecimal margemLucro, LocalDate dataProcessamento){
        this.imposto = imposto;
        this.custoVariavel = custoVariavel;
        this.custoFixo = custoFixo;
        this.margemLucro = margemLucro;
        this.dataProcessamento = dataProcessamento;
    }

    //Getter
    public Long getId() {
        return id;
    }
    
    public BigDecimal getImposto() {
        return imposto;
    }
    public BigDecimal getCustoVariavel() {
        return custoVariavel;
    }
    public BigDecimal getCustoFixo() {
        return custoFixo;
    }
    public BigDecimal getMargemLucro() {
        return margemLucro;
    }
    public LocalDate getDataProcessamento() {
        return dataProcessamento;
    }

    //Setter
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setImposto(BigDecimal imposto) {
        this.imposto = imposto;
    }
    public void setCustoVariavel(BigDecimal custoVariavel) {
        this.custoVariavel = custoVariavel;
    }
    public void setCustoFixo(BigDecimal custoFixo) {
        this.custoFixo = custoFixo;
    }
    public void setMargemLucro(BigDecimal margemLucro) {
        this.margemLucro = margemLucro;
    }
    public void setDataProcessamento(LocalDate dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }
}