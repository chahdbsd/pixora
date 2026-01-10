package com.pixora.adapters.infrastructure.persistence.mapper;

import com.pixora.adapters.infrastructure.persistence.entity.FavoriJpaEntity;
import com.pixora.domain.entities.Favori;

public class FavoriJpaMapper {

    public FavoriJpaEntity toEntity(Favori f) {
        FavoriJpaEntity e = new FavoriJpaEntity();
        e.setId(f.getId());
        e.setUserId(f.getUserId());
        e.setPhotoId(f.getPhotoId());
        e.setCreatedAt(f.getCreatedAt());
        return e;
    }

    public Favori toDomain(FavoriJpaEntity e) {
        return new Favori(
                e.getId(),
                e.getUserId(),
                e.getPhotoId(),
                e.getCreatedAt()
        );
    }
}
