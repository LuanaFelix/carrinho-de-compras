/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import br.calebe.exemplos.ex01.controller.PedidoController;
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
@PrepareForTest({Pedido.class})


public class PedidoTest {
    
    
    @Test
    public void executandoStatusAguardandoPagamento() throws Exception {
        
        PedidoController controllerMock = PowerMock.createMock(PedidoController.class);
        PowerMock.expectNew(PedidoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("aguardandoPagamento")).andReturn("aguardandoPagamento");
        PowerMock.replay(controllerMock, PedidoController.class);
        
        Pedido tested = new Pedido();
        tested.run("aguardandoPagamento");
        Assert.assertEquals("aguardandoPagamento", tested.getStatus());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoStatusPago() throws Exception {
        
        PedidoController controllerMock = PowerMock.createMock(PedidoController.class);
        PowerMock.expectNew(PedidoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("pago")).andReturn("pago");
        PowerMock.replay(controllerMock, PedidoController.class);
        
        Pedido tested = new Pedido();
        tested.run("pago");
        Assert.assertEquals("pago", tested.getStatus());
        
        PowerMock.verifyAll();
    }
     
    @Test
    public void executandoStatusEmpacotando() throws Exception {
        
        PedidoController controllerMock = PowerMock.createMock(PedidoController.class);
        PowerMock.expectNew(PedidoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("empacotando")).andReturn("empacotando");
        PowerMock.replay(controllerMock, PedidoController.class);
        
        Pedido tested = new Pedido();
        tested.run("empacotando");
        Assert.assertEquals("empacotando", tested.getStatus());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoStatusEnviadoEntrega() throws Exception {
        
        PedidoController controllerMock = PowerMock.createMock(PedidoController.class);
        PowerMock.expectNew(PedidoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("enviadoEntrega")).andReturn("enviadoEntrega");
        PowerMock.replay(controllerMock, PedidoController.class);
        
        Pedido tested = new Pedido();
        tested.run("enviadoEntrega");
        Assert.assertEquals("enviadoEntrega", tested.getStatus());
        
        PowerMock.verifyAll();
    }
    
    @Test
    public void executandoStatusEntregue() throws Exception {
        
        PedidoController controllerMock = PowerMock.createMock(PedidoController.class);
        PowerMock.expectNew(PedidoController.class).andReturn(controllerMock);
        EasyMock.expect(controllerMock.consultStatus("entregue")).andReturn("entregue");
        PowerMock.replay(controllerMock, PedidoController.class);
        
        Pedido tested = new Pedido();
        tested.run("entregue");
        Assert.assertEquals("entregue", tested.getStatus());
        
        PowerMock.verifyAll();
    }
}
