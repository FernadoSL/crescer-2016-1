
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExercitoElfosTest{
    
    
    @After
    public void limpaElfos(){
        System.gc();
    }
    
    @Test
    public void alistaUmElfoVerde(){
        //arrange
        ExercitoElfos ex1 = new ExercitoElfos();
        Elfo elfo1 = new ElfoVerde("Legolas");
        
        //act
        ex1.alista(elfo1);
        
        //asssert
        assertEquals(true, ex1.getExercito().containsValue(elfo1));
    }
    
    @Test
    public void alistaUmElfoComum(){
        //arrange
        ExercitoElfos ex2 = new ExercitoElfos();
        Elfo elfo2 = new Elfo("NãoAlista");
        
        //act
        ex2.alista(elfo2);
        
        //asssert
        assertEquals(false, ex2.getExercito().containsValue(elfo2));
    }
    
    @Test
    public void alistaUmElfoNoturno(){
        //arrange
        ExercitoElfos ex3 = new ExercitoElfos();
        Elfo elfo3 = new ElfoNoturno("Sla");
        
        //act
        ex3.alista(elfo3);
        
        //asssert
        assertEquals(true, ex3.getExercito().containsValue(elfo3));
    }
    
    @Test
    public void buscaUmElfo(){
        //arrange
        ExercitoElfos ex4 = new ExercitoElfos();
        Elfo elfo3 = new ElfoNoturno("Sla");
        Elfo elfo4 = new ElfoVerde("Légolas");
        Elfo elfo5 = new ElfoVerde("Fanfarrão");
        
        //act
        ex4.alista(elfo3);
        ex4.alista(elfo4);
        ex4.alista(elfo5);
        boolean esperado = ex4.buscaNome("Fanfarrão").equals(elfo5);
        
        //asssert
        assertEquals(true, esperado);
    }
    
    @Test 
    public void alistaDoisElfosEAgrupa(){
        //arrange
        ExercitoElfos ex2 = new ExercitoElfos();
        Elfo elfo6 = new ElfoVerde("Legolas");
        Elfo elfo7 = new ElfoVerde("Sla");
        //act
        ex2.alista(elfo6);
        ex2.alista(elfo7);
        ex2.agruparStatus();
        //verifica se os elfos estão no exercito de agrupados por status
        boolean obtido = ex2.getExercitoStatus().containsValue(elfo6) && ex2.getExercitoStatus().containsValue(elfo7);
        //assert
        assertEquals(true, obtido);
    }
    
    @Test 
    public void alistaElfosEChamaOsMortos(){
        //arrange
        ExercitoElfos ex6 = new ExercitoElfos();
        Elfo elfo8 = new ElfoVerde("Legolas");
        Elfo elfo9 = new ElfoNoturno("Sla");
        Elfo elfo10 = new ElfoNoturno("Sla2");
        //act
        while(elfo9.getStatus() == Status.VIVO){
            elfo9.atiraFlecha(new Dwarf("Imortal"));
        }
        
        while(elfo10.getStatus() == Status.VIVO){
            elfo10.atiraFlecha(new Dwarf("Imortal"));
        }
        
        ex6.alista(elfo8);
        ex6.alista(elfo9);
        ex6.alista(elfo10);
        ex6.agruparStatus();
        
        ArrayList<Elfo> esperado = new ArrayList<>(Arrays.asList(elfo9, elfo10));
        //assert
        assertEquals(esperado, ex6.buscar(Status.MORTO));
    }
}
