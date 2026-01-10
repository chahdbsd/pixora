package com.pixora.usecase.service;

import com.pixora.domain.repository.PartagePermissionRepository;

public class RetirerPartageUseCase {

    private final PartagePermissionRepository repo;

    public RetirerPartageUseCase(PartagePermissionRepository repo) {
        this.repo = repo;
    }

    public void execute(Long partageId) {
        repo.delete(partageId);
    }
}
