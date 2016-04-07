import java.util.*;
public class Inventario{
    
    ArrayList<Item> inventario = new ArrayList<Item>();
    
    public void addItem(Item item){
        inventario.add(item);
    }
    
    public void removeItem(Item item){
        inventario.remove(item);
    }
    
    public Item getItem(int i){
        return inventario.get(i);
    }
    
    public int getSize(){
        return inventario.size();
    }
}