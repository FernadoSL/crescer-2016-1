
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
    

    /**
     * Constructor for objects of class LembaSemGlutem
     */
    public LembaSemGlutem(int quantLembas)
    {
        // initialise instance variables
        this.quantLembas = quantLembas;
        
    }

    public boolean podeDividirPares(){
        
        return((this.quantLembas % 2 == 0) && (this.quantLembas > 2) && (this.quantLembas <= 100));
            
    }
}
