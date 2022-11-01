/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Diego Ramos
 */
@Entity
@Table(name = "LibroVenta")
@NamedQueries({
    @NamedQuery(name = "LibroVenta.findAll", query = "SELECT l FROM LibroVenta l"),
    @NamedQuery(name = "LibroVenta.findById", query = "SELECT l FROM LibroVenta l WHERE l.id = :id"),
    @NamedQuery(name = "LibroVenta.findByIVAdebito", query = "SELECT l FROM LibroVenta l WHERE l.iVAdebito = :iVAdebito"),
    @NamedQuery(name = "LibroVenta.findByTotal", query = "SELECT l FROM LibroVenta l WHERE l.total = :total")})
public class LibroVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "IVAdebito")
    private BigDecimal iVAdebito;
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @JoinColumn(name = "idFactura", referencedColumnName = "noSerie")
    @ManyToOne(optional = false)
    private FacturaVenta idFactura;
    @JoinColumn(name = "idVenta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Venta idVenta;

    public LibroVenta() {
    }

    public LibroVenta(String id) {
        this.id = id;
    }

    public LibroVenta(String id, BigDecimal iVAdebito, BigDecimal total) {
        this.id = id;
        this.iVAdebito = iVAdebito;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getIVAdebito() {
        return iVAdebito;
    }

    public void setIVAdebito(BigDecimal iVAdebito) {
        this.iVAdebito = iVAdebito;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public FacturaVenta getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaVenta idFactura) {
        this.idFactura = idFactura;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroVenta)) {
            return false;
        }
        LibroVenta other = (LibroVenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.LibroVenta[ id=" + id + " ]";
    }
    
}
