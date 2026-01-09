package com.pixora.domain.service;

public class PhotoValidator {

    public PhotoValidator() {
    }

    public void validateUpload(Long albumId, String url) {
        if (albumId == null) {
            throw new IllegalArgumentException("Album obligatoire");
        }
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("URL obligatoire");
        }
    }
}
