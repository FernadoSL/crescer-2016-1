
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
    
    public int getFlechaQuant(){
        return this.flechaQuant;
    }
    
    
}
