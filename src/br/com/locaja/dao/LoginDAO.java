/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;

import br.com.locaja.mysql.ConFactory;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Décio
 */
public class LoginDAO {
    
    private Connection con;

    /**
     *
     */
    public LoginDAO(){
        this.con = new ConFactory().getConnection();
        System.out.println("Conectado ao Banco!");
    }
    
    public String verifica(int matricula){
        String sql = "SELECT senha from `locaja`.`login` where cod_func = (select cod_funcionario from funcionario where matricula = "+matricula+")";
        String senha = "";
        try {
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while (rs.next()){
                senha = rs.getString("senha");
                
             }
             
            
             
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return senha ;
    }
    
    
    
}
