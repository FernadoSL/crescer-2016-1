

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DataTerceiraEraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DataTerceiraEraTest
{
    @Test
    public void anoBissexto4(){
        DataTerceiraEra data1 = new DataTerceiraEra(1, 1, 4);
        assertEquals(true, data1.ehBissexto());
    }
    
    @Test
    public void anoBissexto1992(){
        DataTerceiraEra data2 = new DataTerceiraEra(28, 02, 1992);
        assertEquals(true, data2.ehBissexto());
    }
    
    @Test
    public void anoBissexto1945(){
        DataTerceiraEra data3 = new DataTerceiraEra(01, 01, 1945);
        assertEquals(false, data3.ehBissexto());
    }
    
    @Test
    public void anoBissexto8000(){
        DataTerceiraEra data4 = new DataTerceiraEra(05, 05, 8000);
        assertEquals(true, data4.ehBissexto());
    }
}
