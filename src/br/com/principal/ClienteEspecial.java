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
public class ClienteEspecial extends Cliente {
    
    private double valorDesconto;
    private double valorKmExtra;

    /**
     * @return the valorDesconto
     */
    public double getValorDesconto() {
        return valorDesconto;
    }

    /**
     * @param valorDesconto the valorDesconto to set
     */
    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    /**
     * @return the valorKmExtra
     */
    public double getValorKmExtra() {
        return valorKmExtra;
    }

    /**
     * @param valorKmExtra the valorKmExtra to set
     */
    public void setValorKmExtra(double valorKmExtra) {
        this.valorKmExtra = valorKmExtra;
    }
    
    
    
}
