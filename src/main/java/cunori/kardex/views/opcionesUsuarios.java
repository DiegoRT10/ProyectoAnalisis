/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cunori.kardex.views;

/**
 *
 * @author hermas
 */
public class opcionesUsuarios extends javax.swing.JDialog {

    /**
     * Creates new form opcionesUsuarios
     */
    public opcionesUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlopcionesUsuarios = new javax.swing.JPanel();
        pnlTituloSeccionUsuario = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblinfoGerente = new javax.swing.JLabel();
        lblImgGerente = new javax.swing.JLabel();
        lblTituloGerente = new javax.swing.JLabel();
        lblGerente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTituloAdmin = new javax.swing.JLabel();
        lblImgAdmin = new javax.swing.JLabel();
        lblInfoAdmin = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        lblInfoVendedor = new javax.swing.JLabel();
        lblTituloVendedor = new javax.swing.JLabel();
        lblImgVendedor = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1230, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlopcionesUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlopcionesUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlopcionesUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloSeccionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlTituloSeccionUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTituloSeccionUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionUsuarioMouseMoved(evt);
            }
        });
        pnlTituloSeccionUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionUsuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionUsuarioMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administradores.png"))); // NOI18N
        jLabel14.setText("  Usuario");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlTituloSeccionUsuarioLayout = new javax.swing.GroupLayout(pnlTituloSeccionUsuario);
        pnlTituloSeccionUsuario.setLayout(pnlTituloSeccionUsuarioLayout);
        pnlTituloSeccionUsuarioLayout.setHorizontalGroup(
            pnlTituloSeccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTituloSeccionUsuarioLayout.setVerticalGroup(
            pnlTituloSeccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlopcionesUsuarios.add(pnlTituloSeccionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        lblinfoGerente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblinfoGerente.setForeground(new java.awt.Color(153, 153, 153));
        lblinfoGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblinfoGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 260, 150));

        lblImgGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        lblImgGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblImgGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 140));

        lblTituloGerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloGerente.setForeground(new java.awt.Color(153, 153, 153));
        lblTituloGerente.setText("Gerente");
        lblTituloGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblTituloGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblGerente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGerenteMouseClicked(evt);
            }
        });
        pnlopcionesUsuarios.add(lblGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 316, 371));
        pnlopcionesUsuarios.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        lblTituloAdmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloAdmin.setForeground(new java.awt.Color(153, 153, 153));
        lblTituloAdmin.setText("Administrador");
        lblTituloAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblTituloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        lblImgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        lblImgAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblImgAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 290, 140));

        lblInfoAdmin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoAdmin.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblInfoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 260, 150));

        lblAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorMouseClicked(evt);
            }
        });
        pnlopcionesUsuarios.add(lblAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 316, 371));

        lblInfoVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoVendedor.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblInfoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 260, 150));

        lblTituloVendedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloVendedor.setForeground(new java.awt.Color(153, 153, 153));
        lblTituloVendedor.setText("Vendedor");
        lblTituloVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblTituloVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        lblImgVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        lblImgVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlopcionesUsuarios.add(lblImgVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 290, 140));

        lblVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVendedorMouseClicked(evt);
            }
        });
        pnlopcionesUsuarios.add(lblVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 316, 371));

        getContentPane().add(pnlopcionesUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTituloSeccionUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionUsuarioMouseMoved
        
    }//GEN-LAST:event_pnlTituloSeccionUsuarioMouseMoved

    private void pnlTituloSeccionUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionUsuarioMouseClicked

    private void pnlTituloSeccionUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionUsuarioMouseExited
        
    }//GEN-LAST:event_pnlTituloSeccionUsuarioMouseExited

    private void lblGerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGerenteMouseClicked

    }//GEN-LAST:event_lblGerenteMouseClicked

    private void lblAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAdministradorMouseClicked

    private void lblVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVendedorMouseClicked

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
            java.util.logging.Logger.getLogger(opcionesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opcionesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opcionesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opcionesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                opcionesUsuarios dialog = new opcionesUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblGerente;
    private javax.swing.JLabel lblImgAdmin;
    private javax.swing.JLabel lblImgGerente;
    private javax.swing.JLabel lblImgVendedor;
    private javax.swing.JLabel lblInfoAdmin;
    private javax.swing.JLabel lblInfoVendedor;
    private javax.swing.JLabel lblTituloAdmin;
    private javax.swing.JLabel lblTituloGerente;
    private javax.swing.JLabel lblTituloVendedor;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JLabel lblinfoGerente;
    private javax.swing.JPanel pnlTituloSeccionUsuario;
    private javax.swing.JPanel pnlopcionesUsuarios;
    // End of variables declaration//GEN-END:variables
}
