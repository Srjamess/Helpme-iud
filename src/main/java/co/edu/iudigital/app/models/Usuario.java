package co.edu.iudigital.app.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "usuarios") //crea tabla en la base de datos
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Usuario  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name ="username", nullable = false, unique = true,length = 120)
    String username;
    @Column(name =  "nombre",length = 120)
    String nombre;
    @Column(name =  "apellido",length = 120)
    String apellido;
    @Column
    String password;
    @Column(name = "fecha_nacimiento")
    LocalDate fechaNacimiento;
    @Column
    Boolean enable;
    @Column
    String image;
    @Column(name = "red_social")
    Boolean redSocial;

    @ManyToMany
    @JoinTable(
            name = "roles_usuarios",
            joinColumns = {
                @JoinColumn(name = "usuario_id")
             },
             inverseJoinColumns = {
                @JoinColumn(name = "roles_id")
            }
    )
    List<Role> roles;

}
