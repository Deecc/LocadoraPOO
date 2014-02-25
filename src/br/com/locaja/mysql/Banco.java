/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author x05930906912
 */
public class Banco {
    
    private String host;
    private String user;
    private String pass;
    private String bancoDeDados;
    
    public Connection c;
 
    public Banco(String host, String user, String pass, String bancoDeDados){
        this.bancoDeDados = bancoDeDados;
        this.host = host;
        this.user = user;
        this.pass = pass;
    }
    
    public boolean conecta(){
        boolean isConnected = false;
        String url = "jdbc:mysql://"+this.host+"/"
                +this.bancoDeDados+"?"
                +"user"+this.user
                +"&password"+this.pass;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println(url);
            this.c=DriverManager.getConnection(url);
            isConnected = true;
        }catch(SQLException e){
            e.printStackTrace();
            isConnected = false;
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            isConnected = false;
        }catch (InstantiationException e){
            e.printStackTrace();
            isConnected = false;
        }catch (IllegalAccessException e){
            isConnected = false;
        }
        return isConnected;
    }
    
    public ResultSet executaQuery(String query){
        Statement st;
        ResultSet rs;
        try {
            st = this.c.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
