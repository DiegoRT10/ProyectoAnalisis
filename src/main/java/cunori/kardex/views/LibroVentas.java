package cunori.kardex.views;

import cunori.kardex.controller.CompraJpaController;
import cunori.kardex.controller.FacturaCompraJpaController;
import cunori.kardex.controller.FacturaVentaJpaController;
import cunori.kardex.controller.LibroCompraJpaController;
import cunori.kardex.controller.LibroVentaJpaController;
import cunori.kardex.controller.VentaJpaController;
import cunori.kardex.controller.exceptions.NonexistentEntityException;
import cunori.kardex.dao.Compra;
import cunori.kardex.dao.FacturaCompra;
import cunori.kardex.dao.FacturaVenta;
import cunori.kardex.dao.LibroCompra;
import cunori.kardex.dao.Venta;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * @author Hermas Ramirez
 */
public class LibroVentas extends javax.swing.JFrame {

    EntityManagerFactory emf;
    LibroVentaJpaController LibroVentaEntityManager;
    FacturaVentaJpaController FacturaVentaEntityManager;
    VentaJpaController VentaEntityManager;
    public static TableRowSorter<DefaultTableModel> sorter;
    Double precioNeto=0.0;
    Double IVA=0.0;
    Double precioTotal=0.0;
    /**
     * Creates new form ListarCreadosCheques
     */
    public LibroVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/pngwing.png")).getImage());
        //this.setExtendedState(MAXIMIZED_BOTH);
        tblLibroVentas.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 20));

        emf = Persistence.createEntityManagerFactory("cunori_kardex_jar_1.0-SNAPSHOTPU");
        LibroVentaEntityManager = new LibroVentaJpaController(emf);
        FacturaVentaEntityManager = new FacturaVentaJpaController(emf);
        VentaEntityManager = new VentaJpaController(emf);

        ListarLibroVenta();
        DatosResumen();
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
        jPnlFactura = new javax.swing.JPanel();
        lblNoSerie = new javax.swing.JLabel();
        txtPrecioNeto = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JTextField();
        lblFechaRegistro = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jPnlFactura1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibroVentas = new javax.swing.JTable();
        pnlLeft = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 712));

        jPanel1.setBackground(new java.awt.Color(129, 164, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(931, 522));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtBuscar.setBackground(new java.awt.Color(129, 164, 220));
        txtBuscar.setToolTipText("Filtrar \"ten en cuenta las mayusculas\"");
        txtBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0buscar.png"))); // NOI18N

        jPnlFactura.setBackground(new java.awt.Color(129, 164, 220));
        jPnlFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        jPnlFactura.setPreferredSize(new java.awt.Dimension(931, 522));

        lblNoSerie.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblNoSerie.setForeground(new java.awt.Color(0, 0, 0));
        lblNoSerie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNoSerie.setText("Precio Neto:");

        txtPrecioNeto.setEditable(false);
        txtPrecioNeto.setBackground(new java.awt.Color(129, 164, 220));
        txtPrecioNeto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPrecioNeto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtPrecioNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioNetoActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTipo.setText("IVA Debito:");

        txtPrecioTotal.setEditable(false);
        txtPrecioTotal.setBackground(new java.awt.Color(129, 164, 220));
        txtPrecioTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPrecioTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTotalActionPerformed(evt);
            }
        });

        lblFechaRegistro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFechaRegistro.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaRegistro.setText("Precio Total:");

        txtIVA.setEditable(false);
        txtIVA.setBackground(new java.awt.Color(129, 164, 220));
        txtIVA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtIVA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 153, 255)));
        txtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlFacturaLayout = new javax.swing.GroupLayout(jPnlFactura);
        jPnlFactura.setLayout(jPnlFacturaLayout);
        jPnlFacturaLayout.setHorizontalGroup(
            jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFacturaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoSerie)
                    .addComponent(txtPrecioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaRegistro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPnlFacturaLayout.setVerticalGroup(
            jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPnlFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoSerie)
                    .addComponent(lblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPnlFactura1.setBackground(new java.awt.Color(129, 164, 220));
        jPnlFactura1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Libro de Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        jPnlFactura1.setPreferredSize(new java.awt.Dimension(931, 522));

        tblLibroVentas.setBackground(new java.awt.Color(255, 255, 255));
        tblLibroVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 255), new java.awt.Color(51, 204, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 102, 255)));
        tblLibroVentas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblLibroVentas.setForeground(new java.awt.Color(0, 0, 0));
        tblLibroVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "No. Serie", "No. Documento", "Tipo de Facturaci??n", "NIT", "Nombre del Cliente", "Venta Bienes", "IVA Debito", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibroVentas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblLibroVentas.setGridColor(new java.awt.Color(153, 255, 153));
        tblLibroVentas.setSelectionBackground(new java.awt.Color(255, 255, 204));
        tblLibroVentas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblLibroVentas.setShowGrid(true);
        tblLibroVentas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblLibroVentas);
        if (tblLibroVentas.getColumnModel().getColumnCount() > 0) {
            tblLibroVentas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblLibroVentas.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblLibroVentas.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblLibroVentas.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblLibroVentas.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblLibroVentas.getColumnModel().getColumn(5).setPreferredWidth(200);
            tblLibroVentas.getColumnModel().getColumn(6).setPreferredWidth(150);
            tblLibroVentas.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblLibroVentas.getColumnModel().getColumn(8).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPnlFactura1Layout = new javax.swing.GroupLayout(jPnlFactura1);
        jPnlFactura1.setLayout(jPnlFactura1Layout);
        jPnlFactura1Layout.setHorizontalGroup(
            jPnlFactura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlFactura1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPnlFactura1Layout.setVerticalGroup(
            jPnlFactura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlFactura1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 768, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnlFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                            .addComponent(jPnlFactura1, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPnlFactura1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPnlFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPnlFactura.getAccessibleContext().setAccessibleName("Resumen");

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
        btnEliminar.setToolTipText("Anular");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE))
            .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPrecioNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioNetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioNetoActionPerformed

    private void txtPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTotalActionPerformed

    private void txtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAActionPerformed
    
//    private void ListarFacturas(){
//    //FacturaCompra    
//    DefaultTableModel modelC = (DefaultTableModel) tblListarFacturas.getModel();
//    List<FacturaCompra> facturaC = FacturaCompraEntityManager.findFacturaCompraEntities();
//    modelC.setRowCount(0); //eliminar filas existentes
//    tblListarFacturas.setDefaultRenderer(Object.class, new Render());
//    
//    for(FacturaCompra f : facturaC){
//        Object newRow[] = {f.getNoSerie(), f.getTipo(), "", "", "", f.getFechaEmision(), f.getDescuento()};
//        modelC.addRow(newRow);
//    }
//    //FacturaVenta
//    DefaultTableModel modelV = (DefaultTableModel) tblListarFacturas.getModel();    
//    List<FacturaVenta> facturaV = FacturaVentaEntityManager.findFacturaVentaEntities();
//    tblListarFacturas.setDefaultRenderer(Object.class, new Render());
//    
//    for(FacturaVenta f : facturaV){
//        Object newRow[] = {f.getNoSerie(), f.getTipo(), f.getNombreNegocio(), f.getDireccionNegocio(), f.getTelefonoNegocio(), f.getFechaEmision(), f.getDescuento()};
//        modelV.addRow(newRow);
//    }
//    }
//    
//    private boolean DeleteFacturas(){
//        int fila = tblListarFacturas.getSelectedRow();
//        if(fila != -1){
//        String id = (String) tblListarFacturas.getValueAt(fila,0);
//            try {
//                FacturaCompraEntityManager.destroy(id);
//                FacturaVentaEntityManager.destroy(id);
//                JOptionPane.showMessageDialog(null, "La Factura se ha eliminado Correctamente");
//                return true;
//            }catch (NonexistentEntityException ex) {
//                //Logger.getLogger(ListarClientes.class.getName()).log(Level.SEVERE, null, ex);
//                 JOptionPane.showMessageDialog(null, "Error, no se puede eliminar");
//                return false;
//            }
//            //Logger.getLogger(ListarClientes.class.getName()).log(Level.SEVERE, null, ex);
//        }else{JOptionPane.showMessageDialog(null, "No se ha selccionado nada");}
//         return false;
//    }
    
    private void ListarLibroVenta(){
    DefaultTableModel model = (DefaultTableModel) tblLibroVentas.getModel();
    List<Venta> venta = VentaEntityManager.findVentaEntities();
    model.setRowCount(0); //eliminar filas existentes
    tblLibroVentas.setDefaultRenderer(Object.class, new Render());
    
    for(Venta v : venta){
        Double iva=v.getTotal().doubleValue()*0.12;
        Double totalLibro = v.getTotal().doubleValue()+iva;
        Object newRow[] = {v.getFechaVenta(),v.getIdFactura().getNoSerie(),v.getIdFactura().getNoDocumento(),v.getIdFactura().getTipo(),v.getIdCliente().getNit(),v.getIdCliente().getNombre(),v.getTotal(),iva,totalLibro};
        model.addRow(newRow);
    }
    }
    
    private void DatosResumen(){
        for (int i = 0; i < tblLibroVentas.getRowCount(); i++) {
            precioNeto += Double.valueOf(tblLibroVentas.getValueAt(i,6).toString());
            IVA += Double.valueOf(tblLibroVentas.getValueAt(i,7).toString());
            precioTotal += Double.valueOf(tblLibroVentas.getValueAt(i,8).toString());
        }
        txtPrecioNeto.setText(precioNeto.toString());
        txtIVA.setText(IVA.toString());
        txtPrecioTotal.setText(precioTotal.toString());
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
            java.util.logging.Logger.getLogger(LibroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibroVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibroVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPnlFactura;
    private javax.swing.JPanel jPnlFactura1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaRegistro;
    private javax.swing.JLabel lblNoSerie;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlLeft;
    public static javax.swing.JTable tblLibroVentas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtPrecioNeto;
    private javax.swing.JTextField txtPrecioTotal;
    // End of variables declaration//GEN-END:variables
}
