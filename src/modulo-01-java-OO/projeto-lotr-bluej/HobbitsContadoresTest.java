

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
    
    @Test
    public void calculaMaiorMultiploDeTresAtehDez(){
        //arrange
        HobbitsContadores h3 = new HobbitsContadores();
    
        //assert
        assertEquals(9, h3.obterMaiorMultiploDeTresAte(10));
    }
    
    @Test
    public void calculaMaiorMultiploDeTresAtehQuinze(){
        //arrange
        HobbitsContadores h4 = new HobbitsContadores();
        
        //assert
        assertEquals(15, h4.obterMaiorMultiploDeTresAte(15));
    }
    
    @Test
    public void calculaMaiorMultiploDeTresAtehVinte(){
        //arrange
        HobbitsContadores h5 = new HobbitsContadores();
        
        //assert
        assertEquals(18, h5.obterMaiorMultiploDeTresAte(20));
    }
    
    @Test
    public void arrayMultiploDeTresAteh12(){
        //arrange
        HobbitsContadores h6 = new HobbitsContadores();
        ArrayList<Integer>  array1 = new ArrayList<>(Arrays.asList(0, 3, 6, 9, 12));
        
        //assert
        assertEquals(array1, h6.obterMultiplosDeTresAte(12));
    }
    
    @Test
    public void arrayMultiploDeTresAteh25(){
        //arrange
        HobbitsContadores h7 = new HobbitsContadores();
        ArrayList<Integer>  array1 = new ArrayList<>(Arrays.asList(0, 3, 6, 9, 12, 15, 18, 21, 24));
        
        //assert
        assertEquals(array1, h7.obterMultiplosDeTresAte(25));
    }
}
