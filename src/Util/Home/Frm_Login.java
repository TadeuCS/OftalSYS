package Util.Home;

import Controller.UsuarioDAO;
import Model.Usuario;
import Util.Classes.Criptografia;
import Util.Classes.FixedLengthDocument;
import java.awt.Color;
import java.awt.Event;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;

public class Frm_Login extends javax.swing.JFrame {

    Frm_Principal p;
    UsuarioDAO usuarioDAO;
    private static Usuario usuario;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Frm_Login.usuario = usuario;
    }

    public Frm_Login() {
        initComponents();
        txt_usuario.setDocument(new FixedLengthDocument(20));
        novo();
        usuario.setUsuario("ADMIN");
        usuario.setSenha(Criptografia.criptografar("80177534a0c99a7e3645b52f2027a48b"));
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

    public void novo() {
        usuario = new Usuario();
        usuarioDAO = new UsuarioDAO();
    }

    public boolean isAdministrador(String user, String password) {
        if ((usuario.getUsuario().equals(user) == true) && (usuario.getSenha().equals(Criptografia.criptografar(password)) == true)) {
            return true;
        } else {
            return false;
        }
    }

    public void logar(String nome, String senha) {
        if (isAdministrador(nome, senha) == true) {
            p = new Frm_Principal();
            p.setVisible(true);
            dispose();
        } else {
            try {

//                if (usuarioDAO.findByUsuarioAndSenha(nome, senha).getCodstatuspessoa().getDescricao().equals("BLOQUEADO") == true) {
//                    JOptionPane.showMessageDialog(null, "Usuário " + nome + " Bloquado", "Aviso", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    usuario=usuarioDAO.findByUsuarioAndSenha(nome, senha);
//                    p = new Frm_Principal();
//                    p.setVisible(true);
//                    dispose();
//                }
            } catch (NoResultException e) {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos!", "Aviso", JOptionPane.ERROR_MESSAGE);
            } finally {
                limpaCampos();
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_dados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Usuário:");

        txt_usuario.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });

        jLabel2.setText("Senha:");

        txt_senha.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txt_senha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_senhaKeyPressed(evt);
            }
        });

        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/entrar.png"))); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/sair.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_dadosLayout = new javax.swing.GroupLayout(pnl_dados);
        pnl_dados.setLayout(pnl_dadosLayout);
        pnl_dadosLayout.setHorizontalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_dadosLayout.setVerticalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(pnl_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        if (txt_usuario.getText().equals("") == true) {
            JOptionPane.showMessageDialog(null, "Usuário Inválido!");
            txt_usuario.requestFocus();
        } else {
            if (txt_senha.getText().equals("") == true) {
                JOptionPane.showMessageDialog(null, "Senha Inválida!");
                txt_senha.requestFocus();
            } else {
                logar(txt_usuario.getText().toUpperCase(), Criptografia.criptografar(txt_senha.getText()));
            }
        }

    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void txt_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_senhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_entrar.doClick();
        }
    }//GEN-LAST:event_txt_senhaKeyPressed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            txt_senha.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

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
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl_dados;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        txt_senha.setText(null);
        txt_usuario.setText(null);
        txt_usuario.requestFocus();
    }
}