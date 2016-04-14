import java.util.*;

public class ExercitoElfos{
    
    private HashMap<String, Elfo> exercito1 = new HashMap<>();
    private HashMap<Status, ArrayList<Elfo>> exercitoStatus = new HashMap<>();
    
    public ExercitoElfos(){
        
    }
    
    public void alista(Elfo elfo){
        if(elfo instanceof ElfoNoturno || elfo instanceof ElfoVerde){
            exercito1.put(elfo.getNome(), elfo);
        }
    }

    public Elfo buscar(String nome){
        return this.exercito1.get(nome);
    }
    
    public void agruparStatus(){
        for (Map.Entry<String, Elfo> chaveValor : this.exercito1.entrySet()){
            Elfo elfo = chaveValor.getValue();
            ArrayList<Elfo> statusNoAgrupamento = exercitoStatus.get(elfo.getStatus());
            boolean aindaNaoTenhoStatusNoAgrupamento = statusNoAgrupamento == null;
            
            if (aindaNaoTenhoStatusNoAgrupamento) {
                statusNoAgrupamento = new ArrayList<Elfo>();
                exercitoStatus.put(elfo.getStatus(), statusNoAgrupamento);
            }

            statusNoAgrupamento.add(elfo);
        }
    }
    
    public ArrayList<Elfo> buscar(Status status){ 
            return this.exercitoStatus.get(status);
    }

    
    public HashMap getExercito(){
        return this.exercito1;
    }
    
    public HashMap getExercitoStatus(){
        return this.exercitoStatus;
    }
}
