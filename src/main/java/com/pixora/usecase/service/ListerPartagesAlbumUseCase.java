package com.pixora.usecase.service;

import com.pixora.domain.entities.PartagePermission;
import com.pixora.domain.repository.PartagePermissionRepository;

import java.util.List;

public class ListerPartagesAlbumUseCase {

    private final PartagePermissionRepository repo;

    public ListerPartagesAlbumUseCase(PartagePermissionRepository repo) {
        this.repo = repo;
    }

    public List<PartagePermission> execute(Long albumId) {
        return repo.findByAlbumId(albumId);
    }
}
