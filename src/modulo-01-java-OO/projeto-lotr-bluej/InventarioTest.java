import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest{
    
    @Test
    public void adiciona(){
        //arrange
        Item pot = new Item(1, "poção");
        Inventario i1 = new Inventario();
        
        //act
        i1.addItem(pot);
        
        //asert
        assertEquals(pot, i1.getItem(0));
    }
    
    @Test
    public void remove(){
        //arrange
        Inventario i2 = new Inventario();
        Item corda = new Item(1, "corda");
        
        //act
        i2.addItem(corda);
        i2.removeItem(corda);
        
        //asert
        assertEquals(0, i2.getSize());
    }
    
    @Test
    public void descreveItens(){
        //arrange
        Inventario i3 = new Inventario();
        Item pot = new Item(1, "pot");
        Item corda = new Item(1, "corda");
        Item faca = new Item(1, "faca");
        
        //act
        i3.addItem(pot);
        i3.addItem(corda);
        i3.addItem(faca);
        
        //assert
        assertEquals("pot,corda,faca", i3.getDescricoesItens());
    }
}
