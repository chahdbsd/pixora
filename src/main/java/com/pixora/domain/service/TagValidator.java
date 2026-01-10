package com.pixora.domain.service;

import com.pixora.domain.entities.Tag;

public class TagValidator {

    public void validateForCreate(Tag tag) {
        if (tag == null) {
            throw new IllegalArgumentException("Tag null");
        }

        if (tag.getLabel() == null || tag.getLabel().isBlank()) {
            throw new IllegalArgumentException("Le label du tag est obligatoire");
        }
    }
}
