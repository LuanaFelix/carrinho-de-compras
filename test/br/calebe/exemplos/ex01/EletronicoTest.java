/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 41081218
 */
public class EletronicoTest  {
    
    private Eletronico eletronico;
    
    /*@Before
    public void criandoEletronico() {
        eletronico = new Eletronico("Samsung Galaxy Duos",  500.0, "Samsung", "1");
   
    }*/
    @Test
    public void ValorNuloTest(){
        eletronico = new Eletronico("Samsung Galaxy Duos",  500.0, "Samsung", "1");
        assertTrue(eletronico.getValor() > 0);
             
    }
    
}
