
package com.equipo10.utn_clase_5_6_7.controllers;

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

    void crearAdmin(Admin admin) {
        adminJPA.create(admin);
    }

    void crearConsumidor(Consumidor consumidor) {
        consuJPA.create(consumidor);
    }

    void crearProveedor(Proveedor proveedor) {
        proveJPA.create(proveedor);
    }

    
}
