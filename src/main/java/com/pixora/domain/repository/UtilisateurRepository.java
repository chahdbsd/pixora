package com.pixora.domain.repository;

import com.pixora.domain.entities.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository {

    Utilisateur save(Utilisateur utilisateur);

    Optional<Utilisateur> findById(Long id);

    List<Utilisateur> findAll();
}
