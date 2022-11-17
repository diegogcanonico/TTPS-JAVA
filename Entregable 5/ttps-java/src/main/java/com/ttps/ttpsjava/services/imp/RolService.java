package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.Rol;
import com.ttps.ttpsjava.repository.RolRepository;
import com.ttps.ttpsjava.services.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RolService implements IRolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol registrar(Rol rol) {
        if(rol != null)
            return rolRepository.save(rol);
        else return null;
    }

    @Override
    public List<Rol> listar(){
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> encontrar(int id){
        return rolRepository.findById(id);
    }

    @Override
    public void borrar(int id){
        rolRepository.deleteById(id);
    }

    @Override
    public void actualizar(Rol rol){
        rolRepository.save(rol);
    }

}
