package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.Rol;
import com.ttps.ttpsjava.services.imp.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping("/")
    public ResponseEntity<Rol> registrarRol(@RequestBody Rol rol){
        rolService.registrar(rol);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rol>> obtenerRoles(){
        List<Rol> listadoRol = rolService.listar();
        return new ResponseEntity<>(listadoRol, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Rol> borrarRol(@PathVariable("id") int id){
        Optional<Rol> rol = rolService.encontrar(id);
        if(!rol.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            rolService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Rol> actualizarRol(@RequestBody Rol rol){
        Optional<Rol> rolConsulta = rolService.encontrar(rol.getId());
        if(!rolConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            rolService.actualizar(rol);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

}
