
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

public class Calificacion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_calificacion;
    private int califiacion;
    private String comentario;
    @ManyToOne
    private Consumidor calificador;
    @ManyToOne
    private Proveedor calificado;

    public Calificacion() {
    }

    public Calificacion(int id_calificacion, int califiacion, String comentario, Consumidor calificador, Proveedor calificado) {
        this.id_calificacion = id_calificacion;
        this.califiacion = califiacion;
        this.comentario = comentario;
        this.calificador = calificador;
        this.calificado = calificado;
    }

    public int getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    public int getCalifiacion() {
        return califiacion;
    }

    public void setCalifiacion(int califiacion) {
        this.califiacion = califiacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Consumidor getCalificador() {
        return calificador;
    }

    public void setCalificador(Consumidor calificador) {
        this.calificador = calificador;
    }

    public Proveedor getCalificado() {
        return calificado;
    }

    public void setCalificado(Proveedor calificado) {
        this.calificado = calificado;
    }

    
    
    
}
