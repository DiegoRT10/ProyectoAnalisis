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
//        pnlListaAdministradores.setVisible(false);
//        pnlche.setVisible(false);
//        pnlLeft.add(pnlTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 60));
       
        
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
        pnlUsuarios = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlInventario = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        imageAvatar1 = new com.raven.swing.ImageAvatar();
        pnlClientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlFacturacion = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlSalirLogin = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        pnlProveedores = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tpnlContenedor = new javax.swing.JTabbedPane();
        pnlSeccionInicio = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        lblInfoInicio = new javax.swing.JLabel();
        pnlSeccionUsuario = new javax.swing.JPanel();
        pnlTituloSeccionUsuario = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTituloConsultar = new javax.swing.JLabel();
        lblImgConsultar = new javax.swing.JLabel();
        lblInfoConsultar = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();
        pnlSeccionInventario = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        pnlTituloSeccionInventarios = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblinfoConsulta = new javax.swing.JLabel();
        lblImgConsulta = new javax.swing.JLabel();
        lblTituloConsulta = new javax.swing.JLabel();
        lblConsulta = new javax.swing.JLabel();
        lblinfoIngreso = new javax.swing.JLabel();
        lblImgIngreso = new javax.swing.JLabel();
        lblTituloIngreso = new javax.swing.JLabel();
        lblIngreso = new javax.swing.JLabel();
        pnlSeccionClientes = new javax.swing.JPanel();
        pnlTituloSeccionClientes = new javax.swing.JPanel();
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
        pnlSeccionProveedores = new javax.swing.JPanel();
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
        pnlTituloSeccionProveedores = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblInfoCobrado = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lblCobrado = new javax.swing.JLabel();
        pnlSeccionServicios = new javax.swing.JPanel();
        pnlTituloSeccionServicios = new javax.swing.JPanel();
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
        pnlSeccionFacturacion = new javax.swing.JPanel();
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
        pnlTituloSeccionFacturacion = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        pnlSeccionSalir = new javax.swing.JPanel();
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 270, 60));

        pnlUsuarios.setBackground(new java.awt.Color(129, 164, 220));
        pnlUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlUsuariosMouseMoved(evt);
            }
        });
        pnlUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlUsuariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlUsuariosMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administradores.png"))); // NOI18N
        jLabel5.setText(" Usuarios");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 60));

        pnlInventario.setBackground(new java.awt.Color(129, 164, 220));
        pnlInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlInventario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlInventarioMouseMoved(evt);
            }
        });
        pnlInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlInventarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlInventarioMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ListaProductos.png"))); // NOI18N
        jLabel6.setText("  Inventario");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 60));

        imageAvatar1.setGradientColor1(new java.awt.Color(51, 51, 255));
        pnlLeft.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 120));

        pnlClientes.setBackground(new java.awt.Color(129, 164, 220));
        pnlClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlClientesMouseMoved(evt);
            }
        });
        pnlClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlClientesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlClientesMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel3.setText(" Clientes");

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLeft.add(pnlClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 50));

        pnlFacturacion.setBackground(new java.awt.Color(129, 164, 220));
        pnlFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFacturacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlFacturacionMouseMoved(evt);
            }
        });
        pnlFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlFacturacionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFacturacionMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administradores.png"))); // NOI18N
        jLabel11.setText(" Facturación");

        javax.swing.GroupLayout pnlFacturacionLayout = new javax.swing.GroupLayout(pnlFacturacion);
        pnlFacturacion.setLayout(pnlFacturacionLayout);
        pnlFacturacionLayout.setHorizontalGroup(
            pnlFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        pnlFacturacionLayout.setVerticalGroup(
            pnlFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 270, 50));

        pnlSalirLogin.setBackground(new java.awt.Color(129, 164, 220));
        pnlSalirLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSalirLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlSalirLoginMouseMoved(evt);
            }
        });
        pnlSalirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSalirLoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSalirLoginMouseExited(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel64.setText(" Salir");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlSalirLoginLayout = new javax.swing.GroupLayout(pnlSalirLogin);
        pnlSalirLogin.setLayout(pnlSalirLoginLayout);
        pnlSalirLoginLayout.setHorizontalGroup(
            pnlSalirLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalirLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSalirLoginLayout.setVerticalGroup(
            pnlSalirLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalirLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlLeft.add(pnlSalirLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 260, 60));

        pnlProveedores.setBackground(new java.awt.Color(129, 164, 220));
        pnlProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProveedores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlProveedoresMouseMoved(evt);
            }
        });
        pnlProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlProveedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlProveedoresMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ListaProductos.png"))); // NOI18N
        jLabel8.setText("  Proveedores");

        javax.swing.GroupLayout pnlProveedoresLayout = new javax.swing.GroupLayout(pnlProveedores);
        pnlProveedores.setLayout(pnlProveedoresLayout);
        pnlProveedoresLayout.setHorizontalGroup(
            pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlProveedoresLayout.setVerticalGroup(
            pnlProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLeft.add(pnlProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 50));

        pnlFondo.add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 270, 720));

        pnlSeccionInicio.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlSeccionInicio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        jLabel7.setText("  Inicio");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInicio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 236, 36));

        lblInfoInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblInfoInicio.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInicio.add(lblInfoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 730, 350));

        tpnlContenedor.addTab("tab1", pnlSeccionInicio);

        pnlSeccionUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlSeccionUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTituloSeccionUsuarioLayout.setVerticalGroup(
            pnlTituloSeccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSeccionUsuario.add(pnlTituloSeccionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));
        pnlSeccionUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        lblTituloConsultar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloConsultar.setForeground(new java.awt.Color(153, 153, 153));
        lblTituloConsultar.setText("Consultar");
        lblTituloConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionUsuario.add(lblTituloConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        lblImgConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        lblImgConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionUsuario.add(lblImgConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 290, 140));

        lblInfoConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoConsultar.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionUsuario.add(lblInfoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 260, 150));

        lblConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarMouseClicked(evt);
            }
        });
        pnlSeccionUsuario.add(lblConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 316, 371));

        tpnlContenedor.addTab("tab2", pnlSeccionUsuario);

        pnlSeccionInventario.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlSeccionInventario.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 10));

        pnlTituloSeccionInventarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlTituloSeccionInventarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTituloSeccionInventarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionInventariosMouseMoved(evt);
            }
        });
        pnlTituloSeccionInventarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionInventariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionInventariosMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administradores.png"))); // NOI18N
        jLabel15.setText("Inventarios");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlTituloSeccionInventariosLayout = new javax.swing.GroupLayout(pnlTituloSeccionInventarios);
        pnlTituloSeccionInventarios.setLayout(pnlTituloSeccionInventariosLayout);
        pnlTituloSeccionInventariosLayout.setHorizontalGroup(
            pnlTituloSeccionInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionInventariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );
        pnlTituloSeccionInventariosLayout.setVerticalGroup(
            pnlTituloSeccionInventariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionInventariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSeccionInventario.add(pnlTituloSeccionInventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        lblinfoConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblinfoConsulta.setForeground(new java.awt.Color(153, 153, 153));
        lblinfoConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInventario.add(lblinfoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 260, 150));

        lblImgConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        lblImgConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInventario.add(lblImgConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 290, 140));

        lblTituloConsulta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloConsulta.setForeground(new java.awt.Color(153, 153, 153));
        lblTituloConsulta.setText("Consulta");
        lblTituloConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInventario.add(lblTituloConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        lblConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultaMouseClicked(evt);
            }
        });
        pnlSeccionInventario.add(lblConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 316, 371));

        lblinfoIngreso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblinfoIngreso.setForeground(new java.awt.Color(153, 153, 153));
        lblinfoIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInventario.add(lblinfoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 260, 150));

        lblImgIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listar.png"))); // NOI18N
        lblImgIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInventario.add(lblImgIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 290, 140));

        lblTituloIngreso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloIngreso.setForeground(new java.awt.Color(153, 153, 153));
        lblTituloIngreso.setText("Ingreso");
        lblTituloIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionInventario.add(lblTituloIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        lblIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresoMouseClicked(evt);
            }
        });
        pnlSeccionInventario.add(lblIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 316, 371));

        tpnlContenedor.addTab("tab3", pnlSeccionInventario);

        pnlSeccionClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloSeccionClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlTituloSeccionClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTituloSeccionClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionClientesMouseMoved(evt);
            }
        });
        pnlTituloSeccionClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionClientesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionClientesMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel17.setText("Clientes");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout pnlTituloSeccionClientesLayout = new javax.swing.GroupLayout(pnlTituloSeccionClientes);
        pnlTituloSeccionClientes.setLayout(pnlTituloSeccionClientesLayout);
        pnlTituloSeccionClientesLayout.setHorizontalGroup(
            pnlTituloSeccionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloSeccionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTituloSeccionClientesLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE))))
            .addGroup(pnlTituloSeccionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionClientesLayout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlTituloSeccionClientesLayout.setVerticalGroup(
            pnlTituloSeccionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTituloSeccionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionClientesLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        pnlSeccionClientes.add(pnlTituloSeccionClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        lblInfoSinPledeclarar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoSinPledeclarar.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoSinPledeclarar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(lblInfoSinPledeclarar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 140));

        lblInfoPendiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoPendiente.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoPendiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(lblInfoPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 190, 180));

        lblInfoCreados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoCreados.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoCreados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(lblInfoCreados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 140));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advertencia2.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 50, 50));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advertencia.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 50, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 210, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 210, 80));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel22.setText("jLabel22");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, 80));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Sin predeclarar");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Crear / Creados");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Pendiente de Pago");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        lblCreados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblCreados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreadosMouseClicked(evt);
            }
        });
        pnlSeccionClientes.add(lblCreados, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 230, 380));

        lblPendientePago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblPendientePago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPendientePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPendientePagoMouseClicked(evt);
            }
        });
        pnlSeccionClientes.add(lblPendientePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 230, 380));

        lblSinPredeclarar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblSinPredeclarar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSinPredeclarar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSinPredeclararMouseClicked(evt);
            }
        });
        pnlSeccionClientes.add(lblSinPredeclarar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 230, 380));

        lblInfoListarCheques.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoListarCheques.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoListarCheques.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(lblInfoListarCheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 153, 153));
        jLabel37.setText("Lista Cheques");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearCheque.png"))); // NOI18N
        jLabel38.setText("jLabel22");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionClientes.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 80));

        lblListaCheques.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblListaCheques.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListaCheques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListaChequesMouseClicked(evt);
            }
        });
        pnlSeccionClientes.add(lblListaCheques, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 380));

        lblSiguiente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSiguiente.setForeground(new java.awt.Color(153, 153, 153));
        lblSiguiente.setText("Siguiente →");
        lblSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteMouseClicked(evt);
            }
        });
        pnlSeccionClientes.add(lblSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        tpnlContenedor.addTab("tab4", pnlSeccionClientes);

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

        pnlTituloSeccionProveedores.setBackground(new java.awt.Color(255, 255, 255));
        pnlTituloSeccionProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTituloSeccionProveedores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionProveedoresMouseMoved(evt);
            }
        });
        pnlTituloSeccionProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionProveedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionProveedoresMouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel21.setText(" Proveedores");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel25.setText("jLabel20");

        javax.swing.GroupLayout pnlTituloSeccionProveedoresLayout = new javax.swing.GroupLayout(pnlTituloSeccionProveedores);
        pnlTituloSeccionProveedores.setLayout(pnlTituloSeccionProveedoresLayout);
        pnlTituloSeccionProveedoresLayout.setHorizontalGroup(
            pnlTituloSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTituloSeccionProveedoresLayout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 62, Short.MAX_VALUE))))
            .addGroup(pnlTituloSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionProveedoresLayout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlTituloSeccionProveedoresLayout.setVerticalGroup(
            pnlTituloSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTituloSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionProveedoresLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        jPanel8.add(pnlTituloSeccionProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

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

        javax.swing.GroupLayout pnlSeccionProveedoresLayout = new javax.swing.GroupLayout(pnlSeccionProveedores);
        pnlSeccionProveedores.setLayout(pnlSeccionProveedoresLayout);
        pnlSeccionProveedoresLayout.setHorizontalGroup(
            pnlSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        pnlSeccionProveedoresLayout.setVerticalGroup(
            pnlSeccionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        tpnlContenedor.addTab("tab5", pnlSeccionProveedores);

        pnlSeccionServicios.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionServicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloSeccionServicios.setBackground(new java.awt.Color(255, 255, 255));
        pnlTituloSeccionServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTituloSeccionServicios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionServiciosMouseMoved(evt);
            }
        });
        pnlTituloSeccionServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionServiciosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionServiciosMouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cheque.png"))); // NOI18N
        jLabel29.setText("Servicios");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setText("jLabel20");

        javax.swing.GroupLayout pnlTituloSeccionServiciosLayout = new javax.swing.GroupLayout(pnlTituloSeccionServicios);
        pnlTituloSeccionServicios.setLayout(pnlTituloSeccionServiciosLayout);
        pnlTituloSeccionServiciosLayout.setHorizontalGroup(
            pnlTituloSeccionServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloSeccionServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jSeparator5)))
            .addGroup(pnlTituloSeccionServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionServiciosLayout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlTituloSeccionServiciosLayout.setVerticalGroup(
            pnlTituloSeccionServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTituloSeccionServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionServiciosLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        pnlSeccionServicios.add(pnlTituloSeccionServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Proveedores");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionServicios.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Rentas");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionServicios.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 153, 153));
        jLabel36.setText("Salarios");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionServicios.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proveedor.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionServicios.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 290, 140));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/renta.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionServicios.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 290, 140));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salario.png"))); // NOI18N
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionServicios.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 290, 140));

        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProveedoresMouseClicked(evt);
            }
        });
        pnlSeccionServicios.add(lblProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 316, 371));

        lblRentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblRentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRentasMouseClicked(evt);
            }
        });
        pnlSeccionServicios.add(lblRentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 122, 320, 371));

        lblSalarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblSalarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalariosMouseClicked(evt);
            }
        });
        pnlSeccionServicios.add(lblSalarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 122, 320, 371));

        tpnlContenedor.addTab("tab6", pnlSeccionServicios);

        pnlSeccionFacturacion.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionFacturacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfoTCreado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTCreado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTCreado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoTCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        lblInfoTDescargado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTDescargado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTDescargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoTDescargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 140));

        lblInfoTCargadoVerificado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTCargadoVerificado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTCargadoVerificado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoTCargadoVerificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 140));

        lblInfoTRevisadoSistema.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTRevisadoSistema.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTRevisadoSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoTRevisadoSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 190, 180));

        lblInfoListarCheques2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoListarCheques2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoListarCheques2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoListarCheques2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 140));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("Creado");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CrearPedido.png"))); // NOI18N
        jLabel41.setText("jLabel22");
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, 80));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descargado.png"))); // NOI18N
        jLabel42.setText("jLabel22");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, 80));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(153, 153, 153));
        jLabel52.setText("Descargado");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        lblInfoCreados2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoCreados2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoCreados2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoCreados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 140));

        lblInfoSinPledeclarar2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoSinPledeclarar2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoSinPledeclarar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoSinPledeclarar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 190, 140));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(153, 153, 153));
        jLabel53.setText("Cargado y Verificado");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CargadoVerificado.png"))); // NOI18N
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 210, 80));

        lblInfoPendiente2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoPendiente2.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoPendiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(lblInfoPendiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 190, 180));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(153, 153, 153));
        jLabel55.setText("Revisado por Sistema");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RevisadoSistemaT.png"))); // NOI18N
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionFacturacion.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 210, 80));

        lblTCargadoVerificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTCargadoVerificado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTCargadoVerificado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTCargadoVerificadoMouseClicked(evt);
            }
        });
        pnlSeccionFacturacion.add(lblTCargadoVerificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 230, 380));

        lblTCreado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTCreado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTCreado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTCreadoMouseClicked(evt);
            }
        });
        pnlSeccionFacturacion.add(lblTCreado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 380));

        lblTDescargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTDescargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTDescargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTDescargadoMouseClicked(evt);
            }
        });
        pnlSeccionFacturacion.add(lblTDescargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 230, 380));

        lblTRevisadoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTRevisadoSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTRevisadoSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTRevisadoSistemaMouseClicked(evt);
            }
        });
        pnlSeccionFacturacion.add(lblTRevisadoSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 230, 380));

        lblSiguienteT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSiguienteT.setForeground(new java.awt.Color(153, 153, 153));
        lblSiguienteT.setText("Siguiente →");
        lblSiguienteT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSiguienteT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiguienteTMouseClicked(evt);
            }
        });
        pnlSeccionFacturacion.add(lblSiguienteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, -1, -1));

        pnlTituloSeccionFacturacion.setBackground(new java.awt.Color(255, 255, 255));
        pnlTituloSeccionFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTituloSeccionFacturacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionFacturacionMouseMoved(evt);
            }
        });
        pnlTituloSeccionFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionFacturacionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlTituloSeccionFacturacionMouseExited(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traslados.png"))); // NOI18N
        jLabel61.setText("Facturación");
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel62.setText("jLabel20");

        javax.swing.GroupLayout pnlTituloSeccionFacturacionLayout = new javax.swing.GroupLayout(pnlTituloSeccionFacturacion);
        pnlTituloSeccionFacturacion.setLayout(pnlTituloSeccionFacturacionLayout);
        pnlTituloSeccionFacturacionLayout.setHorizontalGroup(
            pnlTituloSeccionFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloSeccionFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jSeparator7)))
            .addGroup(pnlTituloSeccionFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionFacturacionLayout.createSequentialGroup()
                    .addGap(0, 130, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 130, Short.MAX_VALUE)))
        );
        pnlTituloSeccionFacturacionLayout.setVerticalGroup(
            pnlTituloSeccionFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloSeccionFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlTituloSeccionFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTituloSeccionFacturacionLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        pnlSeccionFacturacion.add(pnlTituloSeccionFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 60));

        tpnlContenedor.addTab("tab7", pnlSeccionFacturacion);

        pnlSeccionSalir.setBackground(new java.awt.Color(255, 255, 255));
        pnlSeccionSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RevisionFisica.png"))); // NOI18N
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionSalir.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 80));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entregado.png"))); // NOI18N
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionSalir.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 210, 80));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(153, 153, 153));
        jLabel59.setText("Revision Fisica");
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionSalir.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel60.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(153, 153, 153));
        jLabel60.setText("Entregado");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionSalir.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        lblInfoTRevisonFisica.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTRevisonFisica.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTRevisonFisica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionSalir.add(lblInfoTRevisonFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 190, 140));

        lblInfoTEntregado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInfoTEntregado.setForeground(new java.awt.Color(153, 153, 153));
        lblInfoTEntregado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeccionSalir.add(lblInfoTEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, 180));

        lblTEntregado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTEntregado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTEntregado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTEntregadoMouseClicked(evt);
            }
        });
        pnlSeccionSalir.add(lblTEntregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 230, 380));

        lblTRevisionFisica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/separador.png"))); // NOI18N
        lblTRevisionFisica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTRevisionFisica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTRevisionFisicaMouseClicked(evt);
            }
        });
        pnlSeccionSalir.add(lblTRevisionFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 380));

        lblAtrasT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAtrasT.setForeground(new java.awt.Color(153, 153, 153));
        lblAtrasT.setText("← Atras");
        lblAtrasT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtrasT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasTMouseClicked(evt);
            }
        });
        pnlSeccionSalir.add(lblAtrasT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        tpnlContenedor.addTab("tab8", pnlSeccionSalir);

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

    private void pnlUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUsuariosMouseClicked
        tpnlContenedor.setSelectedIndex(1);
    }//GEN-LAST:event_pnlUsuariosMouseClicked

    private void pnlUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUsuariosMouseMoved
        pnlUsuarios.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlUsuariosMouseMoved

    private void pnlUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlUsuariosMouseExited
        pnlUsuarios.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlUsuariosMouseExited

    private void pnlInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInventarioMouseClicked
        tpnlContenedor.setSelectedIndex(2);
    }//GEN-LAST:event_pnlInventarioMouseClicked

    private void pnlInventarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInventarioMouseMoved
        pnlInventario.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlInventarioMouseMoved

    private void pnlInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlInventarioMouseExited
        pnlInventario.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlInventarioMouseExited

    private void pnlTituloSeccionUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionUsuarioMouseMoved
        pnlInicio.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlTituloSeccionUsuarioMouseMoved

    private void pnlTituloSeccionUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionUsuarioMouseClicked

    private void pnlTituloSeccionUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionUsuarioMouseExited
        pnlInicio.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlTituloSeccionUsuarioMouseExited

    private void pnlTituloSeccionInventariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionInventariosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionInventariosMouseMoved

    private void pnlTituloSeccionInventariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionInventariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionInventariosMouseClicked

    private void pnlTituloSeccionInventariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionInventariosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionInventariosMouseExited

    private void pnlTituloSeccionClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionClientesMouseMoved

    }//GEN-LAST:event_pnlTituloSeccionClientesMouseMoved

    private void pnlTituloSeccionClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionClientesMouseClicked

    }//GEN-LAST:event_pnlTituloSeccionClientesMouseClicked

    private void pnlTituloSeccionClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionClientesMouseExited

    }//GEN-LAST:event_pnlTituloSeccionClientesMouseExited

    private void pnlClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlClientesMouseClicked
        tpnlContenedor.setSelectedIndex(3);
    }//GEN-LAST:event_pnlClientesMouseClicked

    private void pnlClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlClientesMouseMoved
        pnlClientes.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlClientesMouseMoved

    private void pnlClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlClientesMouseExited
        pnlClientes.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlClientesMouseExited

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

    private void pnlTituloSeccionServiciosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionServiciosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionServiciosMouseMoved

    private void pnlTituloSeccionServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionServiciosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionServiciosMouseClicked

    private void pnlTituloSeccionServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionServiciosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionServiciosMouseExited

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

    private void pnlTituloSeccionProveedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionProveedoresMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionProveedoresMouseMoved

    private void pnlTituloSeccionProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionProveedoresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionProveedoresMouseClicked

    private void pnlTituloSeccionProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionProveedoresMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionProveedoresMouseExited

    private void lblCobradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobradoMouseClicked
