package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T20:57:31", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, Date> fechaNac;
    public static volatile SingularAttribute<Admin, String> tipoDNI;
    public static volatile SingularAttribute<Admin, Integer> id_user;
    public static volatile SingularAttribute<Admin, String> telefono;
    public static volatile SingularAttribute<Admin, String> nombre;
    public static volatile SingularAttribute<Admin, String> cuit_cuil;
    public static volatile SingularAttribute<Admin, String> dni;
    public static volatile SingularAttribute<Admin, String> email;

}