package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonacionRepository extends JpaRepository<Donacion, Long> {

    List<Donacion> getAllByEmprendimiento_id(Long emprendimiento_id);

}
