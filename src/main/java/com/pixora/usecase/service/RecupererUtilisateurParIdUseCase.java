package com.pixora.usecase.service;

import com.pixora.domain.entities.Utilisateur;
import com.pixora.domain.repository.UtilisateurRepository;

public class RecupererUtilisateurParIdUseCase {

    private final UtilisateurRepository repository;

    public RecupererUtilisateurParIdUseCase(UtilisateurRepository repository) {
        this.repository = repository;
    }

    public Utilisateur execute(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Utilisateur introuvable"));
    }
}
