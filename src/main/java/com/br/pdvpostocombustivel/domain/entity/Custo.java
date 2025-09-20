package com.br.pdvpostocombustivel.domain.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Custo")
public class Custo{

    //Atributos
    @Column(length = 5,nullable = false)
    private Double imposto;

    @Column(length = 10, nullable = false)
    private Double custoVariavel;

    @Column(length = 10, nullable = false)
    private Double custoFixo;

    @Column(length = 5, nullable = false)
    private Double margemLucro;

    @Column(length = 10, nullable = false)
    private LocalDate dataProcessamento;

    //Construtor
    public Custo(double imposto, double custoVariavel, double custoFixo, double margemLucro, LocalDate dataProcessamento){
        this.imposto = imposto;
        this.custoVariavel = custoVariavel;
        this.custoFixo = custoFixo;
        this.margemLucro = margemLucro;
        this.dataProcessamento = dataProcessamento;
    }

    //Getter
    public double getImposto() {
        return imposto;
    }
    public double getCustoVariavel() {
        return custoVariavel;
    }
    public double getCustoFixo() {
        return custoFixo;
    }
    public double getMargemLucro() {
        return margemLucro;
    }
    public LocalDate getDataProcessamento() {
        return dataProcessamento;
    }

    //Setter
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public void setCustoVariavel(double custoVariavel) {
        this.custoVariavel = custoVariavel;
    }
    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }
    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    public void setDataProcessamento(LocalDate dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }
}