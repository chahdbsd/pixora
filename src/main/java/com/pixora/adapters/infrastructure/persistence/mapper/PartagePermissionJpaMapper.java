package com.pixora.adapters.infrastructure.persistence.mapper;

import com.pixora.domain.entities.PartagePermission;
import com.pixora.adapters.infrastructure.persistence.entity.PartagePermissionJpaEntity;

public class PartagePermissionJpaMapper {

    public PartagePermissionJpaEntity toEntity(PartagePermission p) {
        PartagePermissionJpaEntity e = new PartagePermissionJpaEntity();
        e.setId(p.getId());
        e.setAlbumId(p.getAlbumId());
        e.setGrantedToUserId(p.getGrantedToUserId());
        e.setPermission(p.getPermission());
        e.setCreatedAt(p.getCreatedAt());
        return e;
    }

    public PartagePermission toDomain(PartagePermissionJpaEntity e) {
        return new PartagePermission(
                e.getId(),
                e.getAlbumId(),
                e.getGrantedToUserId(),
                e.getPermission(),
                e.getCreatedAt()
        );
    }
}
