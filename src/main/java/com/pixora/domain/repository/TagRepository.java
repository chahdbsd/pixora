package com.pixora.domain.repository;

import com.pixora.domain.entities.Tag;

import java.util.List;
import java.util.Optional;

public interface TagRepository {

    Tag save(Tag tag);

    Optional<Tag> findById(Long id);

    Optional<Tag> findByLabel(String label);

    List<Tag> findAll();

    void delete(Long id);
}
