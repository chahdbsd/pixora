package com.pixora.domain.entities;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Favori {
    private final UUID id;
    private final UUID userId;
    private final UUID photoId;
    private final Instant createdAt;

    public Favori(UUID id, UUID userId, UUID photoId, Instant createdAt) {
        this.id = Objects.requireNonNull(id);
        this.userId = Objects.requireNonNull(userId);
        this.photoId = Objects.requireNonNull(photoId);
        this.createdAt = Objects.requireNonNull(createdAt);
    }

    public UUID getId() { return id; }
    public UUID getUserId() { return userId; }
    public UUID getPhotoId() { return photoId; }
    public Instant getCreatedAt() { return createdAt; }
}
