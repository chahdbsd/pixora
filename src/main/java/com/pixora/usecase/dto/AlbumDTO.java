package com.pixora.usecase.dto;

import java.time.Instant;

public class AlbumDTO {

    private final Long id;
    private final Long ownerUserId;
    private final String titre;
    private final Instant createdAt;

    public AlbumDTO(Long id, Long ownerUserId, String titre, Instant createdAt) {
        this.id = id;
        this.ownerUserId = ownerUserId;
        this.titre = titre;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getOwnerUserId() {
        return ownerUserId;
    }

    public String getTitre() {
        return titre;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
