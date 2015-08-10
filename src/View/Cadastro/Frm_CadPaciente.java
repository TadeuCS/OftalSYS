package View.Cadastro;

import Controller.AtendimentoDAO;
import Controller.CidadeDAO;
import Controller.ConvenioDAO;
import Controller.CorDAO;
import Controller.EnderecoDAO;
import Controller.EstadoCivilDAO;
import Controller.EstadoDAO;
import Controller.PacienteDAO;
import Controller.ProfissaoDAO;
import Controller.TelefoneDAO;
import Controller.TipoTelefoneDAO;
import Model.Atendimento;
import Model.Cep;
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
import Util.Classes.FixedLengthDocument;
import Util.Classes.IntegerDocument;
import Util.Classes.TableConfig;
import Util.Classes.ValidaEmail;
import Util.Classes.ValidarCGCCPF;
import View.Atendimento.Frm_DetalhamentoAtendimento;
import View.Consulta.Frm_ConsPaciente;
import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

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
    EnderecoDAO enderecoDAO;

    Paciente paciente;
    Endereco endereco;
    Telefone telefone;
    Cep cep;
    List<Telefone> telefones;
    List<Endereco> enderecos;

    public Frm_CadPaciente() {
        initComponents();
        setVisible(true);
        start();
        trataCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
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
        jLabel15 = new javax.swing.JLabel();
        btn_cadProfissao = new javax.swing.JButton();
        btn_cadCor = new javax.swing.JButton();
        chx_ativo = new javax.swing.JCheckBox();
        txt_observacao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_naturalidade = new javax.swing.JTextField();
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
        btn_cadCidade = new javax.swing.JButton();
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
        cbx_nonoDigito = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_atendimentos = new javax.swing.JTable();
        btn_detalhar = new javax.swing.JButton();
        btn_reimprimir = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        pnl_botoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_operacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Paciente");
        setResizable(false);

        pnl_dados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Código:");

        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabel4.setText("CPF:");

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("RG :");

        jLabel6.setText("Sexo *:");

        rbt_masculino.setText("Masculino");

        rbt_feminino.setText("Feminino");

        cbx_cor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_corFocusGained(evt);
            }
        });

        cbx_estadoCivil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_estadoCivilFocusGained(evt);
            }
        });
        cbx_estadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_estadoCivilActionPerformed(evt);
            }
        });

        jLabel8.setText("Estado Civil:");

        jLabel9.setText("Email:");

        jLabel10.setText("Cor:");

        cbx_profissao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbx_profissaoFocusGained(evt);
            }
        });
        cbx_profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_profissaoActionPerformed(evt);
            }
        });

        jLabel11.setText("Profissão:");

        jLabel15.setText("Naturalidade:");

        btn_cadProfissao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadProfissaoActionPerformed(evt);
            }
        });

        btn_cadCor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadCorActionPerformed(evt);
            }
        });

        chx_ativo.setSelected(true);
        chx_ativo.setText("Ativo");

        jLabel24.setText("Observação:");

        javax.swing.GroupLayout pnl_dadosPessoaisLayout = new javax.swing.GroupLayout(pnl_dadosPessoais);
        pnl_dadosPessoais.setLayout(pnl_dadosPessoaisLayout);
        pnl_dadosPessoaisLayout.setHorizontalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cbx_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cadCor)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbt_masculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbt_feminino)))
                .addGap(11, 11, 11))
            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_observacao)
                        .addGap(18, 18, 18)
                        .addComponent(chx_ativo))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(cbx_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_profissao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cadProfissao)))
                .addContainerGap())
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
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cbx_estadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel11)
                        .addComponent(txt_naturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbx_profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadProfissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chx_ativo)
                    .addComponent(txt_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel9)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        abas.addTab("Dados Pessoais", pnl_dadosPessoais);

        jLabel7.setText("CEP:");

        try {
            txt_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cepKeyPressed(evt);
            }
        });

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

        btn_cadCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadastro.png"))); // NOI18N
        btn_cadCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_enderecoLayout = new javax.swing.GroupLayout(pnl_endereco);
        pnl_endereco.setLayout(pnl_enderecoLayout);
        pnl_enderecoLayout.setHorizontalGroup(
            pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_enderecoLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btn_cadCidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_enderecoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
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
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_complemento)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel21)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbx_cidade)
                        .addComponent(btn_cadCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbx_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
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
        btn_removerTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerTelefoneActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setText("Tipo:");

        jLabel20.setText("Número*:");

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbx_nonoDigito.setText("com 9 digitos");
        cbx_nonoDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_nonoDigitoActionPerformed(evt);
            }
        });

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
                .addGap(18, 18, 18)
                .addComponent(cbx_nonoDigito)
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
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_nonoDigito))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_telefonesLayout = new javax.swing.GroupLayout(pnl_telefones);
        pnl_telefones.setLayout(pnl_telefonesLayout);
        pnl_telefonesLayout.setHorizontalGroup(
            pnl_telefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_telefonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_telefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        abas.addTab("Telefone", pnl_telefones);

        tb_atendimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atendimento", "Data", "Hora", "Queixa", "Anexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_atendimentos.getTableHeader().setReorderingAllowed(false);
        tb_atendimentos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb_atendimentosKeyPressed(evt);
            }
        });
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
            tb_atendimentos.getColumnModel().getColumn(4).setMinWidth(60);
            tb_atendimentos.getColumnModel().getColumn(4).setPreferredWidth(60);
            tb_atendimentos.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        btn_detalhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/detalhe.png"))); // NOI18N
        btn_detalhar.setText("Detalhar");
        btn_detalhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalharActionPerformed(evt);
            }
        });

        btn_reimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/imprimir.png"))); // NOI18N
        btn_reimprimir.setText("Reimprimir");
        btn_reimprimir.setEnabled(false);

        btn_atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/carregar.png"))); // NOI18N
        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_reimprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_detalhar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_detalhar)
                    .addComponent(btn_reimprimir)
                    .addComponent(btn_atualizar))
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

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/adicionar.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/alterar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/excluir.png"))); // NOI18N
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_operacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_operacao.setEnabled(false);

        javax.swing.GroupLayout pnl_botoesLayout = new javax.swing.GroupLayout(pnl_botoes);
        pnl_botoes.setLayout(pnl_botoesLayout);
        pnl_botoesLayout.setHorizontalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_operacao)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_botoesLayout.setVerticalGroup(
            pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_botoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_salvar)
                        .addComponent(btn_cancelar))
                    .addGroup(pnl_botoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_novo)
                        .addComponent(btn_editar)
                        .addComponent(btn_apagar)
                        .addComponent(btn_buscar)
                        .addComponent(txt_operacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    }//GEN-LAST:event_cbx_profissaoActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void btn_cadCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadCorActionPerformed
        Frm_CadCor f = new Frm_CadCor();
    }//GEN-LAST:event_btn_cadCorActionPerformed

    private void btn_cadProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadProfissaoActionPerformed
        Frm_CadProfissao f = new Frm_CadProfissao();
    }//GEN-LAST:event_btn_cadProfissaoActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        limpaCampos();
        txt_operacao.setText("INCLUSÃO");
        setEnabledButtons(false);
        setEnabledFields(true);
        paciente = new Paciente();
        endereco = new Endereco();
        telefones = new ArrayList<>();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpaCampos();
        abas.setSelectedIndex(0);
        cbx_cor.setSelectedIndex(0);
        cbx_profissao.setSelectedIndex(0);
        cbx_tipoTelefone.setSelectedIndex(0);
        setEnabledButtons(true);
        setEnabledFields(false);
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
        if (!txt_telefone.getText().replace("(", "").replace(")", "").replace("-", "").trim().isEmpty()) {
            try {
                if (validaTelefoneExiteNalista(txt_telefone.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "Telefone já existe na Lista abaixo!");
                } else {
                    insereTelefone(txt_telefone.getText());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Inserir o Telefone " + txt_telefone.getText() + "!\n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Telefone Inválido!");
            txt_telefone.requestFocus();
        }
    }//GEN-LAST:event_btn_inserirTelefoneActionPerformed

    private void btn_removerTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerTelefoneActionPerformed
        if (tb_telefones.getSelectedRowCount() == 1) {
            removerTelefone(tb_telefones.getValueAt(tb_telefones.getSelectedRow(), 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione 1 telefone na lista para remover!");
        }
    }//GEN-LAST:event_btn_removerTelefoneActionPerformed

    private void txt_cepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cepKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            if (txt_cep.getText().replaceAll("-", "").trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CEP Inválido!");
            } else {
                buscaCEP(txt_cep.getText().replace("-", ""));
            }
        }
    }//GEN-LAST:event_txt_cepKeyPressed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Frm_ConsPaciente f = new Frm_ConsPaciente();
        this.dispose();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        if (txt_codigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não é possivel alterar sem os dados de um paciente na tela!\n");
        } else {
            txt_operacao.setText("ALTERAÇÃO");
            setEnabledFields(true);
            setEnabledButtons(false);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        if (txt_codigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não é possivel excluír sem os dados de um paciente na tela!\n");
        } else {
            txt_operacao.setText("EXCLUSÃO");
            try {
                if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar o Paciente: " + paciente.getNome(), "Alerta", 0) == 0) {
                    pacienteDAO = new PacienteDAO();
                    pacienteDAO.remover(pacienteDAO.buscar(Integer.parseInt(txt_codigo.getText())));
                    JOptionPane.showMessageDialog(null, "Paciente removido com sucesso!");
                    setEnabledButtons(true);
                    setEnabledFields(false);
                    limpaCampos();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Impossível remover este Paciente pois o mesmo já teve movimentações!");
            }
        }
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_detalharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalharActionPerformed
        if (tb_atendimentos.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1 linha para detalhar por vez!");
        } else {
            atendimentoDAO = new AtendimentoDAO();
            Frm_DetalhamentoAtendimento f = new Frm_DetalhamentoAtendimento(atendimentoDAO.buscar(Integer.parseInt(tb_atendimentos.getValueAt(tb_atendimentos.getSelectedRow(), 0).toString())));
        }
    }//GEN-LAST:event_btn_detalharActionPerformed

    private void btn_cadCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadCidadeActionPerformed
        Frm_CadCidade f = new Frm_CadCidade();
    }//GEN-LAST:event_btn_cadCidadeActionPerformed

    private void cbx_estadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_estadoCivilActionPerformed
    }//GEN-LAST:event_cbx_estadoCivilActionPerformed

    private void cbx_estadoCivilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_estadoCivilFocusGained
        carregaEstadoCivis();
    }//GEN-LAST:event_cbx_estadoCivilFocusGained

    private void cbx_profissaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_profissaoFocusGained
        carregaCidades();
    }//GEN-LAST:event_cbx_profissaoFocusGained

    private void cbx_corFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbx_corFocusGained
        carregaCores();
    }//GEN-LAST:event_cbx_corFocusGained

    private void tb_atendimentosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_atendimentosKeyPressed
        if (evt.getKeyCode() == Event.DELETE) {
            try {
                if (JOptionPane.showConfirmDialog(null, "Deseja realmente apagar o atendimento: " + tb_atendimentos.getValueAt(tb_atendimentos.getSelectedRow(), 0), "Alerta", 0) == 0) {
                    removeAtendimento();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Impossível remover este atendimento!\n" + e);
            }
        }
    }//GEN-LAST:event_tb_atendimentosKeyPressed

    private void cbx_nonoDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_nonoDigitoActionPerformed
        if (cbx_nonoDigito.isSelected()) {
            try {
                txt_telefone.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) #####-####");
                txt_telefone.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_telefone.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        } else {
            try {
                txt_telefone.setValue(null);
                MaskFormatter cpf = new MaskFormatter("(##) ####-####");
                txt_telefone.setFormatterFactory(
                        new DefaultFormatterFactory(cpf));
                txt_telefone.requestFocus();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir o nono digito!\n" + e);
            }
        }
    }//GEN-LAST:event_cbx_nonoDigitoActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        carregarAtendimentoByPaciente(Integer.parseInt(txt_codigo.getText()));
    }//GEN-LAST:event_btn_atualizarActionPerformed

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
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cadCidade;
    private javax.swing.JButton btn_cadCor;
    private javax.swing.JButton btn_cadProfissao;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_detalhar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_inserirTelefone;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_reimprimir;
    private javax.swing.JButton btn_removerTelefone;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox cbx_cidade;
    private javax.swing.JComboBox cbx_cor;
    private javax.swing.JComboBox cbx_estado;
    private javax.swing.JComboBox cbx_estadoCivil;
    private javax.swing.JCheckBox cbx_nonoDigito;
    private javax.swing.JComboBox cbx_profissao;
    private javax.swing.JComboBox cbx_tipoTelefone;
    private javax.swing.JCheckBox chx_ativo;
    private javax.swing.JPanel fundo;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnl_botoes;
    private javax.swing.JPanel pnl_dados;
    private javax.swing.JPanel pnl_dadosPessoais;
    private javax.swing.JPanel pnl_endereco;
    private javax.swing.JPanel pnl_telefones;
    private javax.swing.JRadioButton rbt_feminino;
    private javax.swing.JRadioButton rbt_masculino;
    private javax.swing.JTable tb_atendimentos;
    private javax.swing.JTable tb_telefones;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JFormattedTextField txt_cep;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JFormattedTextField txt_dataNascimento;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_naturalidade;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_observacao;
    private javax.swing.JTextField txt_operacao;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        //dados iniciais
        txt_operacao.setText("");
        txt_codigo.setText(null);
        txt_nome.setText(null);
        txt_cpf.setText(null);
        txt_rg.setText(null);
        txt_dataNascimento.setText(null);
        txt_email.setText(null);
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
    }

    private void setEnabledFields(boolean tipo) {
        //dados iniciais
        txt_nome.setEnabled(tipo);
        txt_cpf.setEnabled(tipo);
        txt_rg.setEnabled(tipo);
        txt_dataNascimento.setEnabled(tipo);
        rbt_masculino.setEnabled(tipo);
        rbt_feminino.setEnabled(tipo);
        txt_email.setEnabled(tipo);
        cbx_estadoCivil.setEnabled(tipo);
        cbx_profissao.setEnabled(tipo);
        cbx_cor.setEnabled(tipo);
        btn_cadCor.setEnabled(tipo);
        btn_cadProfissao.setEnabled(tipo);
        txt_observacao.setEnabled(tipo);
        chx_ativo.setEnabled(tipo);
        txt_naturalidade.setEnabled(tipo);
        txt_nome.requestFocus();

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
        limpaCampos();
        setEnabledButtons(true);
        setEnabledFields(false);
        carregaEstadoCivis();
        carregaCores();
        carregaProfissoes();
        carregaTipoTelefones();
        carregaEstados();
        cbx_estado.setSelectedItem("MG");
        carregaCidades();
        btn_novo.requestFocus();
    }

    private void carregaEstadoCivis() {
        try {
            cbx_estadoCivil.removeAllItems();
            cbx_estadoCivil.addItem("Selecione um estado Civil");
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
            cbx_cor.addItem("Selecione uma COR");
            corDAO = new CorDAO();
            for (Cor cores : corDAO.listar()) {
                cbx_cor.addItem(cores.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar as Cores!\n" + e.getMessage());
        }
    }

    private void carregaProfissoes() {
        try {
            cbx_profissao.removeAllItems();
            cbx_profissao.addItem("Selecione uma Profissão");
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
                                                        if (tb_telefones.getRowCount() == 0) {
                                                            JOptionPane.showMessageDialog(null, "Insira pelo menos 1 TELEFONE de contato na lista!");
                                                            abas.setSelectedIndex(2);
                                                            txt_telefone.requestFocus();
                                                        } else {
                                                            //opcionais
                                                            if (!txt_cpf.getText().replace(".", "").replace("-", "").trim().isEmpty()
                                                                    && ValidarCGCCPF.validaCPF(txt_cpf.getText()) == false) {
                                                                abas.setSelectedIndex(0);
                                                                JOptionPane.showMessageDialog(null, "CPF Inválido!");
                                                                txt_cpf.requestFocus();
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Validar os campos!\n" + e.getMessage());
        }
    }

    private void salvar() {
        try {
            corDAO = new CorDAO();
            estadoCivilDAO = new EstadoCivilDAO();
            convenioDAO = new ConvenioDAO();
            profissaoDAO = new ProfissaoDAO();
            enderecoDAO = new EnderecoDAO();
            cidadeDAO = new CidadeDAO();
            pacienteDAO = new PacienteDAO();

            if (!txt_codigo.getText().isEmpty()) {
                endereco = new Endereco();
                endereco = paciente.getEnderecoList().get(0);

            }
            //dados iniciais
            paciente.setNome(txt_nome.getText());
            if (!txt_cpf.getText().replace(".", "").replace("-", "").trim().isEmpty()) {
                paciente.setCpf(txt_cpf.getText());
            }
            if (!txt_rg.getText().isEmpty()) {
                paciente.setRg(txt_rg.getText());
            }
            paciente.setDtNascimento(Data.getDataByTexto(txt_dataNascimento.getText(), "dd/MM/yyyy"));
            if (cbx_cor.getSelectedIndex() != 0) {
                paciente.setCodcor(corDAO.buscar(cbx_cor.getSelectedItem().toString()));
            } else {
                paciente.setCodcor(null);
            }
            if (rbt_masculino.getSelectedObjects() != null) {
                paciente.setSexo('M');
            } else {
                paciente.setSexo('F');
            }

            if (cbx_profissao.getSelectedIndex() != 0) {
                paciente.setCodprofissao(profissaoDAO.buscar(cbx_profissao.getSelectedItem().toString()));
            } else {
                paciente.setCodprofissao(null);
            }
            if (!txt_naturalidade.getText().isEmpty()) {
                paciente.setNaturalidade(txt_naturalidade.getText());
            }

            //endereco
            if (!txt_cep.getText().isEmpty()) {
                endereco.setCep(txt_cep.getText());
            }
            endereco.setCodpaciente(paciente);
            endereco.setLogradouro(txt_logradouro.getText());
            endereco.setNumero(Integer.parseInt(txt_numero.getText()));
            if (!txt_complemento.getText().isEmpty()) {
                endereco.setComplemento(txt_complemento.getText());
            }
            endereco.setBairro(txt_bairro.getText());
            endereco.setCodcidade(cidadeDAO.buscar(cbx_cidade.getSelectedItem().toString()));
            paciente.getEnderecoList().add(endereco);
            paciente.setTelefoneList(telefones);
            if (!txt_observacao.getText().isEmpty()) {
                paciente.setObservacao(txt_observacao.getText());
            }
            if (chx_ativo.getSelectedObjects() == null) {
                paciente.setAtivo('N');
            } else {
                paciente.setAtivo('S');
            }
            if (cbx_estadoCivil.getSelectedIndex() > 0) {
                paciente.setCodestadoCivil(estadoCivilDAO.buscar(cbx_estadoCivil.getSelectedItem().toString()));
            }
            if (!txt_email.getText().isEmpty()) {
                paciente.setEmail(txt_email.getText());
            }
            pacienteDAO = new PacienteDAO();
            pacienteDAO.salvar(paciente);
            if (txt_operacao.getText().equals("INCLUSÃO") == true) {
                JOptionPane.showMessageDialog(null, "Paciente Salvo com Sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Paciente Alterado com Sucesso!");
            }
            btn_cancelar.doClick();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar o Paciente!\n" + e.getMessage());
        }
    }

    private void insereTelefone(String numero) {
        try {
            telefone = new Telefone();
            tipoTelefoneDAO = new TipoTelefoneDAO();
            telefone.setCodpaciente(paciente);
            telefone.setNumero(txt_telefone.getText());
            telefone.setCodtipoTelefone(tipoTelefoneDAO.buscar(cbx_tipoTelefone.getSelectedItem().toString()));
            telefones.add(telefone);
            String[] linha = new String[]{telefone.getCodtipoTelefone().getDescricao(), telefone.getNumero()};
            TableConfig.getModel(tb_telefones).addRow(linha);
            txt_telefone.setText(null);
            txt_telefone.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o telefone " + numero + " na lista!" + e.getMessage());
        }
    }

    private Telefone validaTelefoneExisteNoBanco(String telefone) {
        try {
            telefoneDAO = new TelefoneDAO();
            return telefoneDAO.buscar(telefone);
        } catch (NoResultException e) {
            return null;
        }
    }

    private boolean validaTelefoneExiteNalista(String telefone) {
        boolean tel = false;
        try {
            for (int i = 0; i < tb_telefones.getRowCount(); i++) {
                if (telefone.equals(tb_telefones.getValueAt(i, 1)) == true) {
                    tel = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar o telefone " + telefone + "!\n" + e.getMessage());
        } finally {
            return tel;
        }
    }

    private void removerTelefone(String numero) {
        try {
            telefoneDAO = new TelefoneDAO();
            telefoneDAO.remover(telefoneDAO.buscar(numero));
            for (int i = 0; i < paciente.getTelefoneList().size(); i++) {
                if (paciente.getTelefoneList().get(i).getNumero().equals(numero) == true) {
                    paciente.getTelefoneList().remove(i);
                    TableConfig.getModel(tb_telefones).removeRow(tb_telefones.getSelectedRow());
                }
            }
        } catch (NoResultException e) {
            TableConfig.getModel(tb_telefones).removeRow(tb_telefones.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o telefone " + numero + " da lista!\n" + e.getMessage());
        }
    }

    private void buscaCEP(String cep) {
        enderecoDAO = new EnderecoDAO();
        this.cep = new Cep();
        try {
            this.cep = enderecoDAO.findByCEP(cep);
            txt_logradouro.setText(this.cep.getLogradouro());
            txt_bairro.setText(this.cep.getBairro());
            cbx_cidade.setSelectedItem(this.cep.getCodcidade().getDescricao());
            cbx_estado.setSelectedItem(this.cep.getCodcidade().getCodestado().getSigla());
            txt_numero.requestFocus();
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(null, "CEP não Encontrado, Preencha os campos obrigatórios!");
            txt_logradouro.requestFocus();
        }
    }

    public void getDadosPaciente(Paciente paciente) {
        getDadosPessoais(paciente);
        getEndereco(paciente);
        getTelefone(paciente);
        getAtendimentos(paciente);

        btn_novo.setEnabled(false);
        btn_buscar.setEnabled(false);
        btn_cancelar.setEnabled(true);
        btn_salvar.setEnabled(false);
        txt_operacao.setText("PESQUISA");
        this.paciente = paciente;
    }

    private void getDadosPessoais(Paciente paciente) {
        try {
            txt_codigo.setText(paciente.getCodpaciente() + "");
            txt_nome.setText(paciente.getNome());
            txt_cpf.setText(paciente.getCpf());
            txt_rg.setText(paciente.getRg());
            txt_dataNascimento.setText(Data.getDataByDate(paciente.getDtNascimento(), "dd/MM/yyyy"));
            if (paciente.getCodcor() != null) {
                cbx_cor.setSelectedItem(paciente.getCodcor().getDescricao());
            } else {
                cbx_cor.setSelectedIndex(0);
            }
            if (paciente.getCodprofissao() != null) {
                cbx_profissao.setSelectedItem(paciente.getCodprofissao().getDescricao());
            } else {
                cbx_profissao.setSelectedIndex(0);
            }
            if (paciente.getSexo().equals('M') == true) {
                rbt_masculino.setSelected(true);
            } else {
                rbt_feminino.setSelected(true);
            }
            if (paciente.getAtivo().equals('S') == true) {
                chx_ativo.setSelected(true);
            } else {
                chx_ativo.setSelected(false);
            }
            txt_observacao.setText(paciente.getObservacao());
            txt_email.setText(paciente.getEmail());
            if (paciente.getCodestadoCivil() != null) {
                cbx_estadoCivil.setSelectedItem(paciente.getCodestadoCivil().getDescricao());
            } else {
                cbx_estadoCivil.setSelectedIndex(0);
            }
            txt_naturalidade.setText(paciente.getNaturalidade());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados pessoais!\n" + e.getMessage());
        }
    }

    private void getEndereco(Paciente paciente) {
        try {
            txt_cep.setText(paciente.getEnderecoList().get(0).getCep());
            txt_logradouro.setText(paciente.getEnderecoList().get(0).getLogradouro());
            txt_numero.setText(paciente.getEnderecoList().get(0).getNumero() + "");
            txt_bairro.setText(paciente.getEnderecoList().get(0).getBairro());
            txt_complemento.setText(paciente.getEnderecoList().get(0).getComplemento());
            cbx_estado.setSelectedItem(paciente.getEnderecoList().get(0).getCodcidade().getCodestado().getSigla());
            carregaCidades();
            cbx_cidade.setSelectedItem(paciente.getEnderecoList().get(0).getCodcidade().getDescricao());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o endereco!\n" + e.getMessage());
        }
    }

    private void getTelefone(Paciente paciente) {
        try {
            TableConfig.limpaTabela(tb_telefones);
            for (Telefone lista : paciente.getTelefoneList()) {
                String[] linha = new String[]{lista.getCodtipoTelefone().getDescricao(), lista.getNumero()};
                TableConfig.getModel(tb_telefones).addRow(linha);
            }
            this.telefones = new ArrayList<>();
            this.telefones = paciente.getTelefoneList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o Telefone" + e.getMessage());
        }
    }

    private void getAtendimentos(Paciente paciente) {
        try {
            for (int i = 0; i < paciente.getAtendimentoList().size(); i++) {
                if (paciente.getAtendimentoList().get(i).getCodstatusAtendimento().getDescricao().equals("CONCLUIDO") == true) {
                    String[] linha = new String[]{
                        paciente.getAtendimentoList().get(i).getCodatendimento() + "",
                        Data.getDataByDate(paciente.getAtendimentoList().get(i).getDtAtendimento(), "dd/MM/yyyy"),
                        Data.getDataByDate(paciente.getAtendimentoList().get(i).getDtAtendimento(), "HH:mm"),
                        paciente.getAtendimentoList().get(i).getQueixa(),
                        temAnexo(paciente.getAtendimentoList().get(i))
                    };
                    TableConfig.getModel(tb_atendimentos).addRow(linha);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os atendimentos!\n" + e.getMessage());
        }
    }

    private void trataCampos() {
        //dados iniciais
        txt_nome.setDocument(new FixedLengthDocument(225));
        txt_rg.setDocument(new FixedLengthDocument(20));

        //endereco
        txt_logradouro.setDocument(new FixedLengthDocument(255));
        txt_bairro.setDocument(new FixedLengthDocument(255));
        txt_complemento.setDocument(new FixedLengthDocument(160));
        txt_numero.setDocument(new IntegerDocument(10));
        txt_observacao.setDocument(new FixedLengthDocument(255));
        cbx_estado.setSelectedItem("MG");
        cbx_cidade.setSelectedItem("PATOS DE MINAS");
    }

    private String temAnexo(Atendimento att) {
        if (att.getAnexoList().size() > 0) {
            return "S";
        } else {
            return "N";
        }
    }

    private void removeAtendimento() {
        try {
            atendimentoDAO = new AtendimentoDAO();
            atendimentoDAO.remove(atendimentoDAO.buscar(Integer.parseInt(tb_atendimentos.getValueAt(tb_atendimentos.getSelectedRow(), 0).toString())));
            JOptionPane.showMessageDialog(null, "Atendimento removido com sucesso!");
            TableConfig.getModel(tb_atendimentos).removeRow(tb_atendimentos.getSelectedRow());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover o atendimento!\n" + e);
        }
    }

    private void carregarAtendimentoByPaciente(int codpaciente) {
        try {
            atendimentoDAO = new AtendimentoDAO();
            pacienteDAO = new PacienteDAO();
            TableConfig.limpaTabela(tb_atendimentos);
            for (Atendimento att : atendimentoDAO.listarByPaciente(pacienteDAO.buscar(codpaciente))) {
                String[] linha = new String[]{att.getCodatendimento().toString(),
                    Data.getDataByDate(att.getDtAtendimento(), "dd/MM/yyyy"),
                    Data.getDataByDate(att.getDtAtendimento(), "HH:mm"),
                    att.getQueixa(), temAnexo(att)};
                TableConfig.getModel(tb_atendimentos).addRow(linha);
            }
            JOptionPane.showMessageDialog(null, "Atendimentos atualizados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os atendimentos do paciente: " + codpaciente + " !\n" + e);
        }
    }
}
