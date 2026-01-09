package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.mapper.AlbumJpaMapper;
import com.pixora.domain.entities.Album;
import com.pixora.domain.repository.AlbumRepository;

import java.util.List;
import java.util.Optional;

public class JpaAlbumRepository implements AlbumRepository {

    private final SpringDataAlbumRepository springRepo;
    private final AlbumJpaMapper mapper;

    public JpaAlbumRepository(SpringDataAlbumRepository springRepo,
                              AlbumJpaMapper mapper) {
        this.springRepo = springRepo;
        this.mapper = mapper;
    }

    @Override
    public Album save(Album album) {
        return mapper.toDomain(
                springRepo.save(mapper.toEntity(album))
        );
    }

    @Override
    public Optional<Album> findById(Long id) {
        return springRepo.findById(id)
                .map(mapper::toDomain);
    }

    @Override
    public List<Album> findByOwnerUserId(Long ownerUserId) {
        return springRepo.findByOwnerUserId(ownerUserId)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public void delete(Long id) {
        springRepo.deleteById(id);
    }
}
