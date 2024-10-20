package Projects;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class seleccionImagenes extends javax.swing.JFrame {
    
    Image awm = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\ProjectsJava\\src\\Projects\\awm.png");
    Image mag7 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\ProjectsJava\\src\\Projects\\mag7.png");
    Image mp40 = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\ProjectsJava\\src\\Projects\\mp40.jpg");
    Image nada = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansLogic\\ProjectsJava\\src\\Projects\\nada.jpg");

    public seleccionImagenes() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.cmbPicture.addItem("Seleccione una opción");
        this.cmbPicture.addItem("AWM");
        this.cmbPicture.addItem("MAG-7");
        this.cmbPicture.addItem("MP40");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbPicture = new javax.swing.JComboBox<>();
        lblInformation = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar Imágenes"));

        cmbPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPictureActionPerformed(evt);
            }
        });

        lblInformation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPicture, 0, 345, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cmbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPictureActionPerformed
        int opc;
        
        awm = awm.getScaledInstance(280, 220, 1);
        mag7 = mag7.getScaledInstance(280, 220, 1);
        mp40 = mp40.getScaledInstance(280, 220, 1);
        nada =  nada.getScaledInstance(280, 220, 1);
        
        opc = this.cmbPicture.getSelectedIndex();
        if (opc == 1) {
            this.lblInformation.setText("<html><body>Esta es una <b>AWM</b></body></html>");
            this.lblPicture.setIcon(new ImageIcon(awm));
        } 
        if (opc == 2) {
            this.lblInformation.setText("<html><body>Esta es una <b>MAG-7</b></body></html>");
            this.lblPicture.setIcon(new ImageIcon(mag7));
        }
        if (opc == 3) {
            this.lblInformation.setText("<html><body>Esta es una <b>MP40</b></body></html>");
            this.lblPicture.setIcon(new ImageIcon(mp40));
        }
        if (opc == 0) {
            this.lblInformation.setText("<html><body><b>No se ha seleccionado nada</b></body></html>");
            this.lblPicture.setIcon(new ImageIcon(nada));
        }
    }//GEN-LAST:event_cmbPictureActionPerformed

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
            java.util.logging.Logger.getLogger(seleccionImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seleccionImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seleccionImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seleccionImagenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seleccionImagenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInformation;
    private javax.swing.JLabel lblPicture;
    // End of variables declaration//GEN-END:variables
}
