/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cunori.kardex.views;


import cunori.kardex.controller.UsuarioJpaController;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.dao.Usuario;
import cunori.kardex.encrypt.Hash;
import java.awt.Font;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Diego Ramos
 */
public class FormEditarUsuario extends javax.swing.JFrame {

    EntityManagerFactory emf;
    UsuarioJpaController UsuarioEntityManager;
    public static String idB ="";
    public static TableRowSorter<DefaultTableModel> sorter;

    public FormEditarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        //this.setExtendedState(MAXIMIZED_BOTH);

        emf = Persistence.createEntityManagerFactory("cunori_kardex_jar_1.0-SNAPSHOTPU");
        UsuarioEntityManager = new UsuarioJpaController(emf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCodin = new javax.swing.JLabel();
        txtDPI = new javax.swing.JTextField();
        lblCodin1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodin2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblCodin3 = new javax.swing.JLabel();
        lblCodin4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblCodin5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCodin6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblCodin7 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        lblCodin8 = new javax.swing.JLabel();
        lblCodin9 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        pnlLeft = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(129, 164, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 522));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Datos del Usuario");

        lblCodin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin.setText("DPI:");

        txtDPI.setBackground(new java.awt.Color(129, 164, 220));
        txtDPI.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDPI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        lblCodin1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin1.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(129, 164, 220));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        lblCodin2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin2.setText("Apellidos:");

        txtApellidos.setBackground(new java.awt.Color(129, 164, 220));
        txtApellidos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtApellidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        txtDireccion.setBackground(new java.awt.Color(129, 164, 220));
        txtDireccion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        lblCodin3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin3.setText("Direccion:");

        lblCodin4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin4.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(129, 164, 220));
        txtCorreo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        lblCodin5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin5.setText("Telefono:");

        txtTelefono.setBackground(new java.awt.Color(129, 164, 220));
        txtTelefono.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        lblCodin6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin6.setText("Usuario:");

        txtUsuario.setBackground(new java.awt.Color(129, 164, 220));
        txtUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblCodin7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin7.setText("Contraseña:");

        txtContrasena.setBackground(new java.awt.Color(129, 164, 220));
        txtContrasena.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtContrasena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseClicked(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        txtNIT.setBackground(new java.awt.Color(129, 164, 220));
        txtNIT.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNIT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));

        lblCodin8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin8.setText("NIT:");

        lblCodin9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCodin9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodin9.setText("Rol:");

        cbxRol.setBackground(new java.awt.Color(129, 164, 220));
        cbxRol.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Administrador", "Vendedor" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodin3)
                                    .addComponent(lblCodin1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodin2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodin5)
                                    .addComponent(lblCodin4)
                                    .addComponent(lblCodin6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodin8)
                                    .addComponent(lblCodin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDPI, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                                    .addComponent(txtNIT)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCodin7)
                                .addComponent(lblCodin9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContrasena)
                                .addComponent(cbxRol, 0, 817, Short.MAX_VALUE)))))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodin9)
                    .addComponent(cbxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 0, 1230, 590));

        pnlLeft.setBackground(new java.awt.Color(129, 164, 220));

        btnImprimir.setBackground(new java.awt.Color(129, 164, 220));
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setBorder(null);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(129, 164, 220));
        btnEliminar.setToolTipText("Anular");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(129, 164, 220));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarCheque.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(129, 164, 220));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regresar.png"))); // NOI18N
        btnRegresar.setToolTipText("Guardar");
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(btnImprimir)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(214, 214, 214)
                .addComponent(btnEliminar)
                .addGap(62, 62, 62)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
        );

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (EditarUsuario()) {
            JOptionPane.showMessageDialog(null, "El Usuario " + txtNombre.getText() + " se editó correctamente");
            ListarUsuarios lu = new ListarUsuarios();
            lu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo editar el Usuario");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ListarUsuarios lu = new ListarUsuarios();
        lu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseClicked
       txtContrasena.setText("");
    }//GEN-LAST:event_txtContrasenaMouseClicked

    private Boolean Vacio() {
        return txtDPI.getText().isEmpty()
                && txtNIT.getText().isEmpty();
    }
    
    private Boolean EditarUsuario(){
    if (!Vacio()) {
            Usuario p = new Usuario();
            p.setId(idB);
            p.setDpi(txtDPI.getText());
            p.setNit(txtNIT.getText());
            p.setNombre(txtNombre.getText());
            p.setApellidos(txtApellidos.getText());
            p.setDireccion(txtDireccion.getText());
            p.setCorreo(txtCorreo.getText());
            p.setTelefono(txtTelefono.getText());
            p.setUsuario(txtUsuario.getText());
            p.setContrasena(Hash.sha1(txtContrasena.getText()));
            Integer cbx = cbxRol.getSelectedIndex();
            System.out.println("cbx "+cbx);
            p.setRol(cbx.toString());
            System.out.println("cbx obj "+p.getRol());

           
        try {
            UsuarioEntityManager.edit(p);
             return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(FormEditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Datos repetidos o mal ingresados");
                return false;
        } catch (Exception ex) {
            Logger.getLogger(FormEditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Datos repetidos o mal ingresados");
                return false;
        }
               
           

                
            
        } else {
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }
        return false;
    }
    
    public static void setDatosUsuario(String dpi,String nit,String nombre,String apellido,String direccion,String correo,String telefono,String usuario,String contrasena,String rol, String id){
    txtDPI.setText(dpi);
    txtNIT.setText(nit);
    txtNombre.setText(nombre);
    txtApellidos.setText(apellido);
    txtDireccion.setText(direccion);
    txtCorreo.setText(correo);
    txtTelefono.setText(telefono);
    txtUsuario.setText(usuario);
    txtContrasena.setText(contrasena);
    cbxRol.setSelectedItem(rol);
    idB = id;
       
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
            java.util.logging.Logger.getLogger(FormEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    public static javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodin;
    private javax.swing.JLabel lblCodin1;
    private javax.swing.JLabel lblCodin2;
    private javax.swing.JLabel lblCodin3;
    private javax.swing.JLabel lblCodin4;
    private javax.swing.JLabel lblCodin5;
    private javax.swing.JLabel lblCodin6;
    private javax.swing.JLabel lblCodin7;
    private javax.swing.JLabel lblCodin8;
    private javax.swing.JLabel lblCodin9;
    private javax.swing.JPanel pnlLeft;
    public static javax.swing.JTextField txtApellidos;
    public static javax.swing.JTextField txtContrasena;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtDPI;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNIT;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTelefono;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
