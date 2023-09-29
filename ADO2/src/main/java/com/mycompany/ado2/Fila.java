/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado2;

/**
 *
 * @author alexs
 */
public class Fila<T> {

    public T[] controle;
    public int tamanho;
    public int senhas=0;

    public Fila(int capacidade) {
        this.controle = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Fila() {
        this(10);
    }

    public void adcionar(T nome) {
        if (this.tamanho < controle.length) {
            
            
            controle[this.tamanho] = nome;
                     
            this.tamanho++;
        }
    }
    public void senhas(){
    senhas++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.controle[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.controle[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
