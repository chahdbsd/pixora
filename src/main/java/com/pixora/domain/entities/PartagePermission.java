package com.pixora.domain.entities;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class PartagePermission {
    public enum Permission { READ, WRITE }

    private final UUID id;
    private final UUID albumId;
    private final UUID ownerId;
    private final UUID targetUserId; // user avec qui on partage
    private final Permission permission;
    private final Instant createdAt;

    public PartagePermission(UUID id, UUID albumId, UUID ownerId, UUID targetUserId, Permission permission, Instant createdAt) {
        this.id = Objects.requireNonNull(id);
        this.albumId = Objects.requireNonNull(albumId);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.targetUserId = Objects.requireNonNull(targetUserId);
        this.permission = Objects.requireNonNull(permission);
        this.createdAt = Objects.requireNonNull(createdAt);
    }

    public UUID getId() { return id; }
    public UUID getAlbumId() { return albumId; }
    public UUID getOwnerId() { return ownerId; }
    public UUID getTargetUserId() { return targetUserId; }
    public Permission getPermission() { return permission; }
    public Instant getCreatedAt() { return createdAt; }
}
