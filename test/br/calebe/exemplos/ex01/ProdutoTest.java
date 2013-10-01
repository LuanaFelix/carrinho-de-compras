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
public class ProdutoTest {
    
    private Produto produto;
    
    
    @Before
    public void criandoProduto() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
   
    }
    
    
    @Test
    public void pegandoPreco() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
        assertTrue(produto.getPreco() == 500);
    }
       
    
    @Test
    public void ObjetosIguais() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
        Object obj = new Produto("Samsung Galaxy Duos", 60.0);
        assertTrue(produto.equals(obj));
    }
    
    
    @Test
    public void ProdutosIguais() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
  
        Produto produto2 = new Produto("Samsung Galaxy Duos", 500.0);
        assertTrue(produto.equals(produto2));
        
    }
    
    

    
}
