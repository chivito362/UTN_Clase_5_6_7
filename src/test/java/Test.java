
import com.equipo10.utn_clase_5_6_7.controllers.Controller;
import java.time.Instant;
import java.util.Date;
import models.Admin;
import models.Consumidor;
import models.Proveedor;

public class Test {

    public static void main(String[] args) {
        Controller control=new  Controller();
        Admin admin=new Admin(22, "Sebastian", "DNI", "40913220", "Chivito362@gmail.com", "1167242416", "2040913220", Date.from(Instant.now()));
        Proveedor proveedor=new Proveedor(0, "juan", "DNI", "1234", "asdasd@asdas.com", "112354", "212343", Date.from(Instant.now()));
        Consumidor consumidor=new Consumidor(0, "pepe", "DNI", "123234", "asdasd@asdas.com", "213123", "232323", Date.from(Instant.now()));
        
        /*control.crearAdmin(admin);
        control.crearProveedor(proveedor);
        control.crearConsumidor(consumidor);*/
        
    }
    
}
