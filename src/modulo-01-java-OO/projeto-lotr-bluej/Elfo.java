
/**
 * Write a description of class Elfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elfo
{
    // instance variables - replace the example below with your own
    private String nome;
    private int exp;
    private int flechaQuant;

    /**
     * Constructor for objects of class Elfo
     */
    public Elfo(String nome)
    {
        // initialise instance variables
        this.nome = nome;
        this.flechaQuant = 42;
    }
    
    public Elfo(String nome, int flecha){
        this.nome = nome;
        this.flechaQuant = flecha;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void atiraFlecha()
    {
        // put your code here
        this.exp++;
        this.flechaQuant--;
    }
    
    public void atiraFlechaRefactory(Dwarf anaoAtingido){
    
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
    
    public int getExp(){
        return this.exp;
    }
}
