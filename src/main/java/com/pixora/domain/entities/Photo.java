package com.pixora.domain.entities;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Photo {
    private final UUID id;
    private final UUID ownerId;
    private UUID albumId; // nullable: photo sans album
    private String fileName;
    private String contentType;
    private long size;
    private String storagePath; // ex: uploads/uuid.jpg
    private final Instant uploadedAt;

    public Photo(UUID id, UUID ownerId, UUID albumId, String fileName, String contentType,
                 long size, String storagePath, Instant uploadedAt) {
        this.id = Objects.requireNonNull(id);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.albumId = albumId;
        this.fileName = Objects.requireNonNull(fileName);
        this.contentType = Objects.requireNonNull(contentType);
        this.size = size;
        this.storagePath = Objects.requireNonNull(storagePath);
        this.uploadedAt = Objects.requireNonNull(uploadedAt);
    }

    public UUID getId() { return id; }
    public UUID getOwnerId() { return ownerId; }
    public UUID getAlbumId() { return albumId; }
    public String getFileName() { return fileName; }
    public String getContentType() { return contentType; }
    public long getSize() { return size; }
    public String getStoragePath() { return storagePath; }
    public Instant getUploadedAt() { return uploadedAt; }

    public void moveToAlbum(UUID newAlbumId) { this.albumId = newAlbumId; }
    public void rename(String newName) { this.fileName = Objects.requireNonNull(newName); }
}
