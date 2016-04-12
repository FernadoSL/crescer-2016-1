

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemTest{
    @Test
    public void itensIguais(){
        //arrange
        Item i1 = new Item(1, "Espada");
        Item i2 = new Item(1, "Espada");
        
        //act
        //assert
        assertEquals(i1, i2);
    }

}
