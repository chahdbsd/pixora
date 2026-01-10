package com.pixora.usecase.service;

import com.pixora.domain.repository.FavoriRepository;

public class RetirerFavoriUseCase {

    private final FavoriRepository repository;

    public RetirerFavoriUseCase(FavoriRepository repository) {
        this.repository = repository;
    }

    public void execute(Long userId, Long photoId) {
        repository.deleteByUserIdAndPhotoId(userId, photoId);
    }
}
