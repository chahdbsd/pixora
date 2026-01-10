package com.pixora.adapters.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "favoris")
public class FavoriJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long photoId;
    private Instant createdAt;

    // ===== GETTERS =====
    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
