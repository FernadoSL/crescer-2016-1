import java.util.*;

public class SindarinParaIngles implements TradutorSindarin{
    
    private HashMap<String, String> dicionario = new HashMap<String, String>()
    {
        {
            put("naur", "fire");
            put("nen", "water");
            put("gûr", "heart");
            put("gwaew", "wind");
            put("amar", "earth");
        }
    };
    
    
    public String traduzir(String palavra){
        return this.dicionario.get(palavra);
    }
}
