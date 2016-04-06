

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
    @Test
    public void testeConstrutorElfo(){
        Elfo e1TC = new Elfo("ElfoConstrutor");
        assertEquals(true, e1TC.getFlechaQuant() == 42);
    }
    
    @Test
    public void testeAtiraFlecha(){
        Elfo e1AF = new Elfo("ElfoAtirador");
        Dwarf d1Teste = new Dwarf("DwarfAtingido");
        e1AF.atiraFlechaRefactory(d1Teste);
        assertEquals(true, (e1AF.getFlechaQuant() == 41) && (e1AF.getExp() == 1));
    }
    
    @Test
    public void testeToString(){
        Elfo e1TS = new Elfo("Legolas");
        assertEquals(e1TS.toStringFlehca(), "Legolas possui " + e1TS.getFlechaQuant() + " flechas e " + e1TS.getExp() + " níves de experiência.");
    }
}
