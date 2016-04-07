import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventarioTest{
    
    @Test
    public void Adiciona(){
        //arrange
        Item pot = new Item(1, "poção");
        Inventario i1 = new Inventario();
        
        //act
        i1.addItem(pot);
        
        //asert
        assertEquals(pot, i1.getItem(0));
    }
    
    @Test
    public void Remove(){
        //arrange
        Inventario i2 = new Inventario();
        Item corda = new Item(1, "corda");
        
        //act
        i2.addItem(corda);
        i2.removeItem(corda);
        
        //asert
        assertEquals(0, i2.getSize());
    }
}
