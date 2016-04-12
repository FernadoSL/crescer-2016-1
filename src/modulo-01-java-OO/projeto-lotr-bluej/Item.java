public class Item{
    
    private int quantidade;
    private String descricao;
    
    public Item(int quantidade, String descricao){
        this.quantidade = quantidade;
        this.descricao = descricao;    
    }
    
    public boolean equals(Object obj){
        Item i1 = (Item)obj;
        return (this.quantidade == i1.getQuant()) && (this.descricao.equalsIgnoreCase(i1.getDescricao()));
    }
    
    public void setQuant(int quant){
        this.quantidade = quant;
    }
    
    public int getQuant(){
        return this.quantidade;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

}
