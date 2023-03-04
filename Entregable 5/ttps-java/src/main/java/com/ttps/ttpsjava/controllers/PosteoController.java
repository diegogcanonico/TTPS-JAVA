package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.Posteo;
import com.ttps.ttpsjava.services.imp.PosteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posteos")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PosteoController {

    @Autowired
    private PosteoService posteoService;

    @PostMapping("/")
    public ResponseEntity<Posteo> registrarPosteo(@RequestBody Posteo posteo){
        posteoService.registrar(posteo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Posteo>> obtenerPosteos(@PathVariable("id") long id){
        List<Posteo> listadoPosteo = posteoService.listarDeEmprendimiento(id);
        return new ResponseEntity<>(listadoPosteo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Posteo> borrarPosteo(@PathVariable("id") long id){
        Optional<Posteo> posteo = posteoService.encontrar(id);
        if(!posteo.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            posteoService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Posteo> actualizarPosteo(@RequestBody Posteo posteo){
        Optional<Posteo> posteoConsulta = posteoService.encontrar(posteo.getId());
        if(!posteoConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            posteoService.actualizar(posteo);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

}
