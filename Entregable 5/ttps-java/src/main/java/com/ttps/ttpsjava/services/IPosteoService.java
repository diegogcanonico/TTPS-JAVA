package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.Posteo;
import java.util.List;
import java.util.Optional;

public interface IPosteoService {

    Posteo registrar(Posteo posteo);
    List<Posteo> listar();
    Optional<Posteo> encontrar(Long id);
    void borrar(Long id);
    void actualizar(Posteo posteo);

}
