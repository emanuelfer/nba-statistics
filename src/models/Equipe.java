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
public class Equipe {
    private Integer id;
    private String franquia;
    private String cidade;
    private String conferencia;

    public Equipe(Integer id, String franquia, String cidade, String conferencia) {
        this.id = id;
        this.franquia = franquia;
        this.cidade = cidade;
        this.conferencia = conferencia;
    }

    public Equipe(String franquia, String cidade, String conferencia) {
        this.franquia = franquia;
        this.cidade = cidade;
        this.conferencia = conferencia;
    }
    
    

    public Integer getId() {
        return id;
    }

    public String getFranquia() {
        return franquia;
    }

    public String getCidade() {
        return cidade;
    }

    public String getConferencia() {
        return conferencia;
    }
    
    public ArrayList<String> toArrayList(){
        ArrayList<String> atributos = new ArrayList();
        atributos.add(this.franquia);
        atributos.add(this.cidade);
        atributos.add(this.conferencia);
        return atributos;
    }
}
