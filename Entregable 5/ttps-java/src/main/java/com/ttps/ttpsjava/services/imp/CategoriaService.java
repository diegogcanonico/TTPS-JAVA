package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.Categoria;
import com.ttps.ttpsjava.repository.CategoriaRepository;
import com.ttps.ttpsjava.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoriaService implements ICategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria registrar(Categoria categoria) {
        if(categoria != null)
            return categoriaRepository.save(categoria);
        else return null;
    }

    @Override
    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> encontrar(Long id){
        return categoriaRepository.findById(id);
    }

    @Override
    public void borrar(Long id){
        categoriaRepository.deleteById(id);
    }

    @Override
    public void actualizar(Categoria categoria){
        categoriaRepository.save(categoria);
    }

}
