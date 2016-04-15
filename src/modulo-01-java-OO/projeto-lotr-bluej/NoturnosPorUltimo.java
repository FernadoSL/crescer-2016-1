import java.util.*;

public class NoturnosPorUltimo implements Estrategia{
    
    ArrayList<Elfo> atacaram = new ArrayList<>();
    
    public void ataque(ExercitoElfos e1, ArrayList<Dwarf> d1){
        ArrayList<Elfo> vivos = e1.buscar(Status.VIVO);
        for(Elfo elfoAtacante : vivos){
            if(elfoAtacante instanceof ElfoVerde){
                atacaram.add(elfoAtacante);
            }
        }
        
        for(Elfo elfoAtacante : vivos){
            if(elfoAtacante instanceof ElfoNoturno){
                atacaram.add(elfoAtacante);
            }
        }
        
        for(Elfo elfoAtacante : atacaram){
            for(int i=0; i<d1.size(); i++){
                elfoAtacante.atiraFlecha(d1.get(i));
            }
            
        }
    }
    
    public ArrayList<Elfo> getOrdem(){
        return this.atacaram;
    }
}
