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
    
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String ddd;
    private String rg;
    private String email;
    private String cnh;
    
    private Connection con;
    private Statement st;
    private  ResultSet rs;
   
    
    public ClienteDAO() {
       this.con = new ConFactory().getConnection();
       
    }
    
    public void Insere(Cliente cliente){
     
        String sql = "INSERT INTO Cliente(nome, cpf, endereco, numero "
                + "rg, email,cnh) VALUES(?,?,?,?,?,?,?)";
       // String sql2 = "INSERT INTO telefone(telefone,ddd ) VALUES(?,?) WHERE cliente.cod_cli ="+REturn;
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            //PreparedStatement psmt2 = con.prepareStatement(sql2);
            psmt.setString(1, cliente.getNome());
            psmt.setString(2, cliente.getCpf());
            psmt.setString(3, cliente.getEndereco());
            psmt.setString(4, cliente.getNumero());
            psmt.setString(5, cliente.getRg() );
            psmt.setString(6, cliente.getEmail());
            psmt.setString(7, cliente.getCnh() );
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
