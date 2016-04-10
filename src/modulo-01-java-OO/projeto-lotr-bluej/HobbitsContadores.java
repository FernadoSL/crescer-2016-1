import java.util.*;

public class HobbitsContadores{
    
    ArrayList<ArrayList<Integer>> listaDividas = new ArrayList<>();
    int result = 0;
    public int calculaDiferenca(ArrayList<ArrayList<Integer>> listaDividas){
        for(int i=0; i<listaDividas.size(); i++){
            result += this.calculaPares(listaDividas.get(i));
        }
        return result;
    }
    
    private int calculaPares(ArrayList<Integer> listaPares){
        
        int x = listaPares.get(0)*listaPares.get(1);
        int mmc = 1 ;
        int i=2;
        
        while((listaPares.get(0) != 1 )|| (listaPares.get(1) != 1)){
            
            boolean flag = false;
            if(listaPares.get(0)%i == 0){
                listaPares.set(0, listaPares.get(0)/i);
                flag = true;
            }
            if(listaPares.get(1)%i == 0){
                listaPares.set(1, listaPares.get(1)/i);
                flag = true;
            }
            if(flag){
                mmc = mmc*i;
                i = 2;
            }else{
                i++;
            }
        }
        
        
        return x - mmc;
    }
}
