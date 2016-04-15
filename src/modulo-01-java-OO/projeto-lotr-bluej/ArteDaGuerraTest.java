
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArteDaGuerraTest{
    @Test
    public void batalhaComNumerosEnunciado(){
        //arrange
        ExercitoElfos ex = criaExercito();
        Estrategia est1 = new ArteDaGuerra();
        
        //act
        ex.agruparStatus();
        ex.atacar(est1, criaHordaDwarf(2));
        
        //assert
        assertEquals(est1.getOrdem().size(), 3);
        assertEquals(est1.getOrdem().get(0) instanceof ElfoNoturno, true);
        assertEquals(est1.getOrdem().get(1) instanceof ElfoNoturno, true);
        assertEquals(est1.getOrdem().get(2) instanceof ElfoVerde, true);
    }
    
    @Test
    public void batalhaComUmElfoVerdeQuatroNoturnoSendoUmMorto(){
        //arrange
        ExercitoElfos ex = criaExercito();
        Estrategia est1 = new ArteDaGuerra();
        Elfo elfo = new ElfoNoturno("VaiMorrer");
        //act
        while(elfo.getStatus() == Status.VIVO){
            elfo.atiraFlecha(new Dwarf("Azarado"));
        }
        ex.alista(elfo);
        ex.agruparStatus();
        ex.atacar(est1, criaHordaDwarf(2));
         
        //assert
        assertEquals(est1.getOrdem().size(), 3);
    }
    
    @Test
    public void todosElfosAtacamPqEhMtoDwarf(){
        //arrange
        ExercitoElfos ex = criaExercito();
        Estrategia est1 = new ArteDaGuerra();
        
        //act
        ex.agruparStatus();
        ex.atacar(est1, criaHordaDwarf(10));
        
        //assert
        assertEquals(est1.getOrdem().size(), 4);
    }
    
    //cria 3 elfos noturnos e 1 elfo verde
    private ExercitoElfos criaExercito(){
        ExercitoElfos ex1 = new ExercitoElfos();
        Elfo elfo1 = new ElfoVerde("V1");
        Elfo elfo2 = new ElfoNoturno("N1");
        Elfo elfo3 = new ElfoNoturno("N2");
        Elfo elfo4 = new ElfoNoturno("N3");
        
        ex1.alista(elfo1);
        ex1.alista(elfo2);
        ex1.alista(elfo3);
        ex1.alista(elfo4);
       
        return ex1;
    }
    
    private ArrayList<Dwarf> criaHordaDwarf(int num){
        ArrayList<Dwarf> d1 = new ArrayList<Dwarf>();
        
        for(int i=0; i<num; i++){
            d1.add(new Dwarf("" + i));
        }
        
        return d1;
    }
}
