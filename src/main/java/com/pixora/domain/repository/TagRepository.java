package com.pixora.domain.repository;

import com.pixora.domain.entities.Tag;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TagRepository {
    Tag save(Tag tag);
    Optional<Tag> findById(UUID id);
    List<Tag> findByOwnerId(UUID ownerId);
    Optional<Tag> findByOwnerIdAndLabel(UUID ownerId, String label);
}
