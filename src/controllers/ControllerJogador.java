/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.DaoJogador;
import java.util.ArrayList;
import models.Jogador;

/**
 *
 * @author emanu
 */
public class ControllerJogador {
    public boolean create(String nome, String cpf, String posicao, int idade, Double altura, Double peso){
        DaoJogador daoJogador = new DaoJogador();
        Jogador jogador = new Jogador(nome, cpf, posicao, idade, altura, peso);
        ArrayList<String> parametros = jogador.toArrayList();
        String comando = "INSERT INTO jogador (nome, cpf, posicao, idade, altura, peso) VALUES (?,?,?,?,?,?)";
        
        return daoJogador.create(comando, parametros);
    }
}
