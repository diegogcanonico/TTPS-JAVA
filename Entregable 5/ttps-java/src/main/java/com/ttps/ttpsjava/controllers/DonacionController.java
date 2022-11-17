package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.Donacion;
import com.ttps.ttpsjava.models.Emprendimiento;
import com.ttps.ttpsjava.services.imp.DonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donaciones")
public class DonacionController {

    @Autowired
    private DonacionService donacionService;

    @PostMapping("/")
    public ResponseEntity<Donacion> registrarDonacion(@RequestBody Donacion donacion){
        donacionService.registrar(donacion);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Donacion>> obtenerDonaciones(){
        List<Donacion> listadoDonacion = donacionService.listar();
        return new ResponseEntity<>(listadoDonacion, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Donacion> borrarDonacion(@PathVariable("id") long id){
        Optional<Donacion> donacion = donacionService.encontrar(id);
        if(!donacion.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            donacionService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Donacion> actualizarDonacion(@RequestBody Donacion donacion){
        Optional<Donacion> donacionConsulta = donacionService.encontrar(donacion.getId());
        if(!donacionConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            donacionService.actualizar(donacion);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Donacion>> obtenerDonaciones(@PathVariable("id") long id){
        List<Donacion> listaDonaciones = donacionService.getAllByIdEmprendimiento(id);
        if(listaDonaciones == null){
            return new ResponseEntity("No hay donaciones para el emprendimiento", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(listaDonaciones, HttpStatus.OK);
        }
    }

}
