/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.aula2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fernando.leandro
 */
public class ManipuladorArquivos {
    public static void main(String args[]){
        
        System.out.println("Digite um comando: ");
        Scanner scan = new Scanner(System.in);
        
        String comando = scan.nextLine();
        String nomeArquivo = "";
        try{
            
            nomeArquivo = comando.substring(comando.indexOf("{")+1, comando.indexOf("}"));
            comando = comando.substring(0, comando.indexOf("{"));
            
            
            switch(comando){
                case "mk $":
                    try {
                        final boolean b = new File(nomeArquivo).createNewFile();
                    } catch (IOException e) {
                        System.out.println("Comando inválido");
                    }
                    break;
                case "rm $":
                    final boolean b = new File(nomeArquivo).delete();
                    break;
                case "ls $":
                    final File file = new File(nomeArquivo);
                    String path = ""; 
                    if(file.exists()){
                       path = file.getAbsolutePath();
                       System.out.println(path);
                    }else{
                        System.out.println(nomeArquivo);
                    }
                    break;
                default:
                    System.out.println("Comando inválido");
            }
            
        }catch(Exception e){
            System.out.println("Comando inválido");
        }
        
        
        scan.close();
    }
}
