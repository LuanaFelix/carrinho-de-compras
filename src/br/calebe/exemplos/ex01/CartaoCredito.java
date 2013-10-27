/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import br.calebe.exemplos.ex01.controller.CartaoCreditoController;
import br.calebe.exemplos.ex01.controller.PedidoController;

/**
 *
 * @author Luana Felix
 */
public class CartaoCredito {
    
    
    private CartaoCreditoController controller;
    private int numero;
    
    CartaoCredito() throws Exception {
        controller = new CartaoCreditoController();
    }
    
    public void run(int num) {
        numero = controller.consultNumero(num);
    }
    
    public int getNumero() {
        return numero;
    }
    
    
}
