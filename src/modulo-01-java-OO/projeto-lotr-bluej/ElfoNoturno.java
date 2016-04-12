
public class ElfoNoturno extends Elfo{
    
    public ElfoNoturno(String nome){
        super(nome);
    }
    
    public void atiraFlecha(Dwarf anaoAtingido){
        this.flechaQuant--;
        anaoAtingido.tomoFlechada();
        exp+=3;
        this.vida -= ((this.vida / 100) * 5);
        this.calculaMorte();
    }
    
    //Resposta questão 7.2:
    //Até essa parte do código os elfos noturnos não morrem atirando flechas, pois apesar de perder vida ela não chegaria ao valor zero.
    
    private void calculaMorte(){
        if(this.vida < 1)
            this.status = Status.MORTO;
    }
}