//        estadoSet = 4;
//        ListarChequesEstado.titulo="Listado cheques cobrados";
//        tpnlContenedor.setSelectedIndex(5);
    }//GEN-LAST:event_lblCobradoMouseClicked

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

    private void pnlTituloSeccionFacturacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionFacturacionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionFacturacionMouseMoved

    private void pnlTituloSeccionFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionFacturacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionFacturacionMouseClicked

    private void pnlTituloSeccionFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTituloSeccionFacturacionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlTituloSeccionFacturacionMouseExited

    private void pnlSalirLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirLoginMouseMoved
        pnlSalirLogin.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlSalirLoginMouseMoved

    private void pnlSalirLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirLoginMouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlSalirLoginMouseClicked

    private void pnlSalirLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirLoginMouseExited
     pnlSalirLogin.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlSalirLoginMouseExited

    private void pnlFacturacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFacturacionMouseExited
       pnlFacturacion.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlFacturacionMouseExited

    private void pnlFacturacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFacturacionMouseMoved
      pnlFacturacion.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlFacturacionMouseMoved

    private void pnlFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFacturacionMouseClicked
     tpnlContenedor.setSelectedIndex(6);   
    }//GEN-LAST:event_pnlFacturacionMouseClicked

    private void lblConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarMouseClicked
     ListarUsuarios lu = new ListarUsuarios();
     lu.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_lblConsultarMouseClicked

    private void lblConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblConsultaMouseClicked

    private void lblIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIngresoMouseClicked

    private void pnlProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProveedoresMouseClicked
        tpnlContenedor.setSelectedIndex(4);
    }//GEN-LAST:event_pnlProveedoresMouseClicked

    private void pnlProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProveedoresMouseExited
        pnlProveedores.setBackground(new Color(129, 164, 220));
    }//GEN-LAST:event_pnlProveedoresMouseExited

    private void pnlProveedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlProveedoresMouseMoved
        pnlProveedores.setBackground(new Color(166, 173, 217));
    }//GEN-LAST:event_pnlProveedoresMouseMoved

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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblConsultar;
    private javax.swing.JLabel lblCreados;
    private javax.swing.JLabel lblImgConsulta;
    private javax.swing.JLabel lblImgConsultar;
    private javax.swing.JLabel lblImgIngreso;
    private javax.swing.JLabel lblInfoAnulados;
    private javax.swing.JLabel lblInfoCobrado;
    private javax.swing.JLabel lblInfoConsultar;
    private javax.swing.JLabel lblInfoCreados;
    private javax.swing.JLabel lblInfoCreados2;
    private javax.swing.JLabel lblInfoInicio;
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
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblListaCheques;
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
    private javax.swing.JLabel lblTituloConsulta;
    private javax.swing.JLabel lblTituloConsultar;
    private javax.swing.JLabel lblTituloIngreso;
    private javax.swing.JLabel lblinfoConsulta;
    private javax.swing.JLabel lblinfoIngreso;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlFacturacion;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlInicio;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlProveedores;
    private javax.swing.JPanel pnlSalirLogin;
    private javax.swing.JPanel pnlSeccionClientes;
    private javax.swing.JPanel pnlSeccionFacturacion;
    private javax.swing.JPanel pnlSeccionInicio;
    private javax.swing.JPanel pnlSeccionInventario;
    private javax.swing.JPanel pnlSeccionProveedores;
    private javax.swing.JPanel pnlSeccionSalir;
    private javax.swing.JPanel pnlSeccionServicios;
    private javax.swing.JPanel pnlSeccionUsuario;
    private javax.swing.JPanel pnlTituloSeccionClientes;
    private javax.swing.JPanel pnlTituloSeccionFacturacion;
    private javax.swing.JPanel pnlTituloSeccionInventarios;
    private javax.swing.JPanel pnlTituloSeccionProveedores;
    private javax.swing.JPanel pnlTituloSeccionServicios;
    private javax.swing.JPanel pnlTituloSeccionUsuario;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JTabbedPane tpnlContenedor;
    // End of variables declaration//GEN-END:variables
}
