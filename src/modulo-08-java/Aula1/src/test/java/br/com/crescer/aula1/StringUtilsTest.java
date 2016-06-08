/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula1;

import static br.com.crescer.aula1.StringUtils.contadorVogais;
import static br.com.crescer.aula1.StringUtils.inverterPalavra;
import static br.com.crescer.aula1.StringUtils.isEmpty;
import static br.com.crescer.aula1.StringUtils.verificaPalindromo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FERNANDO
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @Test
    public void IsEmptyComEspaços(){
        //arrange
        String s1 = new String("   ");
        //assert
        assertEquals(true, isEmpty(s1));
    }
    
    @Test
    public void IsEmptySemEspaços(){
        //arrange
        String s2 = new String("");
        //assert
        assertEquals(true, isEmpty(s2));
    }
    
    
    @Test
    public void naoIsEmpty(){
        //arrange
        String s3 = new String("abcdef");
        //assert
        assertEquals(false, isEmpty(s3));
    }
    
    @Test
    public void contaVogalEmABCDE(){
        //arrange
        String s1 = new String("ABCDE");
        //act
        int obtido = contadorVogais(s1);
        //assert
        assertEquals(2, obtido);
    }
    
    @Test
    public void contaNenhumaVogal(){
        //arrange
        String s2 = new String("BCDFGH");
        //act
        int obtido = contadorVogais(s2);
        //assert
        assertEquals(0, obtido);
    }
    
    @Test
    public void contaVogalEmStringVazia(){
        //arrange
        String s3 = new String("");
        //act
        int obtido = contadorVogais(s3);
        //assert
        assertEquals(0, obtido);
    }
    
    @Test
    public void invertePalavraMaiuscula(){
        //arrange
        String s4 = new String("ABC");
        //act
        String obtido = inverterPalavra(s4);
        //assert
        assertEquals("CBA", obtido);
    }
    
    @Test
    public void invertePalavraMinuscula(){
        //arrange
        String s4 = new String("ovo");
        //act
        String obtido = inverterPalavra(s4);
        //assert
        assertEquals("ovo", obtido);
    }
    
    
    @Test
    public void palavraOvoPalindromo(){
        //arrange
        String s4 = new String("ovo");
        //act
        boolean obtido = verificaPalindromo(s4);
        //assert
        assertEquals(true, obtido);
    }
    
    @Test
    public void palavraAmaPalindromo(){
        //arrange
        String s4 = new String("AMA");
        //act
        boolean obtido = verificaPalindromo(s4);
        //assert
        assertEquals(true, obtido);
    }
    
    @Test
    public void palavraCachorroNaoPalindromo(){
        //arrange
        String s4 = new String("Cachorro");
        //act
        boolean obtido = verificaPalindromo(s4);
        //assert
        assertEquals(false, obtido);
    }
}
