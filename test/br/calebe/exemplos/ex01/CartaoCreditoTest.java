/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import br.calebe.exemplos.ex01.controller.CartaoCreditoController;
import br.calebe.exemplos.ex01.controller.CartaoCreditoController;
import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Luana Felix
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({CartaoCredito.class})

public class CartaoCreditoTest {
    
       
    @Test
    public void NumeroCartaoCreditoValido() throws Exception {
        
        CartaoCreditoController controllerMock = PowerMock.createMock(CartaoCreditoController.class);
        PowerMock.expectNew(CartaoCreditoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultNumero(1234567890)).andReturn(1234567890);
        PowerMock.replay(controllerMock, CartaoCreditoController.class);
        
        CartaoCredito tested = new CartaoCredito();
        tested.run(1234567890);
        Assert.assertEquals(1234567890, tested.getNumero());
        
        PowerMock.verifyAll();
    }
    
    
    
}
