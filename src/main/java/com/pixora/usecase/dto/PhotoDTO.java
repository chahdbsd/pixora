package com.pixora.usecase.dto;

import java.time.Instant;

public class PhotoDTO {

    private final Long id;
    private final Long albumId;
    private final Long uploaderUserId;
    private final String url;
    private final Instant uploadedAt;

    public PhotoDTO(Long id, Long albumId, Long uploaderUserId, String url, Instant uploadedAt) {
        this.id = id;
        this.albumId = albumId;
        this.uploaderUserId = uploaderUserId;
        this.url = url;
        this.uploadedAt = uploadedAt;
    }

    public Long getId() {
        return id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public Long getUploaderUserId() {
        return uploaderUserId;
    }

    public String getUrl() {
        return url;
    }

    public Instant getUploadedAt() {
        return uploadedAt;
    }
}
