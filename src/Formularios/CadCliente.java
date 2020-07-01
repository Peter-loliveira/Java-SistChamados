/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.DbDao;

import Classes.Buscas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor
 * @Coauthor peter
 */
public class CadCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadCliente
     */
    public CadCliente() {
        initComponents();
    }

    DbDao Dao = new DbDao();
    Buscas Buscas = new Buscas();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jTextTel = new javax.swing.JFormattedTextField();
        jTextNome = new javax.swing.JTextField();
        jTextNasc = new javax.swing.JFormattedTextField();
        jTextEndereço = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jTel = new javax.swing.JLabel();
        jNasc = new javax.swing.JLabel();
        jEnderço = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTel1 = new javax.swing.JLabel();
        botaoMasculino = new javax.swing.JRadioButton();
        botaoFeminino = new javax.swing.JRadioButton();
        jBotaoSalvar = new javax.swing.JButton();
        jBotaoExcluir = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jEnderço1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEquipamentos = new javax.swing.JTable();
        btAddEquipamento = new javax.swing.JButton();
        jEnderço2 = new javax.swing.JLabel();
        jEnderço3 = new javax.swing.JLabel();
        inpMarcas = new javax.swing.JTextField();
        inpSerial = new javax.swing.JTextField();
        jEnderço4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        InpTipoEquipamento = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes e equipamentos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextTel.setBackground(new java.awt.Color(240, 240, 240));
        try {
            jTextTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextNome.setBackground(new java.awt.Color(240, 240, 240));
        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNomeKeyReleased(evt);
            }
        });

        jTextNasc.setBackground(new java.awt.Color(240, 240, 240));
        try {
            jTextNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextEndereço.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes / Equipamentos");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jNome.setText("Nome");

        jTel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTel.setText("Telefone");

        jNasc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jNasc.setText("Nascimento");

        jEnderço.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jEnderço.setText("Endereço");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTel1.setText("Sexo:");
        jPanel1.add(jTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        bgSexo.add(botaoMasculino);
        botaoMasculino.setSelected(true);
        botaoMasculino.setText("M");
        jPanel1.add(botaoMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, -1));

        bgSexo.add(botaoFeminino);
        botaoFeminino.setText("F");
        jPanel1.add(botaoFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, -1));

        jBotaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBotaoSalvar.setText("Salvar Novo");
        jBotaoSalvar.setPreferredSize(new java.awt.Dimension(150, 23));
        jBotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSalvarActionPerformed(evt);
            }
        });

        jBotaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBotaoExcluir.setText("Excluir");
        jBotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluirActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jTabela.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.setPreferredSize(null);
        jTabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTabela.getTableHeader().setReorderingAllowed(false);
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabela);

        jEnderço1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEnderço1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEnderço1.setText("Lista de Equipamentos:");

        tbEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Marca", "Serial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEquipamentos);

        btAddEquipamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAddEquipamento.setText("Salvar Equipamento");
        btAddEquipamento.setToolTipText("Adiciona um novo Equipamento");
        btAddEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddEquipamentoActionPerformed(evt);
            }
        });

        jEnderço2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEnderço2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jEnderço2.setText("Tipo");

        jEnderço3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEnderço3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jEnderço3.setText("Marca");

        inpMarcas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        inpSerial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jEnderço4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEnderço4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jEnderço4.setText("Serial");

        InpTipoEquipamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jEnderço2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(InpTipoEquipamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEnderço3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEnderço4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inpSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btAddEquipamento)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jEnderço1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEnderço)
                            .addComponent(jNome))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jNasc)
                                .addGap(10, 10, 10)
                                .addComponent(jTextNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jTel)
                                .addGap(10, 10, 10)
                                .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotaoExcluir)
                        .addGap(287, 287, 287)
                        .addComponent(btVoltar)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNome)
                            .addComponent(jNasc)
                            .addComponent(jTel))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jEnderço))
                    .addComponent(jTextEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoExcluir)
                    .addComponent(btVoltar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btEditar)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEnderço1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jEnderço3)
                                    .addComponent(jEnderço2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(inpMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InpTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jEnderço4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inpSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddEquipamento))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // TODO add your handling code here:
    private void jBotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSalvarActionPerformed
        // Verifica qual o texto do botão salvar e muda a SQL e o 
        // procedimento que será executados de acordo com o texto 
        if (jBotaoSalvar.getText().equals("Salvar Alterações")) {
            String Nome = jTextNome.getText();
            String DataNasc = jTextNasc.getText();
            String Cel = jTextTel.getText();
            String Endereco = jTextEndereço.getText();
            String Genero;
            if (botaoMasculino.isSelected()) {
                Genero = "M";
            } else {
                Genero = "F";
            }

            Dao.UpdateCliente(Nome, DataNasc, Cel, Endereco, Genero, SelecionaCodCliente());
            jBotaoSalvar.setText("Salvar Novo");
            ApagaCampoClientes();

        } else {

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                        + "dbchamados?", "root", "");
                String sql = "insert into clientes(Nome,DataNasc,Cel,Endereco,Genero"
                        + ") values (?,?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, jTextNome.getText());
                stmt.setString(2, jTextNasc.getText());
                stmt.setString(3, jTextTel.getText());
                stmt.setString(4, jTextEndereço.getText());

                // Determina qual genero sera gravado;
                if (botaoMasculino.isSelected()) {
                    stmt.setString(5, "M");
                } else {
                    stmt.setString(5, "F");
                }
                stmt.execute();
                stmt.close();
                connection.close();

                ApagaCampoClientes();

                JOptionPane.showMessageDialog(this, "Cliente Cadastrado com Sucesso!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        PesquisaCliente();
        PesquisaEquipamentos();
    }//GEN-LAST:event_jBotaoSalvarActionPerformed

    private void jBotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluirActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "dbchamados", "root", "");
            String sql = "delete from Clientes where ID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            int linha = this.jTabela.getSelectedRow();
            stmt.setInt(1, Integer.parseInt(jTabela.getValueAt(linha, 0).toString()));
            stmt.execute();
            stmt.close();
            con.close();
            DefaultTableModel model = (DefaultTableModel) jTabela.getModel();
            model.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Cliente Excluído com Sucesso!");
