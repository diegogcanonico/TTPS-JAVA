package com.ttps.ttpsjava.repository;

import com.ttps.ttpsjava.models.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial, Long> {
}
