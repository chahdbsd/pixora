package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.mapper.TagJpaMapper;
import com.pixora.domain.entities.Tag;
import com.pixora.domain.repository.TagRepository;

import java.util.List;
import java.util.Optional;

public class JpaTagRepository implements TagRepository {

    private final SpringDataTagRepository repo;
    private final TagJpaMapper mapper;

    public JpaTagRepository(SpringDataTagRepository repo, TagJpaMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public Tag save(Tag tag) {
        return mapper.toDomain(repo.save(mapper.toEntity(tag)));
    }

    @Override
    public Optional<Tag> findById(Long id) {
        return repo.findById(id).map(mapper::toDomain);
    }

    @Override
    public Optional<Tag> findByLabel(String label) {
        return repo.findByLabel(label).map(mapper::toDomain);
    }

    @Override
    public List<Tag> findAll() {
        return repo.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
