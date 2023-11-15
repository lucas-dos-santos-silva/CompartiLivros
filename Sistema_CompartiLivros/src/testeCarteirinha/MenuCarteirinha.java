package testeCarteirinha;

import Sistema.Carteirinha;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class MenuCarteirinha extends javax.swing.JFrame {
    private JTextField telefone = new JTextField();
    /**
     * Creates new form Menu
     */
    public MenuCarteirinha() {
        initComponents();
        aplicaMascara();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdCNome = new javax.swing.JTextField();
        tfdCCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdCTelefone = new javax.swing.JTextField();
        tfdCRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfdCNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfdCComplemento = new javax.swing.JTextField();
        btnCCancelar = new javax.swing.JButton();
        btnCConfirmar1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Carteirinha");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Cpf:");

        tfdCNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfdCNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCNomeActionPerformed(evt);
            }
        });

        tfdCCpf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfdCCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCCpfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Endereço");

        tfdCTelefone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tfdCRua.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfdCRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCRuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Rua");

        tfdCNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfdCNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCNumeroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Número");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Complemento");

        tfdCComplemento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfdCComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCComplementoActionPerformed(evt);
            }
        });

        btnCCancelar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCCancelar.setText("Cancelar");
        btnCCancelar.setPreferredSize(new java.awt.Dimension(136, 39));
        btnCCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCancelarActionPerformed(evt);
            }
        });

        btnCConfirmar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCConfirmar1.setText("Confirmar");
        btnCConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCConfirmar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfdCRua, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(tfdCNome, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfdCCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdCNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tfdCComplemento)))
                            .addComponent(tfdCTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addComponent(btnCCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(311, Short.MAX_VALUE)
                    .addComponent(btnCConfirmar1)
                    .addGap(30, 30, 30)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdCRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdCNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdCComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdCTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnCCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(557, Short.MAX_VALUE)
                    .addComponent(btnCConfirmar1)
                    .addGap(20, 20, 20)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String cadastraCarteirinha(){
//      ArrayList<Carteirinha> carteirinhas = new ArrayList<Carteirinha>();
        String nomeC = this.tfdCNome.getText();
        String cpfC = this.tfdCCpf.getText();
        String ruaC = this.tfdCRua.getText();
        String numeroC = this.tfdCNumero.getText();
        String complementoC = this.tfdCComplemento.getText();
        String telefoneC = this.tfdCTelefone.getText();
        Carteirinha leitor = new Carteirinha(1, nomeC, telefoneC, ruaC, numeroC, complementoC,cpfC);
//        
        String sql = "INSERT INTO carteirinha VALUES"
                + " ("+1+",'"+leitor.getNome()+"'"+","
                +"'"+leitor.getTelefone()+"'"+","
                +"'"+leitor.getRua()+"'"+","
                +"'"+leitor.getNumero()+"'"+","
                +"'"+leitor.getComplemento()+"'"+","
                +"'"+leitor.getCpf()+");";
                                                                                   
        return sql;
    }
    private void tfdCNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCNomeActionPerformed
        
    }//GEN-LAST:event_tfdCNomeActionPerformed

    private void tfdCNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCNumeroActionPerformed

    private void tfdCComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCComplementoActionPerformed

    private void tfdCCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCCpfActionPerformed

    private void tfdCRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCRuaActionPerformed

    private void btnCCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCCancelarActionPerformed

    private void btnCConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCConfirmar1ActionPerformed
        String nomeC = this.tfdCNome.getText();
        String cpfC = this.tfdCCpf.getText();
        String ruaC = this.tfdCRua.getText();
        String numeroC = this.tfdCNumero.getText();
        String complementoC = this.tfdCComplemento.getText();
        String telefoneC = this.tfdCTelefone.getText();
            if("".equals(nomeC )||"".equals(cpfC )||"".equals(ruaC )|| "".equals(numeroC )||"".equals(complementoC )||"".equals(telefoneC )){
                JOptionPane.showMessageDialog(null, "Campo nao preenchido");
            }else{
                System.out.println(cadastraCarteirinha());
                JOptionPane.showMessageDialog(null, "Carteirinha cadastrada com sucesso");
            }
        
    }//GEN-LAST:event_btnCConfirmar1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCarteirinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCarteirinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCCancelar;
    private javax.swing.JButton btnCConfirmar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField tfdCComplemento;
    private javax.swing.JTextField tfdCCpf;
    private javax.swing.JTextField tfdCNome;
    private javax.swing.JTextField tfdCNumero;
    private javax.swing.JTextField tfdCRua;
    private javax.swing.JTextField tfdCTelefone;
    // End of variables declaration//GEN-END:variables

    private String toString(JTextField tfdCNome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void aplicaMascara() {
        try{
            JTextField telefone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
            System.out.println("ok");
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
