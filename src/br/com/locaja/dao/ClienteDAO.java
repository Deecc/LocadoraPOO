/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;


import br.com.locaja.mysql.ConFactory;
import br.com.locaja.principal.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;







/**
 *
 * @author x05930906912
 */
public class ClienteDAO {
    
    
    private Connection con;
    private  ResultSet rs;
    private Statement st;
   
   
    
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
     
        String sql = "UPDATE `locaja`.`cliente` SET `nome` = ? , `cpf` = ?, `endereco` = ?, `numero` = ?, "
                + "`rg` = ?, `email` = ?,`cnh` = ?, `telefone` = ?, `ddd` = ?, `complemento` = ?, `referencia` = ?, `cep` = ? "
                +"where `cpf` = "+ cliente.getCpf();
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
    
    public ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> cliList = new ArrayList<>();
        try {
            String sql = "Select * from cliente";
            st = con.createStatement();
            rs = st.executeQuery(sql);
           try{ 
            while (rs.next()){
                Cliente cli = new Cliente();
               
                cli.setCEP(rs.getString("cep"));
                cli.setCnh(rs.getString("cnh"));
                cli.setComplemento(rs.getString("complemento"));
                cli.setCpf(rs.getString("cpf"));
                cli.setDdd(rs.getString("ddd"));
                cli.setEmail(rs.getString("email"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setNome(rs.getString("nome"));
                cli.setNumero(rs.getString("numero"));
                cli.setRg(rs.getString("rg"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setReferencia(rs.getString("referencia"));
                cliList.add(cli);
                
            }
           }finally {
               rs.close();
               st.close();
           }
        }catch (SQLException e){
            e.printStackTrace();
        }
      return cliList;  
    }
    
    public void Deleta(Cliente cliente){
       String sql = "DELETE FROM `locaja`.`cliente` WHERE `cpf`= ?"+cliente.getCpf() ;
       try {
           PreparedStatement psmt = con.prepareStatement(sql);
           psmt.execute();
           psmt.close();
           JOptionPane.showMessageDialog(null,"Registro deletado com Sucesso!");
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
    
   
   
}
