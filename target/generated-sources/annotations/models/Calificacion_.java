package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Consumidor;
import models.Proveedor;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T20:57:31", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Calificacion.class)
public class Calificacion_ { 

    public static volatile SingularAttribute<Calificacion, Integer> id_calificacion;
    public static volatile SingularAttribute<Calificacion, Proveedor> calificado;
    public static volatile SingularAttribute<Calificacion, Consumidor> calificador;
    public static volatile SingularAttribute<Calificacion, Integer> califiacion;
    public static volatile SingularAttribute<Calificacion, String> comentario;

}