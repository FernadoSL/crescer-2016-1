
/**
 * Write a description of class LembaSemGlutem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LembaSemGlutem
{
    // instance variables - replace the example below with your own
    private int quantLembas;
    private int numPersonagens;

    /**
     * Constructor for objects of class LembaSemGlutem
     */
    public LembaSemGlutem(int quantLembas, int numPersonagens)
    {
        // initialise instance variables
        this.quantLembas = quantLembas;
        this.numPersonagens = numPersonagens;
    }

    public boolean podeDividirPares(){
        
        if((this.quantLembas >= 1) && (this.quantLembas <= 100))
            return((this.quantLembas % 2 == 0) && (this.quantLembas >= 2* numPersonagens));
        
        return false;    
    }
}
