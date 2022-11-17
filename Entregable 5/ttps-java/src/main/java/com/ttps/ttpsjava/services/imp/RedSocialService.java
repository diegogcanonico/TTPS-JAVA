package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.RedSocial;
import com.ttps.ttpsjava.repository.RedSocialRepository;
import com.ttps.ttpsjava.services.IRedSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RedSocialService implements IRedSocialService {

    @Autowired
    private RedSocialRepository redSocialRepository;

    @Override
    public RedSocial registrar(RedSocial redSocial) {
        if(redSocial != null)
            return redSocialRepository.save(redSocial);
        else return null;
    }

    @Override
    public List<RedSocial> listar(){
        return redSocialRepository.findAll();
    }

    @Override
    public Optional<RedSocial> encontrar(Long id){
        return redSocialRepository.findById(id);
    }

    @Override
    public void borrar(Long id){
        redSocialRepository.deleteById(id);
    }

    @Override
    public void actualizar(RedSocial redSocial){
        redSocialRepository.save(redSocial);
    }

}
