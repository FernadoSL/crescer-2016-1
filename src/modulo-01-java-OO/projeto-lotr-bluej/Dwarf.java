public class Dwarf
{
    // instance variables - replace the example below with your own
    private int vida;
    private String nome;
    private Status status = Status.VIVO;
    private Inventario inventario = new Inventario();
    private DataTerceiraEra dataNascimento = new DataTerceiraEra(1, 1, 1);

    public Dwarf(String nome)
    {
        // initialise instance variables
        this.vida = 110;
        this.nome = nome;
    }
    
    public void tomoFlechada(){
        
        if(this.vida > 0){
            this.vida -= 10;
            this.calculaMorte();
        }
    }
    
    private void calculaMorte(){
        if(this.vida <= 0)
            this.status = Status.MORTO;
    }
    
    public void addItem(Item item){
        this.inventario.addItem(item);
    }
    
    public void removeItem(Item item){
        this.inventario.removeItem(item);
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getVida(){
        return this.vida;
    }

    public Status getStatus(){
        return this.status;
    }
}
