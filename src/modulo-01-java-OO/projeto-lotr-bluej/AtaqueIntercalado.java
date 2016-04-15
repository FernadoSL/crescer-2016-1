import java.util.*;

public class AtaqueIntercalado implements Estrategia{
    
    ArrayList<Elfo> atacaram = new ArrayList<>();
    
    public void ataque(ExercitoElfos e1, ArrayList<Dwarf> d1){
    
        
    }
    
    public ArrayList<Elfo> getOrdem(){
        return this.atacaram;
    }
}
