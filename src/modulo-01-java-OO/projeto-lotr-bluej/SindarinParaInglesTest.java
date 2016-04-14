

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SindarinParaInglesTest{
    @Test
    public void traduzirNaurParaIngles(){
        //naur
        TradutorSindarin tradutorIngles = new SindarinParaIngles();
        assertEquals("fire", tradutorIngles.traduzir("naur"));
    }
    
    @Test
    public void traduzirAmarParaIngles(){
        //Amar
        TradutorSindarin tradutor = new SindarinParaIngles();
        assertEquals("earth", tradutor.traduzir("amar"));
    }
    
    @Test
    public void traduzirGwaewParaIngles(){
        //gwaew
        TradutorSindarin tradutor = new SindarinParaIngles();
        assertEquals("wind", tradutor.traduzir("gwaew"));
    }

    @Test
    public void traduzirNenParaIngles(){
        //nen
        TradutorSindarin tradutor = new SindarinParaIngles();
        assertEquals("water", tradutor.traduzir("nen"));
    }

    @Test
    public void traduzirGurParaIngles(){
        //gûr
        TradutorSindarin tradutor = new SindarinParaIngles();
        assertEquals("heart", tradutor.traduzir("gûr"));
    }
}
