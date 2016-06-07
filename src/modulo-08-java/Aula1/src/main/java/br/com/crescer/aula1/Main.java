/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fernando.leandro
 */
public class Main {
    
    public static void main(String args[]) throws ParseException{
        
        ArrayList<Estados> listaEstados = new ArrayList<>();
        String listaNomeEstados = "";
        StringBuilder buffer = new StringBuilder();
        
        
        listaEstados.addAll(Arrays.asList(Estados.values()));
        //TODO ordenar
        
        for(Estados e : Estados.values()){
            listaNomeEstados = buffer.append(e.getNome()).append(", ").toString();
        }
        
        listaNomeEstados = listaNomeEstados.substring(0, listaNomeEstados.length()-2);
        System.out.println(listaNomeEstados);
        
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss EEE");
        System.out.println(dataFormat.format(new java.util.Date()));
        
        Scanner teclado = new Scanner(System.in);
        String dataDigitada = teclado.nextLine();
        dataFormat.parse(dataDigitada);
        
    }
    
}
