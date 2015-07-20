/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Home;

import Controller.UsuarioDAO;
import Model.Usuario;
import java.awt.Event;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_alteraSenha extends javax.swing.JFrame {

    int tentativas;
    String usuarioLogado;
    UsuarioDAO usuarioDAO;
    Usuario usuario;
    public Frm_alteraSenha() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_alteraSenha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_antigaSenha = new javax.swing.JPasswordField();
        txt_novaSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_confirmaSenha = new javax.swing.JPasswordField();
        btn_salvar = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_alteraSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Antiga Senha*:");

        txt_antigaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_antigaSenhaKeyPressed(evt);
            }
        });

        txt_novaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_novaSenhaKeyPressed(evt);
            }
        });

        jLabel3.setText("Nova Senha*:");

        jLabel5.setText("Confirma Senha*:");

        txt_confirmaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_confirmaSenhaKeyPressed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/fechar.png"))); // NOI18N
        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_alteraSenhaLayout = new javax.swing.GroupLayout(pnl_alteraSenha);
        pnl_alteraSenha.setLayout(pnl_alteraSenhaLayout);
        pnl_alteraSenhaLayout.setHorizontalGroup(
            pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alteraSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_alteraSenhaLayout.createSequentialGroup()
                        .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_novaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txt_confirmaSenha)
                            .addComponent(txt_antigaSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_alteraSenhaLayout.createSequentialGroup()
                        .addComponent(btn_fechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salvar)))
                .addContainerGap())
        );
        pnl_alteraSenhaLayout.setVerticalGroup(
            pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_alteraSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_antigaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_confirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_alteraSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_alteraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_alteraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_antigaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_antigaSenhaKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            txt_novaSenha.requestFocus();
        }
    }//GEN-LAST:event_txt_antigaSenhaKeyPressed

    private void txt_novaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_novaSenhaKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            txt_confirmaSenha.requestFocus();
        }
    }//GEN-LAST:event_txt_novaSenhaKeyPressed

    private void txt_confirmaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirmaSenhaKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            btn_salvar.requestFocus();
        }
    }//GEN-LAST:event_txt_confirmaSenhaKeyPressed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        validaCampos(txt_antigaSenha.getText(), txt_novaSenha.getText(), txt_confirmaSenha.getText());
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        pnl_alteraSenha.setVisible(false);
    }//GEN-LAST:event_btn_fecharActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_alteraSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_alteraSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_alteraSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_alteraSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_alteraSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnl_alteraSenha;
    private javax.swing.JPasswordField txt_antigaSenha;
    private javax.swing.JPasswordField txt_confirmaSenha;
    private javax.swing.JPasswordField txt_novaSenha;
    // End of variables declaration//GEN-END:variables

    private void validaCampos(String antigaSenha, String novaSenha, String confirmaSenha) {
        if (antigaSenha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Antiga Senha inválida!");
            txt_antigaSenha.requestFocus();
        } else {
            if (novaSenha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nova Senha inválida!");
                txt_novaSenha.requestFocus();
            } else {
                if (confirmaSenha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Confirmação da Nova Senha inválida!");
                    txt_confirmaSenha.requestFocus();
                } else {
                    if (novaSenha.equals(confirmaSenha) == false) {
                        JOptionPane.showMessageDialog(null, "Senhas Diferentes");
                        txt_novaSenha.setText(null);
                        txt_confirmaSenha.setText(null);
                        txt_novaSenha.requestFocus();
                    } else {
//                        validaAntigaSenha(antigaSenha, novaSenha);
                    }
                }
            }
        }
    }
}
