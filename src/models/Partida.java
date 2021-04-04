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
public class Partida {
    private Equipe equipe1;
    private Equipe equipe2;
    private Integer pontosEquipe1;
    private Integer pontosEquipe2;
    private String local;
    private String data;

    public Partida(Equipe equipe1, Equipe equipe2, Integer pontosEquipe1, Integer pontosEquipe2, String local, String data) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.pontosEquipe1 = pontosEquipe1;
        this.pontosEquipe2 = pontosEquipe2;
        this.local = local;
        this.data = data;
    }
    
    public ArrayList<String> toArrayList(){
        ArrayList<String> atributos = new ArrayList();
        atributos.add(this.equipe1.getId().toString());
        atributos.add(this.equipe2.getId().toString());
        atributos.add(this.pontosEquipe1.toString());
        atributos.add(this.pontosEquipe2.toString());
        atributos.add(this.local);
        atributos.add(this.data);
        return atributos;
    }
    
    
}
