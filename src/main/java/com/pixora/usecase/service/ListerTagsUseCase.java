package com.pixora.usecase.service;

import com.pixora.domain.entities.Tag;
import com.pixora.domain.repository.TagRepository;

import java.util.List;

public class ListerTagsUseCase {

    private final TagRepository repo;

    public ListerTagsUseCase(TagRepository repo) {
        this.repo = repo;
    }

    public List<Tag> execute() {
        return repo.findAll();
    }
}
