package com.pixora.usecase.service;

import com.pixora.domain.entities.Favori;
import com.pixora.domain.repository.FavoriRepository;

import java.time.Instant;

public class AjouterFavoriUseCase {

    private final FavoriRepository repository;

    public AjouterFavoriUseCase(FavoriRepository repository) {
        this.repository = repository;
    }

    public Favori execute(Long userId, Long photoId) {

        repository.findByUserIdAndPhotoId(userId, photoId)
                .ifPresent(f -> {
                    throw new IllegalStateException("Photo déjà en favori");
                });

        Favori favori = new Favori(
                null,
                userId,
                photoId,
                Instant.now()
        );

        return repository.save(favori);
    }
}
