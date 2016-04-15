import java.util.*;

public class AtaqueIntercalado implements Estrategia{
    
    ArrayList<Elfo> atacaram = new ArrayList<>();
    
    public void ataque(ExercitoElfos e1, ArrayList<Dwarf> d1){
        
        ArrayList<Elfo> vivos = new ArrayList<>();
        int numEV=0, numEN=0;
        
        for(Elfo elfoAtacante : vivos){
            if(elfoAtacante instanceof ElfoVerde){
                numEV++;
            }
            if(elfoAtacante instanceof ElfoNoturno){
                numEN++;
            }
        }
        
        if(numEV == numEN){
            for(Elfo elfoAtacante : vivos){
                int impar = 1;
                int par = 0;
                if(elfoAtacante instanceof ElfoVerde){
                    atacaram.add(par, elfoAtacante);
                    par +=2;
                }
                if(elfoAtacante instanceof ElfoNoturno){
                    atacaram.add(impar, elfoAtacante);
                    impar +=2;
                }
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
