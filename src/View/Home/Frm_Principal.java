package View.Home;

import Controller.AtendimentoDAO;
import Controller.UsuarioDAO;
import Model.Usuario;
import View.Atendimento.Frm_AberturaAtendimento;
import View.Cadastro.Frm_CadCidade;
import View.Cadastro.Frm_CadConvenio;
import View.Cadastro.Frm_CadCor;
import View.Cadastro.Frm_CadEstadoCivil;
import View.Cadastro.Frm_CadPaciente;
import View.Cadastro.Frm_CadProfissao;
import View.Cadastro.Frm_CadUsuario;
import View.Cadastro.Frm_cadTipoAtendimento;
import View.Consulta.Frm_ConsPaciente;
import java.awt.Event;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frm_Principal extends javax.swing.JFrame {

    UsuarioDAO usuarioDAO;
    Usuario usuario;
    AtendimentoDAO atendimentoDAO;
    public static Frm_Principal j = null;
    int tentativas;

    public Frm_Principal(Usuario usuario) {
        initComponents();
        setVisible(true);
        tentativas = 0;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        alteraUsuarioLogado(usuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_atalhos = new javax.swing.JPanel();
        pnl_cadCliente = new javax.swing.JPanel();
        atalhoCadastroCliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_aberturaAtendimento = new javax.swing.JPanel();
        atalhoAbrirAtendimento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnl_consClientes = new javax.swing.JPanel();
        atalhoConsultarClientes = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_usuarioLogado = new javax.swing.JLabel();
        txt_usuarioLogado = new javax.swing.JLabel();
        Menu_barra = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        item_cadPaciente = new javax.swing.JMenuItem();
        item_cadCor = new javax.swing.JMenuItem();
        item_cadProfissao = new javax.swing.JMenuItem();
        item_cadEstadoCivil = new javax.swing.JMenuItem();
        item_cadUsuario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        item_cadConvenio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        item_aberturaAtendimento = new javax.swing.JMenuItem();
        Menu_Utilitários = new javax.swing.JMenu();
        item_AlterarSenha = new javax.swing.JMenuItem();
        item_trocaUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OftalSIS 1.0");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pnl_atalhos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atalhoCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadCliente.png"))); // NOI18N
        atalhoCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoCadastroClienteMousePressed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cadastro de Paciente");

        javax.swing.GroupLayout pnl_cadClienteLayout = new javax.swing.GroupLayout(pnl_cadCliente);
        pnl_cadCliente.setLayout(pnl_cadClienteLayout);
        pnl_cadClienteLayout.setHorizontalGroup(
            pnl_cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_cadClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addComponent(atalhoCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_cadClienteLayout.setVerticalGroup(
            pnl_cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        atalhoAbrirAtendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoAbrirAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/abrirAtendimento.png"))); // NOI18N
        atalhoAbrirAtendimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoAbrirAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoAbrirAtendimentoMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Abrir Atendimento");

        javax.swing.GroupLayout pnl_aberturaAtendimentoLayout = new javax.swing.GroupLayout(pnl_aberturaAtendimento);
        pnl_aberturaAtendimento.setLayout(pnl_aberturaAtendimentoLayout);
        pnl_aberturaAtendimentoLayout.setHorizontalGroup(
            pnl_aberturaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_aberturaAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_aberturaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_aberturaAtendimentoLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addComponent(atalhoAbrirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_aberturaAtendimentoLayout.setVerticalGroup(
            pnl_aberturaAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_aberturaAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoAbrirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        atalhoConsultarClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoConsultarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/consClientes.png"))); // NOI18N
        atalhoConsultarClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoConsultarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoConsultarClientesMousePressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Consultar Pacientes");

        javax.swing.GroupLayout pnl_consClientesLayout = new javax.swing.GroupLayout(pnl_consClientes);
        pnl_consClientes.setLayout(pnl_consClientesLayout);
        pnl_consClientesLayout.setHorizontalGroup(
            pnl_consClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_consClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_consClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_consClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(atalhoConsultarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_consClientesLayout.setVerticalGroup(
            pnl_consClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_consClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoConsultarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_atalhosLayout = new javax.swing.GroupLayout(pnl_atalhos);
        pnl_atalhos.setLayout(pnl_atalhosLayout);
        pnl_atalhosLayout.setHorizontalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_cadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_aberturaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_consClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(857, Short.MAX_VALUE))
        );
        pnl_atalhosLayout.setVerticalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_aberturaAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_consClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        lb_usuarioLogado.setText("Bem vindo (a):");

        txt_usuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_usuarioLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_usuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_usuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_atalhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                .addComponent(pnl_atalhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 451, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Cadastros");

        jMenu3.setText("Paciente");

        item_cadPaciente.setText("Paciente");
        item_cadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadPacienteActionPerformed(evt);
            }
        });
        jMenu3.add(item_cadPaciente);

        item_cadCor.setText("Cor");
        item_cadCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadCorActionPerformed(evt);
            }
        });
        jMenu3.add(item_cadCor);

        item_cadProfissao.setText("Profissão");
        item_cadProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadProfissaoActionPerformed(evt);
            }
        });
        jMenu3.add(item_cadProfissao);

        item_cadEstadoCivil.setText("Estado Civil");
        item_cadEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadEstadoCivilActionPerformed(evt);
            }
        });
        jMenu3.add(item_cadEstadoCivil);

        jMenu1.add(jMenu3);

        item_cadUsuario.setText("Usuário");
        item_cadUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_cadUsuarioMousePressed(evt);
            }
        });
        item_cadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(item_cadUsuario);

        jMenuItem1.setText("Cidade");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Tipo Atendimento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        item_cadConvenio.setText("Convênio");
        item_cadConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadConvenioActionPerformed(evt);
            }
        });
        jMenu1.add(item_cadConvenio);

        Menu_barra.add(jMenu1);

        jMenu2.setText("Atendimento");

        item_aberturaAtendimento.setText("Abertura de Atendimento");
        item_aberturaAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_aberturaAtendimentoMousePressed(evt);
            }
        });
        item_aberturaAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_aberturaAtendimentoActionPerformed(evt);
            }
        });
        jMenu2.add(item_aberturaAtendimento);

        Menu_barra.add(jMenu2);

        Menu_Utilitários.setText("Utilitários");

        item_AlterarSenha.setText("Alterar Senha");
        item_AlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_AlterarSenhaActionPerformed(evt);
            }
        });
        Menu_Utilitários.add(item_AlterarSenha);

        item_trocaUsuario.setText("Trocar de Usuário");
        item_trocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_trocaUsuarioActionPerformed(evt);
            }
        });
        Menu_Utilitários.add(item_trocaUsuario);

        Menu_barra.add(Menu_Utilitários);

        setJMenuBar(Menu_barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1269, 676));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void item_trocaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_trocaUsuarioActionPerformed
        Frm_Login f = new Frm_Login();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_item_trocaUsuarioActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == Event.ESCAPE) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Saindo", 0) == 0) {
                Frm_Login f = new Frm_Login();
                f.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void item_AlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_AlterarSenhaActionPerformed
        Frm_alteraSenha f = new Frm_alteraSenha(txt_usuarioLogado.getText());
    }//GEN-LAST:event_item_AlterarSenhaActionPerformed

    private void atalhoCadastroClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoCadastroClienteMousePressed
        Frm_CadPaciente f = new Frm_CadPaciente();
    }//GEN-LAST:event_atalhoCadastroClienteMousePressed

    private void atalhoAbrirAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoAbrirAtendimentoMousePressed
        Frm_AberturaAtendimento f = new Frm_AberturaAtendimento();
    }//GEN-LAST:event_atalhoAbrirAtendimentoMousePressed

    private void atalhoConsultarClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoConsultarClientesMousePressed
        Frm_ConsPaciente f = new Frm_ConsPaciente();
    }//GEN-LAST:event_atalhoConsultarClientesMousePressed

    private void item_cadUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_cadUsuarioMousePressed
        Frm_CadUsuario f = new Frm_CadUsuario();
    }//GEN-LAST:event_item_cadUsuarioMousePressed

    private void item_aberturaAtendimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_aberturaAtendimentoMousePressed
        Frm_AberturaAtendimento f = new Frm_AberturaAtendimento();
    }//GEN-LAST:event_item_aberturaAtendimentoMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Frm_CadCidade f = new Frm_CadCidade();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Frm_cadTipoAtendimento f =new Frm_cadTipoAtendimento();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void item_cadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadUsuarioActionPerformed
        Frm_CadUsuario f= new Frm_CadUsuario();
    }//GEN-LAST:event_item_cadUsuarioActionPerformed

    private void item_aberturaAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_aberturaAtendimentoActionPerformed
        Frm_AberturaAtendimento f= new Frm_AberturaAtendimento();
    }//GEN-LAST:event_item_aberturaAtendimentoActionPerformed

    private void item_cadEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadEstadoCivilActionPerformed
        Frm_CadEstadoCivil f = new Frm_CadEstadoCivil();
    }//GEN-LAST:event_item_cadEstadoCivilActionPerformed

    private void item_cadCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadCorActionPerformed
        Frm_CadCor f= new Frm_CadCor();
    }//GEN-LAST:event_item_cadCorActionPerformed

    private void item_cadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadPacienteActionPerformed
        Frm_CadPaciente f= new Frm_CadPaciente();
    }//GEN-LAST:event_item_cadPacienteActionPerformed

    private void item_cadProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadProfissaoActionPerformed
        Frm_CadProfissao f= new Frm_CadProfissao();
    }//GEN-LAST:event_item_cadProfissaoActionPerformed

    private void item_cadConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadConvenioActionPerformed
        Frm_CadConvenio f= new Frm_CadConvenio();
    }//GEN-LAST:event_item_cadConvenioActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Principal();
            }
        });
        //Listener que capitura o evento "minimizar"

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_Utilitários;
    private javax.swing.JMenuBar Menu_barra;
    private javax.swing.JLabel atalhoAbrirAtendimento;
    private javax.swing.JLabel atalhoCadastroCliente;
    private javax.swing.JLabel atalhoConsultarClientes;
    private javax.swing.JMenuItem item_AlterarSenha;
    private javax.swing.JMenuItem item_aberturaAtendimento;
    private javax.swing.JMenuItem item_cadConvenio;
    private javax.swing.JMenuItem item_cadCor;
    private javax.swing.JMenuItem item_cadEstadoCivil;
    private javax.swing.JMenuItem item_cadPaciente;
    private javax.swing.JMenuItem item_cadProfissao;
    private javax.swing.JMenuItem item_cadUsuario;
    private javax.swing.JMenuItem item_trocaUsuario;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_usuarioLogado;
    private javax.swing.JPanel pnl_aberturaAtendimento;
    private javax.swing.JPanel pnl_atalhos;
    private javax.swing.JPanel pnl_cadCliente;
    private javax.swing.JPanel pnl_consClientes;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JLabel txt_usuarioLogado;
    // End of variables declaration//GEN-END:variables

    private void alteraUsuarioLogado(Usuario usuario) {
        txt_usuarioLogado.setText(usuario.getUsuario());
    }

}
