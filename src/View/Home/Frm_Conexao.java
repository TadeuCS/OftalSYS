/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Home;

import Util.Classes.Conexao;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import Util.Classes.PropertiesManager;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_Conexao extends javax.swing.JFrame {

    static Frm_Principal p;
    static Statement st;
    static Connection con;
    PrintWriter pw;
    PropertiesManager props;
    Conexao conexao;

    public Frm_Conexao() {
        initComponents();
        setVisible(true);
        carregaDados();
        validaTipoConexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_tipo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txt_ip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_banco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_testar = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_gravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração de Conexão");

        pnl_fundo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Tipo *:");

        cbx_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Local", "Remoto" }));
        cbx_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("IP:");

        txt_ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Banco *:");

        jLabel4.setText("User *:");

        jLabel5.setText("Password *:");

        btn_testar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/carregar.png"))); // NOI18N
        btn_testar.setText("Testar");
        btn_testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        status.setForeground(new java.awt.Color(0, 51, 153));

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addComponent(cbx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_banco))
                .addGap(13, 13, 13))
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_fundoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_fundoLayout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_fundoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbx_tipo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_testar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_gravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarActionPerformed
        testaConexao();
    }//GEN-LAST:event_btn_testarActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        gravaDadosConexao();
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void cbx_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoActionPerformed
        validaTipoConexao();
    }//GEN-LAST:event_cbx_tipoActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Conexao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Conexao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_testar;
    private javax.swing.JComboBox cbx_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JLabel status;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void carregaDados() {
        props = new PropertiesManager();
        txt_banco.setText(props.ler("banco"));
        txt_user.setText(props.ler("usuario"));
        txt_password.setText(props.ler("senha"));
        txt_ip.setText(props.ler("ip"));
        if (txt_ip.getText().equals("localhost") == true) {
            cbx_tipo.setSelectedIndex(0);
        } else {
            cbx_tipo.setSelectedIndex(1);
        }
    }

//    public void testaConexão() {
//        txt_diretorio.setText(txt_diretorio.getText().replace("\\", "/"));
//        if ((cbx_tipo.getSelectedIndex() != 0) && (txt_ip.getText().compareTo("") == 0)) {
//            JOptionPane.showMessageDialog(null, "IP é Obrigatorio se Tipo de conexão é REMOTO");
//            txt_ip.requestFocus();
//        } else {
//            if (txt_diretorio.getText().compareTo("") == 0) {
//                JOptionPane.showMessageDialog(null, "Campo Diretorio é Obrigatorio");
//                txt_diretorio.requestFocus();
//            } else {
//                if (txt_user.getText().compareTo("") == 0) {
//                    JOptionPane.showMessageDialog(null, "Campo User é Obrigatorio");
//                    txt_user.requestFocus();
//                } else {
//                    if (txt_password.getText().compareTo("") == 0) {
//                        JOptionPane.showMessageDialog(null, "Campo Password é Obrigatorio");
//                        txt_password.requestFocus();
//                    } else {
//                        conexao = new Conexao();
//                        if (conexao.getConexao(getIP(), txt_diretorio.getText(), txt_user.getText(), txt_password.getText()) != null) {
//                            status.setText("Conexão Bem Sucedida!");
//                        } else {
//                            status.setText("Sem Conexão!");
//                            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados neste diretório!\n" + txt_diretorio.getText());
//                        }
//                    }
//                }
//            }
//        }
//    }
//    
    private void testaConexao() {
        props = new PropertiesManager();
        if ((cbx_tipo.getSelectedIndex() == 0 && !txt_ip.getText().equals("localhost") == true)
                || (cbx_tipo.getSelectedIndex() == 1 && txt_ip.getText().trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "IP inválido!");
        } else {
            if (txt_banco.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Banco inválido!");
            } else {
                if (txt_user.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Usuário inválido!");
                } else {
                    if (txt_password.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Senha inválida!");
                    } else {
                        conexao = new Conexao();
                        if (conexao.getConexao(txt_ip.getText(), txt_banco.getText(), txt_user.getText(), txt_password.getText()) != null) {
                            status.setText("Conexão bem Sucedida!");
                        } else {
                            status.setText("Sem Conexão!");
                            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!");
                        }
                    }
                }
            }
        }
    }

    private void validaTipoConexao() {
        if (cbx_tipo.getSelectedIndex() == 0) {
            txt_ip.setEnabled(false);
            txt_ip.setText("localhost");
            txt_banco.requestFocus();
        } else {
            txt_ip.setEnabled(true);
            txt_ip.setText(null);
            txt_ip.requestFocus();
        }
    }

    private void gravaDadosConexao() {
        conexao=new Conexao();
        if (conexao.getConexao(txt_ip.getText(), txt_banco.getText(), txt_user.getText(), txt_password.getText()) != null) {
            try {
                props = new PropertiesManager();
                props.altera("ip", txt_ip.getText());
                props.altera("banco", txt_banco.getText());
                props.altera("usuario", txt_user.getText());
                props.altera("senha", txt_password.getText());
                JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar os dados de conexão!\n" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Antes de gravar você precisa conseguir estabelecer conexão com o banco de dados!");
        }

    }
}
