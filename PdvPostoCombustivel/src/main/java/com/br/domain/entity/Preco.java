package com.br.domain.entity;
import java.math.BigDecimal;
import java.util.Date;

public class Preco{


    /**
     * Atributos : definem um atributo
     */
    private BigDecimal valor;

    private Date dataAlteracao;

    private Date horaAlteracao;


    /**
     * Construtor
     */
    public Preco(BigDecimal valor, Date dataAlteracao, Date horaAlteracao){
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
    public Date getDataAlteracao(){
        return dataAlteracao;
    }
    public Date getHoraAlteracao(){
        return horaAlteracao;
    }

    /**
     * Setters
     */
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
    public void setDataAlteracao(Date dataAlteracao){
        this.dataAlteracao = dataAlteracao;
    }
    public void setHoraAlteracao(Date horaAlteracao){
        this.horaAlteracao = horaAlteracao;
    }

}