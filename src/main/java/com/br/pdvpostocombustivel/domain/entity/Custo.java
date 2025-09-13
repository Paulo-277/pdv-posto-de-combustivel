package com.br.pdvpostocombustivel.domain.entity;
import java.util.Date;

public class Custo{

    //Atributos
    private double imposto;
    private double custoVariavel;
    private double custoFixo;
    private double margemLucro;
    private Date dataProcessamento;

    //Construtor
    public Custo(double imposto, double custoVariavel, double custoFixo, double margemLucro, Date dataProcessamento){
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
    public Date getDataProcessamento() {
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
    public void setDataProcessamento(Date dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }
}