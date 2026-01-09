package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.entity.AlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataAlbumRepository extends JpaRepository<AlbumEntity, Long> {
    List<AlbumEntity> findByOwnerUserId(Long ownerUserId);
}
