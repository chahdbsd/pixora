package com.pixora.domain.repository;

import com.pixora.domain.entities.Utilisateur;

import java.util.Optional;
import java.util.UUID;

public interface UtilisateurRepository {
    Utilisateur save(Utilisateur user);
    Optional<Utilisateur> findById(UUID id);
    Optional<Utilisateur> findByEmail(String email);
}
