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
public class mensalidade {
    
    private int id_mensalidade;
    private int id_matricula;
    private double valor;
    private String data_vencimento;

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }
    private int qtd_parcela;
    private String descricao;

    public int getId_mensalidade() {
        return id_mensalidade;
    }

    public void setId_mensalidade(int id_mensalidade) {
        this.id_mensalidade = id_mensalidade;
    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd_parcela() {
        return qtd_parcela;
    }

    public void setQtd_parcela(int qtd_parcela) {
        this.qtd_parcela = qtd_parcela;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        
}
