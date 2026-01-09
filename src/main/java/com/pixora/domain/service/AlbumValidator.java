package com.pixora.domain.service;

import com.pixora.domain.entities.Album;

public class AlbumValidator {

    public void validateForCreate(Album album) {
        if (album.getTitre() == null || album.getTitre().isBlank()) {
            throw new IllegalArgumentException("Le titre de l’album est obligatoire");
        }
        if (album.getOwnerUserId() == null) {
            throw new IllegalArgumentException("Le propriétaire de l’album est obligatoire");
        }
    }
}
