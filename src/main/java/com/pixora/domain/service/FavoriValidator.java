package com.pixora.domain.service;

import com.pixora.domain.entities.Favori;

public final class FavoriValidator {
    private FavoriValidator() {}

    public static void validateForCreate(Favori f) {
        if (f == null) throw new IllegalArgumentException("Favori null");
        if (f.getUserId() == null || f.getUserId() <= 0)
            throw new IllegalArgumentException("userId invalide");
        if (f.getPhotoId() == null || f.getPhotoId() <= 0)
            throw new IllegalArgumentException("photoId invalide");
    }
}
