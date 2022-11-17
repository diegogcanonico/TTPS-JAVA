package com.ttps.ttpsjava.services;

import com.ttps.ttpsjava.models.RedSocial;
import java.util.List;
import java.util.Optional;

public interface IRedSocialService {

    RedSocial registrar(RedSocial redSocial);
    List<RedSocial> listar();
    Optional<RedSocial> encontrar(Long id);
    void borrar(Long id);
    void actualizar(RedSocial redSocial);

}
