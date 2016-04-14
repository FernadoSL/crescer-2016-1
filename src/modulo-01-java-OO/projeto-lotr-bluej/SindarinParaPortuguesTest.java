

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SindarinParaPortuguesTest{
    @Test
    public void traduzirNaurParaPortugues(){
        //naur
        TradutorSindarin tradutor = new SindarinParaPortugues();
        assertEquals("fogo", tradutor.traduzir("naur"));
    }
    
    @Test
    public void traduzirAmarParaPortugues(){
        //Amar
        TradutorSindarin tradutor = new SindarinParaPortugues();
        assertEquals("terra", tradutor.traduzir("amar"));
    }
    
    @Test
    public void traduzirGwaewParaPortugues(){
        //gwaew
        TradutorSindarin tradutor = new SindarinParaPortugues();
        assertEquals("vento", tradutor.traduzir("gwaew"));
    }

    @Test
    public void traduzirNenParaPortugues(){
        //nen
        TradutorSindarin tradutor = new SindarinParaPortugues();
        assertEquals("água", tradutor.traduzir("nen"));
    }

    @Test
    public void traduzirGurParaPortugues(){
        //gûr
        TradutorSindarin tradutor = new SindarinParaPortugues();
        assertEquals("coração", tradutor.traduzir("gûr"));
    }


}
