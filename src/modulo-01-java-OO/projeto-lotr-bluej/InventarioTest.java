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
    
    @Test
    public void maiorQuantItensUnidade(){
        //arrange
        Inventario i4 = new Inventario();
        Item pot = new Item(0, "pot");
        Item corda = new Item(5, "corda");
        Item faca = new Item(3, "faca");
        
        //act
        i4.addItem(pot);
        i4.addItem(corda);
        i4.addItem(faca);
        
        //assert
        assertEquals(corda, i4.maiorQuant());
    }
    
    @Test
    public void maiorQuantItensMilhar(){
        //arrange
        Inventario i5 = new Inventario();
        Item pot = new Item(5231, "pot");
        Item corda = new Item(2891, "corda");
        Item faca = new Item(7590, "faca");
        
        //act
        i5.addItem(pot);
        i5.addItem(corda);
        i5.addItem(faca);
        
        //assert
        assertEquals(faca, i5.maiorQuant());
    }
    
    @Test
    public void ordenarCrescente(){
        //arrange
        Inventario i6 = new Inventario();
        Item pot = new Item(410, "pot");
        Item corda = new Item(208, "corda");
        Item faca = new Item(323, "faca");
        Item comida = new Item(602, "comida");
        
        //act
        i6.addItem(pot);
        i6.addItem(corda);
        i6.addItem(comida);
        i6.addItem(faca);
        i6.ordenarItens();
        
        //assert
        assertEquals(i6.getItem(0), corda);
        assertEquals(i6.getItem(1), faca);
        assertEquals(i6.getItem(2), pot);
        assertEquals(i6.getItem(3), comida);
    }
}
