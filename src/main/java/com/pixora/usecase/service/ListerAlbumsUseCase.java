package com.pixora.usecase.service;

import com.pixora.domain.entities.Album;
import com.pixora.domain.repository.AlbumRepository;

import java.util.List;

public class ListerAlbumsUseCase {

    private final AlbumRepository albumRepository;

    public ListerAlbumsUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> execute(Long ownerUserId) {
        return albumRepository.findByOwnerUserId(ownerUserId);
    }
}
