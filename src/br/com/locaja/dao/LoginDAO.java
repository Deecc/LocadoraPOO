/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;

import br.com.locaja.mysql.ConFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Décio
 */
public class LoginDAO {
    
    private Connection con;
    private PreparedStatement pst;
    private  ResultSet rsSenha,rsLogin;
    
    public void LoginDAO(){
        this.con = new ConFactory().getConnection();
        System.out.println("Conectado ao Banco!");
    }
    
    public ResultSet verificaSenha(){
        String sql = "SELECT senha from `locaja`.`login`";
        try {
            
             rsSenha = pst.executeQuery(sql);
             System.out.println(rsSenha);
             
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rsSenha;
    }
    
    public ResultSet verificaLogin(){
        String sql = "SELECT matricula from `locaja`.`funcionario`";
        try {
            
             rsLogin = pst.executeQuery(sql);
             System.out.println(rsLogin);
             
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rsLogin;
    }
}
