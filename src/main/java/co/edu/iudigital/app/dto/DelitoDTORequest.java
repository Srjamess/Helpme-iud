package co.edu.iudigital.app.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTORequest implements Serializable {
    @NotNull(message = "Nombre es obligatorio")
    //@JsonProperty("nombre") // redundante
    String nombre;

    //@JsonProperty("descripcion") // redundante
    String descripcion;
}
