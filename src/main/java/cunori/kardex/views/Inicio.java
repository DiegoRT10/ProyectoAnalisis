/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cunori.kardex.views;

//import salom.moduloproducto.views.cheque.CrearCheque;
//import salom.moduloproducto.views.cheque.AnuladoCheque;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
//import salom.moduloproducto.views.cheque.ListarCheques;
//import salom.moduloproducto.views.cheque.ListarChequesEstado;



/**
 *
 * @author Diego Ramos
 */
public class Inicio extends javax.swing.JFrame {
    Integer estadoSet;
    
    /**
     * Creates new form InicioProducto
     */
    public Inicio() {
        initComponents();
        getContentPane().setBackground(new Color(0, 255, 51));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        pnlListaAdministradores.setVisible(false);
        pnlche.setVisible(false);
        pnlLeft.add(pnlTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 60));
       
        
        tpnlContenedor.setEnabledAt(0, false);
        tpnlContenedor.setEnabledAt(1, false);
        tpnlContenedor.setEnabledAt(2, false);
        tpnlContenedor.setEnabledAt(3, false);
        tpnlContenedor.setEnabledAt(4, false);
        tpnlContenedor.setEnabledAt(5, false);
        tpnlContenedor.setEnabledAt(6, false);
        tpnlContenedor.setEnabledAt(7, false);

        //Mensajes que se muestran en Inicio seccion de productos 
        String infoListarProducto = "<html><body>En esta seccion podra listar los productos existentes, asi mismo podra filtrar el producto con cualquier atributo</body></html>";
        String infoCrearProducto = "<html><body>En esta seccion podra agregar productos nuevos, tenga en cuenta que no podra repetir codigo de barras y codin.</body></html>";
        String infoEditarProducto = "<html><body>En este apartado podra editar los productos existentes, tenga en cuenta que los cambios que realice se veran reflejados en todo el sistema (Bodega y Farmacias).</html>";

        //Mensaje que se muestra en Inicio seccion de cheques 
        String infoListarCheques = "<html><body>En esta seccion podras visualizar todos los cheques existentes</body></html>";
        String infoCrearCheques = "<html><body>En esta seccion podras crear y listar cheques segun a quien corresponda el pago</body></html>";
        String infoSinPredeclarar = "<html><body>En esta seccion podras listar todos aquellos cheques que estan sin predeclarar</body></html>";
        String infoPendientesCheques = "<html><body>En esta seccion podras listar todos aquellos cheques que estan pendientes por pagar, ten en cuenta que una vez pagado ya no podras editarlo</body></html>";
        String infoPagadoCheques = "<html><body>En esta seccion podras listar todos aquellos cheques pagados, no puedes realizar modificaciones </body></html>";
        String infoCobrado = "<html><body>En esta seccion podras visualizar todos los cheques que ya fue registrado su cobro</body></html>";
        String infoAnuladoCheques = "<html><body>En esta seccion podras listar todos aquellos cheques que estan anulados, ten en cuenta que no puedes borrarlos</body></html>";
        String infoInicio = "<html><body>Este programa fue diseñado con el fin de facilitar el control de traslados de Corporacion Salom S.A</body></html>";
        
        
        //datos del traslado
        String infoCrearTraslado = "<html><body>En esta seccion podras visualizar todos los traslados creados por los administradores de farmacia</body></html>";
        String infoDescargadoTraslado = "<html><body>En esta seccion podras visualizar todos aquellos traslados que el gerente de logistica (Marlin) haya descargado</body></html>";
        String infoCargadoVerificadoTraslado = "<html><body>En esta seccion podras visualizar aquellos traslados que fueron verificados po el gerente de logistica (Marlin)</body></html>";
        String infoRevisadoSistemaTraslado = "<html><body>En este seccion podras visualizar aquellos traslados verificados y autorizados por el gerente de logistica (Marlin)</body></html>";
        String infoRevisionFisicaTraslado = "<html><body>En esta seccion podras visualizar aquellos traslados que ya fueron revisados fisicamente</body></html>";
        String infoEntregadoTraslado = "<html><body>En esta seccion podras visualizar aquellos traslados que ya fueron entregados a las distintas farmacias</body></html>";
        

//seteando valores a labels inicio productos
        lblInfoListar.setText(infoListarProducto);


