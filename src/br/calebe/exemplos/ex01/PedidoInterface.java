/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import javax.ejb.Remote;

/**
 *
 * @author Luana Felix
 */

@Remote
public interface PedidoInterface {
    
    //String metodo(int i);
    
    public String consultStatus(String statusType);
   
    
}
