package com.pixora.adapters.infrastructure.persistence.mapper;

import com.pixora.adapters.infrastructure.persistence.entities.UtilisateurJpaEntity;
import com.pixora.domain.entities.Utilisateur;

public class UtilisateurJpaMapper {

    public UtilisateurJpaEntity toEntity(Utilisateur u) {
        UtilisateurJpaEntity e = new UtilisateurJpaEntity();
        e.setId(u.getId());
        e.setEmail(u.getEmail());
        e.setNom(u.getNom());
        return e;
    }

    public Utilisateur toDomain(UtilisateurJpaEntity e) {
        return new Utilisateur(e.getId(), e.getEmail(), e.getNom());
    }
}
