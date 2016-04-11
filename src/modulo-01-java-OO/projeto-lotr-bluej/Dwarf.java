public class Dwarf extends PersonagemTerraMedia{
    private Status status = Status.VIVO;
    private DataTerceiraEra dataNascimento = new DataTerceiraEra(1, 1, 1);

    public Dwarf(String nome){
        super(nome);
        this.vida = 110;
    }
    
    public Dwarf(String nome, DataTerceiraEra data){
        super(nome);
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
    
    public double getNumSorte(){
              
        if(this.dataNascimento.ehBissexto() && (this.vida >= 80 && this.vida <= 90)){
            return 101.0 * -33;
        }
        else if(!this.dataNascimento.ehBissexto() && (this.nome.equalsIgnoreCase("Seixas") || this.nome.equalsIgnoreCase("Meireles"))){
            return (101.0 * 33)%100;
        }
        else{
            return 101.0;
        }
  
    }
    
    public void tentarSorte(){
        if(getNumSorte() == - 3333.0){
            for(int i=0; i<this.inventario.getSize(); i++){
                this.inventario.getItem(i).setQuant(this.inventario.getItem(i).getQuant() + 1000);
            }
        }
    }

    public Status getStatus(){
        return this.status;
    }
    
}
