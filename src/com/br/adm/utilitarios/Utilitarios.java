/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.adm.utilitarios;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author dacru
 */
public class Utilitarios {   
    public void LimpaTela (JPanel container) {
        Component conponentes[] = container.getComponents();
       for(Component component : conponentes) {
           if (component instanceof JTextField) {
               ((JTextField)component).setText(null);
           }
       } 
    }     
         
}
