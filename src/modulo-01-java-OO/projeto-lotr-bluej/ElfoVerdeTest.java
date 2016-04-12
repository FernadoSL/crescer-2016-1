

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoVerdeTest{
    @Test
    public void expEmDobro(){
        //arrange
        Elfo e1 = new ElfoVerde("Green");
        
        //act
        e1.atiraFlecha(new Dwarf("Azarado"));
        
        //assert
        assertEquals(2, e1.getExp());
    }
    
    @Test
    public void addItemErrado(){
        //arrange
        Elfo e2 = new ElfoVerde("Neerg");
        Item flechaComum = new Item(1, "flecha comum");
        Item flechaVidro = new Item(1, "Arco e Flecha de Vidro");
        Item espadaComum = new Item(1, "espada comum");
        Item espadaValiriana = new Item(1, "Espada de aço valiriano");
        
        //act
        e2.addItem(flechaComum);
        e2.addItem(flechaVidro);
        e2.addItem(espadaComum);
        e2.addItem(espadaValiriana);
        
        //assert
        assertEquals(flechaVidro, e2.getInventario().getItem(0));
        assertEquals(espadaValiriana, e2.getInventario().getItem(1));
        assertEquals(2, e2.getInventario().getSize());
    }
}
