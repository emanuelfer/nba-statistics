/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanu
 */
public class ControllerEquipeTest {
    
    public ControllerEquipeTest() {
    }

    /**
     * Test of create method, of class ControllerEquipe.
     */
    @Test
    public void testCreate() {
//        ControllerEquipe ce = new ControllerEquipe();
//        boolean retorno = ce.create("Chicago Bulls", "Miami", "Sudeste");
//        assertEquals(true, retorno);
    }

    /**
     * Test of getAll method, of class ControllerEquipe.
     */
    @Test
    public void testGetAll() {
        ControllerEquipe ce = new ControllerEquipe();
        int quantidade = ce.getAll().size();
        System.out.println("Quantidade de equipes: " + quantidade);
        boolean retorno = quantidade <= 0;
        assertFalse("Erro ao inserir buscar equipe!", retorno);
    }

    /**
     * Test of get method, of class ControllerEquipe.
     */
    @Test
    public void testGet() {
    }

    /**
     * Test of getById method, of class ControllerEquipe.
     */
    @Test
    public void testGetById() {
        ControllerEquipe ce = new ControllerEquipe();
        assertFalse("Erro ao inserir buscar equipe!", ce.getById("1") == null);
    }

    /**
     * Test of getByName method, of class ControllerEquipe.
     */
    @Test
    public void testGetByName() {
        ControllerEquipe ce = new ControllerEquipe();
        assertFalse("Erro ao inserir buscar equipe!", ce.getByName("Cle") == null);
    }
    
}
