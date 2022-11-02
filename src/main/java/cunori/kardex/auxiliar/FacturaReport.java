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
    public static String NoSerie;
    public static String NoDocumento;
    public static String Fecha;
    public static String Tipo;
    public static String Telefono;
    public static String Descripcion;
    public static String Cantidad;
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
            case "Descripcion" -> value = detalleVenta.get(index).getDescripcion();
            
            case "Cantidad" -> value = detalleVenta.get(index).getCantidad();
            
            case "SubTotal" -> value = detalleVenta.get(index).getSubTotal();
//            case "NombreNegocio" -> value = listadoFactura[index][0];
//            
//            case "NoSerie" -> value = listadoFactura[index][1];
//            
//            case "NoDocumento" -> value = listadoFactura[index][2];
//            
//            case "Fecha" -> value = listadoFactura[index][3];
//            
//            case "Tipo" -> value = listadoFactura[index][4];
//            
//            case "Telefono" -> value = listadoFactura[index][5];
//            
//            case "Descripcion" -> value = listadoFactura[index][6];
//            
//            case "Cantidad" -> value = listadoFactura[index][7];
//            
//            case "SubTotal" -> value = listadoFactura[index][8];
            
            
        }
        
        return value;
    
    }
    
    public static JRDataSource getDataSource(){
        
        return new FacturaReport();
    }
    
    public static void setearDatos(){
    
    
    }
}
