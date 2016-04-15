import java.util.*;

public class ArteDaGuerra implements Estrategia{
    
    ArrayList<Elfo> atacaram = new ArrayList<>();
    
    public void ataque(ExercitoElfos e1, ArrayList<Dwarf> d1){
        
        ArrayList<Elfo> vivos = e1.buscar(Status.VIVO);
        
        
        int numAtks = vivos.size() * d1.size();
        double elfoNotuQuant = numAtks * 0.3;
        
        for(Elfo elfoAtacante : vivos){
            
            boolean elfoNotuAtk = elfoAtacante instanceof ElfoNoturno;
            
            if(elfoNotuAtk){
                if( (int)elfoNotuQuant > 0 ){
                    elfoNotuQuant--;
                    for(int i=0; i<d1.size(); i++){
                        elfoAtacante.atiraFlecha(d1.get(i));  
                    }
                    atacaram.add(elfoAtacante);
                }   
            }else{
               for(int i=0; i<d1.size(); i++){
                  elfoAtacante.atiraFlecha(d1.get(i));
               }
               atacaram.add(elfoAtacante);
            }
            
            
        }
        
    }
    
    public ArrayList<Elfo> getOrdem(){
        return this.atacaram;
    }
}
