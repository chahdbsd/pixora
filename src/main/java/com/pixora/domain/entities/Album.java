package com.pixora.domain.entities;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Album {
    private final UUID id;
    private String name;
    private final UUID ownerId;
    private final Instant createdAt;

    public Album(UUID id, String name, UUID ownerId, Instant createdAt) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.createdAt = Objects.requireNonNull(createdAt);
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public UUID getOwnerId() { return ownerId; }
    public Instant getCreatedAt() { return createdAt; }

    public void rename(String newName) { this.name = Objects.requireNonNull(newName); }
}
