/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.adm.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author dacru
 */
public class teste {
    public static void main(String[] args) {
        try{
            new ConexaoBanco().pegarConexao();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso ao banco de dados!");
        }catch(HeadlessException erro){
            JOptionPane.showMessageDialog(null, "Erro ao se conectar ao banco de dados" + erro);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:  " + e);
        }
        
    }
}
