package com.pixora.usecase.service;

import com.pixora.domain.entities.Utilisateur;
import com.pixora.domain.repository.UtilisateurRepository;

import java.util.List;

public class ListerUtilisateursUseCase {

    private final UtilisateurRepository repository;

    public ListerUtilisateursUseCase(UtilisateurRepository repository) {
        this.repository = repository;
    }

    public List<Utilisateur> execute() {
        return repository.findAll();
    }
}
