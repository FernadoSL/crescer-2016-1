/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema03;

import br.com.cwi.aula2.LeitorDeArquivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author FERNANDO
 */
public class MeuSqlUtils {
    
    public static void leitorSql(String caminho){
        
        final File file = new File(caminho);
        final File[] filelist = file.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains(".sql");
            }
        });
        
        if(filelist.length > 0){
            BufferedReader bufferReader = null;
        
            try {
                bufferReader = new BufferedReader(new FileReader(filelist[0]));
                String comandoSql = "";
                String linha = bufferReader.readLine();
                
                while(linha != null){
                    comandoSql += linha;
                    linha = bufferReader.readLine();
                }
                
                try(final Connection connection = ConnectionUtils.getConnection()){
                    try(final Statement statement = connection.createStatement()){
                        statement.executeQuery(comandoSql);
                    }catch (final SQLException e) {
                        System.err.format("SQLException: %s", e);
                    }
                }catch (final SQLException e) {
                    System.err.format("SQLException: %s", e);
                }
                
                System.out.println(comandoSql);
                
            } catch(Exception e) {
                e.printStackTrace();
            } finally{
                try{
                    bufferReader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        leitorSql("C:\\Users\\FERNANDO\\Documents\\CienciasDaComputacao\\Tema03");
    }
    
}
