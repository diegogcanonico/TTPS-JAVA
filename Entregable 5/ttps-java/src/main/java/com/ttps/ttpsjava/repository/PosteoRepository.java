package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PosteoRepository extends JpaRepository<Posteo, Long> {

    List<Posteo> findByEmprendimientoId(Long id);

}
