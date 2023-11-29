package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T16:46:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Consumidor.class)
public class Consumidor_ { 

    public static volatile SingularAttribute<Consumidor, Date> fechaNac;
    public static volatile SingularAttribute<Consumidor, String> tipoDNI;
    public static volatile SingularAttribute<Consumidor, Integer> id_user;
    public static volatile SingularAttribute<Consumidor, String> telefono;
    public static volatile SingularAttribute<Consumidor, String> nombre;
    public static volatile SingularAttribute<Consumidor, String> cuit_cuil;
    public static volatile SingularAttribute<Consumidor, String> dni;
    public static volatile SingularAttribute<Consumidor, String> email;

}