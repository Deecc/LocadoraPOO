/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.ui;

import br.com.locaja.dao.ClienteDAO;
import br.com.locaja.principal.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Décio
 */
public class Cadastro_cli extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_cli
     */
    public Cadastro_cli() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPCadastro_Cliente = new javax.swing.JPanel();
        jLabel_Nome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jText_nome = new javax.swing.JTextField();
        jFor_tel = new javax.swing.JFormattedTextField();
        jText_endereco = new javax.swing.JTextField();
        jText_numero = new javax.swing.JTextField();
        jText_complemento = new javax.swing.JTextField();
        jText_cep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScroll_referencia = new javax.swing.JScrollPane();
        jTextA_referencia = new javax.swing.JTextArea();
        jText_cpf = new javax.swing.JTextField();
        jText_cnh = new javax.swing.JTextField();
        jText_rg = new javax.swing.JTextField();
        jText_ddd = new javax.swing.JTextField();
        BtCadastrar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_email = new javax.swing.JTextField();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPCadastro_Cliente.setEnabled(false);

        jLabel_Nome.setText("Nome: ");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("CNH:");

        jLabel5.setText("Endereco:");

        jLabel6.setText("CEP:");

        jLabel7.setText("Numero:");

        jLabel8.setText("Telefone:");

        jLabel9.setText("Complemento:");

        jText_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nomeActionPerformed(evt);
            }
        });

        jFor_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFor_telActionPerformed(evt);
            }
        });

        jText_endereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jText_complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_complementoActionPerformed(evt);
            }
        });

        jText_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cepActionPerformed(evt);
            }
        });

        jLabel10.setText("Endereço");

        jLabel11.setText("Dados");

        jLabel12.setText("Referencia:");

        jTextA_referencia.setColumns(20);
        jTextA_referencia.setRows(5);
        jScroll_referencia.setViewportView(jTextA_referencia);

        jText_ddd.setText("DDD");

        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("E-mail:");

        jText_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_emailActionPerformed(evt);
            }
        });

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPCadastro_ClienteLayout = new javax.swing.GroupLayout(JPCadastro_Cliente);
        JPCadastro_Cliente.setLayout(JPCadastro_ClienteLayout);
        JPCadastro_ClienteLayout.setHorizontalGroup(
            JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(BtCadastrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BtVoltar))
                        .addComponent(jLabel11)
                        .addComponent(jLabel3)
                        .addComponent(jLabel_Nome)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10)
                        .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jText_endereco))
                                .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jText_email, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                        .addComponent(jText_cnh)
                                        .addComponent(jText_cpf)
                                        .addComponent(jText_nome)
                                        .addComponent(jText_rg, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFor_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                            .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel12))
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                                    .addComponent(jText_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jText_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScroll_referencia))))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPCadastro_ClienteLayout.setVerticalGroup(
            JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nome)
                    .addComponent(jText_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jFor_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jText_cnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jText_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jText_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jText_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jText_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScroll_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastrar)
                    .addComponent(BtLimpar)
                    .addComponent(BtVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPCadastro_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPCadastro_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jText_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nomeActionPerformed

    private void jFor_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFor_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFor_telActionPerformed

    private void jText_complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_complementoActionPerformed

    private void jText_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cepActionPerformed

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastrarActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        cli.setNome(jText_nome.getText());
        cli.setCpf(jText_cpf.getText());
        cli.setEndereco(jText_endereco.getText());
        cli.setCnh(jText_cnh.getText());
        cli.setEmail(jText_email.getText());
        cli.setRg(jText_rg.getText());
        cli.setNumero(jText_numero.getText());
        cli.setComplemento(jText_complemento.getText());
        cli.setCEP(jText_cep.getText());
        cli.setReferencia(jTextA_referencia.getText());
        cli.setDdd(jText_ddd.getText());
        cli.setTelefone(jFor_tel.getText());

        if (jText_nome.getText().isEmpty() || jText_cpf.getText().isEmpty() || jText_endereco.getText().isEmpty() ||
            jText_numero.getText().isEmpty() || jText_rg.getText().isEmpty() || jText_email.getText().isEmpty() ||
            jText_cnh.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Os Campos com * devem ser preenchidos!");
        } else {
            ClienteDAO dao = new ClienteDAO();
            dao.Insere(cli);
            JOptionPane.showMessageDialog(null, "Cliente "+jText_nome.getText()+" cadastrado com sucesso!");
        }
        jText_nome.setText("");
        jTextA_referencia.setText("");
        jFor_tel.setText("");
        jText_cep.setText("");
        jText_complemento.setText("");
        jText_cnh.setText("");
        jText_cpf.setText("");
        jText_ddd.setText("");
        jText_email.setText("");
        jText_rg.setText("");
        jText_endereco.setText("");
        jText_numero.setText("");

    }//GEN-LAST:event_BtCadastrarActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Isso apagará os dados do cadastro não salvos, confirma a ação?");
        if (resp == 0) {
            jText_nome.setText("");
            jTextA_referencia.setText("");
            jFor_tel.setText("");
            jText_cep.setText("");
            jText_complemento.setText("");
            jText_cnh.setText("");
            jText_cpf.setText("");
            jText_ddd.setText("");
            jText_email.setText("");
            jText_rg.setText("");
            jText_endereco.setText("");
            jText_numero.setText("");
        }
    }//GEN-LAST:event_BtLimparActionPerformed

    private void jText_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_emailActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "Ao fechar dados não salvos no cadastro serão perdidos, salve antes de sair. Deseja sair?");
        if (resp == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_BtVoltarActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JPanel JPCadastro_Cliente;
    private javax.swing.JFormattedTextField jFor_tel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Nome;
    private javax.swing.JScrollPane jScroll_referencia;
    private javax.swing.JTextArea jTextA_referencia;
    private javax.swing.JTextField jText_cep;
    private javax.swing.JTextField jText_cnh;
    private javax.swing.JTextField jText_complemento;
    private javax.swing.JTextField jText_cpf;
    private javax.swing.JTextField jText_ddd;
    private javax.swing.JTextField jText_email;
    private javax.swing.JTextField jText_endereco;
    private javax.swing.JTextField jText_nome;
    private javax.swing.JTextField jText_numero;
    private javax.swing.JTextField jText_rg;
    // End of variables declaration//GEN-END:variables
}