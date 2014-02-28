/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.interfaces;

/**
 *
 * @author x05930906912
 */
public interface ICarro {

    /**
     *
     * @param valor
     * @param dias
     */
    public void valorDiaria(double valor, int dias);

    /**
     *
     * @param valor
     * @param semanas
     */
    public void valorSemana(double valor, int semanas);

    /**
     *
     * @param valor
     * @param mes
     */
    public void valorMes(double valor, int mes);

    /**
     *
     * @param valor
     * @param kmInicial
     * @param kmFinal
     */
    public void kmExtra(double valor, int kmInicial, int kmFinal);

    /**
     *
     * @param valor
     * @param litros
     */
    public void gasTanque(double valor, int litros);
    
    /**
     *
     * @param status
     * @return
     */
    public boolean verificaDisponibilidade(char status);

    /**
     *
     * @param status
     * @return
     */
    public char alteraDisponibilidade(char status);
    
}
