/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.DbDao;
import Classes.ProcedimentosAuxiliares;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peter - Carla - Peter
 */
public class CadAtendimentos extends javax.swing.JFrame {

    /**
     * Creates new form CadAtendimentos
     */
    public CadAtendimentos() {
        initComponents();
    }

// <editor-fold defaultstate="collapsed" desc="Instanciamento das Classes">                          
    DbDao Dao = new DbDao();
    ProcedimentosAuxiliares Procedimentos = new ProcedimentosAuxiliares();
    TelaPrincipal telaPrincipal = new TelaPrincipal();
// </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inpNovoAtendimento = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbSetores = new javax.swing.JComboBox<>();
        btSalvarAtendimento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inpEquipamento = new javax.swing.JTextField();
        inpOS = new javax.swing.JTextField();
        inpCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inpDefeito = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inpSerial = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAtendimentos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        inpValorOrcamento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cxbFecharChamado = new javax.swing.JCheckBox();
        lbDataFechamento = new javax.swing.JLabel();
        inpDataFechamento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Histórico ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        inpNovoAtendimento.setColumns(20);
        inpNovoAtendimento.setRows(5);
        jScrollPane4.setViewportView(inpNovoAtendimento);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Atendimento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Setor:");

        cbSetores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerencial", "Financeiro", "Tecnico" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(cbSetores, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbSetores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btSalvarAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar2.png"))); // NOI18N
        btSalvarAtendimento.setText("Salvar");
        btSalvarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAtendimentoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Chamados ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("OS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Equipamento");

        inpEquipamento.setEditable(false);
        inpEquipamento.setBackground(new java.awt.Color(233, 233, 233));

        inpOS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inpOSFocusLost(evt);
            }
        });

        inpCliente.setEditable(false);
        inpCliente.setBackground(new java.awt.Color(233, 233, 233));

        inpDefeito.setEditable(false);
        inpDefeito.setBackground(new java.awt.Color(240, 240, 240));
        inpDefeito.setColumns(20);
        inpDefeito.setRows(5);
        inpDefeito.setFocusable(false);
        jScrollPane1.setViewportView(inpDefeito);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Defeito");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Serial");

        inpSerial.setEditable(false);
        inpSerial.setBackground(new java.awt.Color(233, 233, 233));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inpOS, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inpEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inpSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(inpEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(inpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(inpOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inpSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Histórico ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbAtendimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Atendimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbAtendimentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Valor Orçamento");

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Atendente.png"))); // NOI18N
        jLabel11.setText("Atendimento OS (Ordem de Serviço)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(339, 339, 339))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        inpValorOrcamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inpValorOrcamentoFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cxbFecharChamado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cxbFecharChamado.setText("Fechar Chamado");
        cxbFecharChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cxbFecharChamadoMouseClicked(evt);
            }
        });

        lbDataFechamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDataFechamento.setText("Data Retirada");
        lbDataFechamento.setEnabled(false);

        try {
            inpDataFechamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inpDataFechamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inpDataFechamento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cxbFecharChamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lbDataFechamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpDataFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inpDataFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataFechamento)
                    .addComponent(cxbFecharChamado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(inpValorOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalvarAtendimento)
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvarAtendimento)
                    .addComponent(btVoltar)
                    .addComponent(inpValorOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inpOSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inpOSFocusLost
//        Verifica se algum valor foi digitado
        if (!inpOS.getText().equals("")) {
            String OS = inpOS.getText();
            BuscaOS(OS);
            PreencheTabela();
            VerificaStatusChamado();
            BuscaValorOrcamento();
            inpNovoAtendimento.requestFocus();
        }
    }//GEN-LAST:event_inpOSFocusLost

    private void btSalvarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAtendimentoActionPerformed
        SalvaAtendimento();
        AlterarStatusChamado();
        if (!inpValorOrcamento.getText().equals("")) {
            InsereValorOrcamento();
        }
    }//GEN-LAST:event_btSalvarAtendimentoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        tbAtendimentos.getColumnModel().getColumn(1).setPreferredWidth(800);
    }//GEN-LAST:event_formWindowActivated

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cxbFecharChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cxbFecharChamadoMouseClicked
        // TODO add your handling code here:
        if (cxbFecharChamado.isSelected()) {
            inpDataFechamento.setEnabled(true);
            lbDataFechamento.setEnabled(true);
            inpDataFechamento.setText(Procedimentos.DataAtual());
            
            inpDataFechamento.requestFocus();
            
        } else {
            inpDataFechamento.setEnabled(false);
            lbDataFechamento.setEnabled(false);
            inpDataFechamento.setText("");

        }
    }//GEN-LAST:event_cxbFecharChamadoMouseClicked

    private void inpValorOrcamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inpValorOrcamentoFocusLost


    }//GEN-LAST:event_inpValorOrcamentoFocusLost

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
            java.util.logging.Logger.getLogger(CadAtendimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAtendimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAtendimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAtendimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAtendimentos().setVisible(true);
            }
        });
    }
