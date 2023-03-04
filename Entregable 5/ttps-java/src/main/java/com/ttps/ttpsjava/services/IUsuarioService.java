package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.dto.LoginDTO;
import com.ttps.ttpsjava.models.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    Usuario registrar(Usuario u);
    List<Usuario> listar();
    Optional<Usuario> encontrar(int id);
    void borrar(int id);
    void actualizar(Usuario usuario);
    Usuario login(LoginDTO loginDTO);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    Usuario save(Usuario user);

    Usuario findByUsername(String username);
}
