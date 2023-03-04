package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByUsername(String username);
    Usuario findByUsernameAndPassword(String username, String password);



}
