/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.aula2;

import static br.com.cwi.aula2.LeitorDeArquivo.getWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando.leandro
 */
public class Chat {
    
    public static void main(String args[]){
        
        String user = "Fernando";
        String caminho = "//10.0.100.102/cwitmp/carloshenrique/crescer.txt";
        
        new Thread(new Runnable() {
           @Override
           public void run() {
               BufferedReader bufferReader = null;
               try {
                   bufferReader = LeitorDeArquivo.getReader(caminho);
                   while (true) {
                       String readLine = bufferReader.readLine();
                       if (readLine != null) {
                           System.out.println(readLine);
                       }
                       Thread.sleep(1000l);
                   }
               } catch(Exception e) {
                   
               } finally {
                   try {
                       bufferReader.close();
                   } catch (IOException ex) {
                       Logger.getLogger(LeitorDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
           }
       }).start();
        
        
        while(true){
            System.out.println();
            Scanner scan = new Scanner(System.in);
            Date data = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            String linha = dateFormat.format(data) + " - " + user + " : " + scan.nextLine();
            
            
            if(":q!".equals(linha)){
                break;
            }
            
            BufferedWriter bufferedWriter = null;
            
            try{
                bufferedWriter = getWriter(caminho);
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
                try{
                    if(bufferedWriter != null){
                        bufferedWriter.close();
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
