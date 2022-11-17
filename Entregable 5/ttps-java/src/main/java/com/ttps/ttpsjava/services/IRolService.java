package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.Rol;
import java.util.List;
import java.util.Optional;

public interface IRolService {

    Rol registrar(Rol rol);
    List<Rol> listar();
    Optional<Rol> encontrar(int id);
    void borrar(int id);
    void actualizar(Rol rol);

}
