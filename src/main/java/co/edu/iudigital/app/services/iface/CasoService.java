package co.edu.iudigital.app.services.iface;

import co.edu.iudigital.app.dto.CasoDTO;

import java.util.List;

public interface CasoService {
    List<CasoDTO> getAll(); //TODO: Agregar las excepciones
    CasoDTO save(CasoDTO caso);
    CasoDTO getById(Long id);

}
