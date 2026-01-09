package com.pixora.usecase.service;

import com.pixora.domain.entities.Utilisateur;
import com.pixora.domain.repository.UtilisateurRepository;

public class CreerUtilisateurUseCase {

    private final UtilisateurRepository repository;

    public CreerUtilisateurUseCase(UtilisateurRepository repository) {
        this.repository = repository;
    }

    public Utilisateur execute(String email, String nom) {
        return repository.save(new Utilisateur(email, nom));
    }
}
