package com.pixora.domain.repository;

import com.pixora.domain.entities.Favori;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FavoriRepository {
    Favori save(Favori favori);
    Optional<Favori> findByUserIdAndPhotoId(UUID userId, UUID photoId);
    List<Favori> findByUserId(UUID userId);
    void deleteById(UUID id);
}
