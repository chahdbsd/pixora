package com.pixora.domain.service;

import com.pixora.domain.entities.Utilisateur;

public class UtilisateurValidator {

    public void validateForCreate(Utilisateur u) {
        if (u.getEmail() == null || u.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email obligatoire");
        }
    }
}
