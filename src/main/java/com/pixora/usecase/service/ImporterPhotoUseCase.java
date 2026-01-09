package com.pixora.usecase.service;

import com.pixora.domain.entities.Photo;
import com.pixora.domain.repository.PhotoRepository;

import java.time.Instant;

public class ImporterPhotoUseCase {

    private final PhotoRepository photoRepository;

    public ImporterPhotoUseCase(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public Photo execute(Long albumId, Long uploaderUserId, String url) {
        Photo photo = new Photo(
                null,
                albumId,
                uploaderUserId,
                url,
                Instant.now()
        );

        return photoRepository.save(photo);
    }
}
