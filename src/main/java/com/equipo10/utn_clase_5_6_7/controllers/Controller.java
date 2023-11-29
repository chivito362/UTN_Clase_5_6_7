
package com.equipo10.utn_clase_5_6_7.controllers;

import models.Admin;
import models.Consumidor;
import models.Proveedor;


public class Controller {
    PersistenceController controlPersis=new PersistenceController();

    public void crearAdmin(Admin admin) {
        controlPersis.crearAdmin(admin);
    }

    public void crearProveedor(Proveedor proveedor) {
        controlPersis.crearProveedor(proveedor);
    }

    public void crearConsumidor(Consumidor consumidor) {
        controlPersis.crearConsumidor(consumidor);
    }

}
