

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoNoturnoTest{
   @Test
    public void umaFlechada(){
        //arrange
        Elfo e1 = new ElfoNoturno("Night");
        
        //act
        e1.atiraFlecha(new Dwarf("Azarado"));
        
        //assert
        assertEquals(3, e1.getExp());
        assertEquals(95, e1.getVida(), 0);
    }
    
   @Test
    public void duasFlechadas(){
        //arrange
        Elfo e2 = new ElfoNoturno("Dark");
        
        //act
        e2.atiraFlecha(new Dwarf("Mto Azarado"));
        e2.atiraFlecha(new Dwarf("Mto Azarado"));
        
        //assert
        assertEquals(90.25, e2.getVida(), 0);
        assertEquals(6, e2.getExp());
    } 
    
   @Test
    public void flechadaAtehMorrer(){
        //arrange
        Elfo e3 = new ElfoNoturno("Krad");
        Dwarf d1 = new Dwarf("Mto Mto Azarado");
        //act
        while(e3.getVida() >= 1){
            e3.atiraFlecha(d1);
        }
        //assert
        assertEquals(0, e3.getVida(), 0.99);
        assertEquals(Status.MORTO, e3.getStatus());
    } 
 
}
