

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IrishDwarfTest{
    
    @Test
    public void tentarMtaSorte3ItemQuant(){
        //arrange
        DataTerceiraEra d1 = new DataTerceiraEra(28, 02, 1992);
        IrishDwarf duende1 = new IrishDwarf("Sortudo", d1); 
        Item cotaDeMalha = new Item(3, "Malha");
        
        //act
        for(int i=0; i<2; i++){
            duende1.tomoFlechada();
        }
        duende1.addItem(cotaDeMalha);
        duende1.tentarSorte();
        
        //assert
        assertEquals(-3333.0, duende1.getNumSorte(), 0.1);
        assertEquals(6003, duende1.getInventario().getItem(0).getQuant());
        
    }
    
    @Test
    public void tentarMtaSorte5ItemQuant(){
        //arrange
        DataTerceiraEra d2 = new DataTerceiraEra(1, 01, 2000);
        IrishDwarf duende2 = new IrishDwarf("SortudoDeMais", d2); 
        Item pot = new Item(5, "Poção");
        
        //act
        for(int i=0; i<2; i++){
            duende2.tomoFlechada();
        }
        duende2.addItem(pot);
        duende2.tentarSorte();
        
        //assert
        assertEquals(-3333.0, duende2.getNumSorte(), 0.1);
        assertEquals(15005, duende2.getInventario().getItem(0).getQuant());
        
    }
}