//<editor-fold defaultstate="collapsed" desc=" VARIAVEIS DE COMPONENTES LOCAIS ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarAtendimento;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbSetores;
    private javax.swing.JCheckBox cxbFecharChamado;
    private javax.swing.JTextField inpCliente;
    private javax.swing.JFormattedTextField inpDataFechamento;
    private javax.swing.JTextArea inpDefeito;
    private javax.swing.JTextField inpEquipamento;
    private javax.swing.JTextArea inpNovoAtendimento;
    private javax.swing.JTextField inpOS;
    private javax.swing.JTextField inpSerial;
    private javax.swing.JTextField inpValorOrcamento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbDataFechamento;
    private javax.swing.JTable tbAtendimentos;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

    private void BuscaOS(String OS) {
        Dao.conectar();
        Connection Conn = Dao.getConn();

        ResultSet DadosOS;
        ResultSet Dados;

        PreparedStatement stmt;

        try {
            //Captura TODOS os dados da OS
            String sql = "Select * from chamados where ID = " + OS;
            stmt = Conn.prepareStatement(sql);
            DadosOS = stmt.executeQuery();
            while (DadosOS.next()) {
                //Busca dos daso contidos nas OUTRAS tabelas usando 
                // as informações  DadosOS inseridas no DadosOS
                sql = "SELECT clientes.Nome, "
                        + "equipamentos.TipoEquip, "
                        + "equipamentos.Serial, "
                        + "chamados.Defeito "
                        + "FROM clientes, equipamentos, chamados "
                        + "WHERE clientes.ID = ? "
                        + "AND equipamentos.ID = ? "
                        + "AND chamados.ID = " + OS;

                stmt = Conn.prepareStatement(sql);

                String CodCliente = DadosOS.getString("CodCliente");
                String CodEquipamento = DadosOS.getString("CodEquip");

                stmt.setString(1, CodCliente);
                stmt.setString(2, CodEquipamento);

                Dados = stmt.executeQuery();
                while (Dados.next()) {
                    inpCliente.setText(Dados.getString("Nome"));
                    inpEquipamento.setText(Dados.getString("TipoEquip"));
                    inpSerial.setText(Dados.getString("Serial"));
                    inpDefeito.setText(Dados.getString("Defeito"));
                }
            }
        } catch (SQLException ex) {
//            Logger.getLogger(CadAtendimentos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "OS nao Localizada!");
        }

        Dao.Desconectar();
    }

    private void SalvaAtendimento() {
        int OS = Integer.parseInt(inpOS.getText());
        String Descricao = inpNovoAtendimento.getText();
        String DataAtual = Procedimentos.DataAtual();
        try {
            Dao.CreateAtendimentos(OS, Descricao, DataAtual);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar os dados!");
        }
        PreencheTabela();
        
        if (cxbFecharChamado.isSelected()) {
            FechaChamado();
        }
        inpNovoAtendimento.setText("");
    }

    private void PreencheTabela() {
        Dao.conectar();
        Connection conn = Dao.getConn();

        DefaultTableModel tabAtendimentos = (DefaultTableModel) tbAtendimentos.getModel();
        tabAtendimentos.setNumRows(0);

        String sql = "select * from atendimentos where CodChamado = " + inpOS.getText();
        try {
            PreparedStatement ResultadoAtendimentos = conn.prepareStatement(sql);
            ResultSet DadosAtendimentos = ResultadoAtendimentos.executeQuery();

            while (DadosAtendimentos.next()) {
                String[] Linha = {
                    DadosAtendimentos.getString("DataAtendimento"),
                    DadosAtendimentos.getString("Descricao")
                };
                tabAtendimentos.addRow(Linha);
                tbAtendimentos.setRowSelectionInterval(0, 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadAtendimentos.class.getName()).log(Level.SEVERE, null, ex);
        }

        Dao.Desconectar();
    }

    private void AlterarStatusChamado() {
        Dao.conectar();
        Connection Conn = Dao.getConn();

        String sql = "UPDATE chamados SET `status` = ? WHERE id = ?";

        String OS = inpOS.getText();
        String StatusOS = String.valueOf(cbSetores.getSelectedIndex() + 1);
        try {
            PreparedStatement UpdateChamado = Conn.prepareStatement(sql);
            UpdateChamado.setString(1, StatusOS);
            UpdateChamado.setString(2, OS);
            UpdateChamado.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Não goi possivel encaminhar a OS para o setor desejado!");
        }

        Dao.Desconectar();
    }

    private void VerificaStatusChamado() {
//        Aproveito para informar no cbSetores em que situação está o chamado
        Dao.conectar();
        Connection conn = Dao.getConn();
        String sql = "select `status` from chamados where ID = " + inpOS.getText();
        try {
            PreparedStatement ChecaStatusChamado = conn.prepareStatement(sql);
            ResultSet StatosOS = ChecaStatusChamado.executeQuery();
            while (StatosOS.next()) {
                int StatusChamado = Integer.parseInt(StatosOS.getString("status")) - 1;
                cbSetores.setSelectedIndex(StatusChamado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadAtendimentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dao.Desconectar();
    }

    private void FechaChamado() {
        Dao.conectar();
        Connection Conn = Dao.getConn();
        
        String Data = inpDataFechamento.getText();
        
        String sql = "UPDATE chamados SET DataFechamento = " 
                + "\"" + Data + "\""
                +" WHERE ID = " + inpOS.getText();
        
        try {
            PreparedStatement InsereDataFechamento = Conn.prepareStatement(sql);
            InsereDataFechamento.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir a data de Fechamento!");
        }
        
        Dao.Desconectar();

    }

    private void InsereValorOrcamento() {

        Dao.conectar();
        Connection Conn = Dao.getConn();

        float Valor = Float.parseFloat(inpValorOrcamento.getText());
        String sql = "UPDATE `chamados` SET Valor = "
                + Valor
                + " WHERE ID = " + inpOS.getText();
        PreparedStatement InsereOrcamento;
        try {
            InsereOrcamento = Conn.prepareStatement(sql);
            InsereOrcamento.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possivel inserir o valor do orçamento na OS!");
        }

        Dao.Desconectar();
    }

    private void BuscaValorOrcamento() {
        Dao.conectar();
        Connection Conn = Dao.getConn();

        String Sql = "Select Valor from chamados where ID = " + inpOS.getText();
        try {
            PreparedStatement BuscaValor = Conn.prepareStatement(Sql);
            ResultSet Valor = BuscaValor.executeQuery();
            while(Valor.next()){
                inpValorOrcamento.setText(Valor.getString("Valor"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CadAtendimentos.class.getName()).log(Level.SEVERE, null, ex);
        }

        Dao.Desconectar();
    }

}
