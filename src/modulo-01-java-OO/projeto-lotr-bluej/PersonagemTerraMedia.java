
public abstract class PersonagemTerraMedia{
    
    protected Status status = Status.VIVO;
    protected int exp;
    protected double vida;
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
    
    public abstract void tentarSorte();
    
    @Override
    public boolean equals(Object o){
        PersonagemTerraMedia p1 = (PersonagemTerraMedia)o;
        return super.equals(o) && p1.getNome().equals(this.nome) && p1.getStatus().equals(this.status);
    }
    
    @Override
    public int hashCode(){
        System.out.println("Passou no hashCode");
        return this.getStatus().hashCode()*13;
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
    
    public double getVida(){
        return this.vida;
    }
    
    public Status getStatus(){
        return this.status;
    }
    
    public Inventario getInventario(){
        return this.inventario;
    }
}
