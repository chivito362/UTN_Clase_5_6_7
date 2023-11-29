
package com.equipo10.utn_clase_5_6_7.controllers;

import java.util.ArrayList;
import models.Admin;
import models.Consumidor;
import models.Proveedor;


public class Controller {
    PersistenceController controlPersis=new PersistenceController();
    //Admin
    public void crearAdmin(Admin admin) {
        controlPersis.crearAdmin(admin);
    }
    public Admin traerAdmin(int i) {
        return controlPersis.traerAdmin(i);
    }
    public void eliminarAdmin(int i) {
        controlPersis.eliminarAdmin(i);
    }
    public ArrayList<Admin> listarAdmin() {
        return controlPersis.listarAdmin();
    }
    public void editarAdmin(Admin admin) {
        controlPersis.editarAdmin(admin);
    }
    
    //Proveedor
    public void crearProveedor(Proveedor proveedor) {
        controlPersis.crearProveedor(proveedor);
    }
    public Proveedor traerProveedor(int i) {
        return controlPersis.traerProveedor(i);
    }
    public void eliminarProveedor(int i) {
        controlPersis.eliminarProveedor(i);
    }
    public ArrayList<Proveedor> listarProveedor() {
        return controlPersis.listarProveedor();
    }
    public void editarProveedor(Proveedor proveedor) {
        controlPersis.editarProveedor(proveedor);
    }
    
    //Consumidor
    public void crearConsumidor(Consumidor consumidor) {
        controlPersis.crearConsumidor(consumidor);
    }
    public Consumidor traerConsumidor(int i) {
        return controlPersis.traerConsumidor(i);
    }
    public void eliminarConsumidor(int i) {
        controlPersis.eliminarConsumidor(i);
    }
    public ArrayList<Consumidor> listarConsumidor() {
        return controlPersis.listarConsumidor();
    }
    public void editarConsumidor(Consumidor consumidor) {
        controlPersis.editarConsumidor(consumidor);
    }

    

    

    

    

}
