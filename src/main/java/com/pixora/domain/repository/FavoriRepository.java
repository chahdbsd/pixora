package com.pixora.domain.repository;

import com.pixora.domain.entities.Favori;

import java.util.List;
import java.util.Optional;

public interface FavoriRepository {
    Favori save(Favori favori);
    Optional<Favori> findById(Long id);
    List<Favori> findByUserId(Long userId);
    Optional<Favori> findByUserIdAndPhotoId(Long userId, Long photoId);
    void delete(Long id);
    void deleteByUserIdAndPhotoId(Long userId, Long photoId);
}
