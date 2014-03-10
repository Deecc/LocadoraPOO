/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.principal;

import br.com.locaja.interfaces.ICarro;

/**
 *
 * @author Décio
 */
public class Carro implements ICarro {
    
    private int cod_carro;
    private String modelo;                 //Modelo do carro.Ex = Clio
    private String categoria;                //Se Utilitario, luxo ou pop.
    private int ano;        
    private long chassis;
    private int km;
    private String status;  //l para locado e d para disponível;
    private double valorDiaria;
    
    
     /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the chassis
     */
    public long getChassis() {
        return chassis;
    }

    /**
     * @param chassis the chassis to set
     */
    public void setChassis(long chassis) {
        this.chassis = chassis;
    }

    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        this.km = km;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

  
    /**
     * @return the cod_carro
     */
    public int getCod_carro() {
        return cod_carro;
    }

    /**
     * @param cod_carro the cod_carro to set
     */
    public void setCod_carro(int cod_carro) {
        this.cod_carro = cod_carro;
    }

    
    @Override
     public double valorDiaria() {
       double valor;
       if (this.getCategoria().equals("Popular")){
           valor = 45.00;
       }else if (this.getCategoria().equals("Utilitario")){
           valor = 65.00;
        }else valor = 85.00;
        
       return valor;
    }   

    @Override
    public double kmExtra() {
       double kmExtra;
        switch (this.getCategoria()) {
            case "Popular":
                kmExtra = 3.50;
                break;
            case "Utilitario":
                kmExtra = 4.50;
                break;
            default:
                kmExtra = 6.50;
                break;
        }
        
       return kmExtra;
    }  
    
    
    public String verificaDisponibilidade(String status){
       return this.getStatus();
        
    }

    /**
     *
     * @param status
     * @return
     */
    public String alteraDisponibilidade(String status){
        if (this.getStatus().equals("Disponivel")){
            this.setStatus("Alugado");
        }else this.setStatus("Disponivel");
        return this.getStatus();
    }

    /**
     * @return the valorDiaria
     */
    public double getValorDiaria() {
        return valorDiaria;
    }

    /**
     * @param valorDiaria the valorDiaria to set
     */
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
      
    
    
 }

  
   