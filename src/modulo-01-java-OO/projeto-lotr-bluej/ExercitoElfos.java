import java.util.*;

public class ExercitoElfos{
    
    private HashMap<String, Elfo> exercito1 = new HashMap<>();
    
    public ExercitoElfos(){
        
    }
    
    public void alista(Elfo elfo){
        if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
            exercito1.put(elfo.getNome(), elfo);
        }
    }

    public Elfo buscaNome(String nome){
        for (String chave : exercito1.keySet()) {
            if(nome.equals(exercito1.get(chave))){
                return exercito1.get(chave);
            }
        }
        
        return null;
    }
    
    public HashMap getExercito(){
        return this.exercito1;
    }
}
