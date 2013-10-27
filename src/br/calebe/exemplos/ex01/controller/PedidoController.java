/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01.controller;

import br.calebe.exemplos.ex01.PedidoInterface;
import br.calebe.exemplos.ex02.ConsultStatusInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;

/**
 *
 * @author Luana Felix
 */
public class PedidoController implements PedidoInterface {
    
        
    private PedidoInterface pedido;
    
    public PedidoController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        pedido = (PedidoInterface) ctx.lookup("ejb/Pedido");
    }
    
    @Override
    public String consultStatus(String statusType){
        
        return pedido.consultStatus(statusType);
    }
    
}
