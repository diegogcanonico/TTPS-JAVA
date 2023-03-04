package com.ttps.ttpsjava.controllers;

import com.ttps.ttpsjava.dto.LoginDTO;
import com.ttps.ttpsjava.models.Credentials;
import com.ttps.ttpsjava.models.Usuario;
import com.ttps.ttpsjava.services.imp.TokenServices;
import com.ttps.ttpsjava.services.imp.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private Usuario usuarioDAO;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TokenServices tokenServices;
    // un dia
    private final int EXPIRATION_IN_SEC = 100;

    @PostMapping(path = "/auth")
    public ResponseEntity<?> authenticate(@RequestBody LoginDTO userpass) {

        if(isLoginSuccess(userpass.getUsername(), userpass.getPassword())) {
            String token = tokenServices.generateToken(userpass.getUsername(), EXPIRATION_IN_SEC);
            return ResponseEntity.ok(new Credentials(token, EXPIRATION_IN_SEC, userpass.getUsername()));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario o password incorrecto");
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        // recupero el usuario de la base de usuarios
        Usuario u = usuarioService.findByUsername(username);

        // chequeo que el usuario exista y el password sea correcto
        return (u != null && u.getPassword().equals(password));
    }


        @PostMapping("/")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioVerificado = usuarioService.registrar(usuario);
        if(usuarioVerificado != null) {
            String mensajeExito = "El usuario se ha creado correctamente";
            return new ResponseEntity(usuarioVerificado, HttpStatus.OK);
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
            //String mensajeExito = "El usuario se ha logueado correctamente";
            return new ResponseEntity<>(usuarioVerificado, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
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
