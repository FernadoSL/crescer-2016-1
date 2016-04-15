
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NoturnosPorUltimoTest{
    
    @Test
    public void primeiroElfoVerdeUltimoElfoNoturno(){
        //Arrange
        ExercitoElfos exercitoDeDois = new ExercitoElfos();
        Estrategia est = new NoturnosPorUltimo();
        Elfo elfo1 = new ElfoNoturno("Ultimo");
        Elfo elfo2 = new ElfoVerde("Primeiro");
        //act
        exercitoDeDois.alista(elfo1);
        exercitoDeDois.alista(elfo2);
        exercitoDeDois.agruparStatus();
        exercitoDeDois.atacar(est, criaHordaDwarf(40));
        
        //assert
        assertTrue(est.getOrdem().get(0) instanceof ElfoVerde);
        assertTrue(est.getOrdem().get(1) instanceof ElfoNoturno);
    }
    
    @Test
    public void primeiroElfoVerdeDoisUltimoElfoNoturno(){
        //Arrange
        ExercitoElfos e1 = criaElfos();
        Estrategia est = new NoturnosPorUltimo();
        //act
        e1.atacar(est, criaHordaDwarf(40));
        
        //assert
        assertTrue(est.getOrdem().get(0) instanceof ElfoVerde);
        assertTrue(est.getOrdem().get(1) instanceof ElfoVerde);
        assertTrue(est.getOrdem().get(2) instanceof ElfoNoturno);
        assertTrue(est.getOrdem().get(3) instanceof ElfoNoturno);
    }
    
    private ExercitoElfos criaElfos(){
        ExercitoElfos e1 = new ExercitoElfos();
        Elfo elfo1 = new ElfoVerde("Verde");
        Elfo elfo2 = new ElfoNoturno("Noturno");
        Elfo elfo3 = new ElfoNoturno("NoturnoPenultimo");
        Elfo elfo4 = new ElfoVerde("VerdeSegundo");
        
        e1.alista(elfo1);
        e1.alista(elfo2);
        e1.alista(elfo3);
        e1.alista(elfo4);
        
        e1.agruparStatus();
        
        return e1;
    }

    private ArrayList<Dwarf> criaHordaDwarf(int num){
        ArrayList<Dwarf> d1 = new ArrayList<Dwarf>();
        
        for(int i=0; i<num; i++){
            d1.add(new Dwarf("" + i));
        }
        
        return d1;
    }
}
