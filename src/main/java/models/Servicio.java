
package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_servicio;
    private String nombre;
    private String descripcion;
    private String dias;
    private String horario;
    private String radio_cobertura;
    @OneToOne
    private Proveedor proveedor;

    public Servicio() {
    }

    public Servicio(int id_servicio, String nombre, String desc, String dias, String horario, String radio_cobertura, Proveedor proveedor) {
        this.id_servicio = id_servicio;
        this.nombre = nombre;
        this.descripcion = desc;
        this.dias = dias;
        this.horario = horario;
        this.radio_cobertura = radio_cobertura;
        this.proveedor = proveedor;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return descripcion;
    }

    public void setDesc(String desc) {
        this.descripcion = desc;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getRadio_cobertura() {
        return radio_cobertura;
    }

    public void setRadio_cobertura(String radio_cobertura) {
        this.radio_cobertura = radio_cobertura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
