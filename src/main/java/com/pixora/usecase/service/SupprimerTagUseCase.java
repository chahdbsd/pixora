package com.pixora.usecase.service;

import com.pixora.domain.repository.TagRepository;

public class SupprimerTagUseCase {

    private final TagRepository repo;

    public SupprimerTagUseCase(TagRepository repo) {
        this.repo = repo;
    }

    public void execute(Long id) {
        repo.delete(id);
    }
}
