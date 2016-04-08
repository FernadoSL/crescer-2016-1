

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
    
    @Test
    public void dwarfComVidaNegativa(){
        Dwarf d2 = new Dwarf("dwarfUndead");
        d2.setVida(0);
        d2.tomoFlechada();
        assertEquals(0, d2.getVida());
    }
    
    @Test
    public void numSorteBissexto(){
        //arrange
        DataTerceiraEra data1 = new DataTerceiraEra(28, 02, 1992);
        Dwarf d3 = new Dwarf("dwarfSortudo", data1);
        d3.setVida(85);
        //act
        //assert
        assertEquals(-3333.0, d3.getNumSorte(), 0.1);
    }
    
    @Test
    public void numSorteNaoBissexto(){
        //arrange
        DataTerceiraEra data2 = new DataTerceiraEra(1, 1, 2001);
        Dwarf d4 = new Dwarf("Seixas", data2);
        //act
        //assert
        assertEquals(33.0, d4.getNumSorte(), 0.1);
    }
    
    @Test
    public void numSorteQualquerOutro(){
        //arrange
        DataTerceiraEra data3 = new DataTerceiraEra(1, 1, 2000);
        Dwarf d5 = new Dwarf("dwarfAarado", data3);
        //act
        //assert
        assertEquals(101.0, d5.getNumSorte(), 0.1);
    }
}
