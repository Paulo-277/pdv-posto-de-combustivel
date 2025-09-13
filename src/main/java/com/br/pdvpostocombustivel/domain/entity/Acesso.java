package com.br.pdvpostocombustivel.domain.entity;

public class Acesso{
    /**
     * Atributos
     */
    private String usuario;
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
