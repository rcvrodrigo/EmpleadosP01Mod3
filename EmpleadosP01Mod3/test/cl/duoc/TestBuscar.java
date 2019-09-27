
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luis Cabrera
 */
public class TestBuscar {
 
public TestBuscar() {
    }

    @Test
    public void TestBuscar() {
        System.out.println("Buscar");
        String rut="12345678";        
        BussEmpleado instance=new BussEmpleado();
        String buscar = instance.Buscar(rut).getRut();
        Assert.assertEquals(rut, buscar);
    } 
}
