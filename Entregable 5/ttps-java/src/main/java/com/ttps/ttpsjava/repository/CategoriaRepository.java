package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
