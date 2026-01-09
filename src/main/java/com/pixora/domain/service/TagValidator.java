package com.pixora.domain.service;


import com.pixora.domain.entities.Tag;

public final class TagValidator {
    private TagValidator() {}

    public static void validateForCreate(Tag t) {
        if (t == null) throw new IllegalArgumentException("Tag null");
        if (t.getNom() == null || t.getNom().trim().isEmpty())
            throw new IllegalArgumentException("Nom de tag obligatoire");
        if (t.getNom().length() < 2)
            throw new IllegalArgumentException("Nom de tag trop court");
    }
}
