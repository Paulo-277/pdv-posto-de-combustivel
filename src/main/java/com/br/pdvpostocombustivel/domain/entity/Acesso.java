package com.br.pdvpostocombustivel.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Acesso")
public class Acesso{
    /**
     * Atributos
     */
    @Column(length = 30, nullable = false)
    private String usuario;

    @Column(length = 20, nullable = false)
    private String senha;

    /**
     * Construtor
     */
    public Acesso(String usuario, String senha){
        this.usuario = usuario;
        this.senha =  senha;
    }

    /**
     * Getters
     */
    public String getUsuario(){
        return usuario;
    }
    public String getSenha(){
        return senha;
    }

    /**
     * Setters
     */
    public void setUsuario(String usuario){
        this.usuario =usuario;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
