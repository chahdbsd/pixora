package com.pixora.usecase.service;

import com.pixora.domain.repository.PhotoRepository;

public class SupprimerPhotoUseCase {

    private final PhotoRepository photoRepository;

    public SupprimerPhotoUseCase(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public void execute(Long id) {
        photoRepository.delete(id);
    }
}
