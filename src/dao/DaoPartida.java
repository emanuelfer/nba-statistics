/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import controllers.ControllerEquipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Equipe;
import models.Partida;

/**
 *
 * @author emanu
 */
public class DaoPartida {
    private Connection con;
    
    public DaoPartida(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean create(String comando, ArrayList<String> parametros){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {  
            stmt = con.prepareStatement(comando);  
            for(int i = 1; i<parametros.size() + 1; i++){
                stmt.setString(i, parametros.get(i-1));
            }
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        return true;
    }
    
    public ArrayList<Partida> get(String comando, ArrayList<String> parametros){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Partida> partidas = new ArrayList();
        Partida partida;
        try {  
            stmt = con.prepareStatement(comando);  
            for(int i = 1; i<parametros.size() + 1; i++){
                stmt.setString(i, parametros.get(i-1));
            }
            rs = stmt.executeQuery();
            
            while(rs.next()){
                ControllerEquipe ce = new ControllerEquipe();
                Equipe equipe1 = ce.getById(rs.getString("fk_equipe1"));
                Equipe equipe2 = ce.getById(rs.getString("fk_equipe2"));
                partida = new Partida(rs.getInt("id"), equipe1, equipe2, rs.getInt("pontos_equipe1"), rs.getInt("pontos_equipe2"), rs.getString("local"), rs.getString("data"));
                partidas.add(partida);
            }
            
        } catch (SQLException e) {  
            System.out.println(e.getMessage());
            return null;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        return partidas;
    }
}
