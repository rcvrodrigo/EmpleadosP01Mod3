
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luis Cabrera
 */
public class TestCrear {
    
    @Test
    public void testCrear(){
        System.out.println("Crear");
        Empleado empleado= new Empleado("12345678", "Luis", 50, 3);
        BussEmpleado instance=new BussEmpleado();
        boolean esperado=true;
        boolean obtenido=instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
