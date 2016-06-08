/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.aula2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author fernando.leandro
 */
    
public class LeitorDeArquivo {
    
    public static BufferedReader getReader(String file) throws FileNotFoundException{
        return new BufferedReader(new FileReader(file));
    }
    
    public static BufferedWriter getWriter(String file) throws IOException{
        return new BufferedWriter(new FileWriter(file, true));
    }
    
}

