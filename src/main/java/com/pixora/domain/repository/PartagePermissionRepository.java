package com.pixora.domain.repository;

import com.pixora.domain.entities.PartagePermission;

import java.util.List;
import java.util.Optional;

public interface PartagePermissionRepository {
    PartagePermission save(PartagePermission permission);
    Optional<PartagePermission> findById(Long id);
    List<PartagePermission> findByAlbumId(Long albumId);
    List<PartagePermission> findByGrantedToUserId(Long userId);
    void delete(Long id);
}
