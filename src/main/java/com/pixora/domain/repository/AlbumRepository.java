package com.pixora.domain.repository;

import com.pixora.domain.entities.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository {
    Album save(Album album);
    Optional<Album> findById(Long id);
    List<Album> findByOwnerUserId(Long ownerUserId);
    void delete(Long id);
}
