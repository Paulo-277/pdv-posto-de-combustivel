package com.br.pdvpostocombustivel.domain.entity;
public class Contato{


    /**
     * Atributos : definem um atributo
     */
    private String telefone;

    private String email;

    private String endereço;


    /**
     * Construtor
     */
    public Contato(String telefone, String email, String endereço){
        this.telefone = telefone;
        this.email = email;
        this.endereço = endereço;
    }

    /**
     * Getters
     */
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
    public String getEndereço(){
        return endereço;
    }

    /**
     * Setters
     */
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

}