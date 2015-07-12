package View.Cadastro;

import Controller.AtendimentoDAO;
import Controller.CidadeDAO;
import Controller.ConvenioDAO;
import Controller.CorDAO;
import Controller.EstadoCivilDAO;
import Controller.EstadoDAO;
import Controller.PacienteDAO;
import Controller.ProfissaoDAO;
import Controller.TelefoneDAO;
import Controller.TipoTelefoneDAO;
import Model.Atendimento;
import Model.Cidade;
import Model.Convenio;
import Model.Cor;
import Model.Endereco;
import Model.EstadoCivil;
import Model.Paciente;
import Model.Profissao;
import Model.Telefone;
import Model.TipoTelefone;
import Model.Uf;
import Util.Classes.Data;
import Util.Classes.TableConfig;
import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Frm_CadPaciente extends javax.swing.JFrame {

    Data data;
    EstadoCivilDAO estadoCivilDAO;
    CorDAO corDAO;
    ConvenioDAO convenioDAO;
    ProfissaoDAO profissaoDAO;
    EstadoDAO estadoDAO;
    CidadeDAO cidadeDAO;
    TipoTelefoneDAO tipoTelefoneDAO;
    TelefoneDAO telefoneDAO;
    PacienteDAO pacienteDAO;
    AtendimentoDAO atendimentoDAO;
    
    Paciente paciente;
    Endereco endereco;
    Telefone telefone;
    List<Telefone> telefones;

    public Frm_CadPaciente() {
        initComponents();
        setVisible(true);
        start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        Frm_ConsCliente = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_pacientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_telefonesPesquisa = new javax.swing.JTable();
        pnl_botoes1 = new javax.swing.JPanel();
        btn_selecionar = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();
        fundo = new javax.swing.JPanel();
        pnl_dados = new javax.swing.JPanel();
        abas = new javax.swing.JTabbedPane();
        pnl_dadosPessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_dataNascimento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JFormattedTextField();
        txt_rg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbt_masculino = new javax.swing.JRadioButton();
        rbt_feminino = new javax.swing.JRadioButton();
        cbx_cor = new javax.swing.JComboBox();
        cbx_estadoCivil = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbx_profissao = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_plano = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_numCarteira = new javax.swing.JTextField();
        cbx_convenio = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txt_naturalidade = new javax.swing.JTextField();
        btn_cadConvenio = new javax.swing.JButton();
        btn_cadProfissao = new javax.swing.JButton();
        btn_cadCor = new javax.swing.JButton();
        pnl_endereco = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_cep = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_logradouro = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_complemento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cbx_cidade = new javax.swing.JComboBox();
        cbx_estado = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        pnl_telefones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_telefones = new javax.swing.JTable();
        btn_inserirTelefone = new javax.swing.JButton();
        btn_removerTelefone = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        cbx_tipoTelefone = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_atendimentos = new javax.swing.JTable();
        btn_detalhar = new javax.swing.JButton();
        btn_reimprimir = new javax.swing.JButton();
        pnl_botoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        Frm_ConsCliente.setTitle("Consulta de Paciente");
        Frm_ConsCliente.setVisible(true);

        jLabel24.setText("Filtro:");

        tb_pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Logradouro", "Numero", "Bairro", "Cidade", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_pacientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb_pacientes);
        if (tb_pacientes.getColumnModel().getColumnCount() > 0) {
            tb_pacientes.getColumnModel().getColumn(0).setMinWidth(65);
            tb_pacientes.getColumnModel().getColumn(0).setPreferredWidth(65);
            tb_pacientes.getColumnModel().getColumn(0).setMaxWidth(65);
            tb_pacientes.getColumnModel().getColumn(2).setMinWidth(110);
            tb_pacientes.getColumnModel().getColumn(2).setPreferredWidth(110);
            tb_pacientes.getColumnModel().getColumn(2).setMaxWidth(110);
            tb_pacientes.getColumnModel().getColumn(4).setMinWidth(80);
            tb_pacientes.getColumnModel().getColumn(4).setPreferredWidth(80);
            tb_pacientes.getColumnModel().getColumn(4).setMaxWidth(80);
            tb_pacientes.getColumnModel().getColumn(7).setMinWidth(40);
            tb_pacientes.getColumnModel().getColumn(7).setPreferredWidth(40);
            tb_pacientes.getColumnModel().getColumn(7).setMaxWidth(40);
        }

        tb_telefonesPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPO", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_telefonesPesquisa.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tb_telefonesPesquisa);

        pnl_botoes1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_selecionar.setText("Selecionar");

        btn_fechar.setText("Fechar");

        javax.swing.GroupLayout pnl_botoes1Layout = new javax.swing.GroupLayout(pnl_botoes1);
        pnl_botoes1.setLayout(pnl_botoes1Layout);
        pnl_botoes1Layout.setHorizontalGroup(
            pnl_botoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoes1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        pnl_botoes1Layout.setVerticalGroup(
            pnl_botoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoes1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_botoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionar)
                    .addComponent(btn_fechar))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro))
                    .addComponent(pnl_botoes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_botoes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Frm_ConsClienteLayout = new javax.swing.GroupLayout(Frm_ConsCliente.getContentPane());
        Frm_ConsCliente.getContentPane().setLayout(Frm_ConsClienteLayout);
        Frm_ConsClienteLayout.setHorizontalGroup(
            Frm_ConsClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Frm_ConsClienteLayout.setVerticalGroup(
            Frm_ConsClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Paciente");
        setResizable(false);

        pnl_dados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Código:");

        txt_codigo.setEnabled(false);

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome *:");

        jLabel3.setText("Data Nascimento *:");

        try {
            txt_dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_dataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dataNascimentoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dataNascimentoKeyReleased(evt);
            }
        });

        jLabel4.setText("CPF *:");

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("RG *:");

        jLabel6.setText("Sexo *:");

        rbt_masculino.setText("Masculino");

        rbt_feminino.setText("Feminino");

        jLabel8.setText("Estado Civil *:");

        jLabel9.setText("Email:");

        jLabel10.setText("Cor *:");

        cbx_profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_profissaoActionPerformed(evt);
            }
        });

        jLabel11.setText("Profissão *:");

        jLabel12.setText("Convênio *:");

        jLabel13.setText("Plano:");

        jLabel14.setText("Num. Carteira:");

        jLabel15.setText("Naturalidade:");

        btn_cadConvenio.setText("...");
        btn_cadConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadConvenioActionPerformed(evt);
            }
        });

        btn_cadProfissao.setText("...");
        btn_cadProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadProfissaoActionPerformed(evt);
            }
        });

        btn_cadCor.setText("...");
        btn_cadCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadCorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_dadosPessoaisLayout = new javax.swing.GroupLayout(pnl_dadosPessoais);
        pnl_dadosPessoais.setLayout(pnl_dadosPessoaisLayout);
        pnl_dadosPessoaisLayout.setHorizontalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(cbx_profissao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cadProfissao)
                        .addGap(267, 267, 267)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_naturalidade))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txt_plano)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_numCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(cbx_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cadCor)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbt_masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbt_feminino))
                            .addComponent(txt_email)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(cbx_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_convenio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cadConvenio)))
                .addGap(11, 11, 11))
        );
        pnl_dadosPessoaisLayout.setVerticalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btn_cadCor)
                    .addComponent(jLabel6)
                    .addComponent(rbt_masculino)
                    .addComponent(rbt_feminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_plano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_numCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbx_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbx_convenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadConvenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cadProfissao)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        abas.addTab("Dados Pessoais", pnl_dadosPessoais);

        jLabel7.setText("CEP:");

        try {
            txt_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setText("Logradouro *:");

        jLabel17.setText("Número *:");

        jLabel18.setText("Complemento:");

        jLabel21.setText("Bairro *:");

        jLabel22.setText("Cidade *:");

        cbx_cidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_cidadeFocusGained(evt);
            }
        });
        cbx_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_cidadeActionPerformed(evt);
            }
        });

        cbx_estado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbx_estadoFocusLost(evt);
            }
        });
        cbx_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_estadoActionPerformed(evt);
            }
        });

        jLabel23.setText("Estado *:");

        javax.swing.GroupLayout pnl_enderecoLayout = new javax.swing.GroupLayout(pnl_endereco);
        pnl_endereco.setLayout(pnl_enderecoLayout);
        pnl_enderecoLayout.setHorizontalGroup(
            pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_enderecoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_logradouro)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_enderecoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_complemento, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                    .addGroup(pnl_enderecoLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_cidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_enderecoLayout.setVerticalGroup(
            pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cbx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abas.addTab("Endereço", pnl_endereco);

        tb_telefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPO", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_telefones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_telefones);

        btn_inserirTelefone.setText("Inserir");
        btn_inserirTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirTelefoneActionPerformed(evt);
            }
        });

        btn_removerTelefone.setText("Remover");

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setText("Tipo:");

        jLabel20.setText("Número*:");

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_tipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbx_tipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_telefonesLayout = new javax.swing.GroupLayout(pnl_telefones);
        pnl_telefones.setLayout(pnl_telefonesLayout);
        pnl_telefonesLayout.setHorizontalGroup(
            pnl_telefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_telefonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_telefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_telefonesLayout.createSequentialGroup()
                        .addComponent(btn_removerTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_inserirTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_telefonesLayout.setVerticalGroup(
            pnl_telefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_telefonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_telefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inserirTelefone)
                    .addComponent(btn_removerTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abas.addTab("Telefone", pnl_telefones);

        tb_atendimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atendimento", "Data", "Hora", "Queixa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_atendimentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tb_atendimentos);
        if (tb_atendimentos.getColumnModel().getColumnCount() > 0) {
            tb_atendimentos.getColumnModel().getColumn(0).setMinWidth(100);
            tb_atendimentos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tb_atendimentos.getColumnModel().getColumn(0).setMaxWidth(100);
            tb_atendimentos.getColumnModel().getColumn(1).setMinWidth(90);
            tb_atendimentos.getColumnModel().getColumn(1).setPreferredWidth(90);
            tb_atendimentos.getColumnModel().getColumn(1).setMaxWidth(90);
            tb_atendimentos.getColumnModel().getColumn(2).setMinWidth(90);
            tb_atendimentos.getColumnModel().getColumn(2).setPreferredWidth(90);
            tb_atendimentos.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        btn_detalhar.setText("Detalhar");

        btn_reimprimir.setText("Reimprimir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_reimprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_detalhar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_detalhar)
                    .addComponent(btn_reimprimir))
                .addContainerGap())
        );

        abas.addTab("Histórico", jPanel2);

        javax.swing.GroupLayout pnl_dadosLayout = new javax.swing.GroupLayout(pnl_dados);
        pnl_dados.setLayout(pnl_dadosLayout);
        pnl_dadosLayout.setHorizontalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_dadosLayout.setVerticalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_botoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");

        btn_apagar.setText("Apagar");

        btn_buscar.setText("Buscar");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_botoesLayout = new javax.swing.GroupLayout(pnl_botoes);
        pnl_botoes.setLayout(pnl_botoesLayout);
        pnl_botoesLayout.setHorizontalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        pnl_botoesLayout.setVerticalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novo)
                        .addComponent(btn_editar)
                        .addComponent(btn_apagar)
                        .addComponent(btn_buscar))
                    .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_salvar)
                        .addComponent(btn_cancelar)))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(pnl_botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_profissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_profissaoActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void btn_cadCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadCorActionPerformed
        Frm_CadCor f = new Frm_CadCor();
    }//GEN-LAST:event_btn_cadCorActionPerformed

    private void btn_cadConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadConvenioActionPerformed
        Frm_CadConvenio f = new Frm_CadConvenio();
    }//GEN-LAST:event_btn_cadConvenioActionPerformed

    private void btn_cadProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadProfissaoActionPerformed
        Frm_CadProfissao f = new Frm_CadProfissao();
    }//GEN-LAST:event_btn_cadProfissaoActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        limpaCampos();
        setEnabledButtons(false);
        setEnableFields(true);
        txt_nome.requestFocus();
        paciente=new Paciente();
        endereco=new Endereco();
        telefones=new ArrayList<>();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpaCampos();
        setEnabledButtons(true);
        setEnableFields(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cbx_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_estadoActionPerformed

    }//GEN-LAST:event_cbx_estadoActionPerformed

    private void cbx_estadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_estadoFocusLost
    }//GEN-LAST:event_cbx_estadoFocusLost

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void txt_dataNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataNascimentoKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            data = new Data();
            txt_dataNascimento.setText(data.completaData(txt_dataNascimento.getText(), "dd/MM/yyyy"));
        }
    }//GEN-LAST:event_txt_dataNascimentoKeyPressed

    private void txt_dataNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataNascimentoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dataNascimentoKeyReleased

    private void cbx_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_cidadeActionPerformed
    }//GEN-LAST:event_cbx_cidadeActionPerformed

    private void cbx_cidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_cidadeFocusGained
        carregaCidades();
    }//GEN-LAST:event_cbx_cidadeFocusGained

    private void btn_inserirTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirTelefoneActionPerformed
        insereTelefone();
    }//GEN-LAST:event_btn_inserirTelefoneActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CadPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_CadPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Frm_ConsCliente;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cadConvenio;
    private javax.swing.JButton btn_cadCor;
    private javax.swing.JButton btn_cadProfissao;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_detalhar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_inserirTelefone;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_reimprimir;
    private javax.swing.JButton btn_removerTelefone;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JComboBox cbx_cidade;
    private javax.swing.JComboBox cbx_convenio;
    private javax.swing.JComboBox cbx_cor;
    private javax.swing.JComboBox cbx_estado;
    private javax.swing.JComboBox cbx_estadoCivil;
    private javax.swing.JComboBox cbx_profissao;
    private javax.swing.JComboBox cbx_tipoTelefone;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnl_botoes;
    private javax.swing.JPanel pnl_botoes1;
    private javax.swing.JPanel pnl_dados;
    private javax.swing.JPanel pnl_dadosPessoais;
    private javax.swing.JPanel pnl_endereco;
    private javax.swing.JPanel pnl_telefones;
    private javax.swing.JRadioButton rbt_feminino;
    private javax.swing.JRadioButton rbt_masculino;
    private javax.swing.JTable tb_atendimentos;
    private javax.swing.JTable tb_pacientes;
    private javax.swing.JTable tb_telefones;
    private javax.swing.JTable tb_telefonesPesquisa;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JFormattedTextField txt_cep;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JFormattedTextField txt_dataNascimento;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_naturalidade;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numCarteira;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_plano;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        //dados iniciais
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_cpf.setText(null);
        txt_rg.setText(null);
        txt_dataNascimento.setText(null);
        txt_plano.setText(null);
        txt_numCarteira.setText(null);
        txt_email.setText(null);
        txt_naturalidade.setText(null);
        rbt_masculino.setSelected(true);

        //endereco
        txt_cep.setText(null);
        txt_logradouro.setText(null);
        txt_numero.setText(null);
        txt_bairro.setText(null);
        txt_complemento.setText(null);

        //telefone
        txt_telefone.setText(null);

        //limpa as tabelas
        TableConfig.limpaTabela(tb_telefones);
        TableConfig.limpaTabela(tb_atendimentos);
        TableConfig.limpaTabela(tb_pacientes);
        TableConfig.limpaTabela(tb_telefonesPesquisa);
    }

    private void setEnableFields(boolean tipo) {
        //dados iniciais
        txt_nome.setEnabled(tipo);
        txt_cpf.setEnabled(tipo);
        txt_rg.setEnabled(tipo);
        txt_dataNascimento.setEnabled(tipo);
        rbt_masculino.setEnabled(tipo);
        rbt_feminino.setEnabled(tipo);
        txt_plano.setEnabled(tipo);
        txt_numCarteira.setEnabled(tipo);
        txt_email.setEnabled(tipo);
        txt_naturalidade.setEnabled(tipo);
        cbx_estadoCivil.setEnabled(tipo);
        cbx_convenio.setEnabled(tipo);
        cbx_profissao.setEnabled(tipo);
        cbx_cor.setEnabled(tipo);
        btn_cadConvenio.setEnabled(tipo);
        btn_cadCor.setEnabled(tipo);
        btn_cadProfissao.setEnabled(tipo);

        //endereco
        txt_cep.setEnabled(tipo);
        txt_logradouro.setEnabled(tipo);
        txt_numero.setEnabled(tipo);
        txt_bairro.setEnabled(tipo);
        txt_complemento.setEnabled(tipo);
        cbx_estado.setEnabled(tipo);
        cbx_cidade.setEnabled(tipo);

        //telefone
        txt_telefone.setEnabled(tipo);
        cbx_tipoTelefone.setEnabled(tipo);
        btn_inserirTelefone.setEnabled(tipo);
        btn_removerTelefone.setEnabled(tipo);

        tb_atendimentos.setEnabled(tipo);
        tb_pacientes.setEnabled(tipo);
    }

    private void setEnabledButtons(boolean valor) {
        btn_novo.setEnabled(valor);
        btn_editar.setEnabled(valor);
        btn_apagar.setEnabled(valor);
        btn_buscar.setEnabled(valor);
        btn_cancelar.setEnabled(!valor);
        btn_salvar.setEnabled(!valor);
    }

    private void start() {
        grupoSexo.add(rbt_masculino);
        grupoSexo.add(rbt_feminino);
        abas.setEnabledAt(3, false);
        limpaCampos();
        setEnabledButtons(true);
        setEnableFields(false);
        carregaEstadoCivis();
        carregaCores();
        carregaConvenios();
        carregaProfissoes();
        carregaEstados();
        carregaTipoTelefones();
    }

    private void carregaEstadoCivis() {
        try {
            cbx_estadoCivil.removeAllItems();
            estadoCivilDAO = new EstadoCivilDAO();
            for (EstadoCivil estadoCivis : estadoCivilDAO.listar()) {
                cbx_estadoCivil.addItem(estadoCivis.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os estados Civis!\n" + e.getMessage());
        }
    }

    private void carregaCores() {
        try {
            cbx_cor.removeAllItems();
            corDAO = new CorDAO();
            for (Cor cores : corDAO.listar()) {
                cbx_cor.addItem(cores.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar as Cores!\n" + e.getMessage());
        }
    }

    private void carregaConvenios() {
        try {
            cbx_convenio.removeAllItems();
            convenioDAO = new ConvenioDAO();
            for (Convenio convenios : convenioDAO.listar()) {
                cbx_convenio.addItem(convenios.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os Convenios!\n" + e.getMessage());
        }
    }

    private void carregaProfissoes() {
        try {
            cbx_profissao.removeAllItems();
            profissaoDAO = new ProfissaoDAO();
            for (Profissao profissoes : profissaoDAO.listar()) {
                cbx_profissao.addItem(profissoes.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar as Profissoes!\n" + e.getMessage());
        }
    }

    private void carregaEstados() {
        try {
            cbx_estado.removeAllItems();
            estadoDAO = new EstadoDAO();
            for (Uf estados : estadoDAO.listar()) {
                cbx_estado.addItem(estados.getSigla());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os estados!\n" + e.getMessage());
        }
    }

    private void carregaCidades() {
        try {
            cbx_cidade.removeAllItems();
            cidadeDAO = new CidadeDAO();
            estadoDAO = new EstadoDAO();
            List<Cidade> cidades = new ArrayList<>();
            cidades = cidadeDAO.listarByEstado(estadoDAO.buscar(cbx_estado.getSelectedItem().toString()));
            for (Cidade listaCidades : cidades) {
                cbx_cidade.addItem(listaCidades.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar as cidades!\n" + e.getMessage());
        }
    }

    private void carregaTipoTelefones() {
        try {
            cbx_tipoTelefone.removeAllItems();
            tipoTelefoneDAO = new TipoTelefoneDAO();
            for (TipoTelefone tiposTelefone : tipoTelefoneDAO.listar()) {
                cbx_tipoTelefone.addItem(tiposTelefone.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os tipos de Telefone!\n" + e.getMessage());
        }
    }

    private void listaTelefones() {
        try {
            TableConfig.limpaTabela(tb_telefones);
            telefoneDAO = new TelefoneDAO();
            pacienteDAO = new PacienteDAO();
            List<Telefone> lista = telefoneDAO.listarbyPaciente(pacienteDAO.buscar(Integer.parseInt(txt_codigo.getText())));
            for (Telefone telefones : lista) {
                String[] linha = new String[]{telefones.getCodtipoTelefone().getDescricao(), telefones.getNumero()};
                TableConfig.getModel(tb_telefones).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os Telefones!\n" + e.getMessage());
        }
    }

    private void listarAtendimentos() {
        try {
            TableConfig.limpaTabela(tb_atendimentos);
            atendimentoDAO = new AtendimentoDAO();
            pacienteDAO = new PacienteDAO();
            List<Atendimento> lista = atendimentoDAO.listarByPaciente(pacienteDAO.buscar(Integer.parseInt(txt_codigo.getText())));
            for (Atendimento atendimentos : lista) {
                String[] linha = new String[]{
                    atendimentos.getCodatendimento().toString(),
                    Data.getDataByDate(atendimentos.getDtAtendimento(), "dd/MM/yyyy"),
                    Data.getDataByDate(atendimentos.getDtAtendimento(), "HH:mm"),
                    atendimentos.getQueixa()};
                TableConfig.getModel(tb_atendimentos).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os Telefones!\n" + e.getMessage());
        }
    }

    private void validaCampos() {
        try {
            if (txt_nome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome inválido!");
                abas.setSelectedIndex(0);
                txt_nome.requestFocus();
            } else {

                if (txt_dataNascimento.getText().replace("/", "").trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data de Nascimento inválida!");
                    abas.setSelectedIndex(0);
                    txt_dataNascimento.requestFocus();
                } else {

                    if (grupoSexo.getSelection() == null) {
                        JOptionPane.showMessageDialog(null, "Sexo inválido!");
                        abas.setSelectedIndex(0);
                        rbt_masculino.requestFocus();
                    } else {

                        if (cbx_estadoCivil.getSelectedItem() == null) {
                            JOptionPane.showMessageDialog(null, "Estado Civil inválido!");
                            abas.setSelectedIndex(0);
                            cbx_estadoCivil.requestFocus();
                        } else {
                            if (cbx_profissao.getSelectedItem() == null) {
                                JOptionPane.showMessageDialog(null, "Profissão inválida!");
                                abas.setSelectedIndex(0);
                                cbx_profissao.requestFocus();
                            } else {
                                if (txt_cep.getText().replace("-", "").trim().isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "CEP inválido!");
                                    abas.setSelectedIndex(1);
                                    txt_cep.requestFocus();
                                } else {
                                    if (txt_logradouro.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Logradouro inválido!");
                                        abas.setSelectedIndex(1);
                                        txt_logradouro.requestFocus();
                                    } else {
                                        if (txt_numero.getText().isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "Número inválido!");
                                            abas.setSelectedIndex(1);
                                            txt_numero.requestFocus();
                                        } else {
                                            if (txt_bairro.getText().isEmpty()) {
                                                JOptionPane.showMessageDialog(null, "Bairro inválido!");
                                                abas.setSelectedIndex(1);
                                                txt_bairro.requestFocus();
                                            } else {
                                                if (cbx_estado.getSelectedItem() == null) {
                                                    JOptionPane.showMessageDialog(null, "Estado inválido!");
                                                    abas.setSelectedIndex(1);
                                                    cbx_estado.requestFocus();
                                                } else {
                                                    if (cbx_cidade.getSelectedItem() == null) {
                                                        JOptionPane.showMessageDialog(null, "Cidade inválida!");
                                                        abas.setSelectedIndex(1);
                                                        cbx_cidade.requestFocus();
                                                    } else {
                                                        if (cbx_tipoTelefone.getSelectedItem() == null) {
                                                            JOptionPane.showMessageDialog(null, "Tipo de Telefone Inválido!");
                                                            abas.setSelectedIndex(2);
                                                            cbx_tipoTelefone.requestFocus();
                                                        } else {
                                                            if (txt_telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().isEmpty()) {
                                                                JOptionPane.showMessageDialog(null, "Telefone Inválido!");
                                                                abas.setSelectedIndex(2);
                                                                txt_telefone.requestFocus();
                                                            } else {
                                                                if (tb_telefones.getRowCount() == 0) {
                                                                    JOptionPane.showMessageDialog(null, "Insira pelo menos 1 TELEFONE de contato na lista!");
                                                                    abas.setSelectedIndex(2);
                                                                    txt_telefone.requestFocus();
                                                                } else {
                                                                    salvar();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
//            if (ValidarCGCCPF.validaCPF(txt_cpf.getText()) == false) {
//                                    JOptionPane.showMessageDialog(null, "CPF inválido!");
//                                    txt_cpf.requestFocus();
//                                } else {
//                                    if (txt_rg.getText().isEmpty()) {
//                                        JOptionPane.showMessageDialog(null, "RG inválido!");
//                                        txt_rg.requestFocus();
//                                    } else {
//                                        if (txt_naturalidade.getText().isEmpty()) {
//                                            JOptionPane.showMessageDialog(null, "Naturalidade inválida!");
//                                            txt_naturalidade.requestFocus();
//                                        } else {
//                                            if (cbx_cor.getSelectedItem() == null) {
//                                                JOptionPane.showMessageDialog(null, "Cor inválida!");
//                                                cbx_cor.requestFocus();
//                                            } else {
//                                                if (txt_plano.getText().isEmpty()) {
//                                                    JOptionPane.showMessageDialog(null, "Plano inválido!");
//                                                    txt_plano.requestFocus();
//                                                } else {
//                                                    if (txt_numCarteira.getText().isEmpty()) {
//                                                        JOptionPane.showMessageDialog(null, "Número da carteira inválido!");
//                                                        txt_numCarteira.requestFocus();
//                                                    } else {
//                                                        if (ValidaEmail.validarEmail(txt_email.getText()) == false) {
//                                                            JOptionPane.showMessageDialog(null, "Email inválido!");
//                                                            txt_email.requestFocus();
//                                                        } else {
//                                                            if (cbx_convenio.getSelectedItem() == null) {
//                                                                JOptionPane.showMessageDialog(null, "Convênio inválido!");
//                                                                cbx_convenio.requestFocus();
//                                                            } else {

//                                                            }
//                                                        }
//                                                    }
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Validar os campos!\n" + e.getMessage());
        }
    }

    private void salvar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insereTelefone() {
        try {
            if(validaTelefoneExisteNoBanco(txt_telefone.getText())==null){
                JOptionPane.showMessageDialog(null, "Telefone utilizado por outro paciente!");
            }else{
                if(validaTelefoneExiteNalista(txt_telefone.getText())==true){
                    JOptionPane.showMessageDialog(null, "Telefone já existe na Lista abaixo!");
                }else{
                    telefone=new Telefone();
                    tipoTelefoneDAO=new TipoTelefoneDAO();
                    telefone.setNumero(txt_telefone.getText());
                    telefone.setCodtipoTelefone(tipoTelefoneDAO.buscar(cbx_tipoTelefone.getSelectedItem().toString()));
                    telefones.add(telefone);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir o Telefone " + txt_telefone.getText() + "!\n" + e.getMessage());
        }
    }

    private Telefone validaTelefoneExisteNoBanco(String telefone) {
        Telefone tel= new Telefone();
        try {
            telefoneDAO=new TelefoneDAO();
            tel=telefoneDAO.buscar(telefone);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar o telefone +"+telefone+"!\n"+e.getMessage());
        }finally{
            return tel;
        }
    }

    private boolean validaTelefoneExiteNalista(String telefone) {
        boolean tel=false;
        try {
            for(int i=0; i<tb_telefones.getRowCount();i++){
                if(telefone.equals(tb_telefones.getValueAt(i, 1))==true){
                    tel=true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar o telefone +"+telefone+"!\n"+e.getMessage());
        }finally{
            return tel;
        }
    }

}
