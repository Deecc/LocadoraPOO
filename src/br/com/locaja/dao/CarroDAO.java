/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.dao;

import br.com.locaja.mysql.ConFactory;
import br.com.locaja.principal.Carro;
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
public class CarroDAO {
    private Connection con;
    private  ResultSet rs;
    private Statement st;
   
   
    
    public CarroDAO() {
       this.con = new ConFactory().getConnection();
       System.out.println("Conectado!");
       
    }
    
	
    public void Insere(Carro carro){
     
        String sql = "INSERT INTO `locaja`.`carro`(`modelo`, `chassis`, `categoria`, `km`,`status`, `ano`"
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, carro.getModelo());
            psmt.setInt(2, carro.getChassis());
            psmt.setString(3, carro.getCategoria());
            psmt.setInt(4, carro.getKm());
            psmt.setString(5, carro.getStatus());
            psmt.setInt(6, carro.getAno());
           
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Edita(Carro carro){
     
        String sql = "UPDATE `locaja`.`carro` SET `modelo = ?`, `chassis = ?`, `categoria = ?`, `km = ?`,`status = ?`, `ano = ?`"
                +"where `cod_carro` = "+ carro.getCod_carro();
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, carro.getModelo());
            psmt.setInt(2, carro.getChassis());
            psmt.setString(3, carro.getCategoria());
            psmt.setInt(4, carro.getKm());
            psmt.setString(5, carro.getStatus());
            psmt.setInt(6, carro.getAno());
            psmt.execute();
            psmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Carro> getCarros(){
        ArrayList<Carro> carList = new ArrayList<>();
        try {
            String sql = "Select * from carro";
            st = con.createStatement();
            rs = st.executeQuery(sql);
           try{ 
            while (rs.next()){
               Carro car = new Carro();
               
                car.setAno(rs.getInt("ano"));
                car.setCategoria(rs.getString("categoria"));
                car.setChassis(rs.getInt("chassis"));
                car.setKm(rs.getInt("km"));
                car.setModelo("modelo");
                car.setStatus("status");
                carList.add(car);
                
            }
           }finally {
               rs.close();
               st.close();
           }
        }catch (SQLException e){
            e.printStackTrace();
        }
      return carList;  
    }
    
    public void Deleta(Carro carro){
       String sql = "DELETE FROM `locaja`.`carro` WHERE `cod_carro` = ?"+carro.getCod_carro();
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
