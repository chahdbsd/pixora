package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.entity.PartagePermissionJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataPartagePermissionRepository
        extends JpaRepository<PartagePermissionJpaEntity, Long> {

    List<PartagePermissionJpaEntity> findByAlbumId(Long albumId);

    List<PartagePermissionJpaEntity> findByGrantedToUserId(Long grantedToUserId);
}
