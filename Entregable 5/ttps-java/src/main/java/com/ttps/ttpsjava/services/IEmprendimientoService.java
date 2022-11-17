package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.Donacion;
import com.ttps.ttpsjava.models.Emprendimiento;
import java.util.List;
import java.util.Optional;

public interface IEmprendimientoService {

    Emprendimiento registrar(Emprendimiento emprendimiento);
    List<Emprendimiento> listar();
    Optional<Emprendimiento> encontrar(Long id);
    void borrar(Long id);
    void actualizar(Emprendimiento emprendimiento);

}
