package com.pixora.usecase.service;

import com.pixora.domain.entities.Album;
import com.pixora.domain.repository.AlbumRepository;

public class RecupererAlbumParIdUseCase {
    private final AlbumRepository albumRepository;

    public RecupererAlbumParIdUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public Album execute(Long albumId) {
        return albumRepository.findById(albumId)
                .orElseThrow(() -> new IllegalArgumentException("Album introuvable: " + albumId));
    }
}
