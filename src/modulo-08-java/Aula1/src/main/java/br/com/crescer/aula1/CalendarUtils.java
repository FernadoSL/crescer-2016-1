/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.aula1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fernando.leandro
 */
public class CalendarUtils {
    
    public static Date diaSemana(String data) throws ParseException{
        SimpleDateFormat dataFormat = new SimpleDateFormat("EEE");
        return dataFormat.parse(data);
    }
    
    public static void main(String args[]){
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/mm/yy EEE");
        
        try{
            System.out.println(dataFormat.format(""));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
