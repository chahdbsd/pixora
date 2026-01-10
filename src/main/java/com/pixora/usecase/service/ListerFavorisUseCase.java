package com.pixora.usecase.service;

import com.pixora.domain.entities.Favori;
import com.pixora.domain.repository.FavoriRepository;

import java.util.List;

public class ListerFavorisUseCase {

    private final FavoriRepository repository;

    public ListerFavorisUseCase(FavoriRepository repository) {
        this.repository = repository;
    }

    public List<Favori> execute(Long userId) {
        return repository.findByUserId(userId);
    }
}
