package br.calebe.exemplos.ex01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }

    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertEquals(null, menor);
        
    }
    
    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        assertArrayEquals(new Object[]{original}, new Object[]{copia});
    }
    
     

	@Test
	public void removalTest() {
		Produto p = new Produto("Samsung Galaxy Duos", 900.00);
		carrinho.add(p);
		carrinho.ProdutoRemoval("Samsung Galaxy Duos");
		assertTrue(carrinho.getQuantity() == 0);
	}

	@Test
	public void searchTest() {
		Produto p = new Produto("Samsung Galaxy Duos", 400.00);
		carrinho.add(p);
		assertTrue(carrinho.ProdutoSearch("Samsung Galaxy Duos"));
	}
        
        @Test
        public void calcTotalTest(){
               double total = 0;
               Produto p1 = new Produto("Samsung Galaxy Duos", 400.00);
               Produto p2 = new Produto("Iphone", 1400.00);
               carrinho.add(p1);
               carrinho.add(p2);
               
               for(Produto p : carrinho.produtos) {
                    total += carrinho.produtos.getPreco();
            }
               assertEquals( (int) total, 1800 );
              
        }

}
