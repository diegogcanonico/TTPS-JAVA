package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.models.Categoria;
import com.ttps.ttpsjava.services.imp.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/")
    public ResponseEntity<Categoria> registrarCategoria(@RequestBody Categoria categoria){
        categoriaService.registrar(categoria);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> obtenerCategorias(){
        List<Categoria> listadoCategoria = categoriaService.listar();
        return new ResponseEntity<>(listadoCategoria, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Categoria> borrarCategoria(@PathVariable("id") long id){
        Optional<Categoria> categoria = categoriaService.encontrar(id);
        if(!categoria.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            categoriaService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Categoria> actualizarCategoria(@RequestBody Categoria categoria){
        Optional<Categoria> categoriaConsulta = categoriaService.encontrar(categoria.getId());
        if(!categoriaConsulta.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            categoriaService.actualizar(categoria);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }

}
