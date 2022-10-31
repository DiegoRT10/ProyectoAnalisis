/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cunori.kardex.views;

import cunori.kardex.controller.ProveedorJpaController;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.dao.Proveedor;
import static cunori.kardex.views.ListarProveedores.tblListarProveedores;
import java.awt.Font;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Diego Ramos
 * @author Hermas Ramirez
 */
public class ListarProveedoresCompra extends javax.swing.JDialog {

    /**
     * Creates new form ListarProveedoresCompra
     */
    
    EntityManagerFactory emf;
    ProveedorJpaController ProveedorEntityManager;
    public static TableRowSorter<DefaultTableModel> sorter;
    
    
    public ListarProveedoresCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        //this.setExtendedState(MAXIMIZED_BOTH);
        tblListarProveedores.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 20));

        emf = Persistence.createEntityManagerFactory("cunori_kardex_jar_1.0-SNAPSHOTPU");
        ProveedorEntityManager = new ProveedorJpaController(emf);
        
        ListarUsuarios();
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
        txtBuscar = new javax.swing.JTextField();
        jLblBuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarProveedores = new javax.swing.JTable();
        pnlLeft = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 712));
        setPreferredSize(new java.awt.Dimension(1230, 712));

        jPanel1.setBackground(new java.awt.Color(129, 164, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 522));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Proveedores");

        txtBuscar.setBackground(new java.awt.Color(129, 164, 220));
        txtBuscar.setToolTipText("Filtrar \"ten en cuenta las mayusculas\"");
        txtBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0buscar.png"))); // NOI18N

        tblListarProveedores.setBackground(new java.awt.Color(255, 255, 255));
        tblListarProveedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 102, 255)));
        tblListarProveedores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblListarProveedores.setForeground(new java.awt.Color(0, 0, 0));
        tblListarProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIT", "Nombre", "Direccion", "Correo", "Telefono", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarProveedores.setGridColor(new java.awt.Color(153, 255, 153));
        tblListarProveedores.setSelectionBackground(new java.awt.Color(255, 255, 204));
        tblListarProveedores.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblListarProveedores.setShowGrid(true);
        tblListarProveedores.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblListarProveedores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pnlLeft.setBackground(new java.awt.Color(129, 164, 220));

        btnRegresar.setBackground(new java.awt.Color(129, 164, 220));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0undo_111005.png"))); // NOI18N
        btnRegresar.setToolTipText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(129, 164, 220));
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setBorder(null);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnSeleccionar.setBackground(new java.awt.Color(129, 164, 220));
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0select_110958.png"))); // NOI18N
        btnSeleccionar.setToolTipText("Crear");
        btnSeleccionar.setBorder(null);
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir))
                .addContainerGap())
            .addComponent(btnSeleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(324, 324, 324)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio i = new Inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
//        FormCrearProveedor fcp = new FormCrearProveedor();
//        fcp.setVisible(true);
//        this.dispose();
                                         
    int fila = tblListarProveedores.getSelectedRow();
    if(fila != -1){
    String idProveedor = (String) tblListarProveedores.getValueAt(fila, 5);
    String nitProveedor = (String) tblListarProveedores.getValueAt(fila, 0);
    String nombreProveedor = (String) tblListarProveedores.getValueAt(fila, 1);
    
    FormCrearCompra.DatosProveedor(idProveedor, nitProveedor, nombreProveedor);
            this.dispose();
    }else{JOptionPane.showMessageDialog(null, "No se ha selccionado nada");}

    }//GEN-LAST:event_btnSeleccionarActionPerformed

    
    private void ListarUsuarios(){
    DefaultTableModel model = (DefaultTableModel) tblListarProveedores.getModel();
    List<Proveedor> usuario = ProveedorEntityManager.findProveedorEntities();
    model.setRowCount(0); //eliminar filas existentes
    tblListarProveedores.setDefaultRenderer(Object.class, new Render());
    
    for(Proveedor p : usuario){
        Object newRow[] = {p.getNit(),p.getNombre(),p.getDireccion(),p.getCorreo(),p.getTelefono(),p.getId()};
        model.addRow(newRow);
    }   
        //Ocultar id
        TableColumn columna2 = tblListarProveedores.getColumnModel().getColumn(5);
        columna2.setMaxWidth(0);
        columna2.setMinWidth(0);
        columna2.setPreferredWidth(0);
        tblListarProveedores.doLayout();
    }
    
    public  void setDatosUsuario(){
    int fila = tblListarProveedores.getSelectedRow();

    String nit = (String) tblListarProveedores.getValueAt(fila,0);
    String nombre = (String) tblListarProveedores.getValueAt(fila,1);
    String direccion = (String) tblListarProveedores.getValueAt(fila,2);
    String correo = (String) tblListarProveedores.getValueAt(fila,3); 
    String telefono = (String) tblListarProveedores.getValueAt(fila,4);
    String id = (String) tblListarProveedores.getValueAt(fila,5);
    
    FormEditarProveedor.setDatosProveedor(nit,nombre,direccion,correo,telefono,id);
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
            java.util.logging.Logger.getLogger(ListarProveedoresCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProveedoresCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProveedoresCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProveedoresCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarProveedoresCompra dialog = new ListarProveedoresCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlLeft;
    public static javax.swing.JTable tblListarProveedores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
