package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.Donacion;
import com.ttps.ttpsjava.models.Emprendimiento;
import com.ttps.ttpsjava.repository.EmprendimientoRepository;
import com.ttps.ttpsjava.services.IEmprendimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmprendimientoService implements IEmprendimientoService {

    @Autowired
    private EmprendimientoRepository emprendimientoRepository;

    @Override
    public Emprendimiento registrar(Emprendimiento emprendimiento) {
        if(emprendimiento != null)
            return emprendimientoRepository.save(emprendimiento);
        else return null;
    }

    @Override
    public List<Emprendimiento> listar(){
        return emprendimientoRepository.findAll();
    }

    @Override
    public Optional<Emprendimiento> encontrar(Long id){
        return emprendimientoRepository.findById(id);
    }

    @Override
    public void borrar(Long id){
        emprendimientoRepository.deleteById(id);
    }

    @Override
    public void actualizar(Emprendimiento emprendimiento){
        emprendimientoRepository.save(emprendimiento);
    }

}
