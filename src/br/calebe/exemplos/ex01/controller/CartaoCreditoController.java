/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01.controller;



import br.calebe.exemplos.ex01.CartaoCreditoInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;
/**
 *
 * @author Luana Felix
 */
public class CartaoCreditoController implements CartaoCreditoInterface {
    


    private CartaoCreditoInterface cartaoCredito;

    public CartaoCreditoController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        cartaoCredito = (CartaoCreditoInterface) ctx.lookup("ejb/CartaoCredito");
    }

    @Override
    public int consultNumero(int i) {
        return cartaoCredito.consultNumero(i);
    }
    
}
