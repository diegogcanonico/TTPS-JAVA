package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.dto.LoginDTO;
import com.ttps.ttpsjava.models.Usuario;
import com.ttps.ttpsjava.services.imp.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioVerificado = usuarioService.registrar(usuario);
        if(usuarioVerificado != null) {
            String mensajeExito = "El usuario se ha creado correctamente";
            return new ResponseEntity(mensajeExito, HttpStatus.CREATED);
        }
        else {
            String mensajeError = "El usuario que intenta registrar ya existe";
            return new ResponseEntity(mensajeError, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> loginUsuario(@RequestBody LoginDTO loginDTO){
        Usuario usuarioVerificado = usuarioService.login(loginDTO);
        if(usuarioVerificado != null) {
            String mensajeExito = "El usuario se ha logueado correctamente";
            return new ResponseEntity(mensajeExito, HttpStatus.CREATED);
        }
        else {
            String mensajeError = "Credenciales incorrectas";
            return new ResponseEntity(mensajeError, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obtenerUsuarios(){
        List<Usuario> listadoUsuario = usuarioService.listar();
        return new ResponseEntity<>(listadoUsuario, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> borrarUsuario(@PathVariable("id") int id){
        Optional<Usuario> usuario = usuarioService.encontrar(id);
        if(!usuario.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            usuarioService.borrar(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario){
        Optional<Usuario> usuarioConsulta = usuarioService.encontrar(usuario.getId());
        if(!usuarioConsulta.isPresent()){
            return new ResponseEntity("El usuario que se desea actualizar no existe",HttpStatus.NOT_FOUND);
        } else {
            usuarioService.actualizar(usuario);
            return new ResponseEntity("El usuario se ha actualizado correctamente", HttpStatus.OK);
        }

    }

}
