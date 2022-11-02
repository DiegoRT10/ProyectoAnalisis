/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.dao;

/**
 *
 * @author Diego Ramos
 */
public class PojoFactura {
  
   String Descripcion;
   Integer Cantidad;
   Double SubTotal;
   Double TotalPagar;
   Double Efectivo;
   Double Vuelto;

    public PojoFactura() {
    }

    public PojoFactura(String Descripcion, Integer Cantidad, Double SubTotal, Double TotalPagar, Double Efectivo, Double Vuelto) {
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.SubTotal = SubTotal;
        this.TotalPagar = TotalPagar;
        this.Efectivo = Efectivo;
        this.Vuelto = Vuelto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public Double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(Double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    public Double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(Double Efectivo) {
        this.Efectivo = Efectivo;
    }

    public Double getVuelto() {
        return Vuelto;
    }

    public void setVuelto(Double Vuelto) {
        this.Vuelto = Vuelto;
    }
    
    
}
