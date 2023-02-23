package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.Plan;
import com.ttps.ttpsjava.services.imp.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/planes")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PlanController {

    @Autowired
    private PlanService planService;

    @PostMapping("/")
    public ResponseEntity<Plan> registrarPlan(@RequestBody Plan plan){
        planService.registrar(plan);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Plan>> obtenerPlanes(){
        List<Plan> listadoPlan = planService.listar();
        return new ResponseEntity<>(listadoPlan, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Plan> borrarPlan(@PathVariable("id") long id){
        Optional<Plan> plan = planService.encontrar(id);
        if(!plan.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            planService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Plan> actualizarPlan(@RequestBody Plan plan){
        Optional<Plan> planConsulta = planService.encontrar(plan.getId());
        if(!planConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            planService.actualizar(plan);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

}
