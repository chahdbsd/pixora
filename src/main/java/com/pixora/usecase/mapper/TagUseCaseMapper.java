package com.pixora.usecase.mapper;

import com.pixora.domain.entities.Tag;
import com.pixora.usecase.dto.TagDTO;

public class TagUseCaseMapper {

    public TagDTO toDTO(Tag tag) {
        TagDTO dto = new TagDTO();
        dto.id = tag.getId();
        dto.label = tag.getLabel();
        return dto;
    }
}
