package com.ttps.ttpsjava.services.imp;

import com.ttps.ttpsjava.models.Plan;
import com.ttps.ttpsjava.repository.PlanRepository;
import com.ttps.ttpsjava.services.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PlanService implements IPlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Plan registrar(Plan plan) {
        if(plan != null)
            return planRepository.save(plan);
        else return null;
    }

    @Override
    public List<Plan> listar(){
        return planRepository.findAll();
    }

    @Override
    public Optional<Plan> encontrar(Long id){
        return planRepository.findById(id);
    }

    @Override
    public void borrar(Long id){
        planRepository.deleteById(id);
    }

    @Override
    public void actualizar(Plan plan){
        planRepository.save(plan);
    }

}
