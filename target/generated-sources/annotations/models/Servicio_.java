package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Proveedor;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T20:57:31", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile SingularAttribute<Servicio, String> horario;
    public static volatile SingularAttribute<Servicio, String> dias;
    public static volatile SingularAttribute<Servicio, String> radio_cobertura;
    public static volatile SingularAttribute<Servicio, Proveedor> proveedor;
    public static volatile SingularAttribute<Servicio, Integer> id_servicio;
    public static volatile SingularAttribute<Servicio, String> nombre;

}