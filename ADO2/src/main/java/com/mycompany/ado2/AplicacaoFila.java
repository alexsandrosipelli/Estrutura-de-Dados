/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado2;

import javax.swing.JOptionPane;

/**
 *
 * @author alexs
 */
public class AplicacaoFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        String respostaUsuario = JOptionPane.showInputDialog(null, " Escolha sua ficha !! \n"
                + "\n 1 - ATENDIMENTO PREFERENCIAL"
                + "\n 2 - ATENDIMENTO COMUM "
                + "\n 3 - VER FILA"
                + "\n 4 - PROXIMO DA FILA"
                + "\n");
        if (respostaUsuario.equals("1")) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome : ");
            
            fila.adcionar(nome);
        } else if (respostaUsuario.equals("2")) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome : ");
            fila.adcionar(nome);

        } else if (respostaUsuario.equals("3")) {
            

        } else if (respostaUsuario.equals("4")) {
            

        }

        JOptionPane.showMessageDialog(null, fila.toString());
    }

}
