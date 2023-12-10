package co.edu.iudigital.app.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "casos") //crea tabla en la base de datos
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Caso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long id;
    @Column(name = "fecha_hora")
    LocalDateTime fechaHora;
    @Column
    Float latitud;
    @Column
    Float longitud;
    @Column
    Float altitud;
    @Column(name = "is_visible")
    Boolean isVisible;
    @Column
    String detalle;
    @Column(name = "url_map")
    String urlMap;
    @Column(name = "url_rmi")
    String rmiUrl;

    // TODO: finalizarlo
    @ManyToOne
    @JoinColumn(name = "delitos_id")
    Delito delito;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    Usuario usuario;


}
