package com.pixora.domain.entities;

import java.util.Objects;
import java.util.UUID;

public class Tag {
    private final UUID id;
    private final UUID ownerId;
    private String label;

    public Tag(UUID id, UUID ownerId, String label) {
        this.id = Objects.requireNonNull(id);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.label = Objects.requireNonNull(label);
    }

    public UUID getId() { return id; }
    public UUID getOwnerId() { return ownerId; }
    public String getLabel() { return label; }

    public void rename(String newLabel) { this.label = Objects.requireNonNull(newLabel); }
}
