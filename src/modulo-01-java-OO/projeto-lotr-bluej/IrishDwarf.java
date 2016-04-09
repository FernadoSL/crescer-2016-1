public class IrishDwarf
{
    // instance variables - replace the example below with your own
    private int vida = 110;
    private int exp = 0;
    private String nome;
    private Status status = Status.VIVO;
    private Inventario inventario = new Inventario();
    private DataTerceiraEra dataNascimento = new DataTerceiraEra(1, 1, 1);

    public IrishDwarf(String nome)
    {
        this.nome = nome;
    }
    
    public IrishDwarf(String nome, DataTerceiraEra data){
        this.nome = nome;
        this.dataNascimento = data;
    }
    
    public void tomoFlechada(){ 
        if(this.getNumSorte() < 0){
            this.exp += 2;
        }else if(this.getNumSorte() > 100){
            if(this.vida > 0){
                this.vida -= 10;
                this.calculaMorte();
            }
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
    
    public double getNumSorte(){
              
        if(dataNascimento.ehBissexto() && (this.vida >= 80 && this.vida <= 90)){
            return 101.0 * -33;
        }
        else if(!dataNascimento.ehBissexto() && (this.nome.equalsIgnoreCase("Seixas") || this.nome.equalsIgnoreCase("Meireles"))){
            return (101.0 * 33)%100;
        }
        else{
            return 101.0;
        }
  
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
    
    public int getExp(){
        return this.exp;
    }
    
    public Inventario getInventario(){
        return this.inventario;
    }
}
