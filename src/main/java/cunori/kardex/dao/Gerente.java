/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cunori.kardex.dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Diego Ramos
 */
@Entity
@Table(name = "gerente")
@NamedQueries({
    @NamedQuery(name = "Gerente.findAll", query = "SELECT g FROM Gerente g"),
    @NamedQuery(name = "Gerente.findById", query = "SELECT g FROM Gerente g WHERE g.id = :id"),
    @NamedQuery(name = "Gerente.findByUsuario", query = "SELECT g FROM Gerente g WHERE g.usuario = :usuario"),
    @NamedQuery(name = "Gerente.findByContrasena", query = "SELECT g FROM Gerente g WHERE g.contrasena = :contrasena")})
public class Gerente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contrasena")
    private String contrasena;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;

    public Gerente() {
    }

    public Gerente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
        if (!(object instanceof Gerente)) {
            return false;
        }
        Gerente other = (Gerente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.Gerente[ id=" + id + " ]";
    }
    
}
