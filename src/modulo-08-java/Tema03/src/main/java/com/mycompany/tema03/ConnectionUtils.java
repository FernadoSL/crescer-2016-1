/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FERNANDO
 */
public class ConnectionUtils {
    
    static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER = "Crescer";
    static final String PASS = "Crescer$5";
    
    static Connection getConnection(){
        
        Connection connection = null;
        
        try{
            connection = DriverManager.getConnection(URL, USER, PASS);
        }catch (SQLException e) {
            System.err.format("SQLException: %s", e);
        }
        return connection;
    }       
}
    

