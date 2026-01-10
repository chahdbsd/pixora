package com.pixora.usecase.service;

import com.pixora.domain.entities.Tag;
import com.pixora.domain.repository.TagRepository;
import com.pixora.domain.service.TagValidator;

public class CreerTagUseCase {

    private final TagRepository repo;
    private final TagValidator validator;

    public CreerTagUseCase(TagRepository repo, TagValidator validator) {
        this.repo = repo;
        this.validator = validator;
    }

    public Tag execute(String label) {
        Tag tag = new Tag(null, label);

        validator.validateForCreate(tag);

        return repo.save(tag);
    }
}
