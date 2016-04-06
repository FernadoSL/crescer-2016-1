
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
    
        
        anaoAtingido.tomoFlechada();
        exp++;
        this.flechaQuant--;
        
    }
}
