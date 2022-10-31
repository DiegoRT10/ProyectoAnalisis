/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cunori.kardex.views;

import cunori.kardex.controller.ProductoJpaController;
import cunori.kardex.dao.Producto;
import static cunori.kardex.views.ListarInventario.tblListarProductos;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
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
public class ListarProductoCompra extends javax.swing.JDialog {

    /**
     * Creates new form ListarProductoCompra
     */
    EntityManagerFactory emf;
   ProductoJpaController ProductoEntityManager;
    public static TableRowSorter<DefaultTableModel> sorter;
    public ListarProductoCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        //this.setExtendedState(MAXIMIZED_BOTH);
        tblListarProductos.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 20));

        emf = Persistence.createEntityManagerFactory("cunori_kardex_jar_1.0-SNAPSHOTPU");
        ProductoEntityManager = new ProductoJpaController(emf);
        
        ListarProductos();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarProductos = new javax.swing.JTable();
        lblCodin5 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPrecioVenta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCodin6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblCodin7 = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(129, 164, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 522));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Inventario");

        txtBuscar.setBackground(new java.awt.Color(129, 164, 220));
        txtBuscar.setToolTipText("Filtrar \"ten en cuenta las mayusculas\"");
        txtBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0buscar.png"))); // NOI18N

        tblListarProductos.setBackground(new java.awt.Color(255, 255, 255));
        tblListarProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 102, 255)));
        tblListarProductos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblListarProductos.setForeground(new java.awt.Color(0, 0, 0));
        tblListarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Categoría", "Marca", "Unidad", "Peso Neto", "Precio Compra", "Precio Venta", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblListarProductos.setGridColor(new java.awt.Color(153, 255, 153));
        tblListarProductos.setSelectionBackground(new java.awt.Color(255, 255, 204));
        tblListarProductos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblListarProductos.setShowGrid(true);
        tblListarProductos.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblListarProductos);

        lblCodin5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCodin5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodin5.setText("Precio Compra");

        txtPrecioCompra.setBackground(new java.awt.Color(129, 164, 220));
        txtPrecioCompra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPrecioCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioCompra.setBorder(null);
        txtPrecioCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioCompraMouseClicked(evt);
            }
        });

        txtPrecioVenta.setBackground(new java.awt.Color(129, 164, 220));
        txtPrecioVenta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPrecioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecioVenta.setBorder(null);
        txtPrecioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioVentaMouseClicked(evt);
            }
        });
        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        lblCodin6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCodin6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodin6.setText("Precio Venta");

        txtCantidad.setBackground(new java.awt.Color(129, 164, 220));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadMouseClicked(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        lblCodin7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblCodin7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodin7.setText("Cantidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 601, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(lblCodin7))))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCodin5)
                                        .addGap(100, 100, 100))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(lblCodin6))))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodin6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodin5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodin7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 0, 1100, -1));

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

        btnEditar.setBackground(new java.awt.Color(129, 164, 220));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardarCheque.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 522));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tblListarProductos.getSelectedRow();
        if(fila != -1){
            if(txtCantidad.getText().isEmpty() && txtPrecioCompra.getText().isEmpty() && txtPrecioVenta.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
            }else{
                setSeleccionProducto();
                this.dispose();
            }
            
            
        }else{JOptionPane.showMessageDialog(null, "No se ha selccionado nada");}
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio i = new Inicio();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtPrecioCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraMouseClicked

    private void txtPrecioVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioVentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaMouseClicked

    private void txtCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadMouseClicked

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed
    
   public  void setSeleccionProducto(){
    int fila = tblListarProductos.getSelectedRow();

    String codigo = (String) tblListarProductos.getValueAt(fila,0);
    String nombre = (String) tblListarProductos.getValueAt(fila,1);
    String categoria = (String) tblListarProductos.getValueAt(fila,2);
    String marca = (String) tblListarProductos.getValueAt(fila,3);
    String unidad = (String) tblListarProductos.getValueAt(fila,4);
    String pesoNeto = (String) tblListarProductos.getValueAt(fila,5); 
    Double precioCompra = Double.valueOf(txtPrecioCompra.getText());
    Double precioVenta = Double.valueOf(txtPrecioVenta.getText());
    Integer stock = Integer.valueOf(txtCantidad.getText());
    
    FormCrearCompra.DatosProducto(codigo,nombre,categoria,marca,unidad,pesoNeto,precioCompra,precioVenta,stock);
    }
   
   private void ListarProductos(){
    DefaultTableModel model = (DefaultTableModel) tblListarProductos.getModel();
    List<Producto> producto = ProductoEntityManager.findProductoEntities();
    model.setRowCount(0); //eliminar filas existentes
    tblListarProductos.setDefaultRenderer(Object.class, new Render());
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    
    for(Producto p : producto){
        
        Object newRow[] = {p.getCodigo(),p.getNombre(),p.getCategoria(),p.getMarca(),p.getUnidad(),p.getPesoNeto(),p.getPrecioCompra(),p.getPrecioVenta(),p.getStock()};
        model.addRow(newRow);
        
    } 
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
            java.util.logging.Logger.getLogger(ListarProductoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProductoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProductoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProductoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarProductoCompra dialog = new ListarProductoCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCodin5;
    private javax.swing.JLabel lblCodin6;
    private javax.swing.JLabel lblCodin7;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JTable tblListarProductos;
    private javax.swing.JTextField txtBuscar;
    private static javax.swing.JTextField txtCantidad;
    private static javax.swing.JTextField txtPrecioCompra;
    private static javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}