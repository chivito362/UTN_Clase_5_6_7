package models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Servicio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T16:46:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Tarea.class)
public class Tarea_ { 

    public static volatile SingularAttribute<Tarea, String> descripcion;
    public static volatile SingularAttribute<Tarea, Double> precio;
    public static volatile SingularAttribute<Tarea, Servicio> servicio;
    public static volatile SingularAttribute<Tarea, Integer> id_Tarea;

}