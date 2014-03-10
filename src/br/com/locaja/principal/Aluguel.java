/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.principal;



import java.sql.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author Décio
 */
public class Aluguel {
    
    private int cod_aluguel;
    private Date data_inicio;
    private Date data_fim;
    private int km_inicial;
    private int cod_cli;
    private int cod_car;
    private double valor_total;
    private int dias;
    

    /**
     * @return the data_inicio
     */
    public Date getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public Date getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the km_inicial
     */
    public int getKm_inicial() {
        return km_inicial;
    }

    /**
     * @param km_inicial the km_inicial to set
     */
    public void setKm_inicial(int km_inicial) {
        this.km_inicial = km_inicial;
    }

    /**
     * @return the cod_aluguel
     */
    public int getCod_aluguel() {
        return cod_aluguel;
    }

    /**
     * @param cod_aluguel the cod_aluguel to set
     */
    public void setCod_aluguel(int cod_aluguel) {
        this.cod_aluguel = cod_aluguel;
    }

    /**
     * @return the cod_cli
     */
    public int getCod_cli() {
        return cod_cli;
    }

    /**
     * @param cod_cli the cod_cli to set
     */
    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    /**
     * @return the cod_car
     */
    public int getCod_car() {
        return cod_car;
    }

    /**
     * @param cod_car the cod_car to set
     */
    public void setCod_car(int cod_car) {
        this.cod_car = cod_car;
    }
    
    /**
     * @return the valor_total
     */
    public double getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     * @return 
     */
    public int setDias(Date dias) {
       return this.dias = dataDiff(this.data_fim, this.data_inicio);
      }  
    
     public double CalcularPreco(Carro carro){
        this.valor_total = this.dias * carro.valorDiaria() * carro.kmExtra();
        return getValor_total();
    }
    
    public static int dataDiff(java.util.Date data_inicio, java.util.Date data_fim){  
  
     GregorianCalendar startTime = new GregorianCalendar();  
     GregorianCalendar endTime = new GregorianCalendar();  
       
     GregorianCalendar curTime = new GregorianCalendar();  
     GregorianCalendar baseTime = new GregorianCalendar();  
  
     startTime.setTime(data_inicio);  
     endTime.setTime(data_fim);  
       
     int dif_multiplier = 1;  
       
     // Verifica a ordem de inicio das datas  
     if( data_inicio.compareTo(data_fim ) < 0 ){  
         baseTime.setTime(data_fim);  
         curTime.setTime(data_inicio);  
         dif_multiplier = 1;  
     }else{  
         baseTime.setTime(data_inicio);  
         curTime.setTime(data_fim);  
         dif_multiplier = -1;  
     }  
       
     
     int result_dias = 0;  
  
    
     // Retirna a diferenca de dias do total dos meses  
     result_dias += (endTime.get(GregorianCalendar.DAY_OF_MONTH) - startTime.get(GregorianCalendar.DAY_OF_MONTH));  
       
     return result_dias;  
}
}
