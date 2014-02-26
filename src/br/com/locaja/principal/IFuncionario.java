/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.principal;

/**
 *
 * @author x05930906912
 */
public interface IFuncionario {
    
    void alteraSalario(double salario);
    void alteraFuncao(int cargo);
    void cadastraCliente(String nome,String cpf, String endereco,String telefone,
            int rg, String contato, int cnh);
    void cadastraCarro(String modelo,char categoria, int ano, int chassis ,int km);
    void geraDesconto();
}
