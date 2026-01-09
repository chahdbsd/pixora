package com.pixora.usecase.service;

import com.pixora.domain.repository.AlbumRepository;

public class SupprimerAlbumUseCase {
    private final AlbumRepository albumRepository;

    public SupprimerAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(Long albumId) {
        albumRepository.delete(albumId);
    }
}
