package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.entity.FavoriJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpringDataFavoriRepository
        extends JpaRepository<FavoriJpaEntity, Long> {

    List<FavoriJpaEntity> findByUserId(Long userId);

    Optional<FavoriJpaEntity> findByUserIdAndPhotoId(Long userId, Long photoId);

    void deleteByUserIdAndPhotoId(Long userId, Long photoId);
}
