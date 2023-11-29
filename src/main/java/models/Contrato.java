
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Contrato implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_contrato;
    private Date fecha;
    private String lugar;
    private String rango_Horario;
    private boolean estado;
    @OneToOne
    private Servicio servicio;
    @ManyToOne
    private Consumidor consumidor;

    public Contrato() {
    }

    public Contrato(int id_contrato, Date fecha, String lugar, String rango_Horario, boolean estado, Servicio servicio, Consumidor consumidor) {
        this.id_contrato = id_contrato;
        this.fecha = fecha;
        this.lugar = lugar;
        this.rango_Horario = rango_Horario;
        this.estado = estado;
        this.servicio = servicio;
        this.consumidor = consumidor;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getRango_Horario() {
        return rango_Horario;
    }

    public void setRango_Horario(String rango_Horario) {
        this.rango_Horario = rango_Horario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    
    
    
}
