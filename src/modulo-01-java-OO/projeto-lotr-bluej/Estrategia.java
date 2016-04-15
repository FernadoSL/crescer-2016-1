import java.util.*;

public interface Estrategia{
    
    public void ataque(ExercitoElfos e1, ArrayList<Dwarf> d1);
    
    public ArrayList<Elfo> getOrdem();
}
