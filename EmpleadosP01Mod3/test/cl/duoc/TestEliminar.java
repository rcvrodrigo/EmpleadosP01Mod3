
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luis Cabrera
 */
public class TestEliminar {

    @Test
    public void TestEliminar() {
        System.out.println("Eliminar");
        String rut="12345678";        
        BussEmpleado instance=new BussEmpleado();
        instance.Eliminar(rut);
        boolean esperado=true;
        boolean obtenido=instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
    
}
