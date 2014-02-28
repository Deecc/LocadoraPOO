/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author x05930906912
 */
public class ConFactory {
    
    private final String host = "localhost";
    private final String user ="admin";
    private final String pass="sysadmin";
    private final String bancoDeDados="locaja";
    
    public Connection getConnection() throws ClassNotFoundException{
        try {
            String url = "jdbc:mysql://"+host+"/"
                +bancoDeDados+"?"
                +"user"+user
                +"&password"+pass;
           
            
            return DriverManager.getConnection("jdbc:mysql://"+host+"/"+bancoDeDados, user, pass);
            
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }
}
