/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static junit.framework.TestCase.assertEquals;
import models.Equipe;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emanu
 */
public class ControllerJogadorTest {
    
    public ControllerJogadorTest() {
    }

    /**
     * Test of create method, of class ControllerJogador.
     */
    @Test
    public void testCreate() {
        ControllerEquipe ce = new ControllerEquipe();;
        Equipe equipe = ce.getById("6");
        ControllerJogador cj = new ControllerJogador();
        boolean retorno = cj.create("Geraldo Braz", equipe, "99999999999", "Ala Armador", 35, 190.0, 80.0);
        
        assertEquals(true, retorno);
    }

    /**
     * Test of getJogadorByEquipe method, of class ControllerJogador.
     */
    @Test
    public void testGetJogadorByEquipe() {
        ControllerEquipe ce = new ControllerEquipe();
        Equipe equipe = ce.getById("6");
        ControllerJogador cj = new ControllerJogador();
        assertFalse("Erro ao busacr jogafor pela equipe", cj.getJogadorByEquipe(equipe).size() <= 0);
    }

    /**
     * Test of getJogadorByCpf method, of class ControllerJogador.
     */
    @Test
    public void testGetJogadorByCpf() {
        ControllerJogador cj = new ControllerJogador();
        assertFalse("Erro ao busacr jogador pelo CPF", cj.getJogadorByCpf("99999999999") == null);
    }

    /**
     * Test of getJogadorByName method, of class ControllerJogador.
     */
    @Test
    public void testGetJogadorByName() {
        ControllerJogador cj = new ControllerJogador();
        assertFalse("Erro ao busacr jogador pelo nome", cj.getJogadorByName("gera") == null);
    }
    
}