        //seteando valores a labels inicio cheques 
        lblInfoCreados.setText(infoCrearCheques);
        lblInfoSinPledeclarar.setText(infoSinPredeclarar);
        lblInfoPendiente.setText(infoPendientesCheques);
        lblInfoPagados.setText(infoPagadoCheques);
        lblInfoAnulados.setText(infoAnuladoCheques);
        lblInfoListarCheques.setText(infoListarCheques);
        lblInfoCobrado.setText(infoCobrado);
        lblInfoInicio.setText(infoInicio);
        
        //seteandoValores Traslado
        lblInfoTCreado.setText(infoCrearTraslado);
        lblInfoTDescargado.setText(infoDescargadoTraslado);
        lblInfoTCargadoVerificado.setText(infoCargadoVerificadoTraslado);
        lblInfoTRevisadoSistema.setText(infoRevisadoSistemaTraslado);
        lblInfoTRevisonFisica.setText(infoRevisionFisicaTraslado);
        lblInfoTEntregado.setText(infoEntregadoTraslado);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlInicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlListaProductos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlListaAdministradores = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        imageAvatar1 = new com.raven.swing.ImageAvatar();
        pnlche = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlTraslados = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        pnlTraslados1 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        pnlTraslados2 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        tpnlContenedor = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lblInfoInicio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlListaProductos1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblInfoListar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblListarProducto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        pnlListaAdministradores1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnlCheques1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblInfoSinPledeclarar = new javax.swing.JLabel();
        lblInfoPendiente = new javax.swing.JLabel();
        lblInfoCreados = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblCreados = new javax.swing.JLabel();
        lblPendientePago = new javax.swing.JLabel();
        lblSinPredeclarar = new javax.swing.JLabel();
        lblInfoListarCheques = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblListaCheques = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lblInfoPagados = new javax.swing.JLabel();
        lblInfoAnulados = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        lblAnulados = new javax.swing.JLabel();
        lblPagados = new javax.swing.JLabel();
        pnlCheques3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblInfoCobrado = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lblCobrado = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pnlCheques2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblRentas = new javax.swing.JLabel();
        lblSalarios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblInfoTCreado = new javax.swing.JLabel();
        lblInfoTDescargado = new javax.swing.JLabel();
        lblInfoTCargadoVerificado = new javax.swing.JLabel();
        lblInfoTRevisadoSistema = new javax.swing.JLabel();
        lblInfoListarCheques2 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lblInfoCreados2 = new javax.swing.JLabel();
        lblInfoSinPledeclarar2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lblInfoPendiente2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lblTCargadoVerificado = new javax.swing.JLabel();
        lblTCreado = new javax.swing.JLabel();
        lblTDescargado = new javax.swing.JLabel();
        lblTRevisadoSistema = new javax.swing.JLabel();
        lblSiguienteT = new javax.swing.JLabel();
        pnlCheques4 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lblInfoTRevisonFisica = new javax.swing.JLabel();
        lblInfoTEntregado = new javax.swing.JLabel();
        lblTEntregado = new javax.swing.JLabel();
        lblTRevisionFisica = new javax.swing.JLabel();
        lblAtrasT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCorp.png"))); // NOI18N
        pnlFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 190, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/head.jpg"))); // NOI18N
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 970, 90));

        pnlLeft.setBackground(new java.awt.Color(129, 164, 220));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInicio.setBackground(new java.awt.Color(129, 164, 220));
        pnlInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlInicioMouseMoved(evt);
            }
        });
        pnlInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlInicioMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        jLabel4.setText("  Inicio");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 60));

        pnlListaProductos.setBackground(new java.awt.Color(129, 164, 220));
        pnlListaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlListaProductos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlListaProductosMouseMoved(evt);
            }
        });
        pnlListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlListaProductosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlListaProductosMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administradores.png"))); // NOI18N
        jLabel5.setText("  Usuario");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlListaProductosLayout = new javax.swing.GroupLayout(pnlListaProductos);
        pnlListaProductos.setLayout(pnlListaProductosLayout);
        pnlListaProductosLayout.setHorizontalGroup(
            pnlListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListaProductosLayout.setVerticalGroup(
            pnlListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 60));

        pnlListaAdministradores.setBackground(new java.awt.Color(129, 164, 220));
        pnlListaAdministradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlListaAdministradores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlListaAdministradoresMouseMoved(evt);
            }
        });
        pnlListaAdministradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlListaAdministradoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlListaAdministradoresMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ListaProductos.png"))); // NOI18N
        jLabel6.setText(" Inventario");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlListaAdministradoresLayout = new javax.swing.GroupLayout(pnlListaAdministradores);
        pnlListaAdministradores.setLayout(pnlListaAdministradoresLayout);
        pnlListaAdministradoresLayout.setHorizontalGroup(
            pnlListaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAdministradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
        pnlListaAdministradoresLayout.setVerticalGroup(
            pnlListaAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAdministradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlListaAdministradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 60));

        imageAvatar1.setGradientColor1(new java.awt.Color(51, 51, 255));
        pnlLeft.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 120));

        pnlche.setBackground(new java.awt.Color(129, 164, 220));
        pnlche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlche.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlcheMouseMoved(evt);
            }
        });
        pnlche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlcheMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlcheMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel3.setText(" Clientes");

        javax.swing.GroupLayout pnlcheLayout = new javax.swing.GroupLayout(pnlche);
        pnlche.setLayout(pnlcheLayout);
        pnlcheLayout.setHorizontalGroup(
            pnlcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlcheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
        pnlcheLayout.setVerticalGroup(
            pnlcheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlLeft.add(pnlche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 60));

        pnlTraslados.setBackground(new java.awt.Color(129, 164, 220));
        pnlTraslados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTraslados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTrasladosMouseMoved(evt);
            }
        });
        pnlTraslados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTrasladosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTrasladosMouseExited(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel40.setText(" Facturacion");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlTrasladosLayout = new javax.swing.GroupLayout(pnlTraslados);
        pnlTraslados.setLayout(pnlTrasladosLayout);
        pnlTrasladosLayout.setHorizontalGroup(
            pnlTrasladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrasladosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTrasladosLayout.setVerticalGroup(
            pnlTrasladosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrasladosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 60));

        pnlLogin.setBackground(new java.awt.Color(129, 164, 220));
        pnlLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlLoginMouseMoved(evt);
            }
        });
        pnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLoginMouseExited(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel64.setText(" Salir");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 260, 60));

        pnlTraslados1.setBackground(new java.awt.Color(129, 164, 220));
        pnlTraslados1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTraslados1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTraslados1MouseMoved(evt);
            }
        });
        pnlTraslados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTraslados1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTraslados1MouseExited(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel63.setText(" Proveedores");
        jLabel63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlTraslados1Layout = new javax.swing.GroupLayout(pnlTraslados1);
        pnlTraslados1.setLayout(pnlTraslados1Layout);
        pnlTraslados1Layout.setHorizontalGroup(
            pnlTraslados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTraslados1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTraslados1Layout.setVerticalGroup(
            pnlTraslados1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTraslados1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlTraslados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 260, 60));

        pnlTraslados2.setBackground(new java.awt.Color(129, 164, 220));
        pnlTraslados2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTraslados2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTraslados2MouseMoved(evt);
            }
        });
        pnlTraslados2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTraslados2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTraslados2MouseExited(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel65.setText(" Servicios");
        jLabel65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlTraslados2Layout = new javax.swing.GroupLayout(pnlTraslados2);
        pnlTraslados2.setLayout(pnlTraslados2Layout);
        pnlTraslados2Layout.setHorizontalGroup(
            pnlTraslados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTraslados2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTraslados2Layout.setVerticalGroup(
            pnlTraslados2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTraslados2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlTraslados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 260, 60));

        pnlFondo.add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 710));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        jLabel7.setText("  Inicio");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 236, 36));

        lblInfoInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblInfoInicio.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblInfoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 730, 350));

        tpnlContenedor.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlListaProductos1.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaProductos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlListaProductos1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlListaProductos1MouseMoved(evt);
            }
        });
        pnlListaProductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlListaProductos1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlListaProductos1MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ListaProductos.png"))); // NOI18N
        jLabel14.setText("  Productos");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlListaProductos1Layout = new javax.swing.GroupLayout(pnlListaProductos1);
        pnlListaProductos1.setLayout(pnlListaProductos1Layout);
        pnlListaProductos1Layout.setHorizontalGroup(
            pnlListaProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaProductos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListaProductos1Layout.setVerticalGroup(
            pnlListaProductos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaProductos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlListaProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        lblInfoListar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoListar.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblInfoListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 260, 150));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 140));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Listar Productos ");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblListarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblListarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarProductoMouseClicked(evt);
            }
        });
        jPanel2.add(lblListarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 316, 371));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        tpnlContenedor.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 10));

        pnlListaAdministradores1.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaAdministradores1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlListaAdministradores1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlListaAdministradores1MouseMoved(evt);
            }
        });
        pnlListaAdministradores1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlListaAdministradores1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlListaAdministradores1MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administradores.png"))); // NOI18N
        jLabel15.setText(" Administradores");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlListaAdministradores1Layout = new javax.swing.GroupLayout(pnlListaAdministradores1);
        pnlListaAdministradores1.setLayout(pnlListaAdministradores1Layout);
        pnlListaAdministradores1Layout.setHorizontalGroup(
            pnlListaAdministradores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAdministradores1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
        pnlListaAdministradores1Layout.setVerticalGroup(
            pnlListaAdministradores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaAdministradores1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(pnlListaAdministradores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        tpnlContenedor.addTab("tab3", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCheques1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheques1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCheques1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlCheques1MouseMoved(evt);
            }
        });
        pnlCheques1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCheques1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCheques1MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel17.setText(" Cheques");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout pnlCheques1Layout = new javax.swing.GroupLayout(pnlCheques1);
        pnlCheques1.setLayout(pnlCheques1Layout);
        pnlCheques1Layout.setHorizontalGroup(
            pnlCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCheques1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE))))
            .addGroup(pnlCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques1Layout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlCheques1Layout.setVerticalGroup(
            pnlCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCheques1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques1Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        jPanel4.add(pnlCheques1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        lblInfoSinPledeclarar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoSinPledeclarar.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoSinPledeclarar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblInfoSinPledeclarar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 140));

        lblInfoPendiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoPendiente.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoPendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblInfoPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 190, 180));

        lblInfoCreados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoCreados.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoCreados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblInfoCreados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 140));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advertencia2.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 50, 50));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advertencia.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 50, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 210, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 210, 80));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, 80));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Sin predeclarar");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Crear / Creados");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Pendiente de Pago");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        lblCreados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblCreados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreadosMouseClicked(evt);
            }
        });
        jPanel4.add(lblCreados, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 230, 380));

        lblPendientePago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblPendientePago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPendientePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPendientePagoMouseClicked(evt);
            }
        });
        jPanel4.add(lblPendientePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 230, 380));

        lblSinPredeclarar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblSinPredeclarar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSinPredeclarar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSinPredeclararMouseClicked(evt);
            }
        });
        jPanel4.add(lblSinPredeclarar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 230, 380));

        lblInfoListarCheques.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoListarCheques.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoListarCheques.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblInfoListarCheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 153, 153));
        jLabel37.setText("Lista Cheques");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel38.setText("jLabel22");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 80));

        lblListaCheques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblListaCheques.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListaCheques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListaChequesMouseClicked(evt);
            }
        });
        jPanel4.add(lblListaCheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 380));

        lblSiguiente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(153, 153, 153));
        lblSiguiente.setText("Siguiente →");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        jPanel4.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        tpnlContenedor.addTab("tab4", jPanel4);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificado.png"))); // NOI18N
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, 50));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anulado.png"))); // NOI18N
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 50, 50));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 153, 153));
        jLabel47.setText("Pagados");
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(153, 153, 153));
        jLabel48.setText("Anulados");
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        lblInfoPagados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoPagados.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoPagados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(lblInfoPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        lblInfoAnulados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoAnulados.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoAnulados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(lblInfoAnulados, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 190, 140));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 80));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 210, 80));

        lblAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(153, 153, 153));
        lblAtras.setText("← Atras");
        lblAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });
        jPanel8.add(lblAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        lblAnulados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblAnulados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnulados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnuladosMouseClicked(evt);
            }
        });
        jPanel8.add(lblAnulados, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 230, 380));

        lblPagados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblPagados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPagados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPagadosMouseClicked(evt);
            }
        });
        jPanel8.add(lblPagados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 380));

        pnlCheques3.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheques3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCheques3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlCheques3MouseMoved(evt);
            }
        });
        pnlCheques3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCheques3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCheques3MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel21.setText(" Cheques");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel25.setText("jLabel20");

        javax.swing.GroupLayout pnlCheques3Layout = new javax.swing.GroupLayout(pnlCheques3);
        pnlCheques3.setLayout(pnlCheques3Layout);
        pnlCheques3Layout.setHorizontalGroup(
            pnlCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCheques3Layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE))))
            .addGroup(pnlCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques3Layout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlCheques3Layout.setVerticalGroup(
            pnlCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCheques3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques3Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        jPanel8.add(pnlCheques3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificado.png"))); // NOI18N
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 50, 50));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 210, 80));

        lblInfoCobrado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoCobrado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoCobrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(lblInfoCobrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, 140));

        jLabel50.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 153, 153));
        jLabel50.setText("Cobrado");
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        lblCobrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblCobrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCobrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCobradoMouseClicked(evt);
            }
        });
        jPanel8.add(lblCobrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 230, 380));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        tpnlContenedor.addTab("tab5", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCheques2.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheques2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCheques2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlCheques2MouseMoved(evt);
            }
        });
        pnlCheques2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCheques2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCheques2MouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel29.setText("Tipo de Cuenta");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setText("jLabel20");

        javax.swing.GroupLayout pnlCheques2Layout = new javax.swing.GroupLayout(pnlCheques2);
        pnlCheques2.setLayout(pnlCheques2Layout);
        pnlCheques2Layout.setHorizontalGroup(
            pnlCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jSeparator5)))
            .addGroup(pnlCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques2Layout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlCheques2Layout.setVerticalGroup(
            pnlCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCheques2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques2Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        jPanel6.add(pnlCheques2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Proveedores");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Rentas");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 153, 153));
        jLabel36.setText("Salarios");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proveedor.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 140));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/renta.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 290, 140));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salario.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 290, 140));

        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseClicked(evt);
            }
        });
        jPanel6.add(lblProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 316, 371));

        lblRentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblRentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRentasMouseClicked(evt);
            }
        });
        jPanel6.add(lblRentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 122, 320, 371));

        lblSalarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblSalarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalariosMouseClicked(evt);
            }
        });
        jPanel6.add(lblSalarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 122, 320, 371));

        tpnlContenedor.addTab("tab6", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfoTCreado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTCreado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTCreado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoTCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        lblInfoTDescargado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTDescargado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTDescargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoTDescargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 140));

        lblInfoTCargadoVerificado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTCargadoVerificado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTCargadoVerificado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoTCargadoVerificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 140));

        lblInfoTRevisadoSistema.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTRevisadoSistema.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTRevisadoSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoTRevisadoSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 190, 180));

        lblInfoListarCheques2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoListarCheques2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoListarCheques2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoListarCheques2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("Creado");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearPedido.png"))); // NOI18N
        jLabel41.setText("jLabel22");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 80));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descargado.png"))); // NOI18N
        jLabel42.setText("jLabel22");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, 80));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(153, 153, 153));
        jLabel52.setText("Descargado");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        lblInfoCreados2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoCreados2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoCreados2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoCreados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 140));

        lblInfoSinPledeclarar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoSinPledeclarar2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoSinPledeclarar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoSinPledeclarar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 140));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(153, 153, 153));
        jLabel53.setText("Cargado y Verificado");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CargadoVerificado.png"))); // NOI18N
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 210, 80));

        lblInfoPendiente2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoPendiente2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoPendiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(lblInfoPendiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 190, 180));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(153, 153, 153));
        jLabel55.setText("Revisado por Sistema");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RevisadoSistemaT.png"))); // NOI18N
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 210, 80));

        lblTCargadoVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTCargadoVerificado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTCargadoVerificado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTCargadoVerificadoMouseClicked(evt);
            }
        });
        jPanel7.add(lblTCargadoVerificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 230, 380));

        lblTCreado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTCreado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTCreado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTCreadoMouseClicked(evt);
            }
        });
        jPanel7.add(lblTCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 380));

        lblTDescargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTDescargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTDescargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTDescargadoMouseClicked(evt);
            }
        });
        jPanel7.add(lblTDescargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 230, 380));

        lblTRevisadoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTRevisadoSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTRevisadoSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTRevisadoSistemaMouseClicked(evt);
            }
        });
        jPanel7.add(lblTRevisadoSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 230, 380));

        lblSiguienteT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSiguienteT.setForeground(new java.awt.Color(153, 153, 153));
        lblSiguienteT.setText("Siguiente →");
        lblSiguienteT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguienteT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteTMouseClicked(evt);
            }
        });
        jPanel7.add(lblSiguienteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        pnlCheques4.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheques4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCheques4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlCheques4MouseMoved(evt);
            }
        });
        pnlCheques4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCheques4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCheques4MouseExited(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel61.setText("Traslados");
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel62.setText("jLabel20");

        javax.swing.GroupLayout pnlCheques4Layout = new javax.swing.GroupLayout(pnlCheques4);
        pnlCheques4.setLayout(pnlCheques4Layout);
        pnlCheques4Layout.setHorizontalGroup(
            pnlCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jSeparator7)))
            .addGroup(pnlCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques4Layout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlCheques4Layout.setVerticalGroup(
            pnlCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheques4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCheques4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCheques4Layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        jPanel7.add(pnlCheques4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        tpnlContenedor.addTab("tab7", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RevisionFisica.png"))); // NOI18N
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 80));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entregado.png"))); // NOI18N
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 210, 80));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(153, 153, 153));
        jLabel59.setText("Revision Fisica");
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel60.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(153, 153, 153));
        jLabel60.setText("Entregado");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        lblInfoTRevisonFisica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTRevisonFisica.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTRevisonFisica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(lblInfoTRevisonFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 190, 140));

        lblInfoTEntregado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTEntregado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTEntregado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(lblInfoTEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, 180));

        lblTEntregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTEntregado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTEntregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTEntregadoMouseClicked(evt);
            }
        });
        jPanel9.add(lblTEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 230, 380));

        lblTRevisionFisica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTRevisionFisica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTRevisionFisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTRevisionFisicaMouseClicked(evt);
            }
        });
        jPanel9.add(lblTRevisionFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 380));

        lblAtrasT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAtrasT.setForeground(new java.awt.Color(153, 153, 153));
        lblAtrasT.setText("← Atras");
        lblAtrasT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtrasT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasTMouseClicked(evt);
            }
        });
        jPanel9.add(lblAtrasT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        tpnlContenedor.addTab("tab8", jPanel9);

        pnlFondo.add(tpnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 970, 650));
        tpnlContenedor.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 712));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseClicked
        tpnlContenedor.setSelectedIndex(0);

    }//GEN-LAST:event_pnlInicioMouseClicked

    private void pnlInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseMoved
        pnlInicio.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlInicioMouseMoved

    private void pnlInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInicioMouseExited
        pnlInicio.setBackground(new Color(129, 164, 220));

    }//GEN-LAST:event_pnlInicioMouseExited

    private void pnlListaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaProductosMouseClicked
        tpnlContenedor.setSelectedIndex(1);
    }//GEN-LAST:event_pnlListaProductosMouseClicked

    private void pnlListaProductosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaProductosMouseMoved
        pnlListaProductos.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlListaProductosMouseMoved

    private void pnlListaProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaProductosMouseExited
        pnlListaProductos.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlListaProductosMouseExited

    private void pnlListaAdministradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaAdministradoresMouseClicked
        tpnlContenedor.setSelectedIndex(2);
    }//GEN-LAST:event_pnlListaAdministradoresMouseClicked

    private void pnlListaAdministradoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaAdministradoresMouseMoved
        pnlListaAdministradores.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlListaAdministradoresMouseMoved

    private void pnlListaAdministradoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaAdministradoresMouseExited
        pnlListaAdministradores.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlListaAdministradoresMouseExited

    private void lblListarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarProductoMouseClicked
   

    }//GEN-LAST:event_lblListarProductoMouseClicked

    private void pnlListaProductos1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaProductos1MouseMoved
        pnlInicio.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlListaProductos1MouseMoved

    private void pnlListaProductos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaProductos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlListaProductos1MouseClicked

    private void pnlListaProductos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaProductos1MouseExited
        pnlInicio.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlListaProductos1MouseExited

    private void pnlListaAdministradores1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaAdministradores1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlListaAdministradores1MouseMoved

    private void pnlListaAdministradores1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaAdministradores1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlListaAdministradores1MouseClicked

    private void pnlListaAdministradores1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlListaAdministradores1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlListaAdministradores1MouseExited

    private void pnlCheques1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques1MouseMoved

    }//GEN-LAST:event_pnlCheques1MouseMoved

    private void pnlCheques1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques1MouseClicked

    }//GEN-LAST:event_pnlCheques1MouseClicked

    private void pnlCheques1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques1MouseExited

    }//GEN-LAST:event_pnlCheques1MouseExited

    private void pnlcheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlcheMouseClicked
        tpnlContenedor.setSelectedIndex(3);
    }//GEN-LAST:event_pnlcheMouseClicked

    private void pnlcheMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlcheMouseMoved
        pnlche.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlcheMouseMoved

    private void pnlcheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlcheMouseExited
        pnlche.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlcheMouseExited

    private void lblCreadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreadosMouseClicked
