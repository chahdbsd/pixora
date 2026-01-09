package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.entities.UtilisateurJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUtilisateurRepository
        extends JpaRepository<UtilisateurJpaEntity, Long> {
}
