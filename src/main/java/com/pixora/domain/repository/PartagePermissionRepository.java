package com.pixora.domain.repository;

import com.pixora.domain.entities.PartagePermission;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PartagePermissionRepository {
    PartagePermission save(PartagePermission permission);
    List<PartagePermission> findByAlbumId(UUID albumId);
    Optional<PartagePermission> findByAlbumIdAndTargetUserId(UUID albumId, UUID targetUserId);
}