//            this.setClosable(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jBotaoExcluirActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTabela.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTabela.getColumnModel().getColumn(1).setPreferredWidth(350);
        jTabela.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbEquipamentos.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbEquipamentos.getColumnModel().getColumn(1).setPreferredWidth(500);
        PesquisaCliente();
        PesquisaEquipamentos();
    }//GEN-LAST:event_formWindowOpened

    private void jTextNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyReleased
        if (jBotaoSalvar.getText().equals("Salvar Novo")) {
            PesquisaCliente();
            PesquisaEquipamentos();

        }
    }//GEN-LAST:event_jTextNomeKeyReleased

    private void btAddEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddEquipamentoActionPerformed
        Dao.conectar();

//      Captura Codigo e nome do cliente selecioando
        int LinhaSelecioanda = jTabela.getSelectedRow();
        int CodCli = Integer.parseInt(jTabela.getValueAt(LinhaSelecioanda, 0).toString());
        String NomeCli = jTabela.getValueAt(LinhaSelecioanda, 1).toString();
        try {
            Dao.CreateEquipamentos(CodCli, InpTipoEquipamento.getText(), inpSerial.getText(), inpMarcas.getText());
            JOptionPane.showMessageDialog(this, "Edquipamento associado à " + NomeCli);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possivel Adicooar esse equipamento.");
        }
        PesquisaEquipamentos();
        ApagaCampoEquipamentos();
    }//GEN-LAST:event_btAddEquipamentoActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        PesquisaEquipamentos();
    }//GEN-LAST:event_jTabelaMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT Nome, DataNasc, Cel, Endereco, Genero FROM clientes WHERE ID = " + SelecionaCodCliente();
        Dao.conectar();
        Connection conn = Dao.getConn();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet PesquisaCliente = stmt.executeQuery();
            while (PesquisaCliente.next()) {
                String[] DadosCliente = {
                    PesquisaCliente.getString("Nome"),
                    PesquisaCliente.getString("DataNasc"),
                    PesquisaCliente.getString("Cel"),
                    PesquisaCliente.getString("Endereco"),
                    PesquisaCliente.getString("Genero")
                };
                //            JOptionPane.showMessageDialog(this, DadosCliente);
                jTextNome.setText(DadosCliente[0]);
                jTextNasc.setText(DadosCliente[1]);
                jTextTel.setText(DadosCliente[2]);
                jTextEndereço.setText(DadosCliente[3]);
                jBotaoSalvar.setText("Salvar Alterações");
                if (DadosCliente[4].equals("M")) {
                    botaoMasculino.setSelected(true);
//                    botaoFeminino.setSelected(false);
                } else if (DadosCliente[4].equals("F")) {
//                    botaoMasculino.setSelected(false);
                    botaoFeminino.setSelected(true);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dao.Desconectar();

    }//GEN-LAST:event_btEditarActionPerformed

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

// <editor-fold defaultstate="collapsed" desc="DECLARAÇÃO DE VARIAVEIS DOS COMPONENTES">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InpTipoEquipamento;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JRadioButton botaoFeminino;
    private javax.swing.JRadioButton botaoMasculino;
    private javax.swing.JButton btAddEquipamento;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField inpMarcas;
    private javax.swing.JTextField inpSerial;
    private javax.swing.JButton jBotaoExcluir;
    private javax.swing.JButton jBotaoSalvar;
    private javax.swing.JLabel jEnderço;
    private javax.swing.JLabel jEnderço1;
    private javax.swing.JLabel jEnderço2;
    private javax.swing.JLabel jEnderço3;
    private javax.swing.JLabel jEnderço4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNasc;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabela;
    private javax.swing.JLabel jTel;
    private javax.swing.JLabel jTel1;
    private javax.swing.JTextField jTextEndereço;
    private javax.swing.JFormattedTextField jTextNasc;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JFormattedTextField jTextTel;
    private javax.swing.JTable tbEquipamentos;
    // End of variables declaration//GEN-END:variables

// </editor-fold>    
    private void PesquisaCliente() {
        Dao.conectar();
        Connection conn = Dao.getConn();

        DefaultTableModel TabClientes = (DefaultTableModel) jTabela.getModel();
        TabClientes.setNumRows(0);
        try {
            String sql = "select * from Clientes";
            if (!jTextNome.getText().equals("")) {
                sql = sql + " where Nome LIKE ? ";
            }
            PreparedStatement stmt = conn.prepareStatement(sql);
            if (!jTextNome.getText().equals("")) {
                stmt.setString(1, jTextNome.getText() + "%");
            }

            ResultSet ResultadoClientes = stmt.executeQuery();
            while (ResultadoClientes.next()) {
                String[] linha = {
                    ResultadoClientes.getString("ID"),
                    ResultadoClientes.getString("Nome"),
                    ResultadoClientes.getString("DataNasc"),
                    ResultadoClientes.getString("Cel"),
                    ResultadoClientes.getString("Endereco"),
                    ResultadoClientes.getString("Genero")
                };
                TabClientes.addRow(linha);

//              Seleciona a primara linha da tabela
                jTabela.setRowSelectionInterval(0, 0);
            }
        } catch (Exception e) {
        }

    }

    private void PesquisaEquipamentos() {
        Dao.conectar();
        Connection conn = Dao.getConn();

        try {
            String sql = "select * from equipamentos where ClienteID = " + SelecionaCodCliente();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet ResultadoEquipamentos = stmt.executeQuery();

            DefaultTableModel TabEquipamentos = (DefaultTableModel) tbEquipamentos.getModel();
            TabEquipamentos.setNumRows(0);
            while (ResultadoEquipamentos.next()) {
                String[] linha = {
                    ResultadoEquipamentos.getString("TipoEquip"),
                    ResultadoEquipamentos.getString("Marca"),
                    ResultadoEquipamentos.getString("Serial")
                };
                TabEquipamentos.addRow(linha);
            }
            Dao.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private String SelecionaCodCliente() {
        int LinhaTabelaCliente = jTabela.getSelectedRow();
        String CodCli = jTabela.getValueAt(LinhaTabelaCliente, 0).toString();
        return CodCli;
    }

    private void ApagaCampoEquipamentos() {
        InpTipoEquipamento.setText("");
        inpMarcas.setText("");
        inpSerial.setText("");
    }

    private void ApagaCampoClientes() {
        jTextNome.setText("");
        jTextNasc.setText("");
        jTextTel.setText("");
        jTextEndereço.setText("");
    }

}
