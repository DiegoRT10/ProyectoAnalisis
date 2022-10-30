package cunori.kardex.views;


import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Diego Ramos
 * @author Hermas Ramirez
 */
public class ListarInventario extends javax.swing.JFrame {

   EntityManagerFactory emf;
//   ProductosJpaController ProductosEntityManager;
    public static TableRowSorter<DefaultTableModel> sorter;

    public ListarInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        //this.setExtendedState(MAXIMIZED_BOTH);
//        tblListarProductos.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 20));
//
//        emf = Persistence.createEntityManagerFactory("cunori_kardex_jar_1.0-SNAPSHOTPU");
//        ProductosEntityManager = new ProductosJpaController(emf);
//        
//        ListarProductos();
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
        pnlLeft = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 712));
        setPreferredSize(new java.awt.Dimension(1230, 712));

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
        if (tblListarProductos.getColumnModel().getColumnCount() > 0) {
            tblListarProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblListarProductos.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblListarProductos.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblListarProductos.getColumnModel().getColumn(3).setPreferredWidth(300);
            tblListarProductos.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblListarProductos.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblListarProductos.getColumnModel().getColumn(6).setPreferredWidth(180);
            tblListarProductos.getColumnModel().getColumn(7).setPreferredWidth(180);
            tblListarProductos.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addGap(12, 12, 12))
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

        btnEliminar.setBackground(new java.awt.Color(129, 164, 220));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anular.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(129, 164, 220));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarCheque.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(129, 164, 220));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AgregarCheque.png"))); // NOI18N
        btnCrear.setToolTipText("Crear");
        btnCrear.setBorder(null);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
            .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       Inicio i = new Inicio();
       i.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        FormCrearProducto fp = new FormCrearProducto();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

//    private void ListarProductos(){
//    DefaultTableModel model = (DefaultTableModel) tblListarProductos.getModel();
//    List<Productos> producto = ProductosEntityManager.findProductosEntities();
//    model.setRowCount(0); //eliminar filas existentes
//    tblListarProductos.setDefaultRenderer(Object.class, new Render());
//    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
//    
//    for(Productos p : producto){
//        
//        Object newRow[] = {p.getCodigo(),p.getNombre(),p.getCategoria(),p.getMarca(),p.getUnidad(),p.getPesoNeto(),sdf.format(p.getFechaIngreso()),p.getPrecioCompra(),p.getPrecioVenta(),p.getCantidad()};
//        model.addRow(newRow);
//        
//    } 
//    }
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
            java.util.logging.Logger.getLogger(ListarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlLeft;
    public static javax.swing.JTable tblListarProductos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
