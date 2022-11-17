package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
}
