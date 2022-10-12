/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cunori.kardex.dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author hermas
 */
@Embeddable
public class PersonaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "dpi")
    private String dpi;

    public PersonaPK() {
    }

    public PersonaPK(int id, String dpi) {
        this.id = id;
        this.dpi = dpi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (dpi != null ? dpi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaPK)) {
            return false;
        }
        PersonaPK other = (PersonaPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.dpi == null && other.dpi != null) || (this.dpi != null && !this.dpi.equals(other.dpi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cunori.kardex.dao.PersonaPK[ id=" + id + ", dpi=" + dpi + " ]";
    }
    
}
