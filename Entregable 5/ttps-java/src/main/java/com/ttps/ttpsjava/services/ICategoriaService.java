package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.Categoria;
import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    Categoria registrar(Categoria categoria);
    List<Categoria> listar();
    Optional<Categoria> encontrar(Long id);
    void borrar(Long id);
    void actualizar(Categoria categoria);

}
