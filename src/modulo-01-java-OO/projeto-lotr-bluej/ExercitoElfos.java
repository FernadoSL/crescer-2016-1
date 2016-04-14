import java.util.*;

public class ExercitoElfos{
    
    private HashMap<String, Elfo> exercito1 = new HashMap<>();
    private HashMap<Status, Elfo> exercitoStatus = new HashMap<>();
    
    public ExercitoElfos(){
        
    }
    
    public void alista(Elfo elfo){
        if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
            exercito1.put(elfo.getNome(), elfo);
        }
    }

    public Elfo buscaNome(String nome){
        for (Elfo elfo : exercito1.values()) {
            if(elfo.getNome().equalsIgnoreCase(nome)){
                return exercito1.get(nome);
            }
        }
        
        return null;
    }
    
    public void agruparStatus(){
        for(Elfo elfo : exercito1.values()){
            exercitoStatus.put(elfo.getStatus(), elfo);
        }
    }
    
    public ArrayList<Elfo> buscar(Status status){
        ArrayList<Elfo> retorno = new ArrayList<>();
        
        for(Elfo elfo : exercitoStatus.values()){
            if(elfo.getStatus() == status){
                retorno.add(elfo);
            }
        }
        
        return retorno;
    }
    
    public HashMap getExercito(){
        return this.exercito1;
    }
    
    public HashMap getExercitoStatus(){
        return this.exercitoStatus;
    }
}
