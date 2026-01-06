package com.pixora.domain.repository;

import com.pixora.domain.entities.Album;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AlbumRepository {
    Album save(Album album);
    Optional<Album> findById(UUID id);
    List<Album> findByOwnerId(UUID ownerId);
    void deleteById(UUID id);
}
