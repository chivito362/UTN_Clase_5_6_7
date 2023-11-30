
package com.equipo10.utn_clase_5_6_7.controllers;

import com.equipo10.utn_clase_5_6_7.controllers.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Admin;
import models.Calificacion;
import models.Consumidor;
import models.Contrato;
import models.Proveedor;
import models.Servicio;
import models.Tarea;


public class PersistenceController {
    AdminJpaController adminJPA=new AdminJpaController();
    ConsumidorJpaController consuJPA=new ConsumidorJpaController();
    ProveedorJpaController proveJPA=new ProveedorJpaController();
    CalificacionJpaController caliJPA=new CalificacionJpaController();
    ServicioJpaController serJPA=new ServicioJpaController();
    TareaJpaController tarJPA=new TareaJpaController();
    ContratoJpaController contJPA=new  ContratoJpaController();

    //Admin------------------
    void crearAdmin(Admin admin) {
        adminJPA.create(admin);
    }
    Admin traerAdmin(int i) {
        return adminJPA.findAdmin(i);
    }
    void eliminarAdmin(int i) {
        try {
            adminJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }
    void editarAdmin(Admin admin) {
        try {
            adminJPA.edit(admin);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }
    ArrayList<Admin> listarAdmin() {
        return new ArrayList<>(adminJPA.findAdminEntities());
    }
    
    //Proveedor-----------------------
    void crearProveedor(Proveedor proveedor) {
        proveJPA.create(proveedor);
    }
    Proveedor traerProveedor(int i) {
        return proveJPA.findProveedor(i);
    }
    void eliminarProveedor(int i) {
        try {
            proveJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }
    void editarProveedor(Proveedor proveedor) {
        try {
            proveJPA.edit(proveedor);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }
    ArrayList<Proveedor> listarProveedor() {
        return new ArrayList<>(proveJPA.findProveedorEntities());
    }
    
    //Consumidor------------------------
    void crearConsumidor(Consumidor consumidor) {
        consuJPA.create(consumidor);
    } 
    Consumidor traerConsumidor(int i) {
        return consuJPA.findConsumidor(i);
    }    
    void eliminarConsumidor(int i) {
        try {
            consuJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }
    void editarConsumidor(Consumidor consumidor) {
        try {
            consuJPA.edit(consumidor);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }
    ArrayList<Consumidor> listarConsumidor() {
        return new ArrayList<>(consuJPA.findConsumidorEntities());
    }
    
    //Servicio--------------------
    void crearServicio(Servicio servicio) {
        serJPA.create(servicio);
    }
    Servicio traerServicio(int i) {
        return serJPA.findServicio(i);
    }
    void eliminarServicio(int i) {
        try {
            serJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }
    ArrayList<Servicio> listarServicio() {
        return new ArrayList<>(serJPA.findServicioEntities());
    }
    void editarServicio(Servicio servicio) {
        try {
            serJPA.edit(servicio);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }
    
    //Tarea---------------------
    void crearTarea(Tarea tarea) {
        tarJPA.create(tarea);
    }
    Tarea traerTarea(int i) {
        return tarJPA.findTarea(i);
    }
    void eliminarTarea(int i) {
        try {
            tarJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
        }
    ArrayList<Tarea> listarTarea() {
        return new ArrayList<>(tarJPA.findTareaEntities());
    }
    void editarTarea(Tarea tarea) {
        try {
            tarJPA.edit(tarea);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Calificacion-----------------
    void crearCalificacion(Calificacion calificacion) {
        caliJPA.create(calificacion);
    }
    Calificacion traerCalificacion(int i) {
       return caliJPA.findCalificacion(i);
    }
    void eliminarCalificacion(int i) {
        try {
            caliJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }
    ArrayList<Calificacion> listarCalificacion() {
        return new ArrayList<>(caliJPA.findCalificacionEntities());
    }
    void editarCalificacion(Calificacion calificacion) {
        try {
            caliJPA.edit(calificacion);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }

    //Contrato----------------------
    void crearContrato(Contrato contrato) {
        contJPA.create(contrato);
    }

    Contrato traerContrato(int i) {
       return contJPA.findContrato(i);
    }

    void eliminarContrato(int i) {
        try {
            contJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            ex.fillInStackTrace();
        }
    }

    ArrayList<Contrato> listarContrato() {
        return new ArrayList<>(contJPA.findContratoEntities());
    }

    void editarContrato(Contrato contrato) {
        try {
            contJPA.edit(contrato);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
    }

    


    

    

    

    

    

    

    

    
}
