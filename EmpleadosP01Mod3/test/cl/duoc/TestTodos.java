package cl.duoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Luis Cabrera
 */

@RunWith(Suite.class)
@SuiteClasses(
        {
            TestCrear.class, 
            TestModificar.class, 
            TestBuscar.class, 
            TestMonto.class,
            TestEliminar.class
        }    )


public class TestTodos {
    
}
