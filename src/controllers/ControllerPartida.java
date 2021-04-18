/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.DaoPartida;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
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
    
    public ArrayList<Partida> getByData(String data){
        try {  
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date d = sdf.parse(data);
            sdf.applyPattern("yyyy-mm-dd");
            data = sdf.format(d);

        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        
        data = "%".concat(data);
        data = data.concat("%");
        DaoPartida dp = new DaoPartida();
        ArrayList<Partida> partidas = new ArrayList();
        ArrayList<String> parametros = new ArrayList();
        parametros.add(data);
        
        String comando = "SELECT * FROM partida where data like ?";
        partidas = dp.get(comando, parametros);
        
        return partidas;
    }
    
    public ArrayList<Partida> getEquipe(Equipe equipe){
        DaoPartida dp = new DaoPartida();
        ArrayList<String> parametros = new ArrayList();
        parametros.add(equipe.getId().toString());
        parametros.add(equipe.getId().toString());
        System.out.println(equipe.getId());
        String comando = "SELECT * FROM partida WHERE fk_equipe1 = ? or fk_equipe2 = ?;";
        return dp.get(comando, parametros);
    }
}
