/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class RegistroJSON {
    private String nombre;
    private String[] asignatura;
    private String[] nota;

    public RegistroJSON() {
    }

    public RegistroJSON(String nombre, String[] asignatura, String[] nota) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String[] asignatura) {
        this.asignatura = asignatura;
    }

    public String[] getNota() {
        return nota;
    }

    public void setNota(String[] nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.asignatura);
        hash = 89 * hash + Objects.hashCode(this.nota);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistroJSON other = (RegistroJSON) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.asignatura, other.asignatura)) {
            return false;
        }
        if (!Objects.equals(this.nota, other.nota)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegistroJSON{" + "nombre=" + nombre + ", asignatura=" + asignatura.toString() + ", nota=" + nota.toString() + '}';
    }
    
    
}
