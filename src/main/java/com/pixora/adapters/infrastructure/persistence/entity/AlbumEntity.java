package com.pixora.adapters.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "albums")
public class AlbumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ownerUserId;
    private String titre;
    private Instant createdAt;

    public AlbumEntity() {}

    public Long getId() { return id; }
    public Long getOwnerUserId() { return ownerUserId; }
    public String getTitre() { return titre; }
    public Instant getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setOwnerUserId(Long ownerUserId) { this.ownerUserId = ownerUserId; }
    public void setTitre(String titre) { this.titre = titre; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
