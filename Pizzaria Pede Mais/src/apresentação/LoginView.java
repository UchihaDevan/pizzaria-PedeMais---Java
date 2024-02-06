package apresentação;

import apresentação.Estoque;
import br.com.login.controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Devan
 */
public class LoginView extends javax.swing.JFrame {
public LoginView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCriarconta = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jTEmail = new javax.swing.JTextField();
        jPSenha = new javax.swing.JPasswordField();
        jlSenha = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Pede Mais");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 113, 67));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCriarconta.setContentAreaFilled(false);
        jButtonCriarconta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCriarconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarcontaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCriarconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 70, 10));

        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 270, 30));

        jTEmail.setBackground(new java.awt.Color(243, 113, 67));
        jTEmail.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 270, 30));

        jPSenha.setBackground(new java.awt.Color(243, 113, 67));
        jPSenha.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPSenha.setForeground(new java.awt.Color(255, 255, 255));
        jPSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(jPSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 270, 30));

        jlSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(0, 0, 0));
        jlSenha.setText("Senha");
        jPanel1.add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 50, 20));

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setForeground(new java.awt.Color(0, 0, 0));
        jlNome.setText("Email");
        jPanel1.add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 40, 20));

        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pink White Simple Blocks Login Page Wireframe Website UI Prototype (4).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 520));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pink White Simple Blocks Login Page Wireframe Website UI Prototype (5).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSenhaActionPerformed

    private void jButtonCriarcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarcontaActionPerformed
        this.setVisible(false);
        RegistroView teladeCadastro = new RegistroView();
       teladeCadastro.setVisible(true);
    }//GEN-LAST:event_jButtonCriarcontaActionPerformed

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        if (jTEmail.getText().matches("") || jPSenha.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        }else{
        
            LoginController login = new LoginController();
            try {
            login.loginUsuario(this);
        } catch (SQLException sql) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, sql);
        }
            this.setVisible(false);
        
    }
        
        
       
       
    }//GEN-LAST:event_jButtonLoginActionPerformed

    public JPasswordField getjPSenha() {
        return jPSenha;
    }

    public void setjPSenha(JPasswordField jPSenha) {
        this.jPSenha = jPSenha;
    }

    public JTextField getjTEmail() {
        return jTEmail;
    }

    public void setjTEmail(JTextField jTEmail) {
        this.jTEmail = jTEmail;
    }

    
    
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarconta;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    // End of variables declaration//GEN-END:variables
}
