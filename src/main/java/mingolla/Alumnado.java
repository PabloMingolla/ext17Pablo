/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.util.Map;
import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Alumnado implements Comparable<Alumnado>{
    private String nombre;
    private Map<String,String> calificaciones;

    public Alumnado() {
    }

    public Alumnado(String nombre, Map<String, String> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, String> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<String, String> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.calificaciones);
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
        final Alumnado other = (Alumnado) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.calificaciones, other.calificaciones)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + "\n" + presentarCalificaciones();
    }
    
    private String presentarCalificaciones(){
        String salida="";
        for (Map.Entry<String, String> entry : calificaciones.entrySet()) {
            salida += entry.getKey() + ":";
            salida += entry.getValue() + " ";
        }
        return salida;
    }

    @Override
    public int compareTo(Alumnado al) {
        int salida = this.nombre.compareTo(al.getNombre());
        return salida;
    }
}
