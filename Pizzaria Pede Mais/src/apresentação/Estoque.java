package apresentação;

import br.com.login.dao.ConectaBanco;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Devan
 */
public class Estoque extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();

    public Estoque() {
        initComponents();
        conecta.conexao();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTSabor = new javax.swing.JTextField();
        jTTamanho = new javax.swing.JTextField();
        jTQuantidade = new javax.swing.JTextField();
        jTPreço = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonVerEstoque = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque - Pede Mais");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 113, 67));
        jPanel2.setForeground(new java.awt.Color(243, 113, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sabor:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 93, 120, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tamanho:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 170, 140, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Preço:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 247, 90, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Quantidade:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 324, 150, -1));

        jTSabor.setBackground(new java.awt.Color(243, 113, 67));
        jTSabor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTSabor.setForeground(new java.awt.Color(255, 255, 255));
        jTSabor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSaborActionPerformed(evt);
            }
        });
        jPanel2.add(jTSabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 130, 332, 28));

        jTTamanho.setBackground(new java.awt.Color(243, 113, 67));
        jTTamanho.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTTamanho.setForeground(new java.awt.Color(255, 255, 255));
        jTTamanho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 207, 332, 28));

        jTQuantidade.setBackground(new java.awt.Color(243, 113, 67));
        jTQuantidade.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jTQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 361, 332, 28));

        jTPreço.setBackground(new java.awt.Color(243, 113, 67));
        jTPreço.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTPreço.setForeground(new java.awt.Color(255, 255, 255));
        jTPreço.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTPreço, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 284, 332, 28));

        jPanel1.setBackground(new java.awt.Color(243, 113, 67));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalvar.setBackground(new java.awt.Color(243, 113, 67));
        jButtonSalvar.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 133, 37));

        jButtonVerEstoque.setBackground(new java.awt.Color(243, 113, 67));
        jButtonVerEstoque.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButtonVerEstoque.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerEstoque.setText("Ver Estoque");
        jButtonVerEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVerEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 154, 37));

        jButton2.setBackground(new java.awt.Color(243, 113, 67));
        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 109, 37));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pink White Simple Blocks Login Page Wireframe Website UI Prototype (2)_1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 690, 181));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pink White Simple Blocks Login Page Wireframe Website UI Prototype (2)_1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 565, 415, 205));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pink White Simple Blocks Login Page Wireframe Website UI Prototype (3)_2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 650, 520));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pink White Simple Blocks Login Page Wireframe Website UI Prototype (5).png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -240, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerEstoqueActionPerformed
        ListaPizzas lp = new ListaPizzas();
        lp.setVisible(true);
    }//GEN-LAST:event_jButtonVerEstoqueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTSabor.getText().matches("") || jTTamanho.getText().matches("") || jTQuantidade.getText().matches("") || jTPreço.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        } else {
            try {
                PreparedStatement pst = conecta.conn.prepareStatement("insert into teste2 (sabor, tamanho, preço, quantidade)values(?,?,?,?)");
                pst.setString(1, jTSabor.getText());
                pst.setString(2, jTTamanho.getText());
                pst.setString(3, jTPreço.getText());
                pst.setString(4, jTQuantidade.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Pizza cadastrada com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar pizza!\n ERRO: " + ex);
            }
        }
        jTSabor.setText("");
        jTTamanho.setText("");
        jTPreço.setText("");
        jTQuantidade.setText("");
        jTSabor.requestFocus();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSaborActionPerformed

    /**
     *
     * @return
     */
    public JTextField getjTPreço() {
        return jTPreço;
    }

    public void setjTPreço(JTextField jTPreço) {
        this.jTPreço = jTPreço;
    }

    public JTextField getjTQuantidade() {
        return jTQuantidade;
    }

    public void setjTQuantidade(JTextField jTQuantidade) {
        this.jTQuantidade = jTQuantidade;
    }

    public JTextField getjTSabor() {
        return jTSabor;
    }

    public void setjTSabor(JTextField jTSabor) {
        this.jTSabor = jTSabor;
    }

    public JTextField getjTTamanho() {
        return jTTamanho;
    }

    public void setjTTamanho(JTextField jTTamanho) {
        this.jTTamanho = jTTamanho;
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVerEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTPreço;
    private javax.swing.JTextField jTQuantidade;
    private javax.swing.JTextField jTSabor;
    private javax.swing.JTextField jTTamanho;
    // End of variables declaration//GEN-END:variables
}
