package com.br.domain.entity;
import java.math.BigDecimal;

public class Estoque{

    private BigDecimal quantidade;
    private String localTanque;
    private String localEndereco;
    private String loteFabricacao;
    private String dataValidade;


    public Estoque(BigDecimal quantidade, String localTanque, String localEndereco, String loteFabricacao, String dataValidade) {
        this.quantidade = quantidade;
        this.localTanque = localTanque;
        this.localEndereco = localEndereco;
        this.loteFabricacao = loteFabricacao;
        this.dataValidade = dataValidade;
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
    public String getDataValidade(){
        return dataValidade;
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
    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
}

