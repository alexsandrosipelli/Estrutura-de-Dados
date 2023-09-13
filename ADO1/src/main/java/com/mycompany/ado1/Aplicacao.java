/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado1;

/**
 *
 * @author alexs situaçao é sobre uma empresa que precisa sortear para os
 * funcionarios um premio, com isso precisara de todos os nomes deles.
 */
public class Aplicacao {

    private String Nomes[];
    private int Tamanho;

    // criando construtor com parametro  
    public Aplicacao(int capacidade) {
        this.Nomes = new String[capacidade];
        this.Tamanho = 0;
    }
     public int tamanho(){
        return this.Tamanho;
    }

   
    public void adiciona(String nome) throws Exception {
        if (this.Tamanho < this.Nomes.length) {
            this.Nomes[this.Tamanho] = nome;
            this.Tamanho++;
        } else {
            throw new Exception("O Vetor já está cheio, "
                    + "não é possível adiconar novos elementos");
        }
    }
    public void adicionar(String nome) {
        if (Tamanho >= Nomes.length) {
            // Se o array estiver cheio, crie um novo com tamanho maior
            String[] novoArray = new String[Nomes.length +1];
            // Copie os elementos do array antigo para o novo
            for (int i = 0; i < Nomes.length; i++) {
                novoArray[i] = Nomes[i];
            }
            // Atualize a referência para o novo array
            Nomes = novoArray;
        }

        Nomes[Tamanho] = nome;
        Tamanho++;
    }

    public void verNomes(){
        for (int i = 0; i < Nomes.length; i++) {
            System.out.println(Nomes[i]);
            
        }
        
    
    }
     @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0; i<this.Tamanho-1; i++){
            s.append(this.Nomes[i]);
            s.append(", ");
        }
        
        if(this.Tamanho> 0){
            s.append(this.Nomes[this.Tamanho-1]);
        }
        
        s.append("]");
                
        return s.toString();
    }
     public String busca(int posicao)throws Exception{
        if(posicao >=0 && posicao < Tamanho){
            return Nomes[posicao];
            
        } else {
            throw new Exception("Posição Inválida");
        }  
    }
    
    public int busca1 (String elemento){
        for (int i=0; i < Tamanho; i++){
            if(Nomes[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }

}
