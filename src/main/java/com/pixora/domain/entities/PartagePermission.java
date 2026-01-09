package com.pixora.domain.entities;

import java.time.Instant;

public class PartagePermission {
    private Long id;
    private Long albumId;
    private Long grantedToUserId;
    private String permission; // "READ" | "WRITE"
    private Instant createdAt;

    public PartagePermission(Long id, Long albumId, Long grantedToUserId, String permission, Instant createdAt) {
        this.id = id;
        this.albumId = albumId;
        this.grantedToUserId = grantedToUserId;
        this.permission = permission;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public Long getAlbumId() { return albumId; }
    public Long getGrantedToUserId() { return grantedToUserId; }
    public String getPermission() { return permission; }
    public Instant getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setAlbumId(Long albumId) { this.albumId = albumId; }
    public void setGrantedToUserId(Long grantedToUserId) { this.grantedToUserId = grantedToUserId; }
    public void setPermission(String permission) { this.permission = permission; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
