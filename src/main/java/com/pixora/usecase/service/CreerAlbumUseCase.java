package com.pixora.usecase.service;

import com.pixora.domain.entities.Album;
import com.pixora.domain.repository.AlbumRepository;
import com.pixora.domain.service.AlbumValidator;

import java.time.Instant;

public class CreerAlbumUseCase {

    private final AlbumRepository albumRepository;
    private final AlbumValidator albumValidator;

    public CreerAlbumUseCase(
            AlbumRepository albumRepository,
            AlbumValidator albumValidator
    ) {
        this.albumRepository = albumRepository;
        this.albumValidator = albumValidator;
    }

    public Album execute(Long ownerUserId, String titre) {
        Album album = new Album(
                null,
                ownerUserId,
                titre,
                Instant.now()
        );

        albumValidator.validateForCreate(album);

        return albumRepository.save(album);
    }
}
