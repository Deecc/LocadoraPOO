/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.principal;

/**
 *
 * @author Décio
 */
public class Carro {
    
    private String modelo;
    private char categoria;
    private int ano;
    private int chassis;
    private int km;
    private double valorAluguelDiaria;
    private double valorAluguelSemana;
    private char status;
    
    private void cadastrarVeiculo(){
        
    }
    
    private boolean verificaDisponibilidade(){
        return true;
    }
    
    private boolean alteraDisponibilidade(){
        return true;
    }

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
    public char getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(char categoria) {
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
    public int getChassis() {
        return chassis;
    }

    /**
     * @param chassis the chassis to set
     */
    public void setChassis(int chassis) {
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
     * @return the valorAluguelDiaria
     */
    public double getValorAluguelDiaria() {
        return valorAluguelDiaria;
    }

    /**
     * @param valorAluguelDiaria the valorAluguelDiaria to set
     */
    public void setValorAluguelDiaria(double valorAluguelDiaria) {
        this.valorAluguelDiaria = valorAluguelDiaria;
    }

    /**
     * @return the valorAluguelSemana
     */
    public double getValorAluguelSemana() {
        return valorAluguelSemana;
    }

    /**
     * @param valorAluguelSemana the valorAluguelSemana to set
     */
    public void setValorAluguelSemana(double valorAluguelSemana) {
        this.valorAluguelSemana = valorAluguelSemana;
    }

    /**
     * @return the status
     */
    public char getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(char status) {
        this.status = status;
    }
}
    
