package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.Donacion;
import java.util.List;
import java.util.Optional;

public interface IDonacionService {

    Donacion registrar(Donacion donacion);
    List<Donacion> listar();
    Optional<Donacion> encontrar(Long id);
    void borrar(Long id);
    void actualizar(Donacion donacion);
    List<Donacion> getAllByIdEmprendimiento(Long id);

}
