public class ElfoVerde extends Elfo{
    
    public ElfoVerde(String nome){
        super(nome);
    }
    
    public void atiraFlecha(Dwarf anaoAtingido){
        this.flechaQuant--;
        anaoAtingido.tomoFlechada();
        exp+=2;
    }
    
    public void addItem(Item item){
        //Verifica se o item passado tem a descrição "Espada de aço valiriano" ou "Arco e Flecha de Vidro"
        boolean itemCerto = item.getDescricao().equalsIgnoreCase("Espada de aço valiriano") || item.getDescricao().equalsIgnoreCase("Arco e Flecha de Vidro");
        
        if(itemCerto){
            inventario.addItem(item);
        }
    }
}
