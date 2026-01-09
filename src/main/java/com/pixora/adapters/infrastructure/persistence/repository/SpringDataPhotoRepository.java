package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.entity.PhotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataPhotoRepository extends JpaRepository<PhotoEntity, Long> {
    List<PhotoEntity> findByAlbumId(Long albumId);
}
