/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.principal;

import java.util.Date;


/**
 *
 * @author Décio
 */
public class Aluguel implements ICarro{
    
    private Date dataAluguel;
    
    
    
    /**
     * @return the dataAluguel
     */
    public Date getDataAluguel() {
        return dataAluguel;
    }

    /**
     * @param dataAluguel the dataAluguel to set
     */
    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    @Override
    public void valorDiaria(double valor, int dias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valorSemana(double valor, int semanas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valorMes(double valor, int mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kmExtra(double valor, int kmInicial, int kmFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gasTanque(double valor, int litros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean verificaDisponibilidade(char status){
        return status != 'l';
    }
    
    @Override
    public char alteraDisponibilidade(char status){
        if (status == 'l'){
            return status = 'd';
        }
        return status = 'l';
    }
    
}
