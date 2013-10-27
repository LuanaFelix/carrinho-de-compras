/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import br.calebe.exemplos.ex01.controller.PedidoController;
/**
 *
 * @author Luana Felix
 */
public class Pedido {
    
    private PedidoController controller;
    private String status;
    
    Pedido() throws Exception {
        controller = new PedidoController();
    }
    
    public void run(String statusType) {
        status = controller.consultStatus(statusType);
    }
    
    public String getStatus() {
        return status;
    }
    
}
