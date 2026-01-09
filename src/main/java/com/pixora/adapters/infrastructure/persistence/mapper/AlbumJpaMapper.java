package com.pixora.adapters.infrastructure.persistence.mapper;

import com.pixora.adapters.infrastructure.persistence.entity.AlbumEntity;
import com.pixora.domain.entities.Album;

public class AlbumJpaMapper {

    public AlbumEntity toEntity(Album album) {
        AlbumEntity entity = new AlbumEntity();
        entity.setId(album.getId());
        entity.setOwnerUserId(album.getOwnerUserId());
        entity.setTitre(album.getTitre());
        entity.setCreatedAt(album.getCreatedAt());
        return entity;
    }

    public Album toDomain(AlbumEntity entity) {
        return new Album(
                entity.getId(),
                entity.getOwnerUserId(),
                entity.getTitre(),
                entity.getCreatedAt()
        );
    }
}
