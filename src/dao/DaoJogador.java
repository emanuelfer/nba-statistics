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
import models.Jogador;
    
/**
 *
 * @author emanu
 */
public class DaoJogador {
    private Connection con;
    
    public DaoJogador(){
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
            return true;
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
            return false;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
    }
    
        public ArrayList<Jogador> get(String comando, ArrayList<String> parametros){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Jogador> jogadores = new ArrayList();
        Jogador jogador;
        try {  
            stmt = con.prepareStatement(comando);  
            for(int i = 1; i<parametros.size() + 1; i++){
                stmt.setString(i, parametros.get(i-1));
            }
            rs = stmt.executeQuery();
            
            while(rs.next()){
                ControllerEquipe ce = new ControllerEquipe();
                Integer fk_equipe = rs.getInt("fk_equipe");
                Equipe equipe = ce.getById(fk_equipe.toString());
                jogador = new Jogador(rs.getInt("id"), rs.getString("nome"), equipe, rs.getString("cpf"), rs.getString("posicao"), rs.getInt("idade"), rs.getDouble("altura"), rs.getDouble("peso"));
                jogadores.add(jogador);
            }
            
        } catch (SQLException e) {  
            System.out.println(e.getMessage());
            return null;
        } finally {  
            ConnectionFactory.closeConnection(con, stmt);  
        }
        return jogadores;
    }
    
    
}
