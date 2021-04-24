/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Equipe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanu
 */
public class ControllerPartidaTest {
    
    public ControllerPartidaTest() {
    }

    /**
     * Test of create method, of class ControllerPartida.
     */
    @Test
    public void testCreate() {
//        ControllerEquipe ce = new ControllerEquipe();;
//        Equipe equipe1 = ce.getById("1");
//        Equipe equipe2 = ce.getById("2");
//        
//        ControllerPartida cp = new ControllerPartida();
//        cp.create(equipe1, equipe2, 110, 111, "Local teste", "24/04/2021");
    }

    /**
     * Test of getByData method, of class ControllerPartida.
     */
    @Test
    public void testGetByData() {
        ControllerPartida cp = new ControllerPartida();
        assertTrue("Erro ao buscar por data!", cp.getByData("24/04/2021").size() > 0);
    }

    /**
     * Test of getEquipe method, of class ControllerPartida.
     */
    @Test
    public void testGetEquipe() {
        ControllerEquipe ce = new ControllerEquipe();;
        Equipe equipe = ce.getById("1");
        ControllerPartida cp = new ControllerPartida();
        assertTrue("Erro ao buscar por equipe!", cp.getEquipe(equipe).size() > 0);
    }
    
}
