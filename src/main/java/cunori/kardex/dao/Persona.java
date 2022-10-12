/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cunori.kardex.dao;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author hermas
 */
@Entity
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findById", query = "SELECT p FROM Persona p WHERE p.personaPK.id = :id"),
    @NamedQuery(name = "Persona.findByDpi", query = "SELECT p FROM Persona p WHERE p.personaPK.dpi = :dpi"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByApellidos", query = "SELECT p FROM Persona p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Persona.findByDireccion", query = "SELECT p FROM Persona p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Persona.findByCorreo", query = "SELECT p FROM Persona p WHERE p.correo = :correo"),
    @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaPK personaPK;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Cliente cliente;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Administrador administrador;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Vendedor vendedor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "persona")
    private Gerente gerente;

    public Persona() {
    }

    public Persona(PersonaPK personaPK) {
        this.personaPK = personaPK;
    }

    public Persona(int id, String dpi) {
        this.personaPK = new PersonaPK(id, dpi);
    }

    public PersonaPK getPersonaPK() {
        return personaPK;
    }

    public void setPersonaPK(PersonaPK personaPK) {
        this.personaPK = personaPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaPK != null ? personaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.personaPK == null && other.personaPK != null) || (this.personaPK != null && !this.personaPK.equals(other.personaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.Persona[ personaPK=" + personaPK + " ]";
    }
    
}
