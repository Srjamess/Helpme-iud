package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dto.DelitoDTO;
import co.edu.iudigital.app.dto.DelitoDTORequest;
import co.edu.iudigital.app.models.Delito;
import co.edu.iudigital.app.repositories.DelitoRepository;
import co.edu.iudigital.app.services.iface.DelitoService;
import co.edu.iudigital.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DelitoServiceImpl implements DelitoService {


    @Autowired
    private Mapper mapper; // mapper de utilidades

    @Autowired
    private DelitoRepository delitoRepository;
    @Override
    public List<DelitoDTO> getAll() {
        List<Delito> delitos = delitoRepository.findAll();
        return mapper.toDelitosDTO(delitos);

    }

    @Override
    public DelitoDTO save(DelitoDTORequest delitoDTO) {
        Delito delito = mapper.toDelito(delitoDTO);
        delito = delitoRepository.save(delito);
        return mapper.toDelitoDTO(delito);
    }

    @Override
    public DelitoDTO getById(Long id) {
        Optional<Delito> delitoOptional= delitoRepository.findById(id);
        DelitoDTO delitoDTO = new DelitoDTO();
        if (delitoOptional.isPresent()){
            delitoDTO = mapper.toDelitoDTO(delitoOptional.get());
        }
        return delitoDTO;
    }

    @Override
    public void deleteById(Long id) {
        delitoRepository.deleteById(id);
    }
}
