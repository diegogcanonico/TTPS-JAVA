package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.Plan;
import java.util.List;
import java.util.Optional;

public interface IPlanService {

    Plan registrar(Plan plan);
    List<Plan> listar();
    Optional<Plan> encontrar(Long id);
    void borrar(Long id);
    void actualizar(Plan plan);

}
