package com.pixora.domain.repository;

import com.pixora.domain.entities.Photo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PhotoRepository {
    Photo save(Photo photo);
    Optional<Photo> findById(UUID id);
    List<Photo> findByOwnerId(UUID ownerId);
    List<Photo> findByAlbumId(UUID albumId);
    void deleteById(UUID id);
}
