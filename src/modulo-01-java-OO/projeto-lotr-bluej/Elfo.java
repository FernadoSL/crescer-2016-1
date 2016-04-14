
public class Elfo extends PersonagemTerraMedia{
    
    protected int flechaQuant;
    protected static int populacao;

    public Elfo(String nome){
        super(nome);
        this.vida = 100;
        this.flechaQuant = 42;
        populacao++;
    }
    
    public Elfo(String nome, int flecha){
        this(nome);
        this.flechaQuant = flecha;
    }

    public void atiraFlecha(Dwarf anaoAtingido){
        this.flechaQuant--;
        anaoAtingido.tomoFlechada();
        exp++;
    }
    
    public String toStringFlehca(){
        return "Legolas possui " + this.flechaQuant + " flechas e " + this.exp + " níves de experiência.";  
    }
    
    protected void finalize() throws Throwable{
        super.finalize();
        this.populacao--;
    }
    

    public boolean equals(Object o){
        Elfo e1 = (Elfo)o;
        return e1.getNome().equalsIgnoreCase(this.nome) && e1.getStatus().equals(this.status);
    }
    
    public int hashCode(){
        return this.getStatus().toString().length()*10;
    }
    
    public int getFlechaQuant(){
        return this.flechaQuant;
    }
    
    
}
