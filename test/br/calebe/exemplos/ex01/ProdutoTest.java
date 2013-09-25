/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import static org.junit.Assert.assertArrayEquals;
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
    public double pegandoPreco() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
        return produto.getPreco();
    }
   
    @Test
    public boolean comparaObjeto() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
        Object obj = new Produto("Samsung Galaxy Duos", 500.0);
        return produto.equals((Produto) obj);
    }

    @Test
    public boolean comparaProduto() {
        produto = new Produto("Samsung Galaxy Duos", 500.0);
        Produto produto2;
        produto2 = new Produto("Samsung Galaxy Duos", 500.0);
        return produto.equals(produto2);
    }

    
}
