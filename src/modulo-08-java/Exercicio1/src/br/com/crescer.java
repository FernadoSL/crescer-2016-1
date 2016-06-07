/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author fernando.leandro
 */
public class crescer {

    public static void main(String[] args) {
        
        try (final InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            try (final BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                
                int numeroDigitado = bufferedReader.read();
                
                if(numeroDigitado %2 == 0){
                    System.out.format("%d É par", numeroDigitado);
                }else{
                    System.out.format("%d É impar", numeroDigitado);
                }
            } catch (Exception e) {
                //...
            }
        } catch (Exception e) {
            //...
        }
        
    }
    
}
