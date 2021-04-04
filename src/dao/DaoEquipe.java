/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Equipe;

/**
 *
 * @author emanu
 */
public class DaoEquipe {
    private Connection con;
    
    public DaoEquipe(){
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
            return false;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        return true;
    }
    
    public ArrayList<Equipe> getAll(String comando){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Equipe> equipes = new ArrayList();
        Equipe equipe;
        try {  
            stmt = con.prepareStatement(comando);  
            rs = stmt.executeQuery();
            
            while(rs.next()){
                equipe = new Equipe(rs.getInt("id"), rs.getString("franquia"), rs.getString("cidade"), rs.getString("conferencia"));
                equipes.add(equipe);
            }
            
        } catch (SQLException e) {  
            return null;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        return equipes;
    }
    
    public Equipe get(String comando, String parametro){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipe equipe = null;

        try {  
            stmt = con.prepareStatement(comando); 
            stmt.setString(1, parametro);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                equipe = new Equipe(rs.getInt("id"), rs.getString("franquia"), rs.getString("cidade"), rs.getString("conferencia"));
            }
            
        } catch (SQLException e) {  
            System.out.println(e.getMessage());
            return null;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        return equipe;
    }
}
