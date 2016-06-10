/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema03;

import br.com.cwi.aula2.LeitorDeArquivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
//TODO: refatorar métodos para tentar dimnuir suas responsabilidades
public class MeuSqlUtils {
    
    @SuppressWarnings({"CallToPrintStackTrace", "null"})
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
    
    public static void imprimeTabela(String select){
        try(Connection connection = ConnectionUtils.getConnection()){
            try(Statement statement = connection.createStatement()){
                
                ResultSet rs = statement.executeQuery(select);
                final int numColunas = rs.getMetaData().getColumnCount();
                
                for(int i=1; i<=numColunas; i++){
                    System.out.print(rs.getMetaData().getColumnName(i) + "\t");
                }
                System.out.println();
                while(rs.next()){
                    for(int i=1; i<=numColunas; i++){
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println();
                }
            }
        }catch(final SQLException e){
            System.err.format("SQLException: %s", e);
        }
    }
    
    public static void importarCsv(String caminho){
        try(BufferedReader bufferedReader= LeitorDeArquivo.getReader(caminho)){
            
            Long ID;
            String Nome;
            String linha = bufferedReader.readLine();
            String sqlInsert = "INSERT INTO PESSOA (ID_PESSOA, NM_PESSOA) VALUES(?, ?)";
            
            while(linha != null){
                try{
                    ID = Long.parseLong(linha.split("\\;")[0]);
                    Nome = linha.split("\\;")[1];
                    
                    try(Connection connection = ConnectionUtils.getConnection()){
                        try(PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)){
                            preparedStatement.setLong(1, ID);
                            preparedStatement.setString(2, Nome);
                            preparedStatement.executeUpdate();
                        }catch(final SQLException e){
                            System.err.format("SQLException: %s", e);
                        }
                    }catch(final SQLException e){
                        System.err.format("SQLException: %s", e);
                    }
                    
                }catch(Exception e){
                    
                }
                
                linha = bufferedReader.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(MeuSqlUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("null")
    public static void exportarCsv(String novoArquivo){
        try(Connection connection = ConnectionUtils.getConnection()){
            try(Statement statement = connection.createStatement()){
                
                ResultSet rs = statement.executeQuery("SELECT * FROM PESSOA");
                File file = new File(novoArquivo);
                BufferedWriter bufferedWriter = null;
                
                try{
                    final boolean b = file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(MeuSqlUtils.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try{
                    bufferedWriter = LeitorDeArquivo.getWriter(file.getAbsolutePath());
                } catch (IOException ex) {
                    Logger.getLogger(MeuSqlUtils.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                while(rs.next()){
                    try{
                        bufferedWriter.write(rs.getLong("ID_PESSOA") + ";" + rs.getString("NM_PESSOA"));
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    } catch (IOException ex) {
                        Logger.getLogger(MeuSqlUtils.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeuSqlUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        //leitorSql("C:\\Users\\FERNANDO\\Documents\\CienciasDaComputacao\\Tema03");
        imprimeTabela("select * from Pessoa");
        //importarCsv("C:\\Users\\fernando.leandro\\Documents\\crescer-2016-1\\src\\modulo-08-java\\Tema03\\atributosCSV.txt");
        //exportarCsv("TesteExportação.txt");
    }
    
}
