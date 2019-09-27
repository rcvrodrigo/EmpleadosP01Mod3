
package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Luis Cabrera
 */
public class TestMonto {
     
    @Test
    public void TestMonto() {
        System.out.println("TestMonto");
        String rut="12345678";
        BussEmpleado instance = new BussEmpleado();
        assertTrue(instance.Buscar(rut).montoBono()==250000);
    }
    
}
