package com.pixora.domain.repository;

import com.pixora.domain.entities.Photo;

import java.util.List;
import java.util.Optional;

public interface PhotoRepository {

    Photo save(Photo photo);

    Optional<Photo> findById(Long id);

    List<Photo> findByAlbumId(Long albumId);

    void delete(Long id);
}
