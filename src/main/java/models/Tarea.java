
package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Tarea implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_Tarea;
    private double precio;
    private String descripcion;
    @ManyToOne
    private Servicio servicio;

    public Tarea() {
    }

    public Tarea(int id_Tarea, double precio, String desc, Servicio servicio) {
        this.id_Tarea = id_Tarea;
        this.precio = precio;
        this.descripcion = desc;
        this.servicio = servicio;
    }

    public int getId_Tarea() {
        return id_Tarea;
    }

    public void setId_Tarea(int id_Tarea) {
        this.id_Tarea = id_Tarea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDesc() {
        return descripcion;
    }

    public void setDesc(String desc) {
        this.descripcion = desc;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
}
