

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
        for(int i=0; i<11; i++){
            d1.tomoFlechada();
        }
        assertEquals(Status.MORTO, d1.getStatus());
    }
    
    @Test
    public void dwarfComVidaNegativa(){
        Dwarf d2 = new Dwarf("dwarfUndead");
         for(int i=0; i<12; i++){
            d2.tomoFlechada();
        }
        assertEquals(0, d2.getVida(), 0);
    }
    
    @Test
    public void numSorteBissexto(){
        //arrange
        DataTerceiraEra data1 = new DataTerceiraEra(28, 02, 1992);
        Dwarf d3 = new Dwarf("dwarfSortudo", data1);
        
        //act
         for(int i=0; i<3; i++){
            d3.tomoFlechada();
        }
        //assert
        assertEquals(-3333.0, d3.getNumSorte(), 0.1);
        assertEquals(90, d3.getVida(), 0);
        assertEquals(2, d3.getExp());
    }
    
    @Test
    public void numSorteNaoBissexto(){
        //arrange
        DataTerceiraEra data2 = new DataTerceiraEra(1, 1, 2001);
        Dwarf d4 = new Dwarf("Seixas", data2);
        //act
        d4.tomoFlechada();
        //assert
        assertEquals(33.0, d4.getNumSorte(), 0.1);
        assertEquals(0, d4.getExp());
        assertEquals(110, d4.getVida(), 0);
    }
    
    @Test
    public void numSorteQualquerOutro(){
        //arrange
        DataTerceiraEra data3 = new DataTerceiraEra(1, 1, 2000);
        Dwarf d5 = new Dwarf("dwarfAarado", data3);
        //act
        d5.tomoFlechada();
        //assert
        assertEquals(101.0, d5.getNumSorte(), 0.1);
        assertEquals(0, d5.getExp());
        assertEquals(100, d5.getVida(), 0);
    }
    
    @Test
    public void sorteNosItens1Item(){
        //arrange
        DataTerceiraEra data4 = new DataTerceiraEra(28, 02, 1992);
        Dwarf d6 = new Dwarf("O Alquimista", data4);
        Item pot = new Item(1, "poção");
        //act
        for(int i=0; i<3; i++){
            d6.tomoFlechada();
        }
        d6.addItem(pot);
        d6.tentarSorte();
        //assert
        assertEquals(1001, d6.getInventario().getItem(0).getQuant());
    }
    
    @Test
    public void sorteNosItens3Itens(){
        //arrange
        DataTerceiraEra data4 = new DataTerceiraEra(1, 1, 2000);
        Dwarf d7 = new Dwarf("O Mercador", data4);
        Item pot = new Item(1, "poção");
        Item faca = new Item(2, "faca");
        Item corda = new Item(1, "corda");
        //act
        for(int i=0; i<3; i++){
            d7.tomoFlechada();
        }
        d7.addItem(pot);
        d7.addItem(faca);
        d7.addItem(corda);
        d7.tentarSorte();
        //assert
        assertEquals(1001, d7.getInventario().getItem(0).getQuant());
        assertEquals(1002, d7.getInventario().getItem(1).getQuant());
        assertEquals(1001, d7.getInventario().getItem(2).getQuant());
    }
}
