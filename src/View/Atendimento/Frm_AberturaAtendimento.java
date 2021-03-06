/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Atendimento;

import Controller.AtendimentoDAO;
import Controller.ConvenioDAO;
import Controller.ExamesDAO;
import Controller.PacienteDAO;
import Controller.StatusAtendimentoDAO;
import Controller.TipoAtendimentoDAO;
import Controller.TipoUsuarioDAO;
import Controller.UsuarioDAO;
import Model.Anexo;
import Model.Atendimento;
import Model.Convenio;
import Model.Paciente;
import Model.TipoAtendimento;
import Model.Usuario;
import Util.Classes.AutoComplete;
import Util.Classes.Data;
import Util.Classes.FixedLengthDocument;
import Util.Classes.IntegerDocument;
import View.Cadastro.Frm_CadConvenio;
import View.Cadastro.Frm_CadUsuario;
import View.Cadastro.Frm_cadTipoAtendimento;
import java.awt.Event;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_AberturaAtendimento extends javax.swing.JFrame {

    PacienteDAO pacienteDAO;
    UsuarioDAO usuarioDAO;
    TipoUsuarioDAO tipoUsuarioDAO;
    TipoAtendimentoDAO tipoAtendimentoDAO;
    List<Paciente> pacientes;
    List<Anexo> anexos;
    Atendimento atendimento;
    AtendimentoDAO atendimentoDAO;
    StatusAtendimentoDAO statusAtendimentoDAO;
    ConvenioDAO convenioDAO;
    ExamesDAO examesDAO;
    Paciente paciente;

    public Frm_AberturaAtendimento() {
        initComponents();
        setVisible(true);
        txt_numCarteira.setDocument(new IntegerDocument(10));
        txt_plano.setDocument(new FixedLengthDocument(100));
        AutoComplete.decorate(cbx_paciente);
        atendimento = new Atendimento();
        pacientes = new ArrayList<>();
        start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnl_botoes1 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbx_paciente = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt_dataAtendimento = new javax.swing.JFormattedTextField();
        cbx_doutor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbx_tipoAtendimento = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_queixa = new javax.swing.JTextArea();
        btn_agenda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_idade = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbx_convenio = new javax.swing.JComboBox();
        btn_cadConvenio = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_numCarteira = new javax.swing.JTextField();
        txt_plano = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btn_cadTipoAtendimento = new javax.swing.JButton();
        btn_cadUsuario = new javax.swing.JButton();
        pnl_botoes = new javax.swing.JPanel();
        btn_salvar = new javax.swing.JButton();
        btn_anexar = new javax.swing.JButton();

        jInternalFrame1.setTitle("Consulta Agenda de Atendimentos");
        jInternalFrame1.setVisible(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Doutor", "Hora", "Paciente", "Tipo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(65);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(65);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(65);
            jTable2.getColumnModel().getColumn(1).setMinWidth(150);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable2.getColumnModel().getColumn(2).setMinWidth(60);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable2.getColumnModel().getColumn(4).setMinWidth(100);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(5).setMinWidth(60);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        pnl_botoes1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton13.setText("Selecionar");

        jButton14.setText("Fechar");

        jButton3.setText("Cancelar");

        jButton4.setText("Atender");

        jButton7.setText("Receber");

        javax.swing.GroupLayout pnl_botoes1Layout = new javax.swing.GroupLayout(pnl_botoes1);
        pnl_botoes1.setLayout(pnl_botoes1Layout);
        pnl_botoes1Layout.setHorizontalGroup(
            pnl_botoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        pnl_botoes1Layout.setVerticalGroup(
            pnl_botoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoes1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_botoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setText("Data Final:");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setText("Data Inícial:");

        jButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Filtro:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnl_botoes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_botoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abertura de Atendimento");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Paciente:");

        cbx_paciente.setEditable(true);
        cbx_paciente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbx_pacienteFocusLost(evt);
            }
        });

        jLabel1.setText("Data Atendimento*:");

        try {
            txt_dataAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataAtendimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dataAtendimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_dataAtendimentoFocusGained(evt);
            }
        });
        txt_dataAtendimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dataAtendimentoKeyPressed(evt);
            }
        });

        cbx_doutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_doutorFocusGained(evt);
            }
        });

        jLabel4.setText("Doutor*:");

        cbx_tipoAtendimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_tipoAtendimentoFocusGained(evt);
            }
        });

        jLabel5.setText("Tipo Atendimento*:");

        jLabel2.setText("Queixa:");

        txt_queixa.setColumns(20);
        txt_queixa.setRows(5);
        txt_queixa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_queixaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txt_queixa);

        btn_agenda.setText("Agenda");
        btn_agenda.setEnabled(false);

        jLabel7.setText("Idade:");

        txt_idade.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        txt_idade.setForeground(new java.awt.Color(0, 0, 153));
        txt_idade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_idade.setText("0");

        jLabel12.setText("Convênio:");

        cbx_convenio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_convenioFocusGained(evt);
            }
        });

        btn_cadConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadConvenioActionPerformed(evt);
            }
        });

        jLabel14.setText("Num. Carteira:");

        txt_numCarteira.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_numCarteiraFocusGained(evt);
            }
        });

        txt_plano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_planoFocusGained(evt);
            }
        });
        txt_plano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_planoActionPerformed(evt);
            }
        });

        jLabel13.setText("Plano:");

        btn_cadTipoAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadTipoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadTipoAtendimentoActionPerformed(evt);
            }
        });

        btn_cadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbx_doutor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cadUsuario)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_dataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_agenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txt_plano, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_numCarteira))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cbx_tipoAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_cadTipoAtendimento))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cbx_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_cadConvenio)))
                            .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_dataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agenda)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_idade)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btn_cadUsuario)))
                    .addComponent(cbx_doutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadTipoAtendimento)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbx_tipoAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(btn_cadConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_convenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_numCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnl_botoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_anexar.setText("Anexar");
        btn_anexar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anexarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_botoesLayout = new javax.swing.GroupLayout(pnl_botoes);
        pnl_botoes.setLayout(pnl_botoesLayout);
        pnl_botoesLayout.setHorizontalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_anexar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        pnl_botoesLayout.setVerticalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_anexar))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anexarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anexarActionPerformed
        if (txt_idade.getText().replace("/", "").trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            txt_dataAtendimento.requestFocus();
        } else {
            Frm_Anexo f = new Frm_Anexo(atendimento);
        }
    }//GEN-LAST:event_btn_anexarActionPerformed

    private void txt_dataAtendimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataAtendimentoKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            Data data = new Data();
            txt_dataAtendimento.setText(data.completaData(txt_dataAtendimento.getText(), "dd/MM/yyyy"));
        }
    }//GEN-LAST:event_txt_dataAtendimentoKeyPressed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_cadConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadConvenioActionPerformed
        Frm_CadConvenio f = new Frm_CadConvenio();
    }//GEN-LAST:event_btn_cadConvenioActionPerformed

    private void btn_cadTipoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadTipoAtendimentoActionPerformed
        Frm_cadTipoAtendimento f = new Frm_cadTipoAtendimento();
    }//GEN-LAST:event_btn_cadTipoAtendimentoActionPerformed

    private void btn_cadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadUsuarioActionPerformed
        Frm_CadUsuario f = new Frm_CadUsuario();
    }//GEN-LAST:event_btn_cadUsuarioActionPerformed

    private void txt_planoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_planoActionPerformed
    }//GEN-LAST:event_txt_planoActionPerformed

    private void cbx_pacienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_pacienteFocusLost
    }//GEN-LAST:event_cbx_pacienteFocusLost

    private void txt_dataAtendimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_dataAtendimentoFocusGained
        calculaIdade();
    }//GEN-LAST:event_txt_dataAtendimentoFocusGained

    private void cbx_doutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_doutorFocusGained
        calculaIdade();
    }//GEN-LAST:event_cbx_doutorFocusGained

    private void cbx_tipoAtendimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_tipoAtendimentoFocusGained
        calculaIdade();
    }//GEN-LAST:event_cbx_tipoAtendimentoFocusGained

    private void cbx_convenioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_convenioFocusGained
        calculaIdade();
    }//GEN-LAST:event_cbx_convenioFocusGained

    private void txt_planoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_planoFocusGained
        calculaIdade();
    }//GEN-LAST:event_txt_planoFocusGained

    private void txt_numCarteiraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_numCarteiraFocusGained
        calculaIdade();
    }//GEN-LAST:event_txt_numCarteiraFocusGained

    private void txt_queixaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_queixaFocusGained
        calculaIdade();
    }//GEN-LAST:event_txt_queixaFocusGained

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_AberturaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_AberturaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_AberturaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_AberturaAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_AberturaAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agenda;
    private javax.swing.JButton btn_anexar;
    private javax.swing.JButton btn_cadConvenio;
    private javax.swing.JButton btn_cadTipoAtendimento;
    private javax.swing.JButton btn_cadUsuario;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox cbx_convenio;
    private javax.swing.JComboBox cbx_doutor;
    private javax.swing.JComboBox cbx_paciente;
    private javax.swing.JComboBox cbx_tipoAtendimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnl_botoes;
    private javax.swing.JPanel pnl_botoes1;
    private javax.swing.JFormattedTextField txt_dataAtendimento;
    private javax.swing.JLabel txt_idade;
    private javax.swing.JTextField txt_numCarteira;
    private javax.swing.JTextField txt_plano;
    private javax.swing.JTextArea txt_queixa;
    // End of variables declaration//GEN-END:variables

    private void carregaPacientes() {
        try {
            pacienteDAO = new PacienteDAO();
            cbx_paciente.removeAllItems();
            pacientes = pacienteDAO.listar();
            for (Paciente lista : pacientes) {
                cbx_paciente.addItem(lista.getNome());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os pacientes!\n" + e.getMessage());
        }
    }

    private void carregaDoutores() {
        try {
            usuarioDAO = new UsuarioDAO();
            tipoUsuarioDAO = new TipoUsuarioDAO();
            cbx_doutor.removeAllItems();
            for (Usuario lista : usuarioDAO.listaByTipo(tipoUsuarioDAO.buscar("Doutor"))) {
                cbx_doutor.addItem(lista.getUsuario());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os Doutores!\n" + e.getMessage());
        }
    }

    private void carregaTipoAtendimentos() {
        try {
            tipoAtendimentoDAO = new TipoAtendimentoDAO();
            cbx_tipoAtendimento.removeAllItems();
            for (TipoAtendimento lista : tipoAtendimentoDAO.listar()) {
                cbx_tipoAtendimento.addItem(lista.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os tipos de atendimento!\n" + e.getMessage());
        }
    }

    private void start() {
        carregaPacientes();
        carregaDoutores();
        carregaTipoAtendimentos();
        calculaIdade();
        carregaConvenios();
    }

    private void calculaIdade() {
        try {
            pacienteDAO = new PacienteDAO();
            paciente = new Paciente();
            paciente = pacienteDAO.findByNome(cbx_paciente.getSelectedItem().toString());
            Date data = new Date();
            if (paciente.getDtNascimento().getMonth() == data.getMonth()) {
                if (paciente.getDtNascimento().getDate() < data.getDate()) {
                    txt_idade.setText(Data.getIdade(paciente.getDtNascimento()));
                } else {
                    if (paciente.getDtNascimento().getDate() == data.getDate()) {
                        txt_idade.setText(Data.getIdade(paciente.getDtNascimento()));
                    } else {
                        txt_idade.setText(Integer.parseInt(Data.getIdade(paciente.getDtNascimento())) - 1 + "");
                    }
                }
            } else {
                if (paciente.getDtNascimento().getMonth() < data.getMonth()) {
                    txt_idade.setText(Data.getIdade(paciente.getDtNascimento()));
                } else {
                    txt_idade.setText(Integer.parseInt(Data.getIdade(paciente.getDtNascimento())) - 1 + "");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular a idade!\n" + e.getMessage());
        }
    }

    private void limpaCampos() {
        cbx_paciente.setSelectedIndex(0);
        cbx_doutor.setSelectedIndex(0);
        cbx_tipoAtendimento.setSelectedIndex(0);
        txt_queixa.setText(null);
        txt_dataAtendimento.setText(null);
        txt_plano.setText(null);
        txt_numCarteira.setText(null);
        cbx_convenio.setSelectedIndex(0);
    }

    private void salvar() {
        try {
            usuarioDAO = new UsuarioDAO();
            statusAtendimentoDAO = new StatusAtendimentoDAO();
            tipoAtendimentoDAO = new TipoAtendimentoDAO();
            atendimentoDAO = new AtendimentoDAO();
            if (cbx_convenio.getSelectedIndex() > 0) {
                atendimento.setCodconvenio(convenioDAO.buscar(cbx_convenio.getSelectedItem().toString()));
            }
            if (!txt_numCarteira.getText().isEmpty()) {
                atendimento.setNumCarteira(Integer.parseInt(txt_numCarteira.getText()));
            }
            if (!txt_plano.getText().isEmpty()) {
                atendimento.setPlano(txt_plano.getText());
            }
            atendimento.setCodmedico(usuarioDAO.buscar(cbx_doutor.getSelectedItem().toString()));
            atendimento.setCodpaciente(pacientes.get(cbx_paciente.getSelectedIndex()));
            atendimento.setCodreceitaOculos(null);
            atendimento.setCodstatusAtendimento(statusAtendimentoDAO.buscar("CONCLUIDO"));
            atendimento.setCodtipoAtendimento(tipoAtendimentoDAO.buscar(cbx_tipoAtendimento.getSelectedItem().toString()));
            atendimento.setDtAtendimento(Data.getDataByTexto(txt_dataAtendimento.getText(), "dd/MM/yyyy"));
            atendimento.setQueixa(txt_queixa.getText());
            atendimentoDAO.salvar(atendimento);
            JOptionPane.showMessageDialog(null, "Atendimento salvo com sucesso!");
            atendimento = new Atendimento();
            limpaCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o atendimento!\n" + e.getMessage());
        }
    }

    private void validaCampos() {
        if (txt_dataAtendimento.getText().replace("/", "").trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data de agendamento inválida!");
            txt_dataAtendimento.requestFocus();
        } else {
            if (txt_queixa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Queixa inválida!");
                txt_queixa.requestFocus();
            } else {
                salvar();
            }
        }
    }

    private void carregaConvenios() {
        try {
            cbx_convenio.removeAllItems();
            cbx_convenio.addItem("Selecione um Convênio");
            convenioDAO = new ConvenioDAO();
            for (Convenio convenios : convenioDAO.listar()) {
                cbx_convenio.addItem(convenios.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os Convenios!\n" + e.getMessage());
        }
    }
}
