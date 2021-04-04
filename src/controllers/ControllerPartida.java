/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.DaoPartida;
import java.util.ArrayList;
import models.Equipe;
import models.Partida;

/**
 *
 * @author emanu
 */
public class ControllerPartida {
    public boolean create(Equipe equipe1, Equipe equipe2, Integer pontosEquipe1, Integer pontosEquipe2, String local, String data){
        if(equipe1.getId().equals(equipe2.getId())){
            return false;
        }
        DaoPartida daoPartida = new DaoPartida();
        Partida partida = new Partida(equipe1, equipe2, pontosEquipe1, pontosEquipe2, local, data);        
        ArrayList<String> parametros = partida.toArrayList();
        String comando = "INSERT INTO partida (fk_equipe1, fk_equipe2, pontos_equipe1, pontos_equipe2, local, data) VALUES (?,?,?,?,?,STR_TO_DATE(?,'%d/%m/%Y %H:%i:%s'))";
        
        return daoPartida.create(comando, parametros);
    }
}
