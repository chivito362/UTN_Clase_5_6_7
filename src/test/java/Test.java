
import com.equipo10.utn_clase_5_6_7.controllers.Controller;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import models.Admin;
import models.Calificacion;
import models.Consumidor;
import models.Contrato;
import models.Proveedor;
import models.Servicio;
import models.Tarea;

public class Test {

    public static void main(String[] args) {
        Controller control=new  Controller();
        
//        Crud ADMIN
        Admin admin=new Admin(1, "messi", "DNI", "40913220", "Chivito362@gmail.com", "1167242416", "2040913220", Date.from(Instant.now()));
        control.crearAdmin(admin);
//        Admin admin2=control.traerAdmin(2);
//        admin2.setNombre("MessiGOD");
//        control.editarAdmin(admin2);
//        control.listarAdmin().stream().map(c->c.getNombre()+" "+c.getId_user()).forEach(System.out::println);
//        control.eliminarAdmin(1);
//        

//        Crud PROVEEDOR
       Proveedor proveedor=new Proveedor(1, "juan", "DNI", "1234", "asdasd@asdas.com", "112354", "212343", Date.from(Instant.now()));
        control.crearProveedor(proveedor);
//        Proveedor proveedor2=control.traerProveedor(1);
//        proveedor2.setNombre("Juan2");
//        control.editarProveedor(proveedor2);
//        control.listarProveedor().stream().map(c->c.getNombre()+" "+c.getId_user()).forEach(System.out::println);
//        //control.eliminarProveedor(1);
        
//
//        Crud CONSUMIDOR
        Consumidor consumidor=new Consumidor(1, "pepe", "DNI", "123234", "asdasd@asdas.com", "213123", "232323", Date.from(Instant.now()));
        control.crearConsumidor(consumidor);
//        Consumidor consumidor2=control.traerConsumidor(1);
//        consumidor2.setNombre("pepe2");
//        control.editarConsumidor(consumidor2);
//        control.listarConsumidor().stream().map(c->c.getNombre()+" "+c.getId_user()).forEach(System.out::println);
//        control.eliminarConsumidor(1);
          
//        Crud Servicio
          Servicio servicio=new Servicio(1, "Servicio Electricidad", "Mantenimiento Tablero", "Lunes-Jueves", "8:00 AM - 16:00 PM", "20KM", proveedor);
          control.crearServicio(servicio);
          Servicio servicio2=control.traerServicio(1);
          control.editarServicio(servicio2);
          control.listarServicio().stream().map(a->a.getNombre()+" "+a.getDesc()).forEach(System.out::println);
          //control.eliminarServicio(1);
          
//        Crud Tarea
          Tarea tarea=new Tarea(1, 1000, "Mantenimiento Router", servicio);
          control.crearTarea(tarea);
          Tarea tarea2=control.traerTarea(1);
          control.editarTarea(tarea2);
          control.listarTarea().stream().map(c->c.getDesc()).forEach(System.out::println);
          //control.eliminarTarea(1);


      //Crud Calificacion
        Calificacion calificacion=new Calificacion(1, 5, "Bueno", consumidor, proveedor);
        control.crearCalificacion(calificacion);
        Calificacion calificacion2=control.traerCalificacion(1);
        calificacion2.setCalifiacion(4);
        control.editarCalificacion(calificacion2);
        control.listarCalificacion().stream().map(c->c.getCalifiacion()).forEach(System.out::println);
        //control.eliminarCalificacion(1);
        
        //Contrato
        Contrato contrato=new Contrato(1, Date.from(Instant.now()), "CABA", "10:00 AM - 15:00 PM", false, servicio, consumidor);
        control.crearContrato(contrato);
        Contrato contrato2=control.traerContrato(1);
        contrato2.setEstado(true);
        control.editarContrato(contrato);
        control.listarContrato().stream().map(c->c.getLugar()).forEach(System.out::println);
        //control.eliminarContrato(1);
    }
    
    
}
