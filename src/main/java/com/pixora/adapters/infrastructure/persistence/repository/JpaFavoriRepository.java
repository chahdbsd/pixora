package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.domain.entities.Favori;
import com.pixora.domain.repository.FavoriRepository;
import com.pixora.adapters.infrastructure.persistence.mapper.FavoriJpaMapper;

import java.util.List;
import java.util.Optional;

public class JpaFavoriRepository implements FavoriRepository {

    private final SpringDataFavoriRepository springRepo;
    private final FavoriJpaMapper mapper;

    public JpaFavoriRepository(SpringDataFavoriRepository springRepo,
                               FavoriJpaMapper mapper) {
        this.springRepo = springRepo;
        this.mapper = mapper;
    }

    @Override
    public Favori save(Favori favori) {
        return mapper.toDomain(
                springRepo.save(mapper.toEntity(favori))
        );
    }

    @Override
    public Optional<Favori> findById(Long id) {
        return springRepo.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Favori> findByUserId(Long userId) {
        return springRepo.findByUserId(userId)
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Favori> findByUserIdAndPhotoId(Long userId, Long photoId) {
        return springRepo.findByUserIdAndPhotoId(userId, photoId)
                .map(mapper::toDomain);
    }

    @Override
    public void delete(Long id) {
        springRepo.deleteById(id);
    }

    @Override
    public void deleteByUserIdAndPhotoId(Long userId, Long photoId) {
        springRepo.deleteByUserIdAndPhotoId(userId, photoId);
    }
}
