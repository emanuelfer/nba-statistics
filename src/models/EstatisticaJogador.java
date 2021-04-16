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
public class EstatisticaJogador {
    private Partida partida;
    private Jogador jogador;
    private Integer numPartidas;
    private Integer pontos;
    private Integer rebotes;
    private Integer assistencias;
    private Integer roubadas;
    private Integer tocos;
    private Integer turnovers;

    public EstatisticaJogador(Partida partida, Jogador jogador, Integer pontos, Integer rebotes, Integer assistencias, Integer roubadas, Integer tocos, Integer turnovers) {
        this.partida = partida;
        this.jogador = jogador;
        this.pontos = pontos;
        this.rebotes = rebotes;
        this.assistencias = assistencias;
        this.roubadas = roubadas;
        this.tocos = tocos;
        this.turnovers = turnovers;
    }

    public EstatisticaJogador(Integer pontos, Integer rebotes, Integer assistencias, Integer roubadas, Integer tocos, Integer turnovers) {
        this.pontos = pontos;
        this.rebotes = rebotes;
        this.assistencias = assistencias;
        this.roubadas = roubadas;
        this.tocos = tocos;
        this.turnovers = turnovers;
    }

    public EstatisticaJogador(Integer numPartidas, Integer pontos, Integer rebotes, Integer assistencias, Integer roubadas, Integer tocos, Integer turnovers) {
        this.numPartidas = numPartidas;
        this.pontos = pontos;
        this.rebotes = rebotes;
        this.assistencias = assistencias;
        this.roubadas = roubadas;
        this.tocos = tocos;
        this.turnovers = turnovers;
    }

    public Integer getNumPartidas() {
        return numPartidas;
    }

    public Partida getPartida() {
        return partida;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Integer getPontos() {
        return pontos;
    }

    public Integer getRebotes() {
        return rebotes;
    }

    public Integer getAssistencias() {
        return assistencias;
    }

    public Integer getRoubadas() {
        return roubadas;
    }

    public Integer getTocos() {
        return tocos;
    }

    public Integer getTurnovers() {
        return turnovers;
    }
    
    
    
    public ArrayList<String> toArray(){
        ArrayList<String> parametros = new ArrayList();
        parametros.add(this.jogador.getId().toString());
        parametros.add(this.partida.getId().toString());
        parametros.add(this.pontos.toString());
        parametros.add(this.rebotes.toString());
        parametros.add(this.assistencias.toString());
        parametros.add(this.roubadas.toString());
        parametros.add(this.tocos.toString());
        parametros.add(this.turnovers.toString());
        
        return parametros;
    }
}
