/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import javax.swing.JFrame;

/**
 *
 * @author 17PROGB0442
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
       this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNEXT = new javax.swing.JButton();
        lblFaseLuminosa = new javax.swing.JLabel();
        lblimg1 = new javax.swing.JLabel();
        btnSALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fase Luminosa");
        setBackground(new java.awt.Color(204, 204, 0));
        setFocusable(false);
        setFocusableWindowState(false);
        setIconImages(null);
        setName("FASE LUMINOSA"); // NOI18N
        setResizable(false);

        btnNEXT.setBackground(new java.awt.Color(255, 204, 0));
        btnNEXT.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        btnNEXT.setText("NEXT");
        btnNEXT.setName(""); // NOI18N
        btnNEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEXTActionPerformed(evt);
            }
        });

        lblFaseLuminosa.setBackground(new java.awt.Color(153, 255, 153));
        lblFaseLuminosa.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        lblFaseLuminosa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFaseLuminosa.setText(" F a s e   L u m i n o s a");
        lblFaseLuminosa.setName(""); // NOI18N

        lblimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sun.jpg"))); // NOI18N
        lblimg1.setText("jLabel3");

        btnSALIR.setBackground(new java.awt.Color(204, 0, 0));
        btnSALIR.setForeground(new java.awt.Color(255, 255, 255));
        btnSALIR.setText("SALIR");
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblFaseLuminosa)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSALIR)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNEXT)
                        .addGap(253, 253, 253))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblFaseLuminosa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnNEXT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnSALIR)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEXTActionPerformed
        informacion obj1 = new informacion();
        obj1.setVisible(true);
    }//GEN-LAST:event_btnNEXTActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSALIRActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNEXT;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel lblFaseLuminosa;
    private javax.swing.JLabel lblimg1;
    // End of variables declaration//GEN-END:variables

    private void SetVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
