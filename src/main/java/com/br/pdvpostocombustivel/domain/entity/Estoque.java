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
@Table(name = "estoque")
public class Estoque{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private BigDecimal quantidade;

    @Column(length = 50, nullable = false)
    private String localTanque;

    @Column(length = 100, nullable = false)
    private String localEndereco;

    @Column(length = 10, nullable = false)
    private String loteFabricacao;

    @Column(length = 10, nullable = false)
    private LocalDate dataValidade;

    public Estoque() {
    }

    public Estoque(BigDecimal quantidade, String localTanque, String localEndereco, String loteFabricacao, LocalDate dataValidade) {
        this.quantidade = quantidade;
        this.localTanque = localTanque;
        this.localEndereco = localEndereco;
        this.loteFabricacao = loteFabricacao;
        this.dataValidade = dataValidade;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getQuantidade(){
        return quantidade;
    }
    public String getLocalTanque(){
        return localTanque;
    }
    public String getLocalEndereco(){
        return localEndereco;
    }
    public String getLoteFabricacao(){
        return loteFabricacao;
    }
    public LocalDate getDataValidade(){
        return dataValidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuantidade(BigDecimal Quantidade){
        this.quantidade = quantidade;
    }
    public void setLocalTanque(String localTanque){
        this.localTanque = localTanque;
    }
    public void setLocalEndereco(String localEndereco){
        this.localEndereco = localEndereco;
    }
    public void setLoteFabricacao(String loteFabricacao){
        this.loteFabricacao = loteFabricacao;
    }
    public void setDataValidade(LocalDate dataValidade){
        this.dataValidade = dataValidade;
    }
}

