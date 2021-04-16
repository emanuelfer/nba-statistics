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
import models.EstatisticaJogador;

/**
 *
 * @author emanu
 */
public class DaoEstatistica {
    private Connection con;
    
    public DaoEstatistica(){
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
    
    public EstatisticaJogador getEstatisticaJogador(String comando, String parametro){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<String> retorno = new ArrayList();

        try {  
            stmt = con.prepareStatement(comando); 
            stmt.setString(1, parametro);
            rs = stmt.executeQuery();
            
            EstatisticaJogador ej = null;
            while(rs.next()){
                ej = new EstatisticaJogador(rs.getInt("partidas"), rs.getInt("pontos"), 
                        rs.getInt("rebotes"), rs.getInt("assistencias"), 
                        rs.getInt("roubadas"), rs.getInt("tocos"), rs.getInt("turnovers"));
            }
            return ej;
        } catch (SQLException e) {  
            System.out.println(e.getMessage());
            return null;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        
    }
}
