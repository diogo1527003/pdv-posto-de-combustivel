package com.br.domain.entity;

import java.util.Date;

public class Contato {
    private  String telefone;

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    private  String email;
    private String endereço;

    //construtor
    public Contato(String telefone, String email, String endereço){
        this.telefone = telefone;
        this.email = email;
        this.endereço = endereço;
    }
    //getters
    public String getTelefone(){
        return telefone;
    }
    //setters

}