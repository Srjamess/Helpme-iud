package co.edu.iudigital.app.services.iface;

import co.edu.iudigital.app.dto.CasoDTO;
import co.edu.iudigital.app.dto.DelitoDTO;
import co.edu.iudigital.app.dto.DelitoDTORequest;

import java.util.List;

public interface DelitoService {
    List<DelitoDTO> getAll();
    DelitoDTO save(DelitoDTORequest request);
    DelitoDTO getById(Long id);
    void deleteById(Long id);
}
