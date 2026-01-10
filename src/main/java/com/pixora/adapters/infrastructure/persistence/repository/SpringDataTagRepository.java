package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.entity.TagJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataTagRepository
        extends JpaRepository<TagJpaEntity, Long> {

    Optional<TagJpaEntity> findByLabel(String label);
}
