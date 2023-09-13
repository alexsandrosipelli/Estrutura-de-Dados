/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado1;

/**
 *
 * @author alexs
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class TestarAplicacao {

    public static void main(String[] args) throws Exception {
        Aplicacao apl = new Aplicacao(1);
        int sorteios = 0;
        while (true) {
            String opcao = JOptionPane.showInputDialog(null,
                    "Digite uma opção : \n 1-inserir um nome"
                    + " \n 2-Ver os nomes \n 3-sortear \n 4-Ver a quantidade de nomes "
                    + "\n 5- buscar um Nome \n 6-SAIR"
                    + "\n 7-buscar um nome ");
            if (opcao.equals("1")) {
                try {

                    apl.adicionar(JOptionPane.showInputDialog(null, "Digite o Nome completo : "));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (opcao.equals("2")) {
                JOptionPane.showMessageDialog(null, apl.toString());

            } else if (opcao.equals("3")) {

                Random sotear = new Random(apl.tamanho());
                if (sorteios == 0) {
                    int rs = sotear.nextInt(apl.tamanho());

                    JOptionPane.showMessageDialog(null, apl.busca(rs));
                    System.out.println(sorteios);
                }

            } else if (opcao.equals("4")) {

                JOptionPane.showMessageDialog(null, apl.tamanho());

            } else if (opcao.equals("5")) {
                int index = apl.busca1(JOptionPane.showInputDialog(null, "Digite o Nome completo:"));

                if (index == -1) {

                    JOptionPane.showMessageDialog(null, "nome não encontrado !!");

                } else {

                    JOptionPane.showMessageDialog(null, "o nome esta na posição : "
                            + (index + 1)
                            + " da lista de nomes ");
                }

            } else if (opcao.equals("6")) {
                JOptionPane.showMessageDialog(null, "Saindo..");
                System.exit(0);

            } else {

                JOptionPane.showMessageDialog(null, "Escolha invalida");
            }

        }

    }
}