//        estadoSet = 1;
//        ListarChequesEstado.titulo="Listado cheques creados";
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblCreadosMouseClicked

    private void lblPendientePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPendientePagoMouseClicked
//        estadoSet = 2;
//        ListarChequesEstado.titulo="Listado cheques pendiente de pago";
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblPendientePagoMouseClicked

    private void lblSinPredeclararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSinPredeclararMouseClicked
//        ListarChequesEstado.titulo="Listado cheques sin predeclarar";
//        estadoSet = 1;
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblSinPredeclararMouseClicked

    private void pnlCheques2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques2MouseMoved

    private void pnlCheques2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques2MouseClicked

    private void pnlCheques2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques2MouseExited

    private void lblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProveedoresMouseClicked
//        ListarChequesEstado.tipo=1;
//        ListarChequesEstado.estado=estadoSet;
//        ListarChequesEstado lc2 = new ListarChequesEstado();
//        ListarChequesEstado lc = new ListarChequesEstado();
//        lc.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_lblProveedoresMouseClicked

    private void lblRentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRentasMouseClicked
//        ListarChequesEstado.tipo=2;
//        ListarChequesEstado.estado=estadoSet;
//        ListarChequesEstado lc = new ListarChequesEstado();
//        lc.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_lblRentasMouseClicked

    private void lblSalariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalariosMouseClicked
