
/**
 * Write a description of class LembaSemGlutem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LembaSemGlutem
{
    // instance variables - replace the example below with your own
    private int quant;

    /**
     * Constructor for objects of class LembaSemGlutem
     */
    public LembaSemGlutem(int quant)
    {
        // initialise instance variables
        this.quant = quant;
    }

    public boolean podeDividirPares(){
        
        boolean result = false;
        
        if((this.quant % 2 == 0) && (this.quant != 2))
            result = true;
        
        return result; 
        
    }
}
