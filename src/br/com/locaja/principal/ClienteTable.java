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
public class ClienteTable extends AbstractTableModel {
    
   
    private final int COD_CLIENTE=0;
    private final int NOME=1;
    private final int CPF=2;
    private final int RG=3;
    private final int CNH=4;
    private final int EMAIL=5;
    private final int DDD=6;
    private final int TELEFONE=7;
    private final int ENDERECO=8;
    private final int NUMERO=9;
    private final int CEP=10;
    private final int COMPLEMENTO=11;
    private final int REFERENCIA=12;
    
     
    private final String colunas[]={"Cod. Cliente:", "Nome:","CPF:","RG:","CNH:","Email:","DDD:","Telefone", "Endereco", "Numero", "CEP", "Complemento", "Referencia"};
    private final List<Cliente> dados;
     
    public ClienteTable (List<Cliente> dados) {
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
        Cliente cli =dados.get(rowIndex);
         
        //retorna o valor da coluna
        switch (columnIndex) {
        case COD_CLIENTE:
            return cli.getCod_cliente();
        case NOME:
            return cli.getNome();
       case CPF:
            return cli.getCpf();
        case RG:
            return cli.getRg();
        case CNH:
            return cli.getCnh();
        case EMAIL:
            return cli.getEmail();
        case DDD :
            return cli.getDdd();
        case TELEFONE:
            return cli.getTelefone();
        case ENDERECO:
            return cli.getEndereco();
        case NUMERO:
            return cli.getNumero();
        case CEP:
            return cli.getCEP();
        case COMPLEMENTO:
            return cli.getComplemento();
        case REFERENCIA:
            return cli.getReferencia();
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
    public Cliente getValue(int rowIndex){
        return dados.get(rowIndex);
    }
   
}
