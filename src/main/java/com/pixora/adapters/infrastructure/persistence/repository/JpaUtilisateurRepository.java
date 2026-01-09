package com.pixora.adapters.infrastructure.persistence.repository;

import com.pixora.adapters.infrastructure.persistence.mapper.UtilisateurJpaMapper;
import com.pixora.domain.entities.Utilisateur;
import com.pixora.domain.repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

public class JpaUtilisateurRepository implements UtilisateurRepository {

    private final SpringDataUtilisateurRepository springRepo;
    private final UtilisateurJpaMapper mapper;

    public JpaUtilisateurRepository(SpringDataUtilisateurRepository springRepo,
                                    UtilisateurJpaMapper mapper) {
        this.springRepo = springRepo;
        this.mapper = mapper;
    }

    @Override
    public Utilisateur save(Utilisateur u) {
        return mapper.toDomain(
                springRepo.save(mapper.toEntity(u))
        );
    }

    @Override
    public Optional<Utilisateur> findById(Long id) {
        return springRepo.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Utilisateur> findAll() {
        return springRepo.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }
}
