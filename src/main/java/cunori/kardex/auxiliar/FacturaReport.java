/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.auxiliar;

import cunori.kardex.dao.PojoFactura;
import cunori.kardex.views.FormCrearVenta;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;


/**
 *
 * @author Diego Ramos
 */
public class FacturaReport implements JRDataSource{

    //private final  Object [][] listadoFactura;
    private int index; 
    
    public static String NombreNegocio;
    public static String Direccion;
    public static String NoSerie;
    public static String NoDocumento;
    public static String Fecha;
    public static String Tipo;
    public static String Telefono;
    public static String Descripcion;
    public static String Cantidad;
    public static Double Descuento;
    public static String SubTotal;
    ArrayList<PojoFactura> detalleVenta = new ArrayList<PojoFactura>();

   

    
    
    public FacturaReport(){
         
         detalleVenta = FormCrearVenta.detalleVenta();
         
         int size = detalleVenta.size();
         System.out.println("dato index "+detalleVenta.get(1).getDescripcion());
         System.out.println("size "+size);
         
//         for (PojoFactura p : detalleVenta) {
//             
//             Descripcion = p.getDescripcion();
//             Cantidad = p.getCantidad().toString();
//             SubTotal = p.getSubTotal().toString();
//             System.out.println("Descripcion: "+p.getDescripcion());
//             System.out.println("Cantidad: "+p.getCantidad());
//             System.out.println("SubTotal: "+p.getSubTotal());
//             
//         }
        index = -1;
        //listadoFactura = new Object[][]{{NombreNegocio,NoSerie,NoDocumento,Fecha,Tipo,Telefono,Descripcion, Cantidad, SubTotal}};
       
    }
     @Override
    public boolean next() throws JRException {
        index++;
        //return (index < listadoFactura.length);
        return (index < detalleVenta.size());
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        
        Object value = null;
        
        String fieldName = jrf.getName();
        
        switch(fieldName){
            
            case "NombreNegocio" -> value = NombreNegocio;
            
            case "Direccion" -> value = Direccion;
            
            case "NoSerie" -> value = NoSerie;
            
            case "NoDocumento" -> value = NoDocumento;
            
            case "Fecha" -> value = Fecha;
            
            case "Tipo" -> value = Tipo;
            
            case "Telefono" -> value = Telefono;
            
            case "Descripcion" -> value = detalleVenta.get(index).getDescripcion();
            
            case "Precio" -> value = detalleVenta.get(index).getPrecio();
            
            case "Cantidad" -> value = detalleVenta.get(index).getCantidad();
            
            case "SubTotal" -> value = detalleVenta.get(index).getSubTotal();
            
            case "TotalPagar" -> value = detalleVenta.get(index).getTotalPagar();
            
            case "Descuento" -> value = Descuento;
            
            case "Efectivo" -> value = detalleVenta.get(index).getEfectivo();
            
            case "Vuelto" -> value = detalleVenta.get(index).getVuelto();
            
            
             
            
        }
        
        return value;
    
    }
    
    public static JRDataSource getDataSource(){
        
        return new FacturaReport();
    }
    
    public static void setearDatos(){
    
    
    }
}
