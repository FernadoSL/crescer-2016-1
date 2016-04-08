import java.util.*;
public class Inventario{
    
    ArrayList<Item> inventario = new ArrayList<Item>();
    
    public void addItem(Item item){
        inventario.add(item);
    }
    
    public void removeItem(Item item){
        inventario.remove(item);
    }
    
    public String getDescricoesItens(){
        String descri = "";
        for(int i=0; i<this.getSize(); i++){
            descri = descri + this.getItem(i).getDescricao() + ",";
        }
        return this.getSize()>0 ? 
        descri.substring(0, descri.length() -1) :
        descri;
    }
    
    public Item maiorQuant(){
        Item maiorQuant = this.getItem(0);
        
        for(int i=0; i<this.getSize(); i++){
            if(this.getItem(i).getQuant()> maiorQuant.getQuant()){
                maiorQuant = this.getItem(i);
            }
        }
        
        return maiorQuant;
    }
    
    public Item getItem(int i){
        return inventario.get(i);
    }
    
    public int getSize(){
        return inventario.size();
    }
}