package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.dto.LoginDTO;
import com.ttps.ttpsjava.models.Rol;
import com.ttps.ttpsjava.models.Usuario;
import com.ttps.ttpsjava.repository.UsuarioRepository;
import com.ttps.ttpsjava.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Usuario registrar(Usuario usuario) {
        Usuario usuarioVerificado = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuario != null && usuarioVerificado == null) {
            Rol rol = new Rol();
            rol.setId(2);
            usuario.setRol(rol);
            return usuarioRepository.save(usuario);
        }
        else return null;
    }

    @Override
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> encontrar(int id){
        return usuarioRepository.findById(id);
    }

    @Override
    public void borrar(int id){
        usuarioRepository.deleteById(id);
    }

    @Override
    public void actualizar(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario login(LoginDTO loginDTO){
        Usuario usuario = usuarioRepository.findByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword());
        if (usuario != null){
            return usuario;
        } else {
            return null;
        }
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No existe usuario con el username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    @Override
    public Usuario save(Usuario user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return usuarioRepository.save(user);
    }

    @Override
    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }

}
