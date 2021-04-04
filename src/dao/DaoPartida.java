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
}
