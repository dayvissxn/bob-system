
package Telas;

import dao.PesquisarDAO;
import dto.ModelPerfil;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class telaPerfil extends javax.swing.JFrame {
    PesquisarDAO DAOPES;
    ModelPerfil objpes = new ModelPerfil();

 
    public telaPerfil() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btvoltar = new javax.swing.JButton();
        jtcidade = new javax.swing.JTextField();
        jtestadocivil = new javax.swing.JTextField();
        jttelefone = new javax.swing.JTextField();
        jtestado = new javax.swing.JTextField();
        jtendereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtcodigo = new javax.swing.JTextField();
        jbpesquisar = new javax.swing.JButton();
        jtidade = new javax.swing.JTextField();
        jtnome = new javax.swing.JTextField();
        jtproficao = new javax.swing.JTextField();
        jtemail = new javax.swing.JTextField();
        jtcurso4 = new javax.swing.JTextField();
        jtcurso1 = new javax.swing.JTextField();
        jtcurso2 = new javax.swing.JTextField();
        jtcurso3 = new javax.swing.JTextField();
        btdicas = new javax.swing.JButton();
        btcontatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta_resized.png"))); // NOI18N
        btvoltar.setBorder(null);
        btvoltar.setBorderPainted(false);
        btvoltar.setContentAreaFilled(false);
        btvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jtcidade.setBackground(new java.awt.Color(0, 51, 204));
        jtcidade.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtcidade.setForeground(new java.awt.Color(255, 255, 255));
        jtcidade.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtcidade.setBorder(null);
        jtcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcidadeActionPerformed(evt);
            }
        });
        jPanel2.add(jtcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 430, 40));

        jtestadocivil.setBackground(new java.awt.Color(0, 51, 204));
        jtestadocivil.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtestadocivil.setForeground(new java.awt.Color(255, 255, 255));
        jtestadocivil.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtestadocivil.setBorder(null);
        jtestadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtestadocivilActionPerformed(evt);
            }
        });
        jPanel2.add(jtestadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 430, 40));

        jttelefone.setBackground(new java.awt.Color(0, 51, 204));
        jttelefone.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jttelefone.setForeground(new java.awt.Color(255, 255, 255));
        jttelefone.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jttelefone.setBorder(null);
        jttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(jttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 430, 40));

        jtestado.setBackground(new java.awt.Color(0, 51, 204));
        jtestado.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtestado.setForeground(new java.awt.Color(255, 255, 255));
        jtestado.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtestado.setBorder(null);
        jtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtestadoActionPerformed(evt);
            }
        });
        jPanel2.add(jtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 430, 40));

        jtendereco.setBackground(new java.awt.Color(0, 51, 204));
        jtendereco.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtendereco.setForeground(new java.awt.Color(255, 255, 255));
        jtendereco.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtendereco.setBorder(null);
        jtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtenderecoActionPerformed(evt);
            }
        });
        jPanel2.add(jtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 430, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matricula");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 30));

        jtcodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 130, 30));

        jbpesquisar.setBackground(new java.awt.Color(0, 51, 204));
        jbpesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbpesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jbpesquisar.setText("Pesquisar");
        jbpesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jbpesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(jbpesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 40));

        jtidade.setBackground(new java.awt.Color(0, 51, 204));
        jtidade.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtidade.setForeground(new java.awt.Color(255, 255, 255));
        jtidade.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtidade.setText(" ");
        jtidade.setBorder(null);
        jtidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtidadeActionPerformed(evt);
            }
        });
        jPanel2.add(jtidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 430, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 720));

        jtnome.setFont(new java.awt.Font("Yu Gothic", 1, 48)); // NOI18N
        jtnome.setForeground(new java.awt.Color(0, 51, 204));
        jtnome.setBorder(null);
        jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomeActionPerformed(evt);
            }
        });
        jPanel1.add(jtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 720, 60));

        jtproficao.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtproficao.setForeground(new java.awt.Color(0, 51, 204));
        jtproficao.setBorder(null);
        jPanel1.add(jtproficao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 630, 40));

        jtemail.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtemail.setForeground(new java.awt.Color(0, 51, 204));
        jtemail.setBorder(null);
        jtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtemailActionPerformed(evt);
            }
        });
        jPanel1.add(jtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 630, 40));

        jtcurso4.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtcurso4.setForeground(new java.awt.Color(0, 51, 204));
        jtcurso4.setBorder(null);
        jPanel1.add(jtcurso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 630, 40));

        jtcurso1.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtcurso1.setForeground(new java.awt.Color(0, 51, 204));
        jtcurso1.setBorder(null);
        jPanel1.add(jtcurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 630, 40));

        jtcurso2.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtcurso2.setForeground(new java.awt.Color(0, 51, 204));
        jtcurso2.setBorder(null);
        jtcurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcurso2ActionPerformed(evt);
            }
        });
        jPanel1.add(jtcurso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 630, 40));

        jtcurso3.setFont(new java.awt.Font("Yu Gothic", 1, 28)); // NOI18N
        jtcurso3.setForeground(new java.awt.Color(0, 51, 204));
        jtcurso3.setBorder(null);
        jtcurso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcurso3ActionPerformed(evt);
            }
        });
        jPanel1.add(jtcurso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 630, 40));

        btdicas.setBackground(new java.awt.Color(51, 153, 255));
        btdicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btdicas.png"))); // NOI18N
        btdicas.setBorder(null);
        btdicas.setBorderPainted(false);
        btdicas.setContentAreaFilled(false);
        btdicas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btdicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdicasActionPerformed(evt);
            }
        });
        jPanel1.add(btdicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 60, 40));

        btcontatos.setBackground(new java.awt.Color(51, 153, 255));
        btcontatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btcontatos.png"))); // NOI18N
        btcontatos.setBorder(null);
        btcontatos.setBorderPainted(false);
        btcontatos.setContentAreaFilled(false);
        btcontatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btcontatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bob_feliz-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 460, 180, 230));

        btsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btsair.png"))); // NOI18N
        btsair.setBorder(null);
        btsair.setBorderPainted(false);
        btsair.setContentAreaFilled(false);
        btsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });
        jPanel1.add(btsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 50, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        // Botão de Sair:
        
        new telaConfirmarSaida().setVisible(true);
         
    }//GEN-LAST:event_btsairActionPerformed

    private void btdicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdicasActionPerformed

    private void jbpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpesquisarActionPerformed
        DAOPES = new PesquisarDAO();
        objpes = new ModelPerfil();
        String codigo = jtcodigo.getText().trim();

        try{
            objpes = DAOPES.Pesquisar(Integer.parseInt(codigo));

            if (objpes != null) { // encontrou o registro
                jtcodigo.setText(String.valueOf(objpes.getCodigo()));
                jtnome.setText(objpes.getNome().trim());
                jtproficao.setText(objpes.getProficao().trim());
                jtemail.setText(objpes.getEmail().trim());
                jtcurso1.setText(objpes.getCurso1().trim());
                jtcurso2.setText(objpes.getCurso2().trim());
                jtcurso3.setText(objpes.getCurso3().trim());
                jtcurso4.setText(objpes.getCurso4().trim());
                jtidade.setText(objpes.getIdade().trim());
                jtestadocivil.setText(objpes.getEstadocivil().trim());
                jtendereco.setText(objpes.getEndereco().trim());
                jtcidade.setText(objpes.getCidade().trim());
                jtestado.setText(objpes.getEstado().trim());
                jttelefone.setText(objpes.getTelefone().trim());
            }else{
                JOptionPane.showConfirmDialog(null, "Código Inválido");
                apossalvar();
            }

        }catch (SQLException ex) {

        }
    }//GEN-LAST:event_jbpesquisarActionPerformed

    private void btvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltarActionPerformed
        // Botão de Voltar:

        telaInicial tInicial = new telaInicial();
        tInicial.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btvoltarActionPerformed

    private void jtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomeActionPerformed

    private void jtcurso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcurso3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcurso3ActionPerformed

    private void jtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtemailActionPerformed

    private void jtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtenderecoActionPerformed

    private void jtcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcidadeActionPerformed

    private void jtestadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtestadocivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtestadocivilActionPerformed

    private void jtidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtidadeActionPerformed

    private void jtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtestadoActionPerformed

    private void jttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttelefoneActionPerformed

    private void jtcurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcurso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcurso2ActionPerformed

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
            java.util.logging.Logger.getLogger(telaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcontatos;
    private javax.swing.JButton btdicas;
    private javax.swing.JButton btsair;
    private javax.swing.JButton btvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbpesquisar;
    private javax.swing.JTextField jtcidade;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtcurso1;
    private javax.swing.JTextField jtcurso2;
    private javax.swing.JTextField jtcurso3;
    private javax.swing.JTextField jtcurso4;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtendereco;
    private javax.swing.JTextField jtestado;
    private javax.swing.JTextField jtestadocivil;
    private javax.swing.JTextField jtidade;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jtproficao;
    private javax.swing.JTextField jttelefone;
    // End of variables declaration//GEN-END:variables

    public void apossalvar(){
        jtnome.setText("");
        jtproficao.setText("");
        jtemail.setText("");
        jtcurso1.setText("");
        jtcurso2.setText("");
        jtcurso3.setText("");
        jtcurso4.setText("");
        jtidade.setText("");
        jtestadocivil.setText("");
        jtendereco.setText("");
        jtcidade.setText("");
        jtestado.setText("");
        jttelefone.setText("");
        jtcodigo.setText("");
        
        jtnome.setEnabled(false);
        jtproficao.setEnabled(false);
        jtemail.setEnabled(false);
        jtcurso1.setEnabled(false);
        jtcurso2.setEnabled(false);
        jtcurso3.setEnabled(false);
        jtcurso4.setEnabled(false);
        jtidade.setEnabled(false);
        jtestadocivil.setEnabled(false);
        jtendereco.setEnabled(false);
        jtcidade.setEnabled(false);
        jttelefone.setEnabled(false);       
        jtcodigo.setEnabled(true);
        objpes = new ModelPerfil();
    }
}
