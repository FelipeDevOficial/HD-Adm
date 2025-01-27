/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.adm.model;

import javafx.animation.Animation;

/**
 *
 * @author dacru
 */
public class aluno {
    
    public enum Status {
        ATIVO,
        INATIVO;
    }
    
    private int id_aluno;
    private String nome;
    private int cpf;
    private String email;
    private String celular;
    private String telefone;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private Status status;

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "alunos{" + "id_aluno=" + id_aluno + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", celular=" + celular + ", telefone=" + telefone + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", status=" + status + '}';
    }
    
    
}
