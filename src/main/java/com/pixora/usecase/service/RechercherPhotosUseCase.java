package com.pixora.usecase.service;

import com.pixora.domain.entities.Photo;
import com.pixora.domain.repository.PhotoRepository;

import java.util.List;

public class RechercherPhotosUseCase {
    private final PhotoRepository photoRepository;

    public RechercherPhotosUseCase(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public List<Photo> execute(Long albumId) {
        return photoRepository.findByAlbumId(albumId);
    }
}
