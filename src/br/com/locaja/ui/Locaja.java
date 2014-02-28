/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.locaja.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author x05930906912
 */
public class Locaja extends javax.swing.JFrame {

    /**
     * Creates new form JFmClientes
     */
    public Locaja() {
        initComponents();
        JPCadastro_Cliente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        BtCadastro = new javax.swing.JButton();
        BtConsulta = new javax.swing.JButton();
        BtReserva = new javax.swing.JButton();
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
        BtCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locajá - Locadora de Veículos");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        BtCadastro.setText("Cadastro");
        BtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastroActionPerformed(evt);
            }
        });

        BtConsulta.setText("Consulta");
        BtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultaActionPerformed(evt);
            }
        });

        BtReserva.setText("Reserva");

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

        BtCancelar.setText("Cancelar");

        javax.swing.GroupLayout JPCadastro_ClienteLayout = new javax.swing.GroupLayout(JPCadastro_Cliente);
        JPCadastro_Cliente.setLayout(JPCadastro_ClienteLayout);
        JPCadastro_ClienteLayout.setHorizontalGroup(
            JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BtCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtCancelar))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_cnh)
                                    .addComponent(jText_cpf)
                                    .addComponent(jText_nome)
                                    .addComponent(jText_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jText_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFor_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPCadastro_ClienteLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jText_endereco))))
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
                .addGap(35, 35, 35)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(JPCadastro_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastrar)
                    .addComponent(BtCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(BtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 241, Short.MAX_VALUE))
                    .addComponent(JPCadastro_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastro)
                    .addComponent(BtConsulta)
                    .addComponent(BtReserva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPCadastro_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jLayeredPane1.setLayer(BtCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BtConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BtReserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(JPCadastro_Cliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Novo");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salvar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
       int resp = JOptionPane.showConfirmDialog(null,"Deseja realmente sair?");
       if(resp == 0)
           System.exit(DISPOSE_ON_CLOSE);
       
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void BtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastroActionPerformed
        // TODO add your handling code here:
        JPCadastro_Cliente.setVisible(true);
        
    }//GEN-LAST:event_BtCadastroActionPerformed

    private void jText_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cepActionPerformed

    private void jText_complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_complementoActionPerformed

    private void jText_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nomeActionPerformed

    private void BtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultaActionPerformed
        // TODO add your handling code here:
       
       
        
            
        
        
    }//GEN-LAST:event_BtConsultaActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtCadastro;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtConsulta;
    private javax.swing.JButton BtReserva;
    private javax.swing.JPanel JPCadastro_Cliente;
    private javax.swing.JFormattedTextField jFor_tel;
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScroll_referencia;
    private javax.swing.JTextArea jTextA_referencia;
    private javax.swing.JTextField jText_cep;
    private javax.swing.JTextField jText_cnh;
    private javax.swing.JTextField jText_complemento;
    private javax.swing.JTextField jText_cpf;
    private javax.swing.JTextField jText_ddd;
    private javax.swing.JTextField jText_endereco;
    private javax.swing.JTextField jText_nome;
    private javax.swing.JTextField jText_numero;
    private javax.swing.JTextField jText_rg;
    // End of variables declaration//GEN-END:variables
}

