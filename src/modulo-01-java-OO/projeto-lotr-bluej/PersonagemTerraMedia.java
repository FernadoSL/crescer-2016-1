
public class PersonagemTerraMedia{
    
    protected Status status = Status.VIVO;
    protected int exp;
    protected int vida;
    protected String nome;
    protected Inventario inventario = new Inventario();
    
    public PersonagemTerraMedia(String nome){
        this.nome = nome;
    }
    
    public void addItem(Item item){
        this.inventario.addItem(item);
    }
    
    public void removeItem(Item item){
        this.inventario.removeItem(item);
    }
    
    public int getExp(){
        return this.exp;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public int getVida(){
        return this.vida;
    }
        
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public Inventario getInventario(){
        return this.inventario;
    }
}
