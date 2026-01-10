package com.pixora.usecase.service;

import com.pixora.domain.entities.PartagePermission;
import com.pixora.domain.repository.PartagePermissionRepository;

import java.time.Instant;

public class PartagerAlbumUseCase {

    private final PartagePermissionRepository repo;

    public PartagerAlbumUseCase(PartagePermissionRepository repo) {
        this.repo = repo;
    }

    public PartagePermission execute(Long albumId, Long userId, String permission) {
        PartagePermission p = new PartagePermission(
                null,
                albumId,
                userId,
                permission,
                Instant.now()
        );
        return repo.save(p);
    }
}
