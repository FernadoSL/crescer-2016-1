import java.util.*;
public class Inventario{
    
    ArrayList<Item> inventario = new ArrayList<Item>();
    
    public void addItem(Item item){
        inventario.add(item);
    }
    
    public void removeItem(Item item){
        inventario.remove(item);
    }
}