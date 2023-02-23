package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.RedSocial;
import com.ttps.ttpsjava.services.imp.RedSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/redes")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class RedSocialController {

    @Autowired
    private RedSocialService redSocialService;

    @PostMapping("/")
    public ResponseEntity<RedSocial> registrarRedSocial(@RequestBody RedSocial redSocial){
        redSocialService.registrar(redSocial);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RedSocial>> obtenerRedesSociales(){
        List<RedSocial> listadoRedSocial = redSocialService.listar();
        return new ResponseEntity<>(listadoRedSocial, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RedSocial> borrarRedSocial(@PathVariable("id") long id){
        Optional<RedSocial> redSocial = redSocialService.encontrar(id);
        if(!redSocial.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            redSocialService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<RedSocial> actualizarRedSocial(@RequestBody RedSocial redSocial){
        Optional<RedSocial> redSocialConsulta = redSocialService.encontrar(redSocial.getId());
        if(!redSocialConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            redSocialService.actualizar(redSocial);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

}
