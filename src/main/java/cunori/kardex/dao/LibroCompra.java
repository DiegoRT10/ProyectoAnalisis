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
@Table(name = "LibroCompra")
@NamedQueries({
    @NamedQuery(name = "LibroCompra.findAll", query = "SELECT l FROM LibroCompra l"),
    @NamedQuery(name = "LibroCompra.findById", query = "SELECT l FROM LibroCompra l WHERE l.id = :id"),
    @NamedQuery(name = "LibroCompra.findByIVAcredito", query = "SELECT l FROM LibroCompra l WHERE l.iVAcredito = :iVAcredito"),
    @NamedQuery(name = "LibroCompra.findByTotal", query = "SELECT l FROM LibroCompra l WHERE l.total = :total")})
public class LibroCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "IVAcredito")
    private BigDecimal iVAcredito;
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @JoinColumn(name = "idCompra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Compra idCompra;
    @JoinColumn(name = "idFactura", referencedColumnName = "noSerie")
    @ManyToOne(optional = false)
    private FacturaCompra idFactura;

    public LibroCompra() {
    }

    public LibroCompra(String id) {
        this.id = id;
    }

    public LibroCompra(String id, BigDecimal iVAcredito, BigDecimal total) {
        this.id = id;
        this.iVAcredito = iVAcredito;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getIVAcredito() {
        return iVAcredito;
    }

    public void setIVAcredito(BigDecimal iVAcredito) {
        this.iVAcredito = iVAcredito;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public FacturaCompra getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaCompra idFactura) {
        this.idFactura = idFactura;
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
        if (!(object instanceof LibroCompra)) {
            return false;
        }
        LibroCompra other = (LibroCompra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.LibroCompra[ id=" + id + " ]";
    }
    
}
