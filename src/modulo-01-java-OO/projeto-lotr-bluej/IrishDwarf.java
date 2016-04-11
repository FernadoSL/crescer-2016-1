public class IrishDwarf extends Dwarf{
    
    public IrishDwarf(String nome){
        super(nome);
    }
    
    public IrishDwarf(String nome, DataTerceiraEra data){
        super(nome, data);
    }
    
    
    public void tentarSorte(){
        if(getNumSorte() == - 3333.0){
            for(int i=0; i<this.inventario.getSize(); i++){
                int x = 0;
                for(int j=1; j<=this.inventario.getItem(i).getQuant(); j++){
                    x += j;
                }
                this.inventario.getItem(i).setQuant(this.inventario.getItem(i).getQuant() +(x*1000));
            }
        }
    }
    
    }
