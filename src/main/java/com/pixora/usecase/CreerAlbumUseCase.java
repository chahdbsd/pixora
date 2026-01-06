package com.pixora.usecase;

import com.pixora.domain.entities.Album;
import com.pixora.domain.repository.AlbumRepository;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class CreerAlbumUseCase {

    private final AlbumRepository albumRepository;

    public CreerAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = Objects.requireNonNull(albumRepository);
    }

    public Album execute(UUID ownerId, String albumName) {
        if (albumName == null || albumName.isBlank()) {
            throw new IllegalArgumentException("albumName is required");
        }
        Album album = new Album(UUID.randomUUID(), albumName.trim(), ownerId, Instant.now());
        return albumRepository.save(album);
    }
}
