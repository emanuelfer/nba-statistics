/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author emanu
 */
public class Arquivo {
    
    public static boolean write(String arquivo, ArrayList<String> linhas){
        try{
            FileWriter fw = new FileWriter(arquivo, false);
            BufferedWriter escritor = new BufferedWriter(fw);
                
            for(String linha : linhas){
                escritor.write(linha);
                escritor.newLine();
            }
           
            escritor.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
