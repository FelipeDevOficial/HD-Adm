/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.adm.model;

/**
 *
 * @author dacru
 */
public class Usuario {
    
    private int id_usuario;
    private String nome;
    private String cpf;
    private String celular;
    private String telefone;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String email;
    private String senha;
    private String cd_nivelAcesso;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCd_nivelAcesso() {
        return cd_nivelAcesso;
    }

    public void setCd_nivelAcesso(String cd_nivelAcesso) {
        this.cd_nivelAcesso = cd_nivelAcesso;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nome=" + nome + ", cpf=" + cpf + ", celular=" + celular + ", telefone=" + telefone + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", email=" + email + ", senha=" + senha + ", cd_nivelAcesso=" + cd_nivelAcesso + '}';
    }

  
    
}
