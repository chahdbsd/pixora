package com.pixora.adapters.infrastructure.persistence.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "photos")
public class PhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long albumId;
    private Long uploaderUserId;
    private String url;
    private Instant uploadedAt;

    public PhotoEntity() {}

    public Long getId() { return id; }
    public Long getAlbumId() { return albumId; }
    public Long getUploaderUserId() { return uploaderUserId; }
    public String getUrl() { return url; }
    public Instant getUploadedAt() { return uploadedAt; }

    public void setId(Long id) { this.id = id; }
    public void setAlbumId(Long albumId) { this.albumId = albumId; }
    public void setUploaderUserId(Long uploaderUserId) { this.uploaderUserId = uploaderUserId; }
    public void setUrl(String url) { this.url = url; }
    public void setUploadedAt(Instant uploadedAt) { this.uploadedAt = uploadedAt; }
}
