package com.pixora.adapters.infrastructure.persistence.mapper;

import com.pixora.adapters.infrastructure.persistence.entity.PhotoEntity;
import com.pixora.domain.entities.Photo;

public class PhotoJpaMapper {

    public PhotoEntity toEntity(Photo photo) {
        PhotoEntity entity = new PhotoEntity();
        entity.setId(photo.getId());
        entity.setAlbumId(photo.getAlbumId());
        entity.setUploaderUserId(photo.getUploaderUserId());
        entity.setUrl(photo.getUrl());
        entity.setUploadedAt(photo.getUploadedAt());
        return entity;
    }

    public Photo toDomain(PhotoEntity entity) {
        return new Photo(
                entity.getId(),
                entity.getAlbumId(),
                entity.getUploaderUserId(),
                entity.getUrl(),
                entity.getUploadedAt()
        );
    }
}
