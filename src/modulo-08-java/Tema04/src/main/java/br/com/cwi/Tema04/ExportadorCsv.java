/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.Tema04;

import com.mycompany.tema03.MeuConnectionUtils;
import com.mycompany.tema03.MeuSqlUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FERNANDO
 */
public class ExportadorCsv {
        
    public void exportaCSV(String nomeArquivo, String nomeTabela){
        
        final String sqlSelect = "Select * from ?";
        final ResultSet rs;
        String linha = "";
        
        try(Connection connection = MeuConnectionUtils.getConnection()){
            try(PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect)){
                
                preparedStatement.setString(1, nomeTabela);
                rs = preparedStatement.executeQuery();
                final int numeroColunas = rs.getMetaData().getColumnCount();
                File file = new File(nomeArquivo);
                BufferedWriter bufferedWriter = null;
                
                
                while(rs.next()){
                    for(int i=0; i<numeroColunas; i++){
                        linha += rs.getObject(i) + ";";
                    }
                    try{
                        bufferedWriter.write(linha);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    } catch (IOException ex) {
                        Logger.getLogger(MeuSqlUtils.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    linha = "";
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportadorCsv.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
