/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.EstatisticaJogador;
import models.Partida;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanu
 */
public class ControllerEstatisticaTest {
    
    public ControllerEstatisticaTest() {
    }

    /**
     * Test of createEstatisticaJogador method, of class ControllerEstatistica.
     */
    @Test
    public void testCreateEstatisticaJogador() {

    }

    /**
     * Test of getEstatisticaJogador method, of class ControllerEstatistica.
     */
    @Test
    public void testGetEstatisticaJogador() {
        ControllerJogador cj = new ControllerJogador();
        assertTrue("Erro ao buscar estatistica do jogador!", cj.getJogadorByName("Geraldo") != null);
    }

    /**
     * Test of salvar method, of class ControllerEstatistica.
     */
    @Test
    public void testSalvar() {
    }
    
}
