
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luis Cabrera
 */

public class TestModificar {
public TestModificar() {
    }
    
    @Test
    public void TestModificar() {
        System.out.println("Modificar");
        Empleado empleado= new Empleado("12345678", "Juan", 30 , 5);
        BussEmpleado instance=new BussEmpleado();       
        boolean esperado=true;
        boolean obtenido=instance.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}

