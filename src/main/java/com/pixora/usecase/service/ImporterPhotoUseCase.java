package com.pixora.usecase.service;

import com.pixora.domain.entities.Photo;
import com.pixora.domain.repository.PhotoRepository;
import com.pixora.usecase.event.PhotoUploadedEvent;
import com.pixora.usecase.port.out.PhotoEventPublisher;

import java.time.Instant;

public class ImporterPhotoUseCase {

    private final PhotoRepository photoRepository;
    private final PhotoEventPublisher photoEventPublisher;

    public ImporterPhotoUseCase(PhotoRepository photoRepository, PhotoEventPublisher photoEventPublisher) {
        this.photoRepository = photoRepository;
        this.photoEventPublisher = photoEventPublisher;
    }

    public Photo execute(Long albumId, Long uploaderUserId, String url) {
        Photo photo = new Photo(
                null,
                albumId,
                uploaderUserId,
                url,
                Instant.now()
        );

        Photo saved = photoRepository.save(photo);

        // Publier l’évènement après la sauvegarde (photoId connu)
        PhotoUploadedEvent event = new PhotoUploadedEvent(
                saved.getId(),
                saved.getAlbumId(),
                saved.getUploaderUserId(),
                saved.getUrl(),
                saved.getUploadedAt()
        );
        photoEventPublisher.publishPhotoUploaded(event);

        return saved;
    }
}
