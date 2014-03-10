/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;

import br.com.locaja.mysql.ConFactory;
import br.com.locaja.principal.Aluguel;
import br.com.locaja.principal.Carro;
import br.com.locaja.principal.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Décio
 */
public class ReservaDAO {
    
     private Connection con;
     private  ResultSet rs;
     private Statement st;
     
    
    public ReservaDAO()  {
       this.con = new ConFactory().getConnection();
       System.out.println("Conectado!");
       
    }
    
    public void Aluga(Aluguel aluguel, Cliente cli){
     
        String sql = "INSERT INTO `locaja`.`aluguel`(`cod_cliente`,`data_inicial`, `data_final`, `km_inicial` ) " 
                + "VALUES((Select cod_cliente from cliente where cliente.nome = "+cli.getNome()+"),?,?,?)";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setDate(1, (Date) aluguel.getData_inicio());
            psmt.setDate(2, (Date) aluguel.getData_fim());
            psmt.setInt(3, aluguel.getKm_inicial());
           
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Edita(Aluguel aluguel){
        
        String sql = "SELECT cod_aluguel from aluguel";
        String sql2 = "UPDATE `locaja`.`aluguel` SET `data_inicial` = ? , `data_final` = ?, `km_inicial` = ?" 
                +"where `cod_aluguel` = "+ aluguel.getCod_aluguel();
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setDate(1, (Date) aluguel.getData_inicio());
            psmt.setDate(2, (Date) aluguel.getData_fim());
            psmt.setInt(3, aluguel.getKm_inicial());
            
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Aluguel> getAluguel(){
        ArrayList<Aluguel> aluList = new ArrayList<>();
        try {
            String sql = "Select * from reserva";
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
           try{ 
            while (rs.next()){
               Aluguel alu = new Aluguel();
                alu.setCod_aluguel(rs.getInt("cod_cliente"));
                alu.setData_inicio(rs.getDate("data_inicial"));
                alu.setData_fim(rs.getDate("data_final"));
                alu.setKm_inicial(rs.getInt("km_inicial"));
                alu.setCod_cli(rs.getInt("cod_cliente"));
                alu.setCod_car(rs.getInt("cod_carro"));
                aluList.add(alu);
            }
           }finally {
               rs.close();
               st.close();
           }
           
        }catch (SQLException e){
            e.printStackTrace();
        }
      return aluList;  
    }
    
    public void Deleta(Aluguel aluguel){
       String sql = "DELETE FROM `locaja`.`aluguel` WHERE `cod_aluguel`= ?"+aluguel.getCod_aluguel();
       try {
           PreparedStatement psmt = con.prepareStatement(sql);
           psmt.execute();
           psmt.close();
           JOptionPane.showMessageDialog(null,"Registro deletado com Sucesso!");
           
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
    
      public void getCarro(int id){
        
        try {
            String sql = "Select * from carro where cod_carro = "+id;
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
           try{ 
            while (rs.next()){
                Carro car = new Carro();
                car.setValorDiaria(rs.getDouble("valor_diaria"));
                
            }
           }finally {
               rs.close();
               st.close();
           }
           
        }catch (SQLException e){
            e.printStackTrace();
        }
     
    }
}
