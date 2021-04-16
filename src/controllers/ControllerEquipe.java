/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.DaoEquipe;
import java.util.ArrayList;
import models.Equipe;

/**
 *
 * @author emanu
 */
public class ControllerEquipe {
    
    public boolean create(String franquia, String cidade, String conferencia){
        Equipe equipe = new Equipe(franquia, cidade, conferencia);
        ArrayList<String> parametros = equipe.toArrayList();
        DaoEquipe daoEquipe = new DaoEquipe();
        
        String comando = "INSERT INTO equipe (franquia, cidade, conferencia) VALUES (?,?,?)";
        return daoEquipe.create(comando, parametros);
    }
    
    public ArrayList<Equipe> getAll(){
        ArrayList<Equipe> equipes = new ArrayList();
        
        DaoEquipe daoEquipe = new DaoEquipe();
        String comando = "SELECT * FROM equipe";
        
        return daoEquipe.getAll(comando);
    }
    
    public Equipe get(String parametro){
        DaoEquipe daoEquipe = new DaoEquipe();
        String comando = "SELECT * FROM equipe where franquia like ?";
        return daoEquipe.get(comando, parametro);
    }
    
    public Equipe getById(String id){
        DaoEquipe daoEquipe = new DaoEquipe();
        String comando = "SELECT * FROM equipe where id = ?";
        return daoEquipe.get(comando, id);
    }
    
    public Equipe getByName(String franquia){
        franquia = "%"+franquia+"%";
        DaoEquipe daoEquipe = new DaoEquipe();
        String comando = "SELECT * FROM equipe where franquia like ? LIMIT 1";
        return daoEquipe.get(comando, franquia);
    }
    
}
