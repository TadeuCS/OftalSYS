/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Atendimento;

import Model.Anexo;
import Model.Atendimento;
import Util.Classes.PropertiesManager;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Frm_Anexo extends javax.swing.JFrame {

    String diretorio = null;
    List<Anexo> lista;
    PropertiesManager prop;
    int codigo;
    Anexo anexo;
    Atendimento atendimento;

    public Frm_Anexo(Atendimento att) {
        initComponents();
        atendimento = att;
        setVisible(true);
        limpaAnexos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_gravar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_qtdeAnexos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anexar Imagens");
        setResizable(false);

        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Adicionar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        jLabel1.setText("Anexos:");

        txt_qtdeAnexos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_qtdeAnexos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_qtdeAnexos.setText("0");

        foto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(foto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_qtdeAnexos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1113, Short.MAX_VALUE)
                        .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gravar)
                    .addComponent(btn_buscar)
                    .addComponent(btn_limpar)
                    .addComponent(jLabel1)
                    .addComponent(txt_qtdeAnexos))
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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        buscaImagem();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        lista = new ArrayList<>();
        txt_qtdeAnexos.setText("0");
        foto.setIcon(null);
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        gravarAnexos();
    }//GEN-LAST:event_btn_gravarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Anexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Anexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Anexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Anexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Anexo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txt_qtdeAnexos;
    // End of variables declaration//GEN-END:variables

    private void buscaImagem() {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(this);//abre o arquivo  
        File file = c.getSelectedFile();//abre o arquivo selecionado  
        Path path = Paths.get(file.getAbsolutePath());
        diretorio = path.toString();
        if (diretorio.endsWith("png") || diretorio.endsWith("jpg")) {
            byte[] bFile = new byte[(int) file.length()];
            if (bFile.length <= 1048576) {
                try {
                    anexo = new Anexo();

                    anexo.setCodatendimento(atendimento);
                    FileInputStream fis = new FileInputStream(file);
                    fis.read(bFile);
                    fis.close();
                    anexo.setImagem(bFile);
                    lista.add(anexo);
                    carregaImagem(diretorio);
                    txt_qtdeAnexos.setText(Integer.parseInt(txt_qtdeAnexos.getText()) + 1 + "");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir imagem na lista!\n" + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Imagem muito grande!\n");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Extenção do arquivo selecionado inválido!\n "
                    + "Tente imagens com extenção: PNG ou JPG");
        }
    }

    private ImageIcon getImagemByCaminho(String caminho) {
        ImageIcon imagem = new ImageIcon(caminho);
        if (imagem != null) {
            return imagem;
        } else {
            System.err.println("Não foi possível encontrar o arquivo: " + caminho);
            return null;
        }
    }

    private void carregaImagem(String caminho) {
        try {
            foto.setIcon(new ImageIcon(alteraTamanhoImagem(getImagemByCaminho(caminho.replace("\\", "/")).getImage(), this.getWidth() - 50)));
            foto.revalidate();
            foto.repaint();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Image alteraTamanhoImagem(Image img, int largura) {
        //Calcula a proporção para descobrir a nova altura  
        double proportion = largura / (double) img.getWidth(null);
        int newHeight = (int) (img.getHeight(null) * proportion);

        //Cria a imagem de destino          
        BufferedImage newImage = new BufferedImage(largura, newHeight, BufferedImage.TYPE_INT_ARGB);

        //Desenha sobre ela usando filtro Bilinear (o java não possui trinilear ou anisotrópica).  
        Graphics2D g2d = newImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(img, 0, 0, largura, newHeight, null);
        g2d.dispose();

        return newImage;
    }

    private void limpaAnexos() {
        try {
            lista = new ArrayList<>();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao limpar os anexos!\n" + e.getMessage());
        }
    }

    private void gravarAnexos() {
        try {
            atendimento.setAnexoList(lista);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao anexar as imagens!\n" + e.getMessage());
        }
        dispose();
    }
}
