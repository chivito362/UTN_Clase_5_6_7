
package com.equipo10.utn_clase_5_6_7.controllers;

import com.equipo10.utn_clase_5_6_7.controllers.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Admin;
import models.Consumidor;
import models.Proveedor;


public class PersistenceController {
    AdminJpaController adminJPA=new AdminJpaController();
    ConsumidorJpaController consuJPA=new ConsumidorJpaController();
    ProveedorJpaController proveJPA=new ProveedorJpaController();
    CalificacionJpaController caliJPA=new CalificacionJpaController();
    ServicioJpaController serJPA=new ServicioJpaController();
    TareaJpaController tarJPA=new TareaJpaController();
    ContratoJpaController cont=new  ContratoJpaController();

    //Admin
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
    
    //Proveedor
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
    
    //Consumidor
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

    

    

    

    

    

    
}
