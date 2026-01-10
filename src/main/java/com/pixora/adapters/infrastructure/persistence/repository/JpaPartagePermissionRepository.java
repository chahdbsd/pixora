package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.mapper.PartagePermissionJpaMapper;
import com.pixora.domain.entities.PartagePermission;
import com.pixora.domain.repository.PartagePermissionRepository;

import java.util.List;
import java.util.Optional;

public class JpaPartagePermissionRepository
        implements PartagePermissionRepository {

    private final SpringDataPartagePermissionRepository repo;
    private final PartagePermissionJpaMapper mapper;

    public JpaPartagePermissionRepository(
            SpringDataPartagePermissionRepository repo,
            PartagePermissionJpaMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public PartagePermission save(PartagePermission p) {
        return mapper.toDomain(
                repo.save(mapper.toEntity(p))
        );
    }

    @Override
    public Optional<PartagePermission> findById(Long id) {
        return repo.findById(id)
                .map(mapper::toDomain);
    }

    @Override
    public List<PartagePermission> findByAlbumId(Long albumId) {
        return repo.findByAlbumId(albumId)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public List<PartagePermission> findByGrantedToUserId(Long userId) {
        return repo.findByGrantedToUserId(userId)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
