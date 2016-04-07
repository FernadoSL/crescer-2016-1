

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DwarfTeste.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DwarfTeste
{
    @Test
    public void dwarfCriadoCom110Vida(){
        
        Dwarf dwarfConstrutor = new Dwarf("DwarfConstrutor");
        assertEquals(true, dwarfConstrutor.getVida() == 110);
        
    }
    
    @Test
    public void dwarfPerde10Vida(){
    
        Dwarf dwarfTF = new Dwarf("DwarfFlechado");
        dwarfTF.tomoFlechada();
        assertEquals(true, dwarfTF.getVida() == 100);
    }

    @Test
    public void dwafNasceVivo(){
        Dwarf dwarf = new Dwarf("Balin");
        assertEquals(Status.VIVO, dwarf.getStatus());
    }
    
    @Test
    public void dwarfTestaMorte(){
        Dwarf d1 = new Dwarf("dwarfMorto");
        d1.setVida(10);
        d1.tomoFlechada();
        assertEquals(Status.MORTO, d1.getStatus());
    }
}