//        ListarChequesEstado.tipo=3;
//        ListarChequesEstado.estado=estadoSet;
//        ListarChequesEstado lc = new ListarChequesEstado();
//        lc.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_lblSalariosMouseClicked

    private void lblPagadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagadosMouseClicked
//        estadoSet = 3;
//        ListarChequesEstado.titulo="Listado cheques pagados";
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblPagadosMouseClicked

    private void lblAnuladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnuladosMouseClicked
//        estadoSet = 5;
//        ListarChequesEstado.titulo="Listado cheques anulados";
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblAnuladosMouseClicked

    private void lblListaChequesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListaChequesMouseClicked
//        ListarCheques lc = new ListarCheques();
//        lc.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_lblListaChequesMouseClicked

    private void lblSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteMouseClicked
       tpnlContenedor.setSelectedIndex(4);
    }//GEN-LAST:event_lblSiguienteMouseClicked

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
      tpnlContenedor.setSelectedIndex(3);
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void pnlCheques3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques3MouseMoved

    private void pnlCheques3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques3MouseClicked

    private void pnlCheques3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques3MouseExited

    private void lblCobradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobradoMouseClicked
//        estadoSet = 4;
//        ListarChequesEstado.titulo="Listado cheques cobrados";
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblCobradoMouseClicked

    private void pnlTrasladosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTrasladosMouseExited
        pnlTraslados.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlTrasladosMouseExited

    private void pnlTrasladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTrasladosMouseClicked
        tpnlContenedor.setSelectedIndex(6);
    }//GEN-LAST:event_pnlTrasladosMouseClicked

    private void pnlTrasladosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTrasladosMouseMoved
        pnlTraslados.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlTrasladosMouseMoved

    private void lblTCreadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTCreadoMouseClicked
     
    }//GEN-LAST:event_lblTCreadoMouseClicked

    private void lblTDescargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTDescargadoMouseClicked
       
    }//GEN-LAST:event_lblTDescargadoMouseClicked

    private void lblTCargadoVerificadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTCargadoVerificadoMouseClicked
      
    }//GEN-LAST:event_lblTCargadoVerificadoMouseClicked

    private void lblTRevisadoSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTRevisadoSistemaMouseClicked
     
    }//GEN-LAST:event_lblTRevisadoSistemaMouseClicked

    private void lblTRevisionFisicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTRevisionFisicaMouseClicked
       
    }//GEN-LAST:event_lblTRevisionFisicaMouseClicked

    private void lblTEntregadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTEntregadoMouseClicked
       
    }//GEN-LAST:event_lblTEntregadoMouseClicked

    private void lblSiguienteTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiguienteTMouseClicked
        tpnlContenedor.setSelectedIndex(7);
    }//GEN-LAST:event_lblSiguienteTMouseClicked

    private void lblAtrasTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasTMouseClicked
        tpnlContenedor.setSelectedIndex(6);
    }//GEN-LAST:event_lblAtrasTMouseClicked

    private void pnlCheques4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques4MouseMoved

    private void pnlCheques4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques4MouseClicked

    private void pnlCheques4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCheques4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCheques4MouseExited

    private void pnlLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseMoved
        pnlLogin.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlLoginMouseMoved

    private void pnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlLoginMouseClicked

    private void pnlLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseExited
     pnlLogin.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlLoginMouseExited

    private void pnlTraslados1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraslados1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTraslados1MouseMoved

    private void pnlTraslados1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraslados1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTraslados1MouseClicked

    private void pnlTraslados1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraslados1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTraslados1MouseExited

    private void pnlTraslados2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraslados2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTraslados2MouseMoved

    private void pnlTraslados2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraslados2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTraslados2MouseClicked

    private void pnlTraslados2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTraslados2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTraslados2MouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblAnulados;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblAtrasT;
    private javax.swing.JLabel lblCobrado;
    private javax.swing.JLabel lblCreados;
    private javax.swing.JLabel lblInfoAnulados;
    private javax.swing.JLabel lblInfoCobrado;
    private javax.swing.JLabel lblInfoCreados;
    private javax.swing.JLabel lblInfoCreados2;
    private javax.swing.JLabel lblInfoInicio;
    private javax.swing.JLabel lblInfoListar;
    private javax.swing.JLabel lblInfoListarCheques;
    private javax.swing.JLabel lblInfoListarCheques2;
    private javax.swing.JLabel lblInfoPagados;
    private javax.swing.JLabel lblInfoPendiente;
    private javax.swing.JLabel lblInfoPendiente2;
    private javax.swing.JLabel lblInfoSinPledeclarar;
    private javax.swing.JLabel lblInfoSinPledeclarar2;
    private javax.swing.JLabel lblInfoTCargadoVerificado;
    private javax.swing.JLabel lblInfoTCreado;
    private javax.swing.JLabel lblInfoTDescargado;
    private javax.swing.JLabel lblInfoTEntregado;
    private javax.swing.JLabel lblInfoTRevisadoSistema;
    private javax.swing.JLabel lblInfoTRevisonFisica;
    private javax.swing.JLabel lblListaCheques;
    private javax.swing.JLabel lblListarProducto;
    private javax.swing.JLabel lblPagados;
    private javax.swing.JLabel lblPendientePago;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblRentas;
    private javax.swing.JLabel lblSalarios;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblSiguienteT;
    private javax.swing.JLabel lblSinPredeclarar;
    private javax.swing.JLabel lblTCargadoVerificado;
    private javax.swing.JLabel lblTCreado;
    private javax.swing.JLabel lblTDescargado;
    private javax.swing.JLabel lblTEntregado;
    private javax.swing.JLabel lblTRevisadoSistema;
    private javax.swing.JLabel lblTRevisionFisica;
    private javax.swing.JPanel pnlCheques1;
    private javax.swing.JPanel pnlCheques2;
    private javax.swing.JPanel pnlCheques3;
    private javax.swing.JPanel pnlCheques4;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlListaAdministradores;
    private javax.swing.JPanel pnlListaAdministradores1;
    private javax.swing.JPanel pnlListaProductos;
    private javax.swing.JPanel pnlListaProductos1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlTraslados;
    private javax.swing.JPanel pnlTraslados1;
    private javax.swing.JPanel pnlTraslados2;
    private javax.swing.JPanel pnlche;
    private javax.swing.JTabbedPane tpnlContenedor;
    // End of variables declaration//GEN-END:variables
}
