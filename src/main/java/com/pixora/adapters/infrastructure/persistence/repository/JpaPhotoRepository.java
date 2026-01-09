package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.mapper.PhotoJpaMapper;
import com.pixora.domain.entities.Photo;
import com.pixora.domain.repository.PhotoRepository;

import java.util.List;
import java.util.Optional;

public class JpaPhotoRepository implements PhotoRepository {

    private final SpringDataPhotoRepository springRepo;
    private final PhotoJpaMapper mapper;

    public JpaPhotoRepository(SpringDataPhotoRepository springRepo,
                              PhotoJpaMapper mapper) {
        this.springRepo = springRepo;
        this.mapper = mapper;
    }

    @Override
    public Photo save(Photo photo) {
        return mapper.toDomain(
                springRepo.save(mapper.toEntity(photo))
        );
    }

    @Override
    public Optional<Photo> findById(Long id) {
        return springRepo.findById(id)
                .map(mapper::toDomain);
    }

    @Override
    public List<Photo> findByAlbumId(Long albumId) {
        return springRepo.findByAlbumId(albumId)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public void delete(Long id) {
        springRepo.deleteById(id);
    }
}
