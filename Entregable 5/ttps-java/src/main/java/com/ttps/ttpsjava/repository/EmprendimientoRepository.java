package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.Emprendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {
}
