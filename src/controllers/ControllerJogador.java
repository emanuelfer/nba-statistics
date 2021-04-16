/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.DaoJogador;
import java.util.ArrayList;
import models.Equipe;
import models.Jogador;

/**
 *
 * @author emanu
 */
public class ControllerJogador {
    public boolean create(String nome, Equipe equipe, String cpf, String posicao, int idade, Double altura, Double peso){
        DaoJogador daoJogador = new DaoJogador();
        Jogador jogador = new Jogador(nome, equipe, cpf, posicao, idade, altura, peso);
        ArrayList<String> parametros = jogador.toArrayList();
        String comando = "INSERT INTO jogador (nome, fk_equipe, cpf, posicao, idade, altura, peso) VALUES (?,?,?,?,?,?,?)";
        
        return daoJogador.create(comando, parametros);
    }
    
    public ArrayList<Jogador> getJogadorByEquipe(Equipe equipe){
        DaoJogador daoJogador = new DaoJogador();
        ArrayList<String> parametros = new ArrayList();
        parametros.add(equipe.getId().toString());
        String comando = "SELECT * FROM jogador WHERE fk_equipe = ?";
        
        return daoJogador.get(comando, parametros);
    }
    
    public Jogador getJogadorByCpf(String cpf){
        DaoJogador daoJogador = new DaoJogador();
        ArrayList<String> parametros = new ArrayList();
        parametros.add(cpf);
        String comando = "SELECT * FROM jogador WHERE cpf = ?";
        
        return daoJogador.get(comando, parametros).get(0);
    }
}
