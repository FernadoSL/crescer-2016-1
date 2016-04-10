

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class HobbitsContadoresTest{
    @Test
    public void calculaDifNumerosDoExemplo(){
        //arrange
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>(); 
        arrayDePares.add(new ArrayList<>(Arrays.asList(15, 18)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(4, 5)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(12, 60)));
        HobbitsContadores h1 = new HobbitsContadores();
        
        //assert
        assertEquals(840, h1.calculaDiferenca(arrayDePares));

    }
    
    @Test
    public void calculaDifMeusNumeros(){
        //arrange
        ArrayList<ArrayList<Integer>> arrayDePares = new ArrayList<>(); 
        arrayDePares.add(new ArrayList<>(Arrays.asList(5, 10)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(15, 30)));
        arrayDePares.add(new ArrayList<>(Arrays.asList(20, 40)));
        HobbitsContadores h2 = new HobbitsContadores();
        
        //assert
        assertEquals(1220, h2.calculaDiferenca(arrayDePares));

    }
}
