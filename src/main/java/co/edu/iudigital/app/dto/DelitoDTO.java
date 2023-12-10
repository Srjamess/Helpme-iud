package co.edu.iudigital.app.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DelitoDTO {
    Long id;
    String nombre;
    String descripcion;

}
