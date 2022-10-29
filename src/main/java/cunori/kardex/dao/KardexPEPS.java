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
@Table(name = "KardexPEPS")
@NamedQueries({
    @NamedQuery(name = "KardexPEPS.findAll", query = "SELECT k FROM KardexPEPS k"),
    @NamedQuery(name = "KardexPEPS.findById", query = "SELECT k FROM KardexPEPS k WHERE k.id = :id"),
    @NamedQuery(name = "KardexPEPS.findByFecha", query = "SELECT k FROM KardexPEPS k WHERE k.fecha = :fecha"),
    @NamedQuery(name = "KardexPEPS.findByIdProveedor", query = "SELECT k FROM KardexPEPS k WHERE k.idProveedor = :idProveedor"),
    @NamedQuery(name = "KardexPEPS.findByTipoMov", query = "SELECT k FROM KardexPEPS k WHERE k.tipoMov = :tipoMov"),
    @NamedQuery(name = "KardexPEPS.findByTotal", query = "SELECT k FROM KardexPEPS k WHERE k.total = :total")})
public class KardexPEPS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "idProveedor")
    private String idProveedor;
    @Basic(optional = false)
    @Column(name = "tipoMov")
    private String tipoMov;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @JoinColumn(name = "idCompra", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Compra idCompra;
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @JoinColumn(name = "idVenta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Venta idVenta;

    public KardexPEPS() {
    }

    public KardexPEPS(String id) {
        this.id = id;
    }

    public KardexPEPS(String id, Date fecha, String idProveedor, String tipoMov, BigDecimal total) {
        this.id = id;
        this.fecha = fecha;
        this.idProveedor = idProveedor;
        this.tipoMov = tipoMov;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof KardexPEPS)) {
            return false;
        }
        KardexPEPS other = (KardexPEPS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.KardexPEPS[ id=" + id + " ]";
    }
    
}
