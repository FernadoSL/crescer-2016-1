
/**
 * Write a description of class CestoDeLembas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CestoDeLembas
{
    // instance variables - replace the example below with your own
    private int quantLembas;
    

    /**
     * Constructor for objects of class CestoDeLembas
     */
    public CestoDeLembas(int quantLembas)
    {
        // initialise instance variables
        this.quantLembas = quantLembas;
        
    }

    public boolean podeDividirPares(){
        
        return((this.quantLembas % 2 == 0) && (this.quantLembas > 2) && (this.quantLembas <= 100));
            
    }
}
