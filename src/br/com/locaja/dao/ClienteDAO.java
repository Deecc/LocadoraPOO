/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;


import br.com.locaja.mysql.ConFactory;
import br.com.locaja.principal.Cliente;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





/**
 *
 * @author x05930906912
 */
public class ClienteDAO {
    
    
    private Connection con;
    private Statement st;
    private  ResultSet rs;
   
    
    public ClienteDAO() {
       this.con = new ConFactory().getConnection();
       System.out.println("Conectado!");
       
    }
    
    public void Insere(Cliente cliente){
     
        String sql = "INSERT INTO `locaja`.`cliente`(`nome`, `cpf`, `endereco`, `numero`, "
                + "`rg`, `email`,`cnh`, `telefone`, `ddd`, `complemento`, `referencia`, `cep`) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, cliente.getNome());
            psmt.setString(2, cliente.getCpf());
            psmt.setString(3, cliente.getEndereco());
            psmt.setString(4, cliente.getNumero());
            psmt.setString(5, cliente.getRg() );
            psmt.setString(6, cliente.getEmail());
            psmt.setString(7, cliente.getCnh() );
            psmt.setString(8, cliente.getTelefone());
            psmt.setString(9 , cliente.getDdd() );
            psmt.setString(10, cliente.getComplemento() );
            psmt.setString(11, cliente.getReferencia() );
            psmt.setString(12, cliente.getCEP() );
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Edita(Cliente cliente){
        
    }
    
    public void Consulta(Cliente cliente){
        
    }
    
    public void Deleta(Cliente cliente){
        
    }
}
