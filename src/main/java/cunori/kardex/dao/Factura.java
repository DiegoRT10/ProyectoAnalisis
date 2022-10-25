/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Diego Ramos
 */
@Entity
@Table(name = "Factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByNoSerie", query = "SELECT f FROM Factura f WHERE f.noSerie = :noSerie"),
    @NamedQuery(name = "Factura.findByNombreNegocio", query = "SELECT f FROM Factura f WHERE f.nombreNegocio = :nombreNegocio"),
    @NamedQuery(name = "Factura.findByTipo", query = "SELECT f FROM Factura f WHERE f.tipo = :tipo"),
    @NamedQuery(name = "Factura.findByDireccionNegocio", query = "SELECT f FROM Factura f WHERE f.direccionNegocio = :direccionNegocio"),
    @NamedQuery(name = "Factura.findByTelefonoNegocio", query = "SELECT f FROM Factura f WHERE f.telefonoNegocio = :telefonoNegocio"),
    @NamedQuery(name = "Factura.findByFechaEmision", query = "SELECT f FROM Factura f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Factura.findByDescuento", query = "SELECT f FROM Factura f WHERE f.descuento = :descuento"),
    @NamedQuery(name = "Factura.findByTotal", query = "SELECT f FROM Factura f WHERE f.total = :total")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "noSerie")
    private String noSerie;
    @Basic(optional = false)
    @Column(name = "nombreNegocio")
    private String nombreNegocio;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "direccionNegocio")
    private String direccionNegocio;
    @Basic(optional = false)
    @Column(name = "telefonoNegocio")
    private String telefonoNegocio;
    @Basic(optional = false)
    @Column(name = "fechaEmision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "descuento")
    private BigDecimal descuento;
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @JoinColumn(name = "detalleCompra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Compra detalleCompra;
    @JoinColumn(name = "detalleVenta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Venta detalleVenta;

    public Factura() {
    }

    public Factura(String noSerie) {
        this.noSerie = noSerie;
    }

    public Factura(String noSerie, String nombreNegocio, String tipo, String direccionNegocio, String telefonoNegocio, Date fechaEmision, BigDecimal descuento, BigDecimal total) {
        this.noSerie = noSerie;
        this.nombreNegocio = nombreNegocio;
        this.tipo = tipo;
        this.direccionNegocio = direccionNegocio;
        this.telefonoNegocio = telefonoNegocio;
        this.fechaEmision = fechaEmision;
        this.descuento = descuento;
        this.total = total;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public String getTelefonoNegocio() {
        return telefonoNegocio;
    }

    public void setTelefonoNegocio(String telefonoNegocio) {
        this.telefonoNegocio = telefonoNegocio;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Compra getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(Compra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public Venta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(Venta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noSerie != null ? noSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.noSerie == null && other.noSerie != null) || (this.noSerie != null && !this.noSerie.equals(other.noSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.Factura[ noSerie=" + noSerie + " ]";
    }
    
}
