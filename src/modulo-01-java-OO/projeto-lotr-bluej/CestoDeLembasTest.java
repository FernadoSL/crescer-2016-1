

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CestoDeLembasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CestoDeLembasTest
{
    @Test
    public void criarCestoCom2Lembas(){
    
        CestoDeLembas cesto = new CestoDeLembas(2);
        boolean esperado = false;
        boolean obtido = cesto.podeDividirPares();
        assertEquals(esperado, obtido);
    
    }
    
    @Test
    public void criarCestoCom4Lembas(){
    
        CestoDeLembas cesto = new CestoDeLembas(4);
        boolean esperado = true;
        boolean obtido = cesto.podeDividirPares();
        assertEquals(esperado, obtido);
    
    }

    @Test
    public void criarCestoComMenos1Lembas(){
    
        CestoDeLembas cesto = new CestoDeLembas(-1);
        boolean esperado = false;
        boolean obtido = cesto.podeDividirPares();
        assertEquals(esperado, obtido);
    
    }
    
    @Test
    public void criarCestoCom101Lembas(){
    
        CestoDeLembas cesto = new CestoDeLembas(101);
        assertEquals(false, cesto.podeDividirPares());
    
    }
    
}
