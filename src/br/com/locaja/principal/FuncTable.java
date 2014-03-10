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
public class FuncTable extends AbstractTableModel {
    
   
    private final int COD_FUNCIONARIO=0;
    private final int NOME=1;
    private final int CPF=2;
    private final int EMAIL=3;
    private final int MATRICULA=4;
    private final int CARGO=5;
    private final int SALARIO=6;
    
    private final String colunas[]={"Cod. Funcionario:", "Nome:","CPF:","Email:","Matricula","Cargo", "Salario"};
    private final List<Funcionario> dados;
     
    public FuncTable (List<Funcionario> dados) {
        //seto os dados no construtor
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
        Funcionario func = dados.get(rowIndex);
         
        //retorna o valor da coluna
        switch (columnIndex) {
        case COD_FUNCIONARIO:
            return func.getCod_func();
        case NOME:
            return func.getNome();
       case CPF:
            return func.getCpf();
        case EMAIL:
            return func.getEmail();
        case MATRICULA:
            return func.getMatricula();
        case CARGO:
            return func.getCargo();
        case SALARIO :
            return func.getSalario();
       
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
    public Funcionario getValue(int rowIndex){
        return dados.get(rowIndex);
    }
   
}
