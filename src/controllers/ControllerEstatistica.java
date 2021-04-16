/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.DaoEstatistica;
import java.util.ArrayList;
import models.EstatisticaJogador;
import models.Jogador;

/**
 *
 * @author emanu
 */
public class ControllerEstatistica {
    public boolean createEstatisticaJogador(EstatisticaJogador ej){
        ArrayList<String> parametros = ej.toArray();
        DaoEstatistica de = new DaoEstatistica();
        String comando = "INSERT INTO estatistica_jogador (fk_jogador, fk_partida, pontos, rebotes, assistencias, roubadas, tocos, turnovers) VALUES (?,?,?,?,?,?,?,?)";
        return de.create(comando, parametros);
    }
    
    public EstatisticaJogador getEstatisticaJogador(Jogador jogador){
        DaoEstatistica de = new DaoEstatistica();
        ArrayList<String> parametros = new ArrayList();
        String comando = "SELECT count(*) as partidas,sum(pontos) as pontos, sum(rebotes) as rebotes, sum(assistencias) as assistencias, sum(roubadas) as roubadas, sum(tocos) as tocos, sum(turnovers) as turnovers FROM estatistica_jogador WHERE fk_jogador = ?";
        
        return de.getEstatisticaJogador(comando, jogador.getId().toString());
    }
}
