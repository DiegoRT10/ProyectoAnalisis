/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Diego Ramos
 */
@Entity
@Table(name = "FacturaVenta")
@NamedQueries({
    @NamedQuery(name = "FacturaVenta.findAll", query = "SELECT f FROM FacturaVenta f"),
    @NamedQuery(name = "FacturaVenta.findByNoSerie", query = "SELECT f FROM FacturaVenta f WHERE f.noSerie = :noSerie"),
    @NamedQuery(name = "FacturaVenta.findByNoDocumento", query = "SELECT f FROM FacturaVenta f WHERE f.noDocumento = :noDocumento"),
    @NamedQuery(name = "FacturaVenta.findByTipo", query = "SELECT f FROM FacturaVenta f WHERE f.tipo = :tipo"),
    @NamedQuery(name = "FacturaVenta.findByNombreNegocio", query = "SELECT f FROM FacturaVenta f WHERE f.nombreNegocio = :nombreNegocio"),
    @NamedQuery(name = "FacturaVenta.findByDireccionNegocio", query = "SELECT f FROM FacturaVenta f WHERE f.direccionNegocio = :direccionNegocio"),
    @NamedQuery(name = "FacturaVenta.findByTelefonoNegocio", query = "SELECT f FROM FacturaVenta f WHERE f.telefonoNegocio = :telefonoNegocio"),
    @NamedQuery(name = "FacturaVenta.findByFechaEmision", query = "SELECT f FROM FacturaVenta f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "FacturaVenta.findByDescuento", query = "SELECT f FROM FacturaVenta f WHERE f.descuento = :descuento")})
public class FacturaVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "noSerie")
    private String noSerie;
    @Basic(optional = false)
    @Column(name = "noDocumento")
    private String noDocumento;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "nombreNegocio")
    private String nombreNegocio;
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
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactura")
//    private Collection<LibroVenta> libroVentaCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactura")
//    private Collection<Venta> ventaCollection;

    public FacturaVenta() {
    }

    public FacturaVenta(String noSerie) {
        this.noSerie = noSerie;
    }

    public FacturaVenta(String noSerie, String noDocumento, String tipo, String nombreNegocio, String direccionNegocio, String telefonoNegocio, Date fechaEmision, BigDecimal descuento) {
        this.noSerie = noSerie;
        this.noDocumento = noDocumento;
        this.tipo = tipo;
        this.nombreNegocio = nombreNegocio;
        this.direccionNegocio = direccionNegocio;
        this.telefonoNegocio = telefonoNegocio;
        this.fechaEmision = fechaEmision;
        this.descuento = descuento;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public String getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
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

//    public Collection<LibroVenta> getLibroVentaCollection() {
//        return libroVentaCollection;
//    }
//
//    public void setLibroVentaCollection(Collection<LibroVenta> libroVentaCollection) {
//        this.libroVentaCollection = libroVentaCollection;
//    }
//
//    public Collection<Venta> getVentaCollection() {
//        return ventaCollection;
//    }
//
//    public void setVentaCollection(Collection<Venta> ventaCollection) {
//        this.ventaCollection = ventaCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noSerie != null ? noSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaVenta)) {
            return false;
        }
        FacturaVenta other = (FacturaVenta) object;
        if ((this.noSerie == null && other.noSerie != null) || (this.noSerie != null && !this.noSerie.equals(other.noSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.FacturaVenta[ noSerie=" + noSerie + " ]";
    }
    
}
