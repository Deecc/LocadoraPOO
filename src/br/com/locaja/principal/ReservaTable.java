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
public class ReservaTable extends AbstractTableModel {
    
   
    private final int COD_ALUGUEL=0;
    private final int DATA_INICIO=1;
    private final int DATA_FIM=2;
    private final int KM_INICIAL=3;
    private final int CLIENTE=4;
    private final int VEICULO=5;
    
   

    
    private final String colunas[]={"Cod. Reserva:", "Data Inical:","Data Final:","Km Inicial:","Cliente","Veiculo"};
    private final List<Aluguel> dados;
     
    public ReservaTable (List<Aluguel> dados) {
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
        Aluguel alu = dados.get(rowIndex);
         
        //retorna o valor da coluna
        switch (columnIndex) {
        case COD_ALUGUEL:
            return alu.getCod_aluguel();
        case DATA_INICIO:
            return alu.getData_inicio();
       case DATA_FIM:
            return alu.getData_fim();
        case KM_INICIAL:
            return alu.getKm_inicial();
        case CLIENTE:
            return alu.getCod_cli();
        case VEICULO:
            return alu.getCod_car();
       
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
    public Aluguel getValue(int rowIndex){
        return dados.get(rowIndex);
    }
   
}
