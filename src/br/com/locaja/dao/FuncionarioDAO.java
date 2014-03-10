/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;

import br.com.locaja.mysql.ConFactory;
import br.com.locaja.principal.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author x05930906912
 */
public class FuncionarioDAO {
    
    private Connection con;
    private  ResultSet rs;
    
    public FuncionarioDAO(){
        this.con = new ConFactory().getConnection();
        
    }
    public void Insere(Funcionario func){
     
        String sql = "INSERT INTO `locaja`.`funcionario`(`nome`, `cpf`, `email`, `matricula`, "
                + "`cargo`, `salario`) VALUES (?,?,?,?,?,?)";
         String sql2 = "INSERT INTO locaja.login (cod_func , senha) VALUES ((select cod_funcionario from funcionario where cpf = "+func.getCpf()+"),'123456')";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, func.getNome());
            psmt.setString(2, func.getCpf());
            psmt.setString(3, func.getEmail());
            psmt.setInt(4, geraMatricula());
            psmt.setString(5, func.getCargo());
            psmt.setDouble(6, func.getSalario());
            psmt.execute();
            psmt.close();
            Statement st = con.createStatement();
            st.execute(sql2);
            st.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Edita(Funcionario func){
      
        String sql = "UPDATE `locaja`.`funcionario` SET `nome` = ? , `cpf` = ?, `email` = ?, `matricula` = ? , "
                + "`cargo` = ? , `salario` = ? "
                +"where `cpf` = "+ func.getCpf();
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, func.getNome());
            psmt.setString(2, func.getCpf());
            psmt.setString(3, func.getEmail());
            psmt.setInt(4, geraMatricula());
            psmt.setString(5, func.getCargo() );
            psmt.setDouble(6, func.getSalario());
        
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Consulta(Funcionario func){
        
    }
    
    public void Deleta(Funcionario func){
       String sql = "DELETE FROM `locaja`.`funcionario` WHERE `cpf`= ?"+func.getCpf() ;
       try {
           PreparedStatement psmt = con.prepareStatement(sql);
           psmt.execute();
           psmt.close();
           JOptionPane.showMessageDialog(null,"Registro deletado com Sucesso!");
       }catch (SQLException e){
           e.printStackTrace();
       }
       
       
    }
    
    public int geraMatricula(){
           
        double x = 2;
        while (x < 1000){
            x = Math.random() * 10000;
        }
        return (int) x;
           
          
       }
   
}
