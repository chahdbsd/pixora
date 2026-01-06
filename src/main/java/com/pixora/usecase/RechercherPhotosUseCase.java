package com.pixora.usecase;

import com.pixora.domain.entities.Photo;
import com.pixora.domain.repository.PhotoRepository;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class RechercherPhotosUseCase {

    private final PhotoRepository photoRepository;

    public RechercherPhotosUseCase(PhotoRepository photoRepository) {
        this.photoRepository = Objects.requireNonNull(photoRepository);
    }

    public List<Photo> byOwner(UUID ownerId) {
        return photoRepository.findByOwnerId(ownerId);
    }

    public List<Photo> byAlbum(UUID albumId) {
        return photoRepository.findByAlbumId(albumId);
    }
}
