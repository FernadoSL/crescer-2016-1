
/**
 * Write a description of class Anao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anao
{
    // instance variables - replace the example below with your own
    private int vida;
    private String nome;

    /**
     * Constructor for objects of class Anao
     */
    public Anao(String nome)
    {
        // initialise instance variables
        vida = 110;
        this.nome = nome;
    }
    
    public void tomoFlechada(){
        
        this.vida = this.vida - 10;
        
    }
    
}
