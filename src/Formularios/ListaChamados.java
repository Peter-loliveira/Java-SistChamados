/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Formularios.CadAtendimentos;
import Classes.DbDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peter
 */
public class ListaChamados extends javax.swing.JFrame {

    /**
     * Creates new form ListaChamados
     */
    public ListaChamados() {
        initComponents();
    }

    DbDao Dao = new DbDao();
    CadAtendimentos Atendimentos = new CadAtendimentos();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbChamados = new javax.swing.JTable();
        cbSetor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btIrOS = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de OS do Sistema");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OS", "Cliente", "Defeito", "Data de Abertura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbChamados);

        cbSetor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS os chamados ABERTOS", "Gerência", "Financeiro", "Técnico", "FECHADOS" }));
        cbSetor.setToolTipText("");
        cbSetor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), null));
        cbSetor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSetorItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Selecione o setor desejado");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lista.png"))); // NOI18N
        jLabel2.setText("Listagem de Chamados por Setor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btIrOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IrOs2.png"))); // NOI18N
        btIrOS.setText("Ir para OS");
        btIrOS.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), null));
        btIrOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrOSActionPerformed(evt);
            }
        });

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 153, 255), null));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btIrOS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btIrOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Determina a largura das colunas da tabela de clientes
        tbChamados.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbChamados.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbChamados.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbChamados.getColumnModel().getColumn(3).setPreferredWidth(100);
        ListaOS(String.valueOf(cbSetor.getSelectedIndex()));
    }//GEN-LAST:event_formWindowActivated

    private void cbSetorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSetorItemStateChanged
        ListaOS(String.valueOf(cbSetor.getSelectedIndex()));
    }//GEN-LAST:event_cbSetorItemStateChanged

    private void btIrOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrOSActionPerformed
        //Pega o nr do chamado da linha selecionada
        int LinhaTabelaCliente = tbChamados.getSelectedRow();
        String OS = tbChamados.getValueAt(LinhaTabelaCliente, 0).toString();
        
        //torna a tela de Atendimento visivel
        //Com a OS selecionada já preenida e o metodo de buscar os já executado
        Atendimentos.setVisible(true);
        Atendimentos.PreencheOS(OS);
        
        dispose();
    }//GEN-LAST:event_btIrOSActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaChamados().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIrOS;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbChamados;
    // End of variables declaration//GEN-END:variables

    //Lista as OS no sistma de acordo com a opção selecionada e preenche a tebela;
    private void ListaOS(String Status) {
//      JOptionPane.showMessageDialog(this, Status);
        Dao.conectar();
        Connection Conn = Dao.getConn();

        String FinalSQL;

        //Determina o valor que será incluino no FINAL do sql com a veriavelFinalSQL
        if (Status.equals("0")) {
            FinalSQL = "AND chamados.Status <> 4"; // 0 Setá a opção TODOS e deverá APENAS mostrar os chamado ABERTOS, independete do setor
        } else {
            FinalSQL = "AND chamados.Status = " + Status;// Qualqeur outro valor de Status 
        }

        String sql = "SELECT "
                + "chamados.id,  clientes.nome , chamados.defeito, chamados.DataAbertura "
                + "FROM  chamados, clientes "
                + "WHERE chamados.CodCliente = clientes.id " + FinalSQL;

        DefaultTableModel TabelaChamados = (DefaultTableModel) tbChamados.getModel();
        TabelaChamados.setNumRows(0);

        try {
            PreparedStatement ListaChamados = Conn.prepareStatement(sql);
            ResultSet Lista = ListaChamados.executeQuery();
            //Preenche a tabela
            while (Lista.next()) {
                String[] linhaTabela = {
                    Lista.getString("id"),
                    Lista.getString("nome"),
                    Lista.getString("defeito"),
                    Lista.getString("DataAbertura")
                };
                TabelaChamados.addRow(linhaTabela);
            }
            Conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possivel listar os Chamados");
        }
        Dao.Desconectar();
    }
}
