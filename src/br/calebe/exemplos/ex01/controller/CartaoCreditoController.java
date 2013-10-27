/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01.controller;



import br.calebe.exemplos.ex01.EJBStatelessInterface;
import java.io.FileInputStream;
import java.util.Properties;
import javax.naming.InitialContext;
/**
 *
 * @author Luana Felix
 */
public class CartaoCreditoController implements EJBStatelessInterface {
    


    private EJBStatelessInterface ejb;

    public CartaoCreditoController() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jndi.properties"));
        InitialContext ctx = new InitialContext(props);
        ejb = (EJBStatelessInterface) ctx.lookup("ejb/EJBStateless");
    }

    @Override
    public String metodo(int i) {
        return ejb.metodo(i);
    }
    
}
