/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.adm.utilitarios;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author dacru
 */
public class NewTableCellRenderer extends DefaultTableCellRenderer {

private boolean tranparente = false;

    public NewTableCellRenderer() {
        super();
    } // Fim do construtor

    public void setTranparencia(boolean tranparente) {
        this.tranparente = tranparente;
    }

    public Component getTableCellRendererComponent(JTable tabela,
            Object valor, boolean estaSelecionado, boolean temFoco, 
            int linha, int coluna) {
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(
                tabela, valor, estaSelecionado, temFoco, linha, coluna);
        
        // Exibe o fundo da tabela ou o do próprio label
        label.setOpaque(!this.tranparente);
        
        // Centraliza o label
        if (coluna != 0)
            label.setHorizontalAlignment(JLabel.CENTER);

        return label; // Retorna o label formatado
        
    } // Fim do método getTableCellRendererComponent

} // Fim da classe NewTableCellRenderer