package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.Donacion;
import com.ttps.ttpsjava.repository.DonacionRepository;
import com.ttps.ttpsjava.services.IDonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DonacionService implements IDonacionService {

    @Autowired
    private DonacionRepository donacionRepository;

    @Override
    public Donacion registrar(Donacion donacion) {
        if(donacion != null)
            return donacionRepository.save(donacion);
        else return null;
    }

    @Override
    public List<Donacion> listar(){
        return donacionRepository.findAll();
    }

    @Override
    public Optional<Donacion> encontrar(Long id){
        return donacionRepository.findById(id);
    }

    @Override
    public void borrar(Long id){
        donacionRepository.deleteById(id);
    }

    @Override
    public void actualizar(Donacion donacion){
        donacionRepository.save(donacion);
    }

    @Override
    public List<Donacion> getAllByIdEmprendimiento(Long id){
        List<Donacion> donaciones = donacionRepository.getAllByEmprendimiento_id(id);
        if (!donaciones.isEmpty()){
            return donaciones;
        } else
            return null;
    }

}
