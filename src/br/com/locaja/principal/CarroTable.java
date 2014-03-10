/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.principal;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Décio
 */
public class CarroTable extends AbstractTableModel {
    
   
    private final int COD_CARRO=0;
    private final int MODELO=1;
    private final int CATEGORIA=2;
    private final int ANO=3;
    private final int CHASSIS=4;
    private final int KM=5;
    private final int STATUS=6;
    private final int VALOR_DIARIA=7;
    
   
    
    private final String colunas[]={"Cod. Carro:", "Modelo:","Categoria:","Ano:","Chassis","KM", "Status", "Valor Diaria"};
    private final List<Carro> dados;
     
    public CarroTable (List<Carro> dados) {
         this.dados=dados;
    }

    @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carro car = dados.get(rowIndex);
         
        //retorna o valor da coluna
        switch (columnIndex) {
        case COD_CARRO:
            return car.getCod_carro();
        case MODELO:
            return car.getModelo();
       case CATEGORIA:
            return car.getCategoria();
        case ANO:
            return car.getAno();
        case CHASSIS:
            return car.getChassis();
        case KM:
            return car.getKm();
        case STATUS :
            return car.getStatus();
        case VALOR_DIARIA:
            return car.getValorDiaria();
        default:
            throw new IndexOutOfBoundsException("Coluna Inválida!!!");
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    /**
     *
     * @param rowIndex
     * @return
     */
    public Carro getValue(int rowIndex){
        return dados.get(rowIndex);
    }
   
}
