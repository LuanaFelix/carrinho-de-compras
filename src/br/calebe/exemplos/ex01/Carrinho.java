package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void add(Produto produto) {
        produtos.add(produto);
    }
    
    public int getQuantity(){
        int quantidade = 0;
        while (!produtos.isEmpty()) {
            quantidade ++;
        }
        return quantidade;
    }
    
    public Produto menorProduto() throws CarrinhoVazioExpected {
        if (produtos.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        Produto menor = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() < menor.getPreco()) {
                menor = produto;
            }
        }
        return menor;
    }
     
    public boolean ProdutoRemoval(String nome) {
        if(ProdutoSearch(nome))
        {   	produtos.remove(produtos.indexOf(nome));
        	return true;	
	}
        return false;
    }

	
	public boolean ProdutoSearch(String nome) {
            for (Produto produto : produtos) {
                if (produto.getNome() == nome) {
                    return true;
                }}
                return false;
	}
        
      public int calcTotalTest(){
               double total=0;
               for(Produto p : produtos) {
                    total += p.getPreco();
            }
               return (int) total;
              
        }
}
