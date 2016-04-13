

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElfoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfoTest
{
    
    @After
    public void limpaElfos(){
        System.gc();
    }
    
    @Test
    public void elfoCriadoCom42Flechas(){
        Elfo e1TC = new Elfo("ElfoConstrutor");
        assertEquals(42, e1TC.getFlechaQuant());
    }
    
    @Test
    public void elfoCriadoComXFlechas(){
        Elfo e2TC = new Elfo("ElfoConstrutor2", 20);
        assertEquals(true, e2TC.getFlechaQuant() == 20);
    }
    
    @Test
    public void aumentoDeExpDiminuiFlechas(){
        Elfo e1AF = new Elfo("ElfoAtirador");
        Dwarf d1Teste = new Dwarf("DwarfAtingido");
        e1AF.atiraFlecha(d1Teste);
        assertEquals(true, (e1AF.getFlechaQuant() == 41) && (e1AF.getExp() == 1));
    }
    
    @Test
    public void fraseLegolas(){
        Elfo e1TS = new Elfo("Legolas");
        assertEquals(e1TS.toStringFlehca(), "Legolas possui " + e1TS.getFlechaQuant() + " flechas e " + e1TS.getExp() + " níves de experiência.");
    }
    
    @Test
    public void contaDoisElfo(){
        //arrange
        Elfo e1 = new Elfo("E1");
        Elfo e2 = new Elfo("E2");
        
        //assert
        assertEquals(2, Elfo.populacao);
    }
    
    
}
