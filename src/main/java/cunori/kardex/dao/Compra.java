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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Compra")
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
    @NamedQuery(name = "Compra.findById", query = "SELECT c FROM Compra c WHERE c.id = :id"),
    @NamedQuery(name = "Compra.findByFechaCompra", query = "SELECT c FROM Compra c WHERE c.fechaCompra = :fechaCompra"),
    @NamedQuery(name = "Compra.findByCantProductos", query = "SELECT c FROM Compra c WHERE c.cantProductos = :cantProductos"),
    @NamedQuery(name = "Compra.findByTotal", query = "SELECT c FROM Compra c WHERE c.total = :total")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "fechaCompra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Basic(optional = false)
    @Column(name = "cantProductos")
    private int cantProductos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private BigDecimal total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompra")
    private Collection<DetalleCompra> detalleCompraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompra")
    private Collection<KardexPEPS> kardexPEPSCollection;
    @JoinColumn(name = "idFactura", referencedColumnName = "noSerie")
    @ManyToOne(optional = false)
    private FacturaCompra idFactura;
    @JoinColumn(name = "idLibroCompra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private LibroCompra idLibroCompra;
    @JoinColumn(name = "idProveedor", referencedColumnName = "id")
    @ManyToOne
    private Proveedor idProveedor;
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Compra() {
    }

    public Compra(String id) {
        this.id = id;
    }

    public Compra(String id, Date fechaCompra, int cantProductos) {
        this.id = id;
        this.fechaCompra = fechaCompra;
        this.cantProductos = cantProductos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Collection<DetalleCompra> getDetalleCompraCollection() {
        return detalleCompraCollection;
    }

    public void setDetalleCompraCollection(Collection<DetalleCompra> detalleCompraCollection) {
        this.detalleCompraCollection = detalleCompraCollection;
    }

    public Collection<KardexPEPS> getKardexPEPSCollection() {
        return kardexPEPSCollection;
    }

    public void setKardexPEPSCollection(Collection<KardexPEPS> kardexPEPSCollection) {
        this.kardexPEPSCollection = kardexPEPSCollection;
    }

    public FacturaCompra getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(FacturaCompra idFactura) {
        this.idFactura = idFactura;
    }

    public LibroCompra getIdLibroCompra() {
        return idLibroCompra;
    }

    public void setIdLibroCompra(LibroCompra idLibroCompra) {
        this.idLibroCompra = idLibroCompra;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.Compra[ id=" + id + " ]";
    }
    
}
