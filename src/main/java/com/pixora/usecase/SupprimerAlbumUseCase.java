package com.pixora.usecase;

import com.pixora.domain.repository.AlbumRepository;

import java.util.Objects;
import java.util.UUID;

public class SupprimerAlbumUseCase {

    private final AlbumRepository albumRepository;

    public SupprimerAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = Objects.requireNonNull(albumRepository);
    }

    public void execute(UUID albumId) {
        albumRepository.deleteById(albumId);
    }
}
