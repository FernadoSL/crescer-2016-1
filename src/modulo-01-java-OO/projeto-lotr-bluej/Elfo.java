
public class Elfo extends PersonagemTerraMedia{
    
    protected int flechaQuant;

    public Elfo(String nome){
        super(nome);
        this.flechaQuant = 42;
    }
    
    public Elfo(String nome, int flecha){
        super(nome);
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
