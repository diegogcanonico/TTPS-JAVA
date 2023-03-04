package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.Donacion;
import com.ttps.ttpsjava.models.Emprendimiento;
import com.ttps.ttpsjava.models.Posteo;
import com.ttps.ttpsjava.services.imp.EmprendimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprendimientos")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class EmprendimientoController {

    @Autowired
    EmprendimientoService emprendimientoService;

    @PostMapping("/")
    public ResponseEntity<Donacion> registrarEmprendimiento(@RequestBody Emprendimiento emprendimiento){
        if(emprendimientoService.registrar(emprendimiento) != null) {
            return new ResponseEntity("Emprendimiento creado correctamente", HttpStatus.CREATED);
        }else return new ResponseEntity("El usuario ya posee un emprendimiento activo", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity <List<Emprendimiento>> obtenerEmprendimientos(){
        List<Emprendimiento> emprendimientos = emprendimientoService.listar();
        return new ResponseEntity<List<Emprendimiento>>(emprendimientos, HttpStatus.OK);
    }

    @GetMapping("/emprendimiento/{id}")
    public ResponseEntity <Optional<Emprendimiento>> obtenerEmprendimiento(@PathVariable("id") long id){
        Optional<Emprendimiento> emprendimiento = emprendimientoService.encontrar(id);
        return new ResponseEntity<Optional<Emprendimiento>>(emprendimiento, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Emprendimiento> borrarEmprendimiento(@PathVariable("id") long id){
        Optional<Emprendimiento> emprendimiento = emprendimientoService.encontrar(id);
        if(!emprendimiento.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            emprendimientoService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Emprendimiento> actualizarEmprendimiento(@RequestBody Emprendimiento emprendimiento){
        Optional<Emprendimiento> emprendimientoConsulta = emprendimientoService.encontrar(emprendimiento.getId());
        if(!emprendimientoConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            emprendimientoService.actualizar(emprendimiento);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Emprendimiento>> datosEmprendimiento(@PathVariable("id") long id){
        Optional<Emprendimiento> datosEmprendimiento = emprendimientoService.encontrar(id);
        if(!datosEmprendimiento.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(datosEmprendimiento, HttpStatus.OK);
        }
    }



}
