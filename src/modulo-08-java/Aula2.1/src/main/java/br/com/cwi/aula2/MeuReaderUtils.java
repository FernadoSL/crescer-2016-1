/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.aula2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
public class MeuReaderUtils {
    public static void main(String[] args) {
        System.out.println("Digite o caminho do arquivo: ");
        Scanner scan = new Scanner(System.in);
        
        String caminho = scan.nextLine();
        BufferedReader bufferReader = null;
        
        try {
            String readLine = "";
            bufferReader = LeitorDeArquivo.getReader(caminho);
            while (readLine != null) {
                readLine = bufferReader.readLine();
                System.out.println(readLine);
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
}
