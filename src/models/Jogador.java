/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author emanu
 */
public class Jogador {
    private String nome;
    private String cpf;
    private String posicao;
    private Integer idade;
    private Double altura;
    private Double peso;

    public Jogador(String nome, String cpf, String posicao, Integer idade, Double altura, Double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.posicao = posicao;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPosicao() {
        return posicao;
    }

    public Integer getIdade() {
        return idade;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }
    
    
    
    public ArrayList<String> toArrayList(){
        ArrayList<String> atributos = new ArrayList();
        atributos.add(this.nome);
        atributos.add(this.cpf);
        atributos.add(this.posicao);
        atributos.add(this.idade.toString());
        atributos.add(this.altura.toString());
        atributos.add(this.peso.toString());
        return atributos;
    }
    
    
}
