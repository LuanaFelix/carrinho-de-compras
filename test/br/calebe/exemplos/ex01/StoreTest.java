package br.calebe.exemplos.ex01;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;




public class StoreTest {

	Store store;

	public StoreTest() {
		this.store = new Store();
	}

	
	@Test
	public void addTest() {
		Produto p = new Produto("Samsung Galaxy Duos", 500.00);
		store.addProduto(p);

		assertTrue(store.getQuantity() == 1);
	}

	@Test
	public void removalTest() {
		Produto p = new Produto("Samsung Galaxy Duos", 900.00);
		store.addProduto(p);
		store.ProdutoRemoval("Samsung Galaxy Duos");
		assertTrue(store.getQuantity() == 0);
	}

	@Test
	public void searchTest() {
		Produto p = new Produto("Samsung Galaxy Duos", 400.00);
		store.addProduto(p);
		assertTrue(store.ProdutoSearch("Samsung Galaxy Duos"));
	}
        
        @Test
        public void calcTotalTest(){
               double total = 0;
               for(Produto p : store.produtos) {
                    total += store.produtos.getPreco();
            }
               assertTrue(store.calcTotal(), 12.000);
        }

}