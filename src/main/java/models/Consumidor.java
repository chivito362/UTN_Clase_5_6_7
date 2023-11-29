package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
@Entity

public class Consumidor implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_user;
    private String nombre;
    private String tipoDNI;
    private String dni;
    private String email;
    private String telefono;
    private String cuit_cuil;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    public Consumidor() {
    }

    public Consumidor(int id_user, String nombre, String tipoDNI, String dni, String email, String telefono, String cuit_cuil, Date fechaNac) {
        this.id_user = id_user;
        this.nombre = nombre;
        this.tipoDNI = tipoDNI;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.cuit_cuil = cuit_cuil;
        this.fechaNac = fechaNac;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDNI() {
        return tipoDNI;
    }

    public void setTipoDNI(String tipoDNI) {
        this.tipoDNI = tipoDNI;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit_cuil() {
        return cuit_cuil;
    }

    public void setCuit_cuil(String cuit_cuil) {
        this.cuit_cuil = cuit_cuil;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}