package com.pixora.usecase.event;

import java.time.Instant;

public class PhotoUploadedEvent {

    private final Long photoId;
    private final Long albumId;
    private final Long uploaderUserId;
    private final String url;
    private final Instant uploadedAt;

    public PhotoUploadedEvent(Long photoId, Long albumId, Long uploaderUserId, String url, Instant uploadedAt) {
        this.photoId = photoId;
        this.albumId = albumId;
        this.uploaderUserId = uploaderUserId;
        this.url = url;
        this.uploadedAt = uploadedAt;
    }

    public Long getPhotoId() {
        return photoId;
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
