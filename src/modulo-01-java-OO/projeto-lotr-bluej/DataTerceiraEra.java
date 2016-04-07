
/**
 * Write a description of class DataTerceiraEra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataTerceiraEra
{
    private int dia;
    private int mes;
    private int ano;
    
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public DataTerceiraEra(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean ehBissexto(){
        if(this.ano % 4 != 0){
            return false;
        }else if(this.ano % 100 != 0 || this.ano % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
}