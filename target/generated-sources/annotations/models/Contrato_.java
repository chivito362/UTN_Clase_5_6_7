package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Consumidor;
import models.Servicio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T20:57:31", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, Date> fecha;
    public static volatile SingularAttribute<Contrato, Boolean> estado;
    public static volatile SingularAttribute<Contrato, Servicio> servicio;
    public static volatile SingularAttribute<Contrato, Integer> id_contrato;
    public static volatile SingularAttribute<Contrato, String> lugar;
    public static volatile SingularAttribute<Contrato, String> rango_Horario;
    public static volatile SingularAttribute<Contrato, Consumidor> consumidor;

}