package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.Posteo;
import com.ttps.ttpsjava.repository.PosteoRepository;
import com.ttps.ttpsjava.services.IPosteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PosteoService implements IPosteoService {

    @Autowired
    private PosteoRepository posteoRepository;

    @Override
    public Posteo registrar(Posteo posteo) {
        if(posteo != null)
            return posteoRepository.save(posteo);
        else return null;
    }

    @Override
    public List<Posteo> listar(){
        return posteoRepository.findAll();
    }


    public List<Posteo> listarDeEmprendimiento(Long id){
        return posteoRepository.findByEmprendimientoId(id);
    }

    @Override
    public Optional<Posteo> encontrar(Long id){
        return posteoRepository.findById(id);
    }

    @Override
    public void borrar(Long id){
        posteoRepository.deleteById(id);
    }

    @Override
    public void actualizar(Posteo posteo){
        posteoRepository.save(posteo);
    }

}
