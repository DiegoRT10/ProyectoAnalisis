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
@Table(name = "FacturaCompra")
@NamedQueries({
    @NamedQuery(name = "FacturaCompra.findAll", query = "SELECT f FROM FacturaCompra f"),
    @NamedQuery(name = "FacturaCompra.findByNoSerie", query = "SELECT f FROM FacturaCompra f WHERE f.noSerie = :noSerie"),
    @NamedQuery(name = "FacturaCompra.findByNoDocumento", query = "SELECT f FROM FacturaCompra f WHERE f.noDocumento = :noDocumento"),
    @NamedQuery(name = "FacturaCompra.findByTipo", query = "SELECT f FROM FacturaCompra f WHERE f.tipo = :tipo"),
    @NamedQuery(name = "FacturaCompra.findByFechaEmision", query = "SELECT f FROM FacturaCompra f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "FacturaCompra.findByDescuento", query = "SELECT f FROM FacturaCompra f WHERE f.descuento = :descuento")})
public class FacturaCompra implements Serializable {

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
    @Column(name = "fechaEmision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "descuento")
    private BigDecimal descuento;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactura")
//    private Collection<Compra> compraCollection;

    public FacturaCompra() {
    }

    public FacturaCompra(String noSerie) {
        this.noSerie = noSerie;
    }

    public FacturaCompra(String noSerie, String noDocumento, String tipo, Date fechaEmision, BigDecimal descuento) {
        this.noSerie = noSerie;
        this.noDocumento = noDocumento;
        this.tipo = tipo;
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

//    public Collection<Compra> getCompraCollection() {
//        return compraCollection;
//    }
//
//    public void setCompraCollection(Collection<Compra> compraCollection) {
//        this.compraCollection = compraCollection;
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
        if (!(object instanceof FacturaCompra)) {
            return false;
        }
        FacturaCompra other = (FacturaCompra) object;
        if ((this.noSerie == null && other.noSerie != null) || (this.noSerie != null && !this.noSerie.equals(other.noSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.FacturaCompra[ noSerie=" + noSerie + " ]";
    }
    
}
