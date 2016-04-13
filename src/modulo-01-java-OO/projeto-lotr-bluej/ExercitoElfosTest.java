

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExercitoElfosTest{

    @Test
    public void alistaUmElfo(){
        //arrange
        ExercitoElfos ex1 = new ExercitoElfos();
        Elfo elfo1 = new ElfoVerde("Legolas");
        
        //act
        ex1.alista(elfo1);
        
        //asssert
        assertEquals(true, ex1.getExercito().containsValue(elfo1));
    }
}
