
package com.equipo10.utn_clase_5_6_7.controllers;

import java.util.ArrayList;
import models.Admin;
import models.Calificacion;
import models.Consumidor;
import models.Contrato;
import models.Proveedor;
import models.Servicio;
import models.Tarea;


public class Controller {
    PersistenceController controlPersis=new PersistenceController();
    
    //Admin------------------
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
    
    //Proveedor------------------
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
    
    //Consumidor------------------
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

    //Servicio------------------
    public void crearServicio(Servicio servicio) {
        controlPersis.crearServicio(servicio);
    }
    public Servicio traerServicio(int i) {
        return controlPersis.traerServicio(i);
    }
    public void eliminarServicio(int i) {
        controlPersis.eliminarServicio(i);
    }
    public ArrayList<Servicio> listarServicio() {
        return controlPersis.listarServicio();
    }
    public void editarServicio(Servicio servicio) {
        controlPersis.editarServicio(servicio);
    }
    
    //Tarea------------------
    public void crearTarea(Tarea tarea) {
        controlPersis.crearTarea(tarea);
    }
    public Tarea traerTarea(int i) {
        return controlPersis.traerTarea(i);
    }
    public void eliminarTarea(int i) {
        controlPersis.eliminarTarea(i);
    }
    public ArrayList<Tarea> listarTarea() {
        return controlPersis.listarTarea();
    }
    public void editarTarea(Tarea tarea) {
        controlPersis.editarTarea(tarea);
    }
    
    //Calificacion------------------
    public void crearCalificacion(Calificacion calificacion) {
        controlPersis.crearCalificacion(calificacion);
    }
    public Calificacion traerCalificacion(int i) {
        return controlPersis.traerCalificacion(i);
    }
    public void eliminarCalificacion(int i) {
        controlPersis.eliminarCalificacion(i);
    }
    public ArrayList<Calificacion> listarCalificacion() {
        return controlPersis.listarCalificacion();
    }
    public void editarCalificacion(Calificacion calificacion) {
        controlPersis.editarCalificacion(calificacion);
    }

    //Contrato------------------
    public void crearContrato(Contrato contrato) {
        controlPersis.crearContrato(contrato);
    }
    public Contrato traerContrato(int i) {
        return controlPersis.traerContrato(i);
    }
    public void eliminarContrato(int i) {
        controlPersis.eliminarContrato(i);
    }
    public ArrayList<Contrato> listarContrato() {
        return controlPersis.listarContrato();
    }
    public void editarContrato(Contrato contrato) {
        controlPersis.editarContrato(contrato);
    }

    

    

    

}
