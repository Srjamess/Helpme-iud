package co.edu.iudigital.app.controller;

import co.edu.iudigital.app.dto.DelitoDTO;
import co.edu.iudigital.app.dto.DelitoDTORequest;
import co.edu.iudigital.app.services.iface.DelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delitos")
public class DelitoController {
    @Autowired
    private DelitoService delitoService;

    @GetMapping
    public ResponseEntity<List<DelitoDTO>> index(){
        return ResponseEntity.ok()
                .body(delitoService.getAll());
    }

    @PostMapping
    public ResponseEntity<DelitoDTO> save(
            @Validated @RequestBody DelitoDTORequest request
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(delitoService.save(request));
    }
}
