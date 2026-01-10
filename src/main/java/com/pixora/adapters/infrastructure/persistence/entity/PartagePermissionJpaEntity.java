package com.pixora.adapters.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.Instant;

@Entity
@Table(name = "album_partages")
public class PartagePermissionJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long albumId;
    private Long grantedToUserId;
    private String permission;
    private Instant createdAt;

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
