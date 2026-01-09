package com.pixora.domain.entities;

import java.time.Instant;

public class Favori {
    private Long id;
    private Long userId;
    private Long photoId;
    private Instant createdAt;

    public Favori(Long id, Long userId, Long photoId, Instant createdAt) {
        this.id = id;
        this.userId = userId;
        this.photoId = photoId;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public Long getPhotoId() { return photoId; }
    public Instant getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setUserId(Long userId) { this.userId = userId; }
    public void setPhotoId(Long photoId) { this.photoId = photoId; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
