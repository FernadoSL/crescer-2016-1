
/**
 * Write a description of class Anao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dwarf
{
    // instance variables - replace the example below with your own
    private int vida;
    private String nome;

    /**
     * Constructor for objects of class Anao
     */
    public Dwarf(String nome)
    {
        // initialise instance variables
        this.vida = 110;
        this.nome = nome;
    }
    
    public void tomoFlechada(){
        
        this.vida -= 10;
        
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
