
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
        boolean esperado = ex4.buscar("Fanfarrão").equals(elfo5);
        
        //asssert
        assertEquals(true, esperado);
    }
        
    @Test
    public void buscaElfosMortos() {
        // Arrange
        ExercitoElfos exercito = criarExercitoDeMortosEVivos();
        exercito.agruparStatus();
        ArrayList<Elfo> mortos = exercito.buscar(Status.MORTO);
        // Assert
        assertTrue(mortos.contains(exercito.buscar("Dead Elf 1")));
        assertTrue(mortos.contains(exercito.buscar("Dead Elf 2")));
    }
    
    
    private ExercitoElfos criarExercitoDeMortosEVivos() {
        ElfoVerde elfoVivo1 = new ElfoVerde("Green 1");
        ElfoNoturno elfoVivo2 = new ElfoNoturno("Aa");
        ElfoVerde elfoVivo3 = new ElfoVerde("BB");
        Elfo elfoMorto1 = criarElfoEMataLo("Dead Elf 1");
        Elfo elfoMorto2 = criarElfoEMataLo("Dead Elf 2");
        ExercitoElfos exercito = new ExercitoElfos();
        exercito.alista(elfoMorto1);
        exercito.alista(elfoMorto2);
        exercito.alista(elfoVivo1);
        exercito.alista(elfoVivo2);
        exercito.alista(elfoVivo3);
        return exercito;
    }
    
    private Elfo criarElfoEMataLo(String nome) {
        Elfo elfo = new ElfoNoturno(nome);
        // Forçando o hara-kiri
        for (int i = 0; i < 90; i++) {
            elfo.atiraFlecha(new Dwarf("Gimli"));
        }
        return elfo;
    }
    
    public void ataque(Estrategia estrategia){
        
    }
}










