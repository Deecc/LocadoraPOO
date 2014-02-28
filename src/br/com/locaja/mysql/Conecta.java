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
public class Conecta {
    
    private final String host = "localhost";
    private final String user ="admin";
    private final String pass="sysadmin";
    private final String bancoDeDados="locaja";
   
    private Connection con = null;
    public static Conecta minhaInst = null;
    
    private Connection Conecta(){
        String url = "jdbc:mysql://"+host+"/"
                +bancoDeDados+"?"
                +"user"+user
                +"&password"+pass;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println(url);
            con = DriverManager.getConnection(url);
           }catch(SQLException e){
            e.printStackTrace();
           }catch (ClassNotFoundException e){
            e.printStackTrace();
           }
        return con;
    }
    
    /**
     *
     * @return
     */
    public static Conecta getInstance(){
       if (minhaInst == null){
           minhaInst = new Conecta();
       }
        return minhaInst; 
    }
    
    public Connection verConexao(){
        if(con != null){
            return con;
        }else {
            throw new NullPointerException("Conexão não iniciada!");
        }
    }

    
}  
